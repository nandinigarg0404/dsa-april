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
    public void display(){
        if(front==-1){
            System.out.println("queue is empty");
        }
        int i=front;
        /*while(i!=rear+1){
            System.out.print(queue[i]+" ");  \\gives infinite 
            i=(i+1)%(size-1);
        }
        System.out.println();*/
        do { 
            System.out.println(queue[i]+" ");
            i=(i+1)%size;
        } while (i!=(rear+1)%size);
    }
    public void dequeue(){
        if(front==-1){
            System.out.println("queue is empty");
        }
        front=(front+1)%size;
        System.out.println("element is dequeued");
    }
}
class circularqueue{
    public static void main(String[] args) {
        circqueue cobj=new circqueue(6);
        cobj.enqueue(5);
        cobj.enqueue(10);
        cobj.enqueue(15);
        cobj.enqueue(20);
        cobj.enqueue(25);
        cobj.enqueue(30);
        cobj.display();
        cobj.dequeue();
        cobj.dequeue();
        cobj.display();
    }
}
