package collection;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Product2> list = new LinkedList<>();
		
		list.add(new Product2("p100", "TV", "20000"));
		list.add(new Product2("p200", "Computer", "10000"));
		list.add(new Product2("p100", "MP3", "700"));
		list.add(new Product2("p300", "Audio", "1000"));
		
		System.out.printf("\n%-10s %-8s %-8s\n", "제품 ID", "제품명", "가격");
		System.out.println("----------------------------");
		
		Collections.sort(list);
		for(Product2 p : list)
			System.out.println(p);
	}
	
	public static void addcheck(boolean flag) {
		if(flag)
			System.out.println("성공적으로 저장되었습니다.");
		else
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
	}

}
