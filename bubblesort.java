class bubblesort {
    public static void sort(int[] arr){
        int n=arr.length;
        boolean isswapped;
        for(int i=0;i<n-1;i++){
            isswapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isswapped=true;
                }
                
            }
            if(!isswapped){
                    break;
                }
        }
    }
    public static void printarray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
            
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,4,2,10,5,3,6};
        System.out.println("unsorted array:");
        printarray(arr);
        sort(arr);
        System.out.println("sorted array:");
        printarray(arr);
    }
}
