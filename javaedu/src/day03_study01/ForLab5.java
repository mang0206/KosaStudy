package day03_study01;

public class ForLab5 {

	public static void main(String[] args) {
		int ran1 = (int)(Math.random() * 8) + 3;
		int ran2 = (int)(Math.random() * 3) + 1;
		
		switch(ran2) {
		case 1:
			for(int i=0; i<ran1; i++)
				System.out.print("*");
			break;
		case 2:
			for(int i=0; i<ran1; i++)
				System.out.print("$");
			break;
		default:
			for(int i=0; i<ran1; i++)
				System.out.print("#");
		}
	}

}
