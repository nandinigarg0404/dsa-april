
import java.util.LinkedList;
import java.util.Queue;

class queue {
    public static void main(String[] args) {
        Queue<Integer> que=new LinkedList<>();
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(9);
        int count=0;
        while(!que.isEmpty()){
            que.remove(que.peek());
            count++;
        }
        System.out.println("elememts in queue are="+count);
    }
}
