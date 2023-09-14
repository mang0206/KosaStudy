package day13_studt01;

import java.util.Objects;

public class Product {
	private String productID;
	private String productName;
	private String productPrice;
	
	public Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Product) {
			Product p = (Product) o;
			if (productID == p.productID )
				return true;
		}
		return false;
	}

	public int hashCode() {
		return Objects.hash(productID);
	}
	
	public void printInfo() {
		System.out.printf("%-10s %-10s %-10s\n", productID,productName,productPrice);
	}
}
