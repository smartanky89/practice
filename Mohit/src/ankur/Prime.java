package ankur;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args)
	{
		int i,flag =0;
		Scanner a = new Scanner(System.in);
		int n= a.nextInt();
		if(n==0 || n==1)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{	
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+" is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(n+" is a prime number");
		}
		a.close();
	}
	}

}
