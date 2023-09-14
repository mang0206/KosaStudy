package day04_study01;

public class ArrayLab1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i: arr)
			System.out.print(i + " ");
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			arr[i-1] = i*10;
		}
		
		System.out.println("첫 번째 : " + arr[0]);
		System.out.println("마지막 : " + arr[9]);
		System.out.println("합 : " + (arr[0] + arr[9]));
		
		for(int i:arr)
			System.out.print(i + " ");
		System.out.println();
		
		for(int i=9; i>=0; i--)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		for(int i=1; i<10; i+= 2)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
