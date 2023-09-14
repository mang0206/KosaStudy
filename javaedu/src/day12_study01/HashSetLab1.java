package day12_study01;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetLab1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		int ran;
		final int SET_SIZE = 10;
		while(set.size() < SET_SIZE) {
			ran = (int)(Math.random()*21) + 10;
			set.add(ran);
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
			if (it.hasNext())
				System.out.print(", ");
		}
				
	}

}
