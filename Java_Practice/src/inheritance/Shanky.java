package inheritance;

public class Shanky {
public static void main(String[] args) {
	String str =null;
	for(int i= 0; i<3;i++) {
		if(i==1)
		str = "abc";
		else {
			str="cde";
		}
		System.out.println(str);
	}
	System.out.println(str);
}
}
