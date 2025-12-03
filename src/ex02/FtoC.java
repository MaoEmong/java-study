package ex02;

// 페이지 77 미니 프로젝트 풀이
public class FtoC {
    public static void main(String[] args) {
        // 1. 화씨 온도 받기 (캐나다, 미국에서 쓰는 온도. 단위는 F)
        double f = 100.0;
//        System.out.println(f);

        // 2. 섭씨 온도로 변경하기
        double c = 5 / 9 * (f - 32);
//      System.out.println(f - 32);
//      System.out.println(5/9);
//      0 * 68.0
//      System.out.println(5 / 9.0);

        // 3. 출력해서 섭씨온도 확인하기 (37.777777778)
        System.out.println("섭씨온도는 "+c);
    }
}
