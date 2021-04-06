package ankur;
public class Test3 {
public void m1(int i)
{
	System.out.println("int -arg");
}
public void m1(float f)
{
	System.out.println("float-arg");
}
public static void main(String[] args) 
{
	Test3 t= new Test3();
	t.m1(10);
	t.m1(15.5f);
	t.m1('a');
}
}
