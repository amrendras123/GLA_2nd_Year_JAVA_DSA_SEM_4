public class First_Unique_character {
    public int firstUniqChar(String s) {
        
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            arr[idx]++;
        }
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(arr[idx]==1){
                return i;
            }
        }
        return -1;

    }
}
