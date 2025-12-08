package ex06.ch01;

class 지구인 {

}

class 유럽인 extends 지구인 {

}

class 아시아인 extends 지구인 {
    String color = "황색";
}

class 한국인 extends 아시아인 {

}

class 일본인 extends 아시아인 {

}

class 영국인 extends 유럽인 {

}

public class Ex02 {
    public static void main(String[] args) {
        지구인 s1 = new 한국인();
//        System.out.println(s1.color);
//        System.out.println(((아시아인)(s1)).color);
        아시아인 s2 = (아시아인)s1;
        System.out.println(s2.color);

    }
}
