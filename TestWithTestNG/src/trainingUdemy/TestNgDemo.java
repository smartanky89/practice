package trainingUdemy;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	@BeforeClass
	public void classMethodBefore() {
		System.out.println("I will execute before all the test in this class");
	}
	
	@AfterClass
	public void classMethodAfter() {
		System.out.println("I will execute after all the test in this class");
	}
	
	@BeforeMethod
	public void initiateSomething(){
		System.out.println("I will execute before each method in this class");
	}
	
	@AfterMethod
	public void closeSomething(){
		System.out.println("I will execute After each method in this class");
	}
	
	@Test(groups ={"my"})
	public void carLoanWeb() {
		System.out.println("carLoanWeb");
		Assert.assertEquals("世界您好", "世界您好");
	}
	
	@Test(dependsOnMethods = {"medicalLoanWeb"})
	public void homeLoanWeb() {
		System.out.println("homeLoanWeb");
	}
	
	@Test
	public void medicalLoanWeb() {
		System.out.println("medicalLoanWeb");
	}
	
	@BeforeSuite
	public void masterBro() {
		System.out.println("Sabse phele");
	}

}
