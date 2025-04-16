import java.util.Stack;

public class DecodeString {

     public String decodeString(String s) {
       Stack<Integer> cnt=new Stack<>();
        Stack<StringBuilder> strStack=new Stack<>();
        int num=0; 
        StringBuilder str=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch>='0'&&ch<='9'){
             num=num*10+ch-'0';
            }else if(ch=='['){
                cnt.push(num);
                num=0;
                strStack.push(str);
                str=new StringBuilder();

            }else if(ch==']'){
              int count=cnt.pop();
              StringBuilder temp=str;
              str=strStack.pop();
              while(count-->0){
                str.append(temp);
              }
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}