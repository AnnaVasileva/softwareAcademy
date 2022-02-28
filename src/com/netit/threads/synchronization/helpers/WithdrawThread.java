// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class WithdrawThread extends Thread {

	private BankAccount bankAccount;
	private int withdrawAmount;

	public WithdrawThread(BankAccount bankAccount, int withdrawAmount) {
		this.bankAccount = bankAccount;
		this.withdrawAmount = withdrawAmount;
	}

	@Override
	public void run() {
		bankAccount.withdraw(withdrawAmount);
	}

}
