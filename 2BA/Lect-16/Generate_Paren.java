import java.util.ArrayList;
import java.util.List;

public class Generate_Paren {

    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        int n = 3;
        pare(n, 0, 0, "", ll);
    }

    public static void pare(int n, int op, int cl, String ans, List<String> ll) {
        if (op == n && cl == n) {
            System.out.println(ans);
            ll.add(ans);
            return;
        }
        if (op < n) {
            pare(n, op + 1, cl, ans + "(", ll);
        }
        if (op > cl) {
            pare(n, op, cl + 1, ans + ")", ll);
        }
    }
}