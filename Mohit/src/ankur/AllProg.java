package ankur;

import java.util.Scanner;

public class AllProg {
	static Scanner s = new Scanner(System.in);

	public static void palindromeWhile() {
		System.out.println("Enter The number");
		int num = s.nextInt(), reversedNum = 0, orignalNum, rem;
		orignalNum = num;
		while (num != 0) {
			rem = num % 10;
			reversedNum = reversedNum * 10 + rem;
			num /= 10;
		}
		if (orignalNum == reversedNum) {
			System.out.println(orignalNum + " is a palindrome number");
		} else {
			System.out.println(orignalNum + " is not a palindrome number");
		}
	}

	public static void palindromeFor() {
		System.out.println("Enter The number");
		int orignalInt, reverseInt = 0, rem, num = s.nextInt();
		orignalInt = num;
		for (; num != 0; num /= 10) {
			rem = num % 10;
			reverseInt = reverseInt * 10 + rem;
		}
		if (orignalInt == reverseInt) {
			System.out.println(orignalInt + " is a palindrome number");
		} else {
			System.out.println(orignalInt + " is not a palindrome number");
		}

	}

	public static void febo() {
		System.out.println("Enter The number of itterations");
		int a = 0, b = 1, n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.print(a + "  ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static void prime() {
		int num = s.nextInt();
		int i = 2;
		boolean flag= false;
			while (i <= num / 2) {
				if (num % i == 0) {
					flag = true;
					break;
				} 
				i++;
			}
			if(!flag) {
				System.out.println(num + " is a prime number");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
	
	public static void betweenPrime() {
		int low= s.nextInt();
		int high = s.nextInt();
		while(low<high) {
			boolean flag = false;
			for(int i= 2; i<=low/2;++i) {
				if(low%i ==0) {
					flag=true;
					break;
				}
			}
			if(flag==false)
			System.out.println(low +"  ");
			++low;
		}
		
	}
	
	public static void squareRoot() {
		int a = 345678;
		System.out.println(Math.sqrt(a));
	}
	
	public static void number(int a) {
		for(int i=0; i<=a; i++)
		{
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * palindromeWhile(); palindromeFor();
		 * 
		 * febo();
		 betweenPrime();
		 squareRoot();
		prime();*/
		number(100);
		
	}
}
