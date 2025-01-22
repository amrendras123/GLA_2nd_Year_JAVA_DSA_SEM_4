import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s1=sc.next();

        String s1="hello";
        String s2=new String("hello");
        String s3="hello";
        String s4=new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s1.equals(s4));

    }
}
