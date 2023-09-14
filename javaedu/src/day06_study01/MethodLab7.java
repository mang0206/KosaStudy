package day06_study01;

public class MethodLab7 {
	static int[] powerArray(int n) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++)
			arr[i] = (i+1)*n;
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i:arr)
			System.out.printf("%d%s",i, i!=arr[arr.length-1]? "," : "" );
		System.out.println();
	}
	public static void main(String[] args) {
		for(int i=2; i<=4; i++)
			printArray(powerArray(i));

	}

}
