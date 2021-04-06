package inheritance;

public class Tester_Child extends Employee_Super {
	
	int bonus = 10000;
	private void emp_hr() {
		System.out.println("private method of child");
	}
	public static void main(String[] args) {
		Tester_Child tester1 = new Tester_Child();
		System.out.println("Salary of Tester is" +" "+ tester1.salary);
		System.out.println("Bonus of Tester is" +" " +tester1.bonus);
		int total_salary = tester1.salary+tester1.bonus;
		System.out.println("Total salary"+" "+ total_salary);
		tester1.emp_bnf();
		tester1.emp_hr();
		Employee_Super emp = new Employee_Super();
		emp.emp_bnf();
		Employee_Super emp2 = new Tester_Child();
		emp2.emp_bnf();
		tester1.get().msg();
		Employee_Super.methodStatic();
	}
	public void emp_bnf() {
		System.out.println("employee benifit of child");
	}
	Tester_Child get() {
		return this;
	}
	void msg(){
		System.out.println("This is example of Covariant Return Type");
	}
	/*
	 * static void methodStatic() {
	 * System.out.println("this is a static method of child"); }
	 */
}
