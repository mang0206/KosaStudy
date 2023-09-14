package day05_study01;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		char[][] arr = {{'B', 'C', 'A', 'A'}, 
						{'C', 'C', 'B', 'B'}, 
						{'D', 'A', 'A', 'D'}};
		
		int[] num = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				switch(arr[i][j]) {
				case 'A':
					num[0]++; 
					break;
				case 'B':
					num[1]++; 
					break;
				case 'C':
					num[2]++; 
					break;
				default:
					num[3]++;
				}
			}
		}
		
		char A = 'A'; 
		for(int i=0; i<4; i++) {
			System.out.println(A++ + " 는 " + num[i] + "개 입니다.");
		}

	}

}
