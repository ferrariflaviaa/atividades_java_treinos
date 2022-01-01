package application;

import java.util.Locale;
import java.util.Scanner;

import entities_student.Student;

public class program_student {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student(null, 0, 0, 0);
		
		System.out.println("Digite seu nome");
		student.name = sc.next();
		System.out.println("Digite sua três notas:");
		student.p1 = sc.nextDouble();
		student.p2 = sc.nextDouble();
		student.p3 = sc.nextDouble();
		
		if(student.nota() >= 60) {
			System.out.println("Final grande: " + student.nota());
			System.out.println("Pass");
		}else {
			double resul = 60 - student.nota();
			System.out.println("Final grande: " + student.nota());
			System.out.println("Failed");
			System.out.println("Missign: " + resul + "Point");
		}
		
		
		sc.close();

	}

}
