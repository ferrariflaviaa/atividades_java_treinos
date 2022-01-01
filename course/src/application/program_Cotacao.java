package application;

import java.util.Locale;
import java.util.Scanner;

import entities_calculo.Cotacao;



public class program_Cotacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many dollars will be bought? ");
		
		double receber = sc.nextDouble();
		
		double c =Cotacao.total(receber);
		
		System.out.print(c);
		
		
		sc.close();
	}

}
