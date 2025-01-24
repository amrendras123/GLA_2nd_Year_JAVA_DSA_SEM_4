public class IspalindromeSubstring {
    
    public static void main(String[] args) {
        String str="nitin";
        substring1(str);
    }
    public static void substring1(String s){

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String s1=s.substring(i, j);
                if(isplaindrome(s1)){
                    System.out.println(s1);
                }
            }
        }
    }
    public static boolean isplaindrome(String s){
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
