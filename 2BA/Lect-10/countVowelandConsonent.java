public class countVowelandConsonent {
    
    public static void main(String[] args) {
        String s="abcbdeioubdcsfgh";
        count(s);
    }
    public static void count(String s){
        int cntV=0;
        int cntc=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                cntV++;
            }else{
                cntc++;
            }
        }
        System.out.println("no of vowel is "+cntV);
        System.out.println("count of consonent is "+cntc);
    }
}
