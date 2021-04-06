package puzzle;

public class StringPalindrome {
	public static void main(String[] args) {
		int org = 1223, temp = org, rev= 0, rem = 0;
		while(temp != 0 ) {
			rem = temp%10;
			rev = rev*10 + rem;
			temp= temp/10;
		}
		if(org==rev) {
			System.out.println("p"+ rev);
		}
		else{
			System.out.println("not"+ rev);
		}
		
	}

}
