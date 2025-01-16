class Bubble_Sort{
    public static void main(String[] args) {
        
        int[] arr={5,1,2,7,8,93,4,10};
        print(arr);
        bubble(arr);
        print(arr);

    }
    public static void bubble(int[] arr){
         boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
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