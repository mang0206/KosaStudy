package day05_study02;

public class MethodLab2 {
	static void printPiramid(char e, int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(e);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPiramid('@',3);
		printPiramid('%',4);
		printPiramid('A',5);
	}

}
