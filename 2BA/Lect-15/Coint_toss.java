public class Coint_toss {
    public static void main(String[] args) {
        int n = 5;
        coin(n, "");
    }

    public static void coin(int n, String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return;
        }
        coin(n - 1, ans + "H");
        coin(n - 1, ans + "T");
    }
}
