//works on gdb:(
class sort2d {

    public static void main(String[] args) {
        int[][] arr = {{2, 1, 3},
        {5, 4, 6}};
        boolean isswapped;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            isswapped = false;
            for (int j = 0; j < arr[i].length - 1; j++) {

                for (int k = 0; k < arr[i].length - 1 - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                        isswapped = true;
                    }
                }
            }
            if (!isswapped) {
                break;
            }
        }
        for (int x = 0; x< arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println("");
        }
    }

}
