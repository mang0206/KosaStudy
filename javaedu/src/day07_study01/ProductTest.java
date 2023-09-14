package day07_study01;

class Product {
	String name;
	int balance;
	int price;
	
	Product() {
		this.name = "듀크인형";
		this.balance = 5;
		this.price = 10000;
	}
	Product(String name,int balance,int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	String getName() {
		return this.name;
	}
	int getBalace() {
		return this.balance;
	}
	int getPrice() {
		return this.price;
	}
}


public class ProductTest {

	public static void main(String[] args) {
		Product[] product = new Product[5];
		
		product[0] = new Product();
		product[1] = new Product("상품1", 4, 11000);
		product[2] = new Product("상품2", 3, 12000);
		product[3] = new Product();
		product[4] = new Product("상품4", 1, 14000);
		
		for(int i=0; i<product.length;i++) {
			System.out.printf("%s \t %d \t %,d\n", 
					product[i].getName(),
					product[i].getBalace(),
					product[i].getPrice());
		}
	}

}
