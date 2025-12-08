package ex06.ch02;
class Animal {
    int i = 1;
    String name = "동물";
}

class Cat extends Animal {
    int i = 2;
    String name = "고양이";
    int age = 5;
}

class Dog extends Animal {
    int i = 3;
    String name = "강아지";
}
public class ExVar01 {

    public static void main(String[] args) {
        Animal a1 = new Animal();   // [Animal]
        System.out.println(a1.i + " / "+ a1.name);

        Dog a2 = new Dog();         // [Animal, Dog(V)]
        System.out.println(a2.i + " / "+ a2.name);

        Animal a3 = new Dog();      // [Animal(V), Dog]
        System.out.println(a3.i + " / "+ a3.name);

        Cat a4 = new Cat();         // [Animal(V), Cat]
        System.out.println(a4.i + " / "+ a4.name +" / "+ a4.age);

    }
}
