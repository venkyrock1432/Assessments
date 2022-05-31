package com.JavaOops.Bank;

public class CurrentAcoount extends Account{
	int cash_Credit;

	public int getCash_Credit() {
		return cash_Credit;
	}

	public void setCash_Credit(int cash_Credit) {
		this.cash_Credit = cash_Credit;
	}
	public void total_balance() {
		System.out.println("total balance after cash credit in your bank :"+(balance+cash_Credit));
	}

}
