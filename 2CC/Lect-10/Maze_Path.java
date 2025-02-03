public class Maze_Path {
    public static void main(String[] args) {
        int n=20;
        maze(n,0,"");
    }
    public static void maze(int end,int curr,String ans){
        if(curr==end){
            System.out.print(ans+" ");
            return ;
        }
        if(curr>end){
            return ;
        }
        // maze(end, curr+1, ans+1);
        // maze(end, curr+2, ans+2);
        // maze(end, curr+3, ans+3);
        for(int dice=1;dice<=6;dice++){
            maze(end,curr+dice,ans+dice);
        }
    }
}
