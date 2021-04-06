package trainingUdemy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgDemo2 {
	@Test
	public void carLoanMob() {
		System.out.println("carLoanMob");
	}
	
	@Test(groups = {"my"})
	public void homeLoanMob() {
		System.out.println("homeLoanMob");
	}
	
	@Test
	public void medicalLoanMob() {
		System.out.println("medicalLoanMob");
		
	}
	
	@AfterSuite
	public void masterBro() {
		System.out.println("Sabse last");
	}
	
	@Test
	public void insuranceCar() {
		System.out.println("insuranceCar");
	}
	
	@Test(enabled = false)
	public void insuranceHome() {
		System.out.println("insuranceHome");
	}
	
	@Test(groups = {"my"})
	public void insuranceMob() {
		System.out.println("insuranceMob");
	}
	
	@BeforeTest
	public void testSePhele() {
		System.out.println("testSePhele");	
	}
	
	@AfterTest
	public void testKeBaad() {
		System.out.println("testKeBaad");	
	}
}
