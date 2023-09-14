package day05_study01;

public class TwoArrayLab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][3];
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		int num = 1;
		for(int i=0; i<arr[0].length;i++) {
			for(int j=0; j< arr.length - i*2; j++) {
				arr[j+i][i] = num++; 
			}
			
		}
		
		System.out.println();
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}

}
