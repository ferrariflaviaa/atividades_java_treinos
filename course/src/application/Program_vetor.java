package application;

import java.util.Locale;
import java.util.Scanner;

import entities_vetor.vetor;

public class Program_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		vetor[] Vetor = new vetor[n];
		
		for (int i=0; i<Vetor.length; i++ ) {
			sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			double row = sc.nextDouble();
			Vetor[i] = new vetor(name, email, row);
		}
		System.out.println(Vetor.toString());
		
		
		
		
		sc.close();

	}

}
