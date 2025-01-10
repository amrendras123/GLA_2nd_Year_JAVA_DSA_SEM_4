public class Majority_Element1 {
    public int majorityElement(int[] nums) { 
        int val=nums[0];
        int cnt=1;
        for(int i=1;i<nums.length;i++){
          if(nums[i]==val){
              cnt++;
          }else{
              if(cnt>0){
                  cnt--;
              }else{
                  val=nums[i];
                  cnt=1;
              }
          }
        }
        return val;   
      }
}
