package day12_study01;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapLab1 {

	public static void main(String[] args) {
		HashMap<String,Integer> country = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String name;
		int count;
		final int MAP_SIZE = 5;
		while(country.size() < MAP_SIZE) {
			System.out.print("나라이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("인구 수를 입력하세요 : ");
			count = sc.nextInt();
			
			if(country.containsKey(name)) {
				System.out.printf("나라명 %s는 이미 저장되었습니다.\n", name);
			} else {
				System.out.println("저장되었습니다.");
				country.put(name, count);
			}
			
		}
		sc.close();
		System.out.println("5개가 모두 입력되었습니다. \n입력된 데이터");

		Iterator<String> it = country.keySet().iterator();
		
		String key;
		while(it.hasNext()) {
			key = it.next();
			System.out.printf("%s(%d)",key, country.get(key));
			if (it.hasNext())
				System.out.print(", ");
		}
	}

}
