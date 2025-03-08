public class N_Queens {

    static int cnt = 0;

    public static void main(String[] args) {
        int n = 4;
        int tq = 4;
        boolean[][] board = new boolean[n][n];
        queen(board, tq, 0);
        System.out.println(
                cnt + " total number of ways to place the " + n + " queen on " + n + " X " + n + " chess board");

    }

    public static void queen(boolean[][] board, int tq, int row) {

        if (tq == 0) {
            display(board);
            cnt++;
            return;
        }
        for (int c = 0; c < board[0].length; c++) {
            if (isItSafeToPlaceTheQueen(board, row, c)) {
                board[row][c] = true;
                queen(board, tq - 1, row + 1);
                board[row][c] = false;// backtracking step
            }
        }
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {

        int r = row;
        int c = col;
        // up
        while (r >= 0) {

            if (board[r][c] == true) {
                return false;
            }
            r--;
        }
        // up-diagonal
        r = row;
        c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c--;
        }
        r = row;
        c = col;
        // diagonal 2
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
            c++;
        }

        return true;

    }

    public static void display(boolean[][] board) {

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("***********************************************");
    }
}