import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
  public List<String> generateParenthesis(int n) {
       List<String> ll=new ArrayList<>();
       pare(n,0,0,"",ll);
       return ll; 
    }
    public void pare(int n,int op,int cl,String ans,List<String> ll){
        if(op==n&&cl==n){
            ll.add(ans);
            return;
        }
        if(op<n){
            pare(n,op+1,cl,ans+"(",ll);
        }
        if(op>cl){
            pare(n,op,cl+1,ans+")",ll);
        }
    }
}
