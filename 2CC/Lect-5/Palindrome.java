public class Palindrome {
    public static void main(String[] args) {
        String s1="nitinq";
        System.out.println(isPalindrome(s1));
    }
    public static boolean isPalindrome(String s){
      int i=0;
      int j=s.length()-1;

      while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
      }
      return true;
    }
}
