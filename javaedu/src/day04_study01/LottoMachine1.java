package day04_study01;

public class LottoMachine1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		int idx = 0;
		while(idx < 6) {
			int ran = (int)(Math.random() * 45) + 1;
			boolean flag = true;
			
			for(int i=0; i<idx; i++)
				if(lotto[i] == ran) {
					flag = false;
					break;
				}
			
			if(flag) {
				lotto[idx] = ran; 
				idx++;
			}
			
		}
		
		System.out.print("오늘의 로또 번호 - ");
		for(int i=0; i<6;i++) {
			System.out.print(lotto[i]);
			if(i<5)
				System.out.print(",");
		}
		System.out.println();
	}

}
