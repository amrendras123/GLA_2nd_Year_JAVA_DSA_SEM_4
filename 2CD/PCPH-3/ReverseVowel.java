public class ReverseVowel {

    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            char chi=arr[i];
            char chj=arr[j];
            if(isVowel(chi)&&isVowel(chj)){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(isVowel(chi)){
                j--;
            }else{
                i++;
            }
        }
        return new String(arr);
        
    }
    public boolean isVowel(char ch){

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
}