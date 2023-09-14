package day05_study02;

public class MethodLab4 {
	static int minus(int a, int b) {
		return Math.abs(a-b);
	}
	public static void main(String[] args) {
		
		int ran1, ran2;
		for(int i=0; i<5; i++) {
			ran1 = (int)(Math.random()*30) + 1;
			ran2 = (int)(Math.random()*30) + 1;
			
			System.out.printf("%d 와 %d 의 차이는 %d 입니다.\n",
					ran1, ran2, minus(ran1, ran2));
		}

	}

}
