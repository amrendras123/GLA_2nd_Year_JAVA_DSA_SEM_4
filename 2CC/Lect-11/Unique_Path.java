public class Unique_Path {
    public int uniquePaths(int m, int n) {
        return mazepath(m - 1, n - 1, 0, 0);
    }

    public static int mazepath(int er, int ec, int cr, int cc) {
        if (cr == er && cc == ec) {
            return 1;
        }
        if (cr > er || cc > ec) {
            return 0;
        }
        int x = mazepath(er, ec, cr, cc + 1);
        int y = mazepath(er, ec, cr + 1, cc);
        return x + y;
    }
}
