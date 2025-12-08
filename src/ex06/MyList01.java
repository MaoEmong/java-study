package ex06;

class Node {
    String key;
    String value;
    Node next;

    public Node(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void add(Node data) {
        Node temp = this.next;
        this.next = data;
        data.next = temp;
    }

    public void remove(Node head) {
        Node temp = head;

        while (temp != null) {
            if (temp.next == this)
                break;

            temp = temp.next;
        }
        if (temp != null)
            temp.next = this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void printAll() {
        Node temp = this;

        while (temp != null) {
            System.out.println(temp.key);
            System.out.println(temp.value);
            System.out.println();

            temp = temp.next;
        }

    }
}

public class MyList01 {
    public static void main(String[] args) {
        Node n1 = new Node("name", "홍길동", null);
        Node n2 = new Node("age", "11", null);
        n1.setNext(n2);
        Node n3 = new Node("weight", "50", null);
        n2.setNext(n3);
        n1.printAll();
        System.out.println("================================");
        n3.remove(n1);
        n1.printAll();
        System.out.println("================================");
        Node n4 = new Node("height", "160", null);
        n2.add(n4);
        n1.printAll();


        String s1 = "";
        s1.equals("ss");

    }
}
