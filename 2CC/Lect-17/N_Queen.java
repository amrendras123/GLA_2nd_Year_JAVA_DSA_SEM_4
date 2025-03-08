public class N_Queen {

    public static void main(String[] args) {
        int n=8;
        int tq=8;
        boolean[][] board=new boolean[n][n];
        Queen(board,0,tq);
    }
    public static void Queen(boolean[][] board, int row,int tq){
        if(tq==0){
            display(board);
            return ;
        }
        for(int c=0;c<board[0].length;c++){
            if(isItSafeToPlaceTheQueen(board, row, c)){
               board[row][c]=true;
               Queen(board,row+1,tq-1);
               board[row][c]=false;//backtracking step
            }
        }
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row,int col){

        int r=row;
        int c=col;
        //up
        while(r>=0){

            if(board[r][c]==true){
                return false;
            }
            r--;
        }
        //left diagonal
        r=row;
        c=col;
        while(r>=0&&c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r=row;
        c=col;
        while(r>=0&&c<board[0].length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
    public static void display(boolean[][] board){


        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                System.out.print(board[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("*************************************");
    }
}