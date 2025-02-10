class QuickSort{
   public static void main(String[] args) {
    int[] arr={48,7,8,54,43,3,2,2,4,6,7,8,10};
    print(arr);
    quicksort(arr,0,arr.length-1);
    print(arr);
   }
   public static void quicksort(int[] arr,int lo,int hi){
    if(lo>=hi){
        return;
    }
    int pivot=part(arr,lo,hi);
    quicksort(arr, lo, pivot-1);
    quicksort(arr, pivot+1, hi);
   }
   public static int part(int[] arr,int lo, int hi){
    int idx=lo;
    int pivot=arr[hi];
    for(int i=lo;i<hi;i++){
       if(arr[i]<=pivot){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
        idx++;
       }
    }
    int temp=arr[hi];
    arr[hi]=arr[idx];
    arr[idx]=temp;
    return idx;
   }
   public static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("**********************************");
   }
}