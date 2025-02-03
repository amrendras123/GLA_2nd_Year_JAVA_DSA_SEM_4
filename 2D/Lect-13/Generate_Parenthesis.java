import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n=10;
        List<String> ll=new ArrayList<>();
        generate(n,0,0,"",ll);
    }
    public static void generate(int n, int op,int cl,String ans,List<String> ll){
        if(op==n&&cl==n){
            System.out.print(ans+" ");
            ll.add(ans);
            return;
        }
        if(op<n){
            generate(n, op+1, cl, ans+"(",ll);
        }
        if(op>cl){
            generate(n, op, cl+1, ans+")",ll);
        }

    }
}
