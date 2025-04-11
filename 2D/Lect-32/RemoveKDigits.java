import java.util.Stack;

public class RemoveKDigits {
      public String removeKdigits(String num, int k) {
        
        String str1=num.valueOf(num);
        StringBuilder sb=new StringBuilder();
        if(k==0)
            return num;
        if(k==num.length())
            return "0";
        
        Stack<Integer> st=new Stack<>();
        int index=0;
        while(index<num.length()){
            
            while(k>0&&!st.isEmpty()&&st.peek()>Character.getNumericValue(str1.charAt(index))){
                k--;
                st.pop();
            }
            st.push(Integer.parseInt(String.valueOf(str1.charAt(index))));
            index++;
        }
        while(k>0){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.remove(0));
        }
        // remove leading zero
    String str = sb.toString();
    String regex = "^0+(?!$)";
    str = str.replaceAll(regex, "");  
    
  return str;
        
    }
}
