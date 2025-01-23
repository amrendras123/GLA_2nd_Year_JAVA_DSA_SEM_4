public class IsomorphicString {
    
    public boolean isIsomorphic(String s, String t) {
       
        int[] inds=new int[200];
        int[] indt=new int[200];
 
        for(int i=0;i<s.length();i++){
 
         if(inds[s.charAt(i)]!=indt[t.charAt(i)]){
             return false;
         }
         inds[s.charAt(i)]=i+1;
         indt[t.charAt(i)]=i+1;
        }
        return true;
     }
}
