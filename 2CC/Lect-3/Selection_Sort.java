public class Selection_Sort {
   public static void main(String[] args) {
    int[] arr={6,7,1,2,3};
    print(arr);
    Selectin(arr);
    System.out.println("after sorting ");
    print(arr);
   } 
   public static void Selectin(int[] arr){

    for(int i=0;i<arr.length-1;i++){
        int s_indx=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[s_indx]){
                s_indx=j;
            }
        }
        if(s_indx!=i){
            int temp=arr[i];
            arr[i]=arr[s_indx];
            arr[s_indx]=temp;
        }
    }
   }
   public static void print(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 }
}
