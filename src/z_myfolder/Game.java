package z_myfolder;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.Spring;

public class Game {
    public static void main(String[] args) throws InterruptedException, IOException {
        // 게임시작 딸깍
        MoveGame mygame = new MoveGame();
        mygame.Start();

    }
}

enum GAMESTATE {
    MOVE,
    INCOUNT,
    BATTLE,
    GAMEEXIT
}

// 게임 클래스
class MoveGame {
    MapData map;
    PlayerCharactor player;
    MonsterCharactor monster;
    GAMESTATE state = GAMESTATE.MOVE;
    Scanner scan = new Scanner(System.in);
    String input = "";

    public void Start() throws InterruptedException, IOException {
        // 필요 데이터 할당
        map = new MapData();
        player = new PlayerCharactor("에몽", 1, 50, 5,new boolean[]{false,false});

        // 플레이 할 맵의 크기값 받아오기
        int sizeX, sizeY;
        sizeX = map.GetMapLengthX(map.map1);
        sizeY = map.GetMapLengthY(map.map1);

        // 게임 로직
        while (true) {
            // 화면 새로 그리기
            ClearView();
            // 필요한 상황에 맞춰 맵 그리기
            PrintMapData();
            // 플레이어 입력 받기
            PrintInput();
            GetInput();
            // 플레이어 행동 처리
            PlayerActionSystem(input, sizeX, sizeY);


            // 현재 게임 상태가 게임 종료일 경우 반복문 탈출
            if (state == GAMESTATE.GAMEEXIT)
                break;
        }
    }

    void PlayerActionSystem(String input, int mapx, int mapy) {
        switch (state) {
            case GAMESTATE.MOVE:
                // 플레이어 이동
                // 실제 플레이어가 이동에 성공했다면 true 반환
                boolean moveActive = MoveInputSystem(input, mapx, mapy);
                // 플레이어가 이동에 성공했을 때
                if (moveActive) {
                    // 랜덤 인카운트 진행
                    RandomInCount();
                }
                break;
            case GAMESTATE.BATTLE:
                BattleSystem(input);
                break;
            case GAMESTATE.INCOUNT:
                boolean incount = IncountMonster(input);
                // 플레이어가 맞서싸우기로 선택했다면
                if (incount) {
                    // 게임 상태는 전투로 변경
                    state = GAMESTATE.BATTLE;
                } else {
                    state = GAMESTATE.MOVE;
                }
                break;
            case GAMESTATE.GAMEEXIT:
                break;
        }
    }

    // 캐릭터 이동 처리
    boolean MoveInputSystem(String input, int mapx, int mapy) {
        switch (input) {
            case "w":
            case "W":
                if (player.controller.startPosX - 1 <= 0) return false;
                player.controller.PlayerMoveUp();
                break;
            case "s":
            case "S":
                if (player.controller.startPosX + 1 >= mapx - 1) return false;
                player.controller.PlayerMoveDown();
                break;
            case "a":
            case "A":
                if (player.controller.startPosY - 1 <= 0) return false;
                player.controller.PlayerMoveLeft();
                break;
            case "d":
            case "D":
                if (player.controller.startPosY + 1 >= mapy - 1) return false;
                player.controller.PlayerMoveRight();
                break;
            case "x":
            case "X":
                state = GAMESTATE.GAMEEXIT;
            default:
                return false;
        }

        return true;
    }

    // 전투 시스템 처리(플레이어 입력값)
    void BattleSystem(String input) {
        // 1싸운다 2도망간다
        // 도망가기를 선택했다면 몬스터 삭제, 게임 상태는 플레이어 이동으로 변경 함수 종료
        if (Objects.equals(input, "2")) {
            monster = null;
            state = GAMESTATE.MOVE;
            return;
        }
        // 플레이어 우선 공격 (변경 가능성 있음)
        player.Attack(monster);

        // 몬스터 생존 시 몬스터 공격
        if (monster.IsLive())
            monster.Attack(player);
            // 몬스터 처치 시 이동상태로 변경
        else
            state = GAMESTATE.MOVE;

        // 플레이어 후처리
        if (!player.IsLive()) {
            System.out.println("플레이어 사망!");
            state = GAMESTATE.GAMEEXIT;
        }
    }

    boolean IncountMonster(String input) {
        // 1싸운다 2도망간다
        if (Objects.equals(input, "1")) {
            return true;
        }
        return false;
    }

    // 캐릭터 이동 시 발생하는 랜덤 인카운트
    void RandomInCount() {
        // 랜덤 인카운트 발생(0 ~ 99.9999 확률 사이)
        double randVal = Math.random() * 100;
        // 인카운트 발생 확률은 30%
        if (randVal > 70) {
            // 몬스터 등장
            // TODO : 아직 몬스터가 고블린밖에 없음 추후 추가할 시 로직 변경 필요
            monster = new Goblin("고블린", 1, 10, 3);
            // 게임상태는 몬스터 인카운트로 넘어감
            state = GAMESTATE.INCOUNT;
        }

    }

    // 콘솔 화면 클리어
    void ClearView() throws IOException, InterruptedException {
//        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        for (int i = 0; i < 30; i++) System.out.println();
    }

    // 맵 데이터 콘솔에 표시
    void PrintMapData() {
        switch (state) {
            case GAMESTATE.MOVE:
                map.PrintMapData(map.map1, player.controller.startPosX, player.controller.startPosY);
                break;
            case GAMESTATE.BATTLE:
                System.out.println("플레이어 이름 : " + player.name);
                System.out.println("플레이어 공격력 : " + player.attack);
                System.out.println("플레이어 체력 : " + player.hp + " / " + player.maxhp);
                System.out.println("========");
                System.out.println("몬스터 : " + monster.name);
                System.out.println("몬스터 공격력 : " + monster.attack);
                System.out.println("몬스터 현재 체력 : " + monster.hp + " / " + monster.maxhp);
                System.out.println("================================");
                break;
            case GAMESTATE.INCOUNT:
                break;
        }

    }

    // 입력값 받기 텍스트 출력
    void PrintInput() {
        switch (state) {
            case GAMESTATE.MOVE:
                System.out.println("움직일 방향을 입력해주세요");
                System.out.println("w:UP/s:DOWN/a:LEFT/d:RIGHT/x:GameExit");
                break;
            case GAMESTATE.BATTLE:
                System.out.println("행동을 선택해주세요");
                System.out.println("1.공격한다 / 2.도망간다");
                break;
            case GAMESTATE.INCOUNT:
                System.out.println("몬스터가 나타났습니다!");
                System.out.println("1.싸운다 / 2.도망간다");
                break;
        }
    }

    // 입력값 받기
    void GetInput() {
        input = scan.next();
    }


}

// 필드 맵 데이터
class MapData {
    public int[][] map1 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    public void PrintMapData(int[][] map, int playerx, int playery) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == playerx && j == playery)
                    System.out.print(CharConverter(2));
                else
                    System.out.print(CharConverter(map[i][j]));
            }
            System.out.println();
        }
    }

    public int GetMapLengthX(int[][] map) {
        return map.length;
    }

    public int GetMapLengthY(int[][] map) {
        return map[0].length;
    }

    public String CharConverter(int data) {
        String conChar = " ";

        switch (data) {
            case 0:
                conChar = " ";
                break;
            case 1:
                conChar = "#";
                break;
            case 2:
                conChar = "$";
                break;
        }

        return conChar;
    }

}

// 플레이어 이동 담당
class PlayerMove {
    // 플레이어 초기 좌표값
    int startPosX = 1;
    int startPosY = 1;

    // 왼쪽 이동
    public void PlayerMoveLeft() {
        startPosY -= 1;
    }

    // 오른쪽 이동
    public void PlayerMoveRight() {
        startPosY += 1;
    }

    // 위 이동
    public void PlayerMoveUp() {
        startPosX -= 1;
    }

    // 아래 이동
    public void PlayerMoveDown() {
        startPosX += 1;
    }

}

// 캐릭터 오브젝트(플레이어, 몬스터)
abstract class Charactor {
    String name;    // 이름
    int level;      // 레벨
    int maxhp;      // 최대 체력
    int hp;         // 현재 체력
    int attack;     // 공격력

    // 기본 초기화
    public Charactor() {
        name = "Default";
        level = 1;
        maxhp = 1;
        hp = maxhp;
        attack = 1;
    }

    // 필요 데이터 추가 초기화
    public Charactor(String _name, int _level, int _maxhp, int _attack) {
        name = _name;
        level = _level;
        maxhp = _maxhp;
        hp = maxhp;
        attack = _attack;
    }

    public void Attack(Charactor other) {
        other.GetDamage(attack);
    }

    // 데미지 받기 처리
    public void GetDamage(int damage) {
        // 실제 처리될 데미지값
        int realDamage = damage;

        // 현재 체력에 받은 데미지 찰감
        hp -= realDamage;

        // 현재 체력이 0이하일 경우 사망 처리
        if (hp <= 0) Dead();
    }

    // 사망
    public void Dead() {

    }

    public boolean IsLive() {
        return hp > 0;
    }
}

// 플레이어 캐릭터
class PlayerCharactor extends Charactor {
    // 플레이어 움직임 처리
    PlayerMove controller = new PlayerMove();
    boolean[] eqipArr = {false, false};

    public PlayerCharactor() {

        name = "Default";
        level = 1;
        maxhp = PlayerDataTable.defaultMaxHp;
        hp = maxhp;
        attack = PlayerDataTable.defaultAttack;

        Arrays.fill(eqipArr, false);
    }

    public PlayerCharactor(String _name, int _level, int _maxhp, int _attack,boolean[] _equip) {
        super(_name, _level, _maxhp, _attack);
        eqipArr = _equip;
    }

    public void Attack(Charactor other) {
        super.Attack(other);
    }

    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    public void Dead() {
        super.Dead();
    }
}

// 몬스터 기본 데이터
class MonsterCharactor extends Charactor {
    public MonsterCharactor() {
        super();
    }

    public MonsterCharactor(String _name, int _level, int _maxhp, int _attack) {
        super(_name, _level, _maxhp, _attack);
    }

    public void Attack(Charactor other) {
        super.Attack(other);
    }

    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    public void Dead() {
        super.Dead();
    }
}

// 몬스터 - 고블린
class Goblin extends MonsterCharactor {
    public Goblin() {
        super();
    }

    public Goblin(String _name, int _level, int _maxhp, int _attack) {
        super(_name, _level, _maxhp, _attack);
    }

    public void Attack(Charactor other) {
        super.Attack(other);
    }

    public void GetDamage(int damage) {
        super.GetDamage(damage);
    }

    public void Dead() {
        super.Dead();
    }
}

//===================데이터 테이블
class PlayerDataTable {
    static final int defaultMaxHp = 50;
    static final int defaultAttack = 5;
    static final int equipWeaponAttack = 5;
    static final int equipArmorMaxHp = 50;
}