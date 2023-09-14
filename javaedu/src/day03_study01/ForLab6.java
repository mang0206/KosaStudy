package day03_study01;

public class ForLab6 {

	public static void main(String[] args) {
		final char A = '&';
		int ran = (int)(Math.random() * 6) + 5;
		for(int i=1; i<= ran; i++) {
			for(int j=0; j<i;j++) {
				System.out.print(A);
			}
			System.out.println();
		}

	}

}
