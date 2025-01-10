public class Rotate_Array_By_K {
    class Solution {
        public void rotate(int[] nums, int k) {
         
           k=k%nums.length;
           rev(nums,0,nums.length-1);
           rev(nums,0,k-1);
           rev(nums,k,nums.length-1);
    
        }
    
        public void rev(int[] arr,int si,int ei){
    
            while(si<=ei){
                int temp=arr[si];
             arr[si]=arr[ei];
             arr[ei]=temp;
             si++;
             ei--;
            }
        }
    
      
    }
}
