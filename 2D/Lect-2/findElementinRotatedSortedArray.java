public class findElementinRotatedSortedArray {

    class Solution {
        public int search(int[] nums, int target) {
            
            int lo=0,hi=nums.length-1;
            
            while(lo<hi){
                int mid=lo+(hi-lo)/2;
                
                if(nums[mid]>nums[hi]){
                    lo=mid+1;
                }else{
                    hi=mid;
                }
            }
            int p1=bs(nums,0,lo-1,target);
            int p2=bs(nums,lo,nums.length-1,target);
            
            if(p1!=-1 &&p2==-1)
                return p1;
            if(p2!=-1&&p1==-1)
                return p2;
            return -1;
        }
        public int bs(int[] arr,int l,int h,int trgt){
            int lo=l;
            int hi=h;
            while(lo<=hi){
                
                int mid=lo+(hi-lo)/2;
                if(arr[mid]==trgt){
                    return mid;
                }else if(arr[mid]>trgt){
                    hi=mid-1;
                }else
                    lo=mid+1;
            }
            return -1;
        }
    }
}