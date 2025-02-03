public class Count_Maze_Path {
    public static void main(String[] args) {
        int n=20;
       System.out.println(mazePath(n,0,""));
    }
    public static int mazePath(int end,int curr, String ans){

        if(curr==end){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int cnt=0;
    //    int x= mazePath(end, curr+1, ans+1);
    //    int y= mazePath(end, curr+2, ans+2);
    //    int z= mazePath(end, curr+3, ans+3);
        for(int i=1;i<=6;i++){
            cnt+=mazePath(end, curr+i, ans+i);
        }
        return cnt;
    }
}
