
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class link {

    Node head;

    void insertc(int data) { //at centre
        Node newnode = new Node(data);
    }

    void insertb(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void inserte(int data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head = newnNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newnNode;
    }

    void removel() {  //remove  from end
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void removeb() { //remove from beginning
        if(head==null){
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("");
    }
}

class linkedlistc {

    public static void main(String[] args) {
        link lst = new link();
        lst.insertc(10);
        lst.insertb(20);
        lst.insertb(30);
        lst.inserte(40);
        lst.inserte(50);
        lst.display();
        lst.removel();
        lst.removeb();
        lst.display();
    }
}
