package application;

import java.util.Locale;
import java.util.Scanner;

import entities_rectangle.Rectangle;

public class Program_rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Digite a largura: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Digite a altura: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		
		
		
		
		
		sc.close();

	}

}
