class selectionsort {
    public static void selection(){
        int[] arr={5,3,8,4,2};
        for(int i=0;i<arr.length;i++){
            int select=i;
            //int j=i-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[select]){
                    select=j;
                }
                int temp=arr[select];
                arr[select]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        selection();
    }
}
