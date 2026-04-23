
import java.util.Stack;

class stack3 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 2,10};
        Stack<Integer> x = new Stack<>();
        for (int k = 0; k < arr.length; k++) {
            int l = -1;
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[j] > arr[k]) {
                    l = arr[j];
                    break;
                }
            }
            x.push(l);
        }

        System.out.print(x + " ");
    }
}
