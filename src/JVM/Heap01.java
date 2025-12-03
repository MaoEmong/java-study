package JVM;

class Student {
    int no;
    String name;
    int age;
static String school = "그린아나데미";


    void SetNo(int no) {
        this.no = no;
    }

    // 상태 확인
    void Show() {
        System.out.println(no);
        System.out.println(name);
        System.out.println(age);
        System.out.println(school);
        System.out.println();
    }
}

public class Heap01 {
    static int num = 10;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.no = 1;
        s1.name = "길동";
        s1.age = 20;
        s1.Show();

        Student s2 = new Student();
        s2.no = 2;
        s2.name = "보고";
        s2.age = 20;
        s2.Show();
        s2.SetNo(5); // 보고 번호 변경
        s2.Show();

        System.out.println(Heap01.num);
    }
}
