package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_fixacao.ImportedProduct;
import entities_fixacao.Product;
import entities_fixacao.UserProduct;

public class program_fixacao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter number of products: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.println("Common, used or imported (c/u/i)? ");
			char tipy = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.next();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			
			if(tipy == 'c') {
				list.add(new Product(name, price));
				
			}else if (tipy == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY)?");
				Date date = sdf.parse(sc.next());
				list.add(new UserProduct(name, price, date));
				
			}else {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				
			}
			
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}

}
