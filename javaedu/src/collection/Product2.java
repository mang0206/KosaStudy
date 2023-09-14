package collection;

import java.util.Objects;

public class Product2 implements Comparable<Product2> {
	private String productID;
	private String productName;
	private String productPrice;
	
	public Product2(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Product2) {
			Product2 p = (Product2) o;
			if (productID == p.productID )
				return true;
		}
		return false;
	}


	public int hashCode() {
		return Objects.hash(productID);
	}
	
	public String toString() {
		return String.format("%-10s %-10s %,d원",
				productID,productName,getProductPriceInt());
	}
	
	public int getProductPriceInt() {
		return Integer.parseInt(productPrice);
	}
	public int compareTo(Product2 o) {
		if(getProductPriceInt()>o.getProductPriceInt()) return -1;
		else if(getProductPriceInt() == o.getProductPriceInt()) return 0;
		else return 1;
	}

}
