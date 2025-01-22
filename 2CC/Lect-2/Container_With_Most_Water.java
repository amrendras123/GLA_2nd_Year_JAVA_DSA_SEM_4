public class Container_With_Most_Water {
    class Solution {
        public int maxArea(int[] ht) {
    
            int i=0;
            int j=ht.length-1;
            int maxar=0;
            while(i<=j){
                int area=Math.min(ht[i],ht[j])*(j-i);
                maxar=Math.max(maxar,area);
                if(ht[i]<ht[j])
                i++;
                else
                j--;
    
            }
            return maxar;
            
        }
    }
}
