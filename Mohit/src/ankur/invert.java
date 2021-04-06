package ankur;
import java.util.Scanner;
public class invert {
public static void main(String[] args)
{
	String rev= "";
	Scanner a= new Scanner(System.in);
	System.out.println("Enter the string");
	String first=a.nextLine();
	int length= first.length();
	for(int i= length- 1;i>=0;i--)
	rev= rev +first.charAt(i);
		System.out.println(rev);
	a.close();
}
}
																				