
import java.util.Scanner;

class linearsearch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of elements of array");
        int l = sc.nextInt();
        int index = -1;
        int[] arr = new int[l];
        System.out.println("enter elements of array:");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int x = sc.nextInt();
        for (int j = 0; j < l; j++) {
            if (arr[j] == x) {
                index = j;
                System.out.println("element found at index: " + j);
                break;
            }
        }
        if (index == -1) {
            System.out.println("element not found!!");
        }

    }
}
