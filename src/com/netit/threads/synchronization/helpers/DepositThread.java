// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class DepositThread extends Thread {

	private BankAccount bankAccount;
	private int depositAmount;

	public DepositThread(BankAccount bankAccount, int depositAmount) {
		this.bankAccount = bankAccount;
		this.depositAmount = depositAmount;
	}

	@Override
	public void run() {
		bankAccount.deposit(depositAmount);
	}

}
