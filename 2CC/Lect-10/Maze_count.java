public class Maze_count {
    public static void main(String[] args) {
        int n=20;
        System.out.println(maze(n,0,""));
    }
    public static int maze(int end,int curr,String ans){
        int cnt=0;
        if(curr==end){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>end){
            return 0;
        }
    //    int x= maze(end, curr+1, ans+1);
    //     int y=maze(end, curr+2, ans+2);
    //     int z=maze(end, curr+3, ans+3);
        for(int dice=1;dice<=6;dice++){
            cnt+=maze(end,curr+dice,ans+dice);
        }
        // return x+y+z;
        return cnt;
    }
}
