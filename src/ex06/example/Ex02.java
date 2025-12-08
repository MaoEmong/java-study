package ex06.example;

abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    void sound() {
    }

    void introduce() {
        System.out.println("제 이름은 " + name + " 입니다");
    }

    void act() {
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("멍멍");
    }
    void act() {
        System.out.println("꼬리를 흔든다");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("애옹");
    }

    void act() {
        System.out.println("할퀸다");
    }
}

class Duck extends Animal {
    public Duck(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("꽥꽥");
    }

    void act() {
        System.out.println("헤엄친다");
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[3];
        zoo[0] = new Dog("콩이");
        zoo[1] = new Cat("나비");
        zoo[2] = new Duck("덕돌이");

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].introduce();
            zoo[i].sound();
            zoo[i].act();
            System.out.println();
        }
    }
}
