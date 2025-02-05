public class Count_Maze_Path2 {
    public static void main(String[] args) {
        int row=3;
        int col=3;

        System.out.println(maze(row,col,0,0,""));

    }
    public static int maze(int er,int ec,int cr, int cc,String ans){

        if(cr==er&&cc==ec){
            System.out.println(ans);
            return 1;
        }
        if(cr>er||cc>ec){
            return 0;
        }
        int x=maze(er, ec, cr, cc+1, ans+"H");
        int y=maze(er, ec, cr+1, cc, ans+"V");
        int z=maze(er, ec, cr+1, cc+1, ans+"D");
        return x+y+z;

    }
}
