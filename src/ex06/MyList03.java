package ex06;

class MyDoublyLikedList {
    DNode root;
    int size;

    MyDoublyLikedList() {
        root = new DNode();
        size = 0;
    }

    public void addIndex(DNode node, int index) {
        if (index > size - 1) {
            System.out.println("입력한 인덱스값이 리스트의 크기보다 큽니다\nEXIT");
            return;
        }
        DNode head = getNodeIndex(index - 1);
        DNode temp = head.getTail();

        head.setTail(node);
        node.setHead(head);
        node.setTail(temp);
        temp.setHead(node);
        size++;
    }

    public void addTail(DNode node) {
        node.setHead(getLastNode());
        getLastNode().setTail(node);

        size++;
    }

    public void removeIndex(int index) {
        if (index > size - 1) {
            System.out.println("입력한 인덱스값이 리스트의 크기보다 큽니다\nEXIT");
            return;
        }

        DNode node = getNodeIndex(index);
        DNode head = node.getHead();
        DNode tail = node.getTail();
        node.setHead(null);
        node.setTail(null);

        head.setTail(tail);
        if(tail != null)
        tail.setHead(head);

        size--;
    }

    public void removeTail() {
        DNode tail = getLastNode();
        DNode head = tail.getHead();
        head.setTail(null);
        tail.setHead(null);
        size--;
    }

    public void printSize() {
        System.out.println("현재 리스트의 크기는 " + size + "입니다");
    }

    public void printAll() {
        DNode node = root.getTail();

        while (node != null) {
            node.printInfo();
            node = node.tail;
        }
        System.out.println();
    }

    public DNode getLastNode() {
        DNode result = root;

        while (result.getTail() != null) {
            result = result.getTail();
        }
        return result;
    }

    public DNode getNodeIndex(int index) {
        if (index > size - 1) {
            System.out.println("입력한 인덱스값이 리스트의 크기보다 큽니다\nEXIT");
            return null;
        }

        DNode node = root.getTail();
        for (int i = 0; i < index; i++) {
            node = node.getTail();
        }

        return node;
    }
}

class DNode {
    DNode head;
    DNode tail;
    String key;
    String value;

    public DNode() {
    }

    public DNode(String key, String value) {
        this.key = key;
        this.value = value;
        this.head = null;
        this.tail = null;
    }

    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }

    public DNode getTail() {
        return tail;
    }

    public void setTail(DNode tail) {
        this.tail = tail;
    }

    public void printInfo() {
        System.out.print("[" + key + " is " + value + "]");
    }
}


public class MyList03 {
    public static void main(String[] args) {
        MyDoublyLikedList DLinkedList = new MyDoublyLikedList();
        // 현재 리스트 크기 출력
        DLinkedList.printSize();
        // 마지막 꼬리 뒤에 데이터 추가
        DLinkedList.addTail(new DNode("name", "홍길동"));
        DLinkedList.addTail(new DNode("age", "11"));
        DLinkedList.addTail(new DNode("height", "170"));
        DLinkedList.addTail(new DNode("weight", "70"));
        DLinkedList.printAll();
        // 마지막 꼬리 지우기
        DLinkedList.removeTail();
        System.out.println("================================");
        DLinkedList.printAll();
        // 중간 데이터 삽입(인덱스 2번)
        DLinkedList.addIndex(new DNode("hobby","baseball"), 2);
        System.out.println("================================");
        DLinkedList.printAll();
        // 중간 데이터 삭제(인덱스 3번)
        DLinkedList.removeIndex(3);
        System.out.println("================================");
        DLinkedList.printAll();
        // 현재 리스트 크기 출력
        DLinkedList.printSize();
    }
}
