package arrays;
import java.util.*;
public class array5 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
	        System.out.println("Enter size of array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        Arrays.sort(arr);

	        System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);
	        System.out.println("Largest two numbers: " + arr[n - 2] + ", " + arr[n - 1]);
	    }

		



}