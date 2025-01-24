public class Anagramcheck {
    //using frequency Array
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] sarr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sarr[ch-'a']++;
        }
        int[] tarr=new int[26];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            tarr[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(sarr[i]!=tarr[i]){
                return false;
            }
        }
        return true;
    }
    //Anagram check in space optimised in one array
    
        public boolean isAnagramopt(String s, String t) {
            int[] occ=new int[26];
    
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                occ[ch-'a']++;
            }
            for(int i=0;i<t.length();i++){
                char ch=t.charAt(i);
                if(occ[ch-'a']==0){
                   return false;
                }
                occ[ch-'a']--;
            }
            for(int i=0;i<26;i++){
                if(occ[i]>0){
                    return false;
                }
            }
            return true;
        }
    
}
