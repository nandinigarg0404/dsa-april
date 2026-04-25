
import java.util.Stack;

class stack4 {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        Stack<Integer> sc2 = new Stack<>();
        sc2.push(4);
        sc2.push(5);
        sc2.push(6);
        Stack<Integer> sc3 = new Stack<>();
        while (!sc2.isEmpty()) {
            sc3.push(sc2.pop());
            count1++;

        }
        while (!sc.isEmpty()) {
            sc3.push(sc.pop());
            count2++;
        }
        int[] arr = new int[count1 + count2];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc3.pop();

            System.out.println(arr[i]);
        }

    }
}
