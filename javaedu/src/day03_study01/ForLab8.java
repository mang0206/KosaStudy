package day03_study01;

public class ForLab8 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+5; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
