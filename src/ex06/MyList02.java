package ex06;

class MyLikedList {
    MyNode root;

    public MyLikedList(){
        root = new MyNode();
    }

    public void add(MyNode node) {
        getLast().next = node;
    }

    public void remove(String key) {
        MyNode temp = root;
        while (temp.getNext() != null) {
            if (temp.getNext().key.equals(key)) {
                if (temp.getNext().getNext() == null) {
                    temp.setNext(null);
                } else {
                    temp.setNext(temp.getNext().getNext());
                }
                break;
            }
            temp = temp.getNext();
        }
    }
    public void remove(MyNode node) {
        MyNode temp = root;
        while (temp.getNext() != null) {
            if (temp.getNext() == node) {
                if (temp.getNext().getNext() == null) {
                    temp.setNext(null);
                } else {
                    temp.setNext(temp.getNext().getNext());
                }
                break;
            }
            temp = temp.getNext();
        }
    }

    public MyNode get(String key) {
        MyNode temp = root.getNext();
        while(temp.getNext()!= null)
        {
            if(temp.key.equals(key))
            {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    private MyNode getLast() {
        MyNode last = root;
        if (last.getNext() == null) return last;

        while (last.getNext() != null) {
            last = last.getNext();
        }

        return last;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("링크드 리스트가 비어있습니다.");
        } else {
            MyNode temp = root.getNext();

            while (temp != null) {
                temp.printInfo();
                System.out.println();
                temp = temp.getNext();
            }
        }
    }

    public boolean isEmpty()
    {
        return root.getNext() == null;
    }
}

class MyNode {
    String key;
    String value;
    MyNode next;

    public MyNode(){}

    public MyNode(String key, String value, MyNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode getNext() {
        return this.next;
    }

    public void printInfo()
    {
        System.out.println("Key is "+key);
        System.out.println("value is "+value);
    }
}


public class MyList02 {
    public static void main(String[] args) {
        MyLikedList myList = new MyLikedList();

        myList.add(new MyNode("name","홍길동",null));
        myList.add(new MyNode("age","11",null));
        myList.add(new MyNode("weight","50",null));
        myList.add(new MyNode("height","170",null));
        myList.add(new MyNode("hobby","baseball",null));

        myList.printAll();

        myList.remove("weight");
        System.out.println("===================");

        myList.printAll();
        System.out.println("===================");

        MyNode node = myList.get("name");
        node.printInfo();
        System.out.println("===================");
        myList.printAll();

        System.out.println("===================");
        myList.remove(node);
        myList.printAll();
    }
}
