import java.util.ArrayList;

public class Generate_Parenthis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        pare(n,0,0,"",ll);
        return ll;
    }
    public static void pare(int n,int op,int cl,String ans, List<String> ll){
        if(op==n&&cl==n){
            System.out.println(ans);
            ll.add(ans);
            return ;
        }
        if(op<n){
            pare(n, op+1, cl, ans+"(",ll);
        }
        if(op>cl){
            pare(n, op, cl+1, ans+")",ll);
        }
    }
}
