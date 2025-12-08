package ex06.ch01;

/*
OOP 관점에서 위배됨

class 엔진{}

class 자동차 extends 엔진{}
*/



class Judge {

}

class Host {

}

class Sinnor {

}

class King extends Judge {

}
class Queen extends Judge {

}

class Rabbit extends Host {

}

class HatSeller extends Sinnor {

}

public class Ex01 {
    public static void main(String[] args) {
        Sinnor u1 = new HatSeller(); // [죄인, 모자장수]
//        Rabbit u2 = new Host(); // [진행자]
        Judge u3 = new King(); // [왕, 재판관]

    }
}
