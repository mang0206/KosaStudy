package day04_study01;

public class ArrayLab4 {

	public static void main(String[] args) {
		int ran = (int)(Math.random() * 6) + 5;
		int[] arr = new int[ran];
		
		for(int i=0; i<ran;i++)
			arr[i] = (int)(Math.random() * 26) + 1;
		
		char[] arr2 = new char[ran];
		
		for(int i=0; i<ran;i++)
			arr2[i] = (char)(arr[i] + 'a' -1);
		
		for(int i=0; i<ran;i++) {
			System.out.print(arr[i]);
			if(i<ran-1)
				System.out.print(",");
		}
		System.out.println();
		
		for(int i=0; i<ran;i++) {
			System.out.print(arr2[i]);
			if(i<ran-1)
				System.out.print(",");
		}
		System.out.println();
	}

}
