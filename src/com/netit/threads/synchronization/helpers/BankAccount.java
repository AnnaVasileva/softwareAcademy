// © 2022 Anna Vasileva. All rights reserved.

package com.netit.threads.synchronization.helpers;

public class BankAccount {

	private int amount;

	public BankAccount(int amount) {
		this.amount = amount;
	}

	public synchronized void withdraw(int withdrawAmount) {

		if (this.amount < withdrawAmount) {
			System.out.println("Not enought money. Current amount: " + this.amount);

			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - withdrawAmount;
		System.out.println("Successful withdraw of " + withdrawAmount + ". Current amount: " + this.amount);

	}

	public synchronized void deposit(int depositAmount) {
		this.amount = this.amount + depositAmount;
		System.out.println("Successful deposit of " + depositAmount + ". Current amount: " + this.amount);
		notify();
	}

}