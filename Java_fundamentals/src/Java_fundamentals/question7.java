package Java_fundamentals;
import java.util.*;
public class question7 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		if(ch1<ch2) {
			System.out.print(ch1 + "," +ch2);
		}
		else {
			System.out.print(ch2 + "," +ch1);
		}
	}

}



