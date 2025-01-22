
public class ifelse {
 
    public static void main(String[] args) {
      
        int a = 25;
        double w = 65.5;
      
        if (a >= 18) {
            if (w >= 50.0) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You must weigh at least 50 kilograms to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
    }
}