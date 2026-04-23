
class linearsearch3 {

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 6, 8, 2};
        int m = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            m = arr[i];
            n = arr[i];
            for (int j = 1; j < arr.length; j++) {
                if (m < arr[j]) {
                    m = arr[j];
                }
                if (n > arr[j]) {
                    n = arr[j];
                }
            }
        }
        System.out.println("largest no. is: " + m);
        System.out.println("smallest no. is: " + n);
    }
}
