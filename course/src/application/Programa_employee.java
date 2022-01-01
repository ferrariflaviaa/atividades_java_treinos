package application;

import java.util.Locale;
import java.util.Scanner;

import entities_employee.Employee;

public class Programa_employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Digite seu nome");
		employee.name = sc.next();
		System.out.println("Digite seu salario");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Digite sua taxt");
		employee.tax = sc.nextDouble();
		System.out.println(employee);
		System.out.println("Digite seu aumento: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println( "Seu aumento: " + employee);
		
		
		
		sc.close();

	}

}
