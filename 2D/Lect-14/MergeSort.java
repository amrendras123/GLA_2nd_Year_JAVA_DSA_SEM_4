public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,2,3,1,5,6,9,7};
        print(arr);
        Divide(arr,0,arr.length-1);
        print(arr);
    }
    public static void Divide(int[] arr,int lo,int hi){
        if(lo>hi){
            return;
        }
        int mid=(lo+hi)/2;
        Divide(arr, lo, mid);
        Divide(arr, mid+1, hi);
        merge(arr,lo,mid,hi);
    }
    public static void merge(int[] arr,int lo,int mid,int hi){

        int[] ans=new int[hi-lo+1];
        int i=lo;
        int j=mid+1;
        int k=0;
        while(i<=mid&&j<=hi){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }else{
                ans[k]=arr[j];
                k++;
                j++;
            }
        }
        while(j<=hi){
            ans[k]=arr[j];
            k++;
            j++;
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("**************************************");
    }
}
