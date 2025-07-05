package Java_fundamentals;
import java.util.*;

public class question4b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();  // Get first number
        int num2 = sc.nextInt();  // Get second number

        if (num1 > 0 && num2 > 0) {
            if (num1 % 10 == num2 % 10) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        sc.close(); // Good practice to close Scanner
    }
}
