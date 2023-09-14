package day03_study02;

public class WhileLab1 {

	public static void main(String[] args) {
		int ran = (int)(Math.random() * 6) + 5;
		System.out.println("[for 결과]");
		for(int i=1; i<= ran; i++) {
			System.out.println(i + " -> " + i*i);
		}
		
		
		System.out.println("[while 결과]");
		int i = 1;
		while(i <= ran) {
			System.out.println(i + " -> " + i*i++);
		}
	}

}
