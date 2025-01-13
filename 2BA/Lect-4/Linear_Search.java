import java.util.Scanner;

class Linear_Search{
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

        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
     }
}