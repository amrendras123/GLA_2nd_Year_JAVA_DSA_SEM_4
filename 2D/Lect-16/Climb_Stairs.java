public class Climb_Stairs {
    public int climbStairs(int n) {
       return climb(n,0,"");
    }
    public int climb(int end,int curr,String ans){
        if(curr==end){
            System.out.println(ans);
            return 1;
        }
        if(curr>end){
            return 0;
        }
       
       int w1= climb(end,curr+1,ans+1);
        int w2=climb(end,curr+2,ans+2);
        return w1+w2;
    }
}
