package day05_study02;

public class MethodLab3 {
	static boolean isEven(int n) {
		if(n %2==0)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 13;
		
		System.out.printf("%d은 %s 입니다.\n", num1, isEven(num1) ? "짝수":"홀수");
		System.out.printf("%d은 %s 입니다.\n", num2, isEven(num2) ? "짝수":"홀수");
		
	}

}
