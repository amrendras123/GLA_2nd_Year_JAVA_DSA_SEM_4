public class ClimbStair {
    public int climbStairs(int n) {
    
        return climb(0,n);
     }
     public int climb(int curr,int end){
         if(curr==end){
             return 1;
         }
         if(curr>end){
             return 0;
         }
         int s1=climb(curr+1,end);
         int s2=climb(curr+2,end);
         return s1+s2;
     }
}
