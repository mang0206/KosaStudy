package day06_study01;

public class MethodLab8 {
	static int addEven(int... n) {
		if (n.length == 0)
			return -1;
		
		int sum = 0;
		for(int i:n)
			if(i%2==0)
				sum += i;
		
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = addEven(10,2,5,13,7);
		arr[1] = addEven(11,22,33,44,55,66);
		arr[2] = addEven();
		arr[3] = addEven(100,101,103);
		
		for(int i=0; i<arr.length;i++)
			System.out.printf("호출 %d: %d\n", i+1, arr[i] );
		
	}

}
