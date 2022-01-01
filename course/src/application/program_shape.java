package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_nums_colors.Color;
import entities_shape.Rectangle;
import entities_shape.Shape;
import entities_shape.Circle;

public class program_shape {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the  number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c):? ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double heigth = sc.nextDouble();
				
				list.add(new Rectangle(color, width, heigth));
				
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		System.out.println();
		System.out.println("SHAPE AREA");
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();

	}

}
