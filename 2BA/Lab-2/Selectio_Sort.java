public class Selectio_Sort {
    public static void main(String[] args) {
        int[] arr={5,1,2,7,8,93,4,10};
        print(arr);
        selection(arr);
        print(arr);
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            }
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("****************************");
    }
}
