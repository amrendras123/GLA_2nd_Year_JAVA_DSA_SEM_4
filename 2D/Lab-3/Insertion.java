public class Insertion {

    public static void main(String[] args) {
        int[] arr={6,5,4,3,1,2};
        print(arr);
        insertion(arr);
        print(arr);
    }
    public static void insertion(int[] arr){

        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int curr=arr[i];
            while(j>=0&&arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("*************************************************");
    }
}