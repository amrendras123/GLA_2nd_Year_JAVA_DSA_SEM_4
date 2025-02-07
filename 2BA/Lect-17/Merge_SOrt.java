public class Merge_SOrt {

    public static void main(String[] args) {
        int[] arr={4,3,2,1,3,4,5,6,7,8};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        divide(arr,0,arr.length-1);
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void divide(int[] arr,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int mid=(lo+hi)/2;
        divide(arr, lo, mid);
        divide(arr, mid+1, hi);
        merge(arr,lo,mid,hi);
    }
    public static  void merge(int[] arr,int lo,int mid, int hi){
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
                j++;
                k++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=hi){
            ans[k]=arr[j];
            j++;
            k++;
        }
        for(int el=0;el<ans.length;el++){
            arr[lo]=ans[el];
            lo++;
        }
    }
}