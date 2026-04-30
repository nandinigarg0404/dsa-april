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
        Node temp=null;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void display(){
        Node temp=null;
        while(temp!=head){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
}
public class linkedlistb {
    public static void main(String[] args) {
        link ls=new link();
        ls.insert(10);
        ls.insert(20);
        ls.display();
    }
}
