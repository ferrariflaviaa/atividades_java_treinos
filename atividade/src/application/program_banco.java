package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class program_banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String resposta;
		
		
		System.out.println("Digite numero da sua conta: ");
		int number = sc.nextInt();
		System.out.println("Digite seu nome:");
		String name = sc.next();
		
		Cliente cliente = new Cliente(name, number);
		
		System.out.print("Deseja fazer um deposito (sim/não)? ");
		resposta = sc.next();
		if (resposta != "não") {
			System.out.println("quando deseja depositar? ");
			double valor = sc.nextDouble();
			cliente.deposito(valor);
			System.out.println(cliente.toString());
		}else {
			System.out.println(cliente.toString());
		}
		System.out.println("Deseja sacar? ");
		double saques = sc.nextDouble();
		cliente.saques(saques);
		System.out.println(cliente.toString()); 
		
		
		sc.close();

	}

}
