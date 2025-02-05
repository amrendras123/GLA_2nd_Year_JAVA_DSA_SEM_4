public class Maze_Path {

    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        mazepath(row, col, 0, 0, "");
    }

    public static void mazepath(int er, int ec, int cr, int cc, String ans) {
        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            return;
        }
        if (cr > er || cc > ec) {
            return;
        }
        mazepath(er, ec, cr, cc + 1, ans + "H");
        mazepath(er, ec, cr + 1, cc, ans + "V");
        mazepath(er, ec, cr + 1, cc + 1, ans + "D");
    }
}