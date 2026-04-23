class binsearch{
    public static int binsearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num={10,20,30,40,50,60,70};
        int result= binsearch(num, 40);
        if(result<0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at "+result);
        }
    }
}