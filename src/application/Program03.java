package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program03 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		list.forEach(new PriceUpdate());
		double factor = 1.1;
//		list.forEach(Product::staticPriceUpdate);
//		list.forEach(Product::nonStaticPriceUpdate);
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
	}

}
