package puzzle;

public class String_reverse {
public static void main(String[] args) {
	String one = "@ankur";
	String rev ="";
	String rev1 ="";
	StringBuffer s= new StringBuffer(one);
	rev = s.reverse().toString();
	
	System.out.println(rev);
	
	for(int i= one.length()-1; i>=0; i--) {
		rev1 =rev1+ one.charAt(i);
		
	}
	
	String a= "世界您好";
	System.out.print(rev1);
	System.out.println(a);
}
}
