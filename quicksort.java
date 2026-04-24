class quicksort {
    public static void sort(int[] arr,int low,int high){
        if(low<high){
            int part=partition(arr, low, high);
            sort(arr,low,part-1);
            sort(arr,part+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={7,3,8,2,5,4};
        sort(arr, 0, arr.length-1);
        System.out.println("ordered array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
