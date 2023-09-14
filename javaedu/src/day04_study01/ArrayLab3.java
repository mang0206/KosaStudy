package day04_study01;

public class ArrayLab3 {

	public static void main(String[] args) {
		char[] element = {'J', 'a', 'v', 'a'};
		
		int m = 'a' - 'A';
		for(int i=0; i<4;i++) {
			if(element[i] > 'Z' )
				element[i] -= m;
			else
				element[i] += m;
		}
		
		for(int i=0; i<4;i++)
			System.out.println(element[i]);

	}

}
