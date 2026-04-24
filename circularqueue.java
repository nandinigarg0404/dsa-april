class circqueue {
    int[] queue;
    int front,rear,size;

    public circqueue(int size) {
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=-1;    
    }
    public void enqueue(int elememts){
        if((rear+1)%size==front){
            System.out.println("queue is full");
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        queue[rear]=elememts;
        System.out.println(elememts+" inserted");

    }
}
class circularqueue{
    public static void main(String[] args) {
        circqueue cobj=new circqueue(6);
        cobj.enqueue(5);
        cobj.enqueue(10);
        cobj.enqueue(15);
        cobj.enqueue(20);
    }
}
