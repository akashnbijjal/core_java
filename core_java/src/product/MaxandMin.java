package product;

import java.util.ArrayList;
import java.util.List;

public class MaxandMin {
public static void main(String[] args) {
	List<Product> productsList = new ArrayList<Product>();
	productsList.add(new Product(1, "HP Laptop", 25000f));
	productsList.add(new Product(2, "Dell Laptop", 30000f));
	productsList.add(new Product(3, "Lenevo Laptop", 28000f));
	productsList.add(new Product(4, "Sony Laptop", 28000f));
	productsList.add(new Product(5, "Apple Laptop", 90000f));
	
	
	Product max=productsList.stream().max((i1,i2)->i1.price>i2.price ?1:-1).get();
	System.out.println(max.name+"    "+max.price);
	
	Product min=productsList.stream().min((i1,i2)->i1.price>i2.price ?1: -1).get();
	System.out.println(min.name+"    "+min.price);
}
}
