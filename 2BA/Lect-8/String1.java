class String1{
    public static void main(String[] args) {
        String s1="hello";
        String s2=new String("hello");
        String s3="hello";
        String s4=new String("hello");
        System.out.println(s1);

        s1=s1+s2;
        s2=s2+s3;
        s3=s3+"hey";
        s4=s3+"bye";
        String s5="hi"+"bye";

        // int[] arr={1,2,3,4};
        // System.out.println(arr);
    }
}