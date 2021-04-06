package globalV;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	
	@Test
	public void demo1() {
		browserOpen();
		driver.get(prop.getProperty("baseUrl"));
		System.out.println(driver.getTitle());
	}

}
