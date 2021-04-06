package ankur;
import java.util.*;
public class hmmm {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		try {
			System.out.println("Enter thr first number");
			int b=a.nextInt();
			System.out.println("Enter thr second number");
			int c= a.nextInt();
			double d= b/c;
	System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		a.close();
	}

}
