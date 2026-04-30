

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
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }
}


class linkedlist {
    public static void main(String[] args) {
        link lst=new link();
        lst.insert(10);
        lst.insert(30);
        lst.display();
    }

}
