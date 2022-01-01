package entities_calculo;

public class Cotacao {
	
	public static double VALOR = 3.10;
	public static double TAX = 6;
	
	public static double total(double transforma) {
		 double trans = transforma * VALOR;
		 double taxa = (TAX/100 * trans) + trans;
		 return taxa;
		
	}
}
