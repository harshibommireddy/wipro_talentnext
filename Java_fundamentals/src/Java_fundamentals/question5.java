package Java_fundamentals;
import java.util.*;

public class question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // Read an integer from user input

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close(); // Good practice to close the scanner
    }
}
