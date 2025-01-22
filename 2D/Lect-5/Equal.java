public class Equal {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(equals(s1, s2));
    }
    public static boolean equals(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1==s2){
            return true;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
