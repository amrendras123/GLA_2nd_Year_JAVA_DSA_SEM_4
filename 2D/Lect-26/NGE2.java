import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NGE2 {
      
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            Stack<Integer> st=new Stack<>();
            int[] arr=new int[nums.length];
            Arrays.fill(arr,-1);
          
            for(int i=0;i<nums.length;i++){
                
                while(st.isEmpty()==false && nums[st.peek()]<nums[i]){
                    arr[st.pop()]=nums[i];     
                }
                st.push(i);
            }
            for(int i=0;i<nums.length;i++){
                if(st.isEmpty())
                    break;
                while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                
                    arr[st.pop()]=nums[i];
                }
                    
            
                }
    //         while(!st.isEmpty())
    //         nums[st.pop()]=-1;
            
           
            return arr;
        }
    }
}
