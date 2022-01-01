package entities_rectangle;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		double total = width * height;
		return total;
	}
	public double perimeter() {
		return (width * 2) + (height * 2);
	}
	public String toString() {
		 return "O área é:" + area()+ "O periometro é: " + perimeter();
	}
	
}
