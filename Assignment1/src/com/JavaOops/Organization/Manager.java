package com.JavaOops.Organization;

public class Manager extends Employee {
	int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	@Override
	public void total_salary() {
		System.out.println("Total salary of the employee with incentives: "+(basic+incentive));
		
	}

}
