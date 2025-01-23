public class ReverseVowel {
    

    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();//convert string into char Array
        while(i<j){
            char ch1=arr[i];
            char ch2=arr[j];
            if(isvowel(ch1)&&isvowel(ch2)){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(isvowel(ch1)){
                j--;
            }else{
                i++;
            }
        }
        return new String(arr);//convert character Array into string  
    }
    public boolean isvowel(char ch){

     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                return true;
            }

            return false;
    }
}
