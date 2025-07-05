package Java_fundamentals;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner th = new Scanner(System.in);
        String str1 = th.nextLine();
        System.out.println("Welcome " + str1);
        th.close(); // Optional but good practice
    }
}
