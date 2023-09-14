package day03_study02;

public class WhileLab3 {

	public static void main(String[] args) {
		int cnt = 0;
		while(true) {
			int ran = (int)(Math.random() * 31);
			
			if (ran == 0 | ran > 26)
				break;
			System.out.printf("%d-%2$c, %2$d, 0x%2$x\n", ran, ran+64);
			cnt++;
		}
		
		System.out.printf("출력횟수는 %d 번 입니다.", cnt);
	}

}
