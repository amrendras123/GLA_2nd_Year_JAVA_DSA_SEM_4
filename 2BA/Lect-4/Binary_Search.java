import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
          
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int tar=sc.nextInt();

       int idx= Search(arr, tar);
       System.out.println("target is present At index "+idx);     
     }

     public static int Search(int[] arr,int tar){

        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==tar){
                return mid;
            }else if(arr[mid]>tar){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return -1;
     }
    

}
