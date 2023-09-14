package day06_study01;

public class MethodLab5 {
	public static int getRandom(int n) {
		return (int)(Math.random()*n) + 1;
	}
	
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2 + 1 - n1)) + n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.print(getRandom(10));
			if(i < 4)
				System.out.print(",");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			System.out.print(getRandom(10, 20));
			if(i < 4)
				System.out.print(",");
		}
	}

}
