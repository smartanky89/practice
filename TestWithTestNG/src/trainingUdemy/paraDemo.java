package trainingUdemy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paraDemo {
	
	@Parameters({"global","global2"})
	@Test
	public void method1(String s, String t) {
		System.out.println("method1");
		System.out.println(s+ t);
	}
	
	@Parameters({"global","global2"})
	@Test
	public void method2(String g, String e) {
		System.out.println("method2");
		System.out.println(g+e);
	}
	
	@Test
	public void method3() {
		System.out.println("method3");
	}

}
