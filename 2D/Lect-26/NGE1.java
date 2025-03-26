import java.util.HashMap;
import java.util.Stack;

public class NGE1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            
            if(st.isEmpty()){
                st.push(nums2[i]);
            }else {
                while(!st.isEmpty()&&nums2[i]>st.peek()){
                map.put(st.peek(),nums2[i]);
                    st.pop();
            }
                st.push(nums2[i]);
            
        }
        }
        while(!st.isEmpty()){
            
            map.put(st.peek(),-1);
            st.pop();
        }
        //int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
           nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}