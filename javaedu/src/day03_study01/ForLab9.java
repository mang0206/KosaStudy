package day03_study01;

public class ForLab9 {
	public static void main(String[] args) {
		int ran = (int)(Math.random()*2) + 1;
		for(int i=ran; i<10; i+=2) {
			for(int j=1; j<10; j++) {
				System.out.print(i + "X"+ j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
