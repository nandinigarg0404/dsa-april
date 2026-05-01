
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

    void insertm(int position, int data) {  //insert at any specific position
        Node newnNode = new Node(data);
        if (position == 0) {
            newnNode.next = head;
            head = newnNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        newnNode.next = temp.next;
        temp.next = newnNode;
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
        if (head == null) {
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }

    void removem(int position) {
        Node temp = head;
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = temp.next;
            temp.next = null;
            return;
        }
        for (int i = 0; i < position - 1; i++) {
            if (temp==null||temp.next == null) {
                return;
            }
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
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
        lst.insertb(20);
        lst.insertb(30);
        lst.inserte(40);
        lst.inserte(50);
        lst.insertm(3, 45);
        lst.display();
        lst.removem(4);
        //lst.removel();
        //lst.removeb();
        lst.display();
    }
}
