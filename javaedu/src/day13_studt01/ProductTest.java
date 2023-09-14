package day13_studt01;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Product> set = new HashSet<>();
		
		ProductTest.addcheck(set.add(new Product("p100", "TV", "20000")));
		ProductTest.addcheck(set.add(new Product("p200", "Computer", "10000")));
		ProductTest.addcheck(set.add(new Product("p100", "MP3", "700")));
		ProductTest.addcheck(set.add(new Product("p300", "Audio", "1000")));
		
		System.out.printf("\n%-10s %-8s %-8s\n", "제품 ID", "제품명", "가격");
		System.out.println("----------------------------");
		
		for(Product p : set)
			p.printInfo();
	}
	
	public static void addcheck(boolean flag) {
		if(flag)
			System.out.println("성공적으로 저장되었습니다.");
		else
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
	}

}
