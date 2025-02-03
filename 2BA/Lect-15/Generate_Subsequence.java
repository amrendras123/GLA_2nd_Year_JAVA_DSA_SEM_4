public class Generate_Subsequence {

    public static void main(String[] args) {
        String s = "abc";
        sub(s, "");
    }

    public static void sub(String s, String ans) {

        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        sub(s.substring(1), ans);
        sub(s.substring(1), ans + ch);
    }
}