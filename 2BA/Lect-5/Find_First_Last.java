import java.util.Scanner;

public class Find_First_Last {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();

        find(arr, tar);
    }
    public static void find(int[] arr, int tar){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                System.out.println("first occ. at index "+i);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==tar){
                System.out.println("Last occ. at index "+i);
                break;
            }
        }
    }
}