package com.JavaOops.Bank;

public class Main {

	public static void main(String[] args) {
		CurrentAcoount CA = new CurrentAcoount();
		CA.setCash_Credit(20000);
		CA.total_balance();
		SavingAccount SA = new SavingAccount();
		SA.setFixedDeposit(500000);
		SA.total_Balance();

	}

}
