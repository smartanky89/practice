package trainingUdemy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider = "data")
	public void method1(String s, String t) {
		System.out.println("method1");
		System.out.println(s+ t);
	}
	
	@DataProvider
	public Object data() {
		Object a[][] = new Object[2][2];
		a[0][0] = "ankur";
		a[0][1] = "chauhan";
		a[1][0] = "ankit";
		a[1][1] = "sisodia";
		return a;
		
	}

}
