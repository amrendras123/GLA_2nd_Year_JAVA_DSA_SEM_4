public class Bubble_Sort {

    public static void main(String[] args) {
        int[] arr={6,5,4,3,1,2};
        print(arr);
        Bubble(arr);
        print(arr);
    }
    public static void Bubble(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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