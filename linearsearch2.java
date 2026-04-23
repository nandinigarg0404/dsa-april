class linearsearch2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,5,1};
        int findElement=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==findElement){
                count++;
            }
        }
        System.out.println("the desired number occurs "+count+" times");
    }
}
