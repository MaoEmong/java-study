package ex04;

// OOP : Object Oriented Programing
// 1원칙 : 상태는 행위를 통해 변경한다.
public class PeopleApp {
    public static void main(String[] args) {
        // 생성자가 없으면 생성 불가
        //        People people = new People();
        People people1 = new People.Builder().setname("홍길동").setheight(30).setweight(5).Build();
        People people2 = new People.Builder().setname("장보고").setheight(20).setweight(3).Build();
        people1.밥먹기();
        people1.밥먹기();
        System.out.println(people1.getWeight());

        var people3 = people1.Clone();
    }
}
