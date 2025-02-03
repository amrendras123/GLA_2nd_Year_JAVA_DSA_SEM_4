public class Maze_Path {

    public static void main(String[] args) {
        int n=10;
        mazePath(n,0,"");
    }
    public static void mazePath(int end,int curr, String ans){

        if(curr==end){
            System.out.print(ans+" ");
            return;
        }
        if(curr>end){
            return ;
        }
        // mazePath(end, curr+1, ans+1);
        // mazePath(end, curr+2, ans+2);
        // mazePath(end, curr+3, ans+3);
        for(int i=1;i<=6;i++){
            mazePath(end, curr+i, ans+i);
        }
    }
}