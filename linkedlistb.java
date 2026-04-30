class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class link{
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
    void insertb(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("");
    }
}
public class linkedlistb {
    public static void main(String[] args) {
        link ls=new link();
        ls.insert(10);
        ls.insert(20);
        ls.insertb(30);
        ls.display();
        System.out.println();
    }
}
