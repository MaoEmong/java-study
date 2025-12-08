package ex06;

// 자바는 디폴트 상속값으로 extends Object를 가지고 있다
// 따로 extents Object를 사용하지 않아도 된다
class Data {
    int num;

    public Data(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        // super = 부모 오브젝트 (C#에서는 base)
//        return super.hashCode();
        return 9;
    }
}

public class MyHash extends Object {
    public static void main(String[] args) {
        // 상태는 같으나 주소는 다름
        Data d1 = new Data(1);
        Data d2 = new Data(1);
        Data d3 = d1; // 앝은 복사(주소만 복사)

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        System.out.println();

        if (d1.hashCode() == d2.hashCode())
            System.out.println("같은 주소에 있는 객체");
        else
            System.out.println("다른 주소에 있는 객체");

        if (d1.num == d2.num)
            System.out.println("값이 같습니다");
        else
            System.out.println("값이 다릅니다");

        System.out.println();

        if (d1.hashCode() == d3.hashCode())
            System.out.println("같은 주소에 있는 객체 / 앝은 복사");
        else
            System.out.println("다른 주소에 있는 객체 / 다른 객체");
    }
}
