package inheritance;

public class Employee_Super {
	int salary = 40000;
	public void emp_bnf() {
		System.out.println("employee benifit of parent");
	}
	private void emp_hr() {
		System.out.println("private method of parent");
	}
	Employee_Super get() {
		return this;
	}
	static void methodStatic() {
		System.out.println("this is a static method of parent");
	}
}
