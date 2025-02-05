import java.util.ArrayList;
import java.util.List;

public class Letter_Comb {

    static String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
     List<String> ll=new ArrayList<>();
     if(digits.length()==0){
        return ll;
     }
        com(digits,"",ll);
        return ll;
    }
    public static void com(String dig,String ans,List<String> ll){
        if(dig.length()==0){
            System.out.print(ans+" ");
            ll.add(ans);
            return;
        }
        char ch=dig.charAt(0);
        int idx=ch-48;
        String key=arr[idx];//abc
        for(int i=0;i<key.length();i++){
            com(dig.substring(1),ans+key.charAt(i),ll);
        }
    }
}