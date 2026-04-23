class insertionsort{
    public static void insert(){
        int[] arr={3,5,2,4,8,6};
        for(int i=1;i<arr.length;i++){
            int ins=arr[i];
            int j=i-1;

            while(j>=0&&arr[j]>ins){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        insert();
    }
}