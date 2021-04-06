package ankur;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args)
	{
		Scanner a= new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name= a.nextLine();
		System.out.println("Enter your Height:");
		double h= a.nextDouble();
		System.out.println("Enter your Weight:");
		int w= a.nextInt();
		double bmi= w/(h*h);
		if(bmi> 25)
		{
			System.out.println(name+"'s BMI is:"+bmi+ "and he is over weight");
		}
		else if(bmi< 20)
		{
			System.out.println(name+"'s BMI is:"+bmi+ "and he is under weight");
		}
		else if(bmi<25 && bmi>20)
		{
			System.out.println(name+"'s BMI is:"+bmi+ "and he is in perfect shape");
		}
		a.close();
	}
}
