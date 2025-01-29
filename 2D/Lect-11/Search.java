public class Search {

    public static void main(String[] args) {
        int[] arr={2,3,2,1,2,3,4,5,4,3,2};
        int ele=2;
        System.out.println(findFirstOcc(arr,ele,0));
        System.out.println(findLastOcc(arr, ele, arr.length-1));
    }
    public static int findFirstOcc(int[] arr,int ele,int i){
         if(i==arr.length){//base case
            return -1;
         }
        if(arr[i]==ele){
            return i;
        }
       return findFirstOcc(arr, ele, i+1); //sp   
    }
    public static int findLastOcc(int[] arr,int ele,int i){
        if(i==-1){//base case
           return -1;
        }
       if(arr[i]==ele){
           return i;
       }
      return findLastOcc(arr, ele, i-1); //sp   
   }
}