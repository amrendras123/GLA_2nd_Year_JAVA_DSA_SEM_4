import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class threeSum {
     public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> ll=new ArrayList<>();
                    ll.add(nums[i]);
                    ll.add(nums[j]);
                    ll.add(nums[k]);
                    j++;
                   ans.add(ll);
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
         }
         return new ArrayList<>(ans);    
    }
}
