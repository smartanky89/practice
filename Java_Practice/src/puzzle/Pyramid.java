package puzzle;

public class Pyramid {
	public static void main(String[] args) {
		for(int i =1; i<=5;i++) {
			for(int j=1 ; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		int row= 5 ; int m=0;
		for(int k =1; k<=row;k++,m=0) {
			for(int l=1 ; l<=row-k; l++) {
				System.out.print(" ");
			}
			
			while(m!= 2*k-1) {
				System.out.print("*");
				m++;
			}
			System.out.println();
		
		}
	}
	
	
}
