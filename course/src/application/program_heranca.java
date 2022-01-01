package application;

import entities_heranca.Account;
import entities_heranca.SevingsAccount;
import entities_heranca.BusinessAccount;

public class program_heranca {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Flávia", 1000.0);
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		
		Account acc2 = new SevingsAccount(1002, "flavia", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		
		

	}

}
