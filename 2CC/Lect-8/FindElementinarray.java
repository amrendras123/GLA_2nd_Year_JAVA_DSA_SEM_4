public class FindElementinarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3};
        int item=4;
        System.out.println(find(arr,item,0));
        System.out.println(findLast(arr, item, arr.length-1));
    }
    public static int find(int[]arr,int ele,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==ele){
            return i;
        }
        int ans=find(arr, ele, i+1);

        return ans;
    }
    public static int findLast(int[]arr,int ele,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==ele){
            return i;
        }
        int ans=find(arr, ele, i-1);

        return ans;
    }
}
