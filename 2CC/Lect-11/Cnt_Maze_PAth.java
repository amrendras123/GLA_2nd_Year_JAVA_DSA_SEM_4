public class Cnt_Maze_PAth {
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        System.out.println(mazepath(row, col, 0, 0, ""));
    }

    public static int mazepath(int er, int ec, int cr, int cc, String ans) {
        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            return 1;
        }
        if (cr > er || cc > ec) {
            return 0;
        }
        int x = mazepath(er, ec, cr, cc + 1, ans + "H");
        int y = mazepath(er, ec, cr + 1, cc, ans + "V");
        int z = mazepath(er, ec, cr + 1, cc + 1, ans + "D");
        return x + y + z;
    }
}
