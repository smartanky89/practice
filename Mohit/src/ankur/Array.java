package ankur;
import java.util.Scanner;
public class Array {
public static void main(String[] args)
{
	Scanner a= new Scanner(System.in);
	System.out.println("How amy numbers you want to compare?");
	int n= a.nextInt();
	int[] x= new int[n];
	System.out.println("Enter element");
	for(int i=0; i<n;i++)
	{
		x[i]=a.nextInt();
	}
	System.out.println("Array is:");
	for(int i:x)
	{
	System.out.println(i);
	}
	a.close();
}
}
