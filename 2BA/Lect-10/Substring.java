public class Substring {
    public static void main(String[] args) {
        String str="nitin";
        substring1(str);
        
    }
    public static void substring1(String s){

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
