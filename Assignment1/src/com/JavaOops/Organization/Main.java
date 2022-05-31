package com.JavaOops.Organization;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.total_salary();
		Labour emp1 = new Labour();
		emp1.setOverTime(3000);
		emp1.total_salary();
		Manager emp2 = new Manager();
		emp2.setIncentive(5000);
		emp2.total_salary();
	}

}
