package day06_study01;

public class MethodLAb6 {
	static int maxNumArray(int[] p) {
		int max = 0;
		for(int i:p)
			if(max < i)
				max = i;
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30};
		int[] arr2 = {100,500,300,200,400};
		int[] arr3 = {1,10,3,4,5,8,7,6,9,2};
		
		int[][] arr = {arr1, arr2, arr3};
		
		for(int i=0; i<3;i++) {
			System.out.printf("가장 큰 값은 %d 입니다.\n", maxNumArray(arr[i]));
		}
	}

}
