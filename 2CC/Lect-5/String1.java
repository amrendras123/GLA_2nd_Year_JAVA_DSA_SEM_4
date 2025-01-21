class String1{
    public static void main(String[] args) {
        
        String str1="hello";
        String str2=new String("hello");
        String str3="hello";
        String str4=new String("hello");



        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str4);
        System.out.println(str1.equals(str4));

        // System.out.println(str1);
        // // int[] arr={1,2,3,4,5};
        // // System.out.println(arr.toString());

        // String s2=str1+str2;
        // s2=s2.concat(str1);
        // System.out.println(s2);

        // str1=str1+str2;
        // str3=str3+"hi";
        // str3=str1+str3;
        // String s1="hi"+"bye";




    }
}