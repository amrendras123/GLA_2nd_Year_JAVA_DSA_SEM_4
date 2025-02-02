public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String one = s.toLowerCase();
        String two = one.replaceAll(" ","");
        String three = two.replaceAll("[^a-z0-9]", "");
        int j = three.length()-1;
            int i=0;
        while(i<j){
            if(three.charAt(i) != three.charAt(j))
                return false;
            
                i++;
                j--;
        }
        return true;  
    }
}