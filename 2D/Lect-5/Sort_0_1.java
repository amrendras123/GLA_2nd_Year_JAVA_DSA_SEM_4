public class Sort_0_1 {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,0,1,0,0,1};
        sort(arr);
        print(arr);

    }
    public static void sort(int[] arr){
           int i=0;
           int j=0;
           while(j<arr.length){
            if(arr[j]==0){
                arr[j]=arr[i];
                arr[i]=0;
                i++;
            }
            j++;
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
