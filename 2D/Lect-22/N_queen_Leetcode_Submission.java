import java.util.ArrayList;
import java.util.List;

public class N_queen_Leetcode_Submission {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        
        char [][] board = new char[n][n];
        //initialize all the row,col with dots
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        
        List<List<String>> ans = new ArrayList<>();
        queen(board,n, 0, ans);
        return ans;
    }

   public static void queen(char[][] board,int tq, int row, List<List<String>> ans) {

        if(tq==0) {

            ans.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isItSafeToPlaceTheQueen(board, row, col)) {
                board[row][col] = 'Q';//mark true
                queen(board,tq-1, row + 1, ans);
                board[row][col] = '.';//undo backtracking steps
            }
        }
    }

   public static List<String> construct(char[][] board) {

        List<String> ll = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            ll.add(row);
        }
        return ll;
    }

    public static boolean isItSafeToPlaceTheQueen(char[][] board, int row, int col) {

        int r = row;
        int c = col;
        // up
        while (r >= 0) {

            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
        }
        // up-diagonal
        r = row;
        c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        // diagonal 2
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }

        return true;

    }

}
