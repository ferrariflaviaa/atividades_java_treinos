package application;

import java.util.Locale;
import java.util.Scanner;

import entities_account_exception.Account;
import exceptions.BusinessException;



public class program_account_exception {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Infome os dados da conta: ");
		System.out.print("N�mero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		
		try {
			acc.withdraw(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
		
		}catch (BusinessException e){
			System.out.println(e.getMessage());
			
		}
		
		
		
		
		
		
		sc.close();

	}

}
