public class Selection_Sort {
    
    public static void main(String[] args) {
        int[] arr={6,5,4,3,1,2};
        print(arr);
        Selection(arr);
        print(arr);
    }

    public static void Selection(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int minidx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minidx]){
                    minidx=j;
                }
            }
            if(minidx!=i){
                int temp=arr[i];
                arr[i]=arr[minidx];
                arr[minidx]=temp;
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
