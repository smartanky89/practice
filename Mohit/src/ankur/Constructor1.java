package ankur;

public class Constructor1 {
	public static int count = 0;
	{
		count++;
	}
	Constructor1(){
		System.out.println("Blank");
	}
	Constructor1(int i){
		System.out.println(i);
	}
	Constructor1(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(10);
		Constructor1 c3 = new Constructor1("Ankur");
		System.out.println(count);
	}
}
