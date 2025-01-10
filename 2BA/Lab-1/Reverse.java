import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
        //reverse
        rev(arr);
        System.out.println();
       //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void rev(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void revinrange(int[] arr,int si, int ei){
        int i=si;
        int j=ei;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}