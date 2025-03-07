public class LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        
        if(name.length()>typed.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(i<name.length()&&j<typed.length()){
            
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(j>0&&name.charAt(i-1)==typed.charAt(j)){
                j++;
            }else{
                return false;
            }
        }
        while(j<typed.length()){
            if(name.charAt(i-1)!=typed.charAt(j)){
                return false;
            }
            j++;
        }
        return (i==name.length()&&j==typed.length());
    }
}
