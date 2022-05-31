package com.JavaOops.Organization;

public class Labour extends Employee {
	int overTime;

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}
	@Override
	public void total_salary() {
		System.out.println("total salary of employee overtime work: "+(basic+overTime));
	}

}
