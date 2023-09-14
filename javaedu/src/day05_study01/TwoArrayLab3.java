package day05_study01;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		int[][] arr = {{5,2,1,0,2,3,6},
						{4,3,2,1,1,0,5},
						{3,1,2,1,3,1,3},
						{4,3,1,0,4,2,7}};
		
		int[] day_time = new int[7];
		final char[] DAY = {'일', '월', '화', '수', '목', '금', '토'};
		
		for(int i=0; i<arr[0].length;i++) {
			for(int j=0; j<arr.length; j++) {
				day_time[i] += arr[j][i];
				
				if(j==arr.length-1)
					System.out.println(DAY[i] + "요일 : " + day_time[i] + "시간");
			}
		}
		
		int[] week_time = new int[4];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				week_time[i] += arr[i][j];
			}
			
			System.out.println(i+1 + "주차 : " + week_time[i] + "시간");
		}
		
	}

}
