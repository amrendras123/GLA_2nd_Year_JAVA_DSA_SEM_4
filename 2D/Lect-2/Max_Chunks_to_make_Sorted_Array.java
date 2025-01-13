public class Max_Chunks_to_make_Sorted_Array {
    
    public int maxChunksToSorted(int[] arr) {
        
        int max=arr[0];
        int cnt=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
               max=arr[i];
            }
            if(max==i){
                cnt++;
                max=i;
            }
        }
        return cnt;
    }
}
