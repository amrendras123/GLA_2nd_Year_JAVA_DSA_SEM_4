import java.util.ArrayList;

public class Letter_comb {
    static String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String dig="2345";
      List<String> ll=new ArrayList<>();
        com(dig,"",ll);
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
