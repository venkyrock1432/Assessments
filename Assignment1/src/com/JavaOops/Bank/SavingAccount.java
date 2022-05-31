package com.JavaOops.Bank;

public class SavingAccount extends Account {
	private int FixedDeposit;

	public int getFixedDeposit() {
		return FixedDeposit;
	}

	public void setFixedDeposit(int fixedDeposit) {
		FixedDeposit = fixedDeposit;
	}
	public void total_Balance() {
		System.out.println("total balance after fixed Deposit :"+(balance+FixedDeposit));
	}

}
