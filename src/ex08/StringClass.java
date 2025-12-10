package ex08;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        String s = "Hello World!";
        int size = s.length();
        char c = s.charAt(0);
        String result = "A chain" + " is only as strong"+" as its weakest link";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        s = "The cat is on the table";
        int index = s.indexOf("table");

        if(index == -1)
            System.out.println("table은 없습니다");
        else
            System.out.println("table의 위치 : "+index);

        String[] tokens = "I am a boy.".split(" ");
        for(String token : tokens)
            System.out.println(token);

        tokens = null;
        tokens = "100,200,300".split(",");
        for(String token : tokens)
            System.out.println(token);

        StringBuffer sb = new StringBuffer("Happiness depends upon ourselves");

        sb = new StringBuffer("Hello");
        int length = sb.length();
        int capacity = sb.capacity();

        sb = new StringBuffer("10+20=");
        sb.append(10+20);
        sb.insert(0,"수식 ");
        System.out.println(sb);

    }
}
