
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

    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    int find(int data) {
        Node temp = head;
        int x = 0;
        while (temp != null) {
            if (temp.data == data) {
                break;
            }
            x++;
            temp = temp.next;
        }
        //System.out.println(x);
        return x;
    }
}

class linklist1 {

    public static void main(String[] args) {
        link lst = new link();
        lst.insert(10);
        lst.insert(20);
        lst.insert(30);
        lst.insert(40);
        lst.insert(50);
        lst.insert(60);
        lst.insert(70);
        lst.insert(80);
        lst.insert(90);
        lst.display();
        System.out.println("element found at index: " + lst.find(70));

    }
}
