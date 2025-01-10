class Binary{
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int  tar=91;

        System.out.println(binary_Search(arr, tar));
        
    }
    public static int binary_Search(int[] arr,int tar){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==tar){
                return mid;
            }else if(arr[mid]<tar){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return -1;
    }
}