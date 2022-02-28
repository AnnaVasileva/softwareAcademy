package com.netit.threads.synchronization.demos;

import com.netit.threads.synchronization.helpers.BankAccount;
import com.netit.threads.synchronization.helpers.DepositThread;
import com.netit.threads.synchronization.helpers.WithdrawThread;

public class DemoCoorporationBankAcc {
	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount(50);
		Thread withdrawThread = new WithdrawThread(myAccount, 100);
		Thread depositThread = new DepositThread(myAccount, 300);

		withdrawThread.start();
		depositThread.start();

	}
}
