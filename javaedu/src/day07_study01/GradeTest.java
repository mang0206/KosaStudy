package day07_study01;

import java.util.Scanner;

import day06_study01.MethodLab7;

class GradeExpr{
	int[] jumsu;
	
	GradeExpr(int[] jumsu){
		this.jumsu = jumsu;
	}
	
	int getTotal() {
		int sum = 0;
		for(int i:jumsu)
			sum += i;
		
		return sum;
	}
	double getAverage() {
		
		return getTotal() / (double)jumsu.length;
	}
	
	int getGoodScore() {
		int max = 0;
		for(int i: jumsu)
			if(max < i)
				max = i;
		
		return max;
	}
	
	int getBadScore() {
		int min = Integer.MAX_VALUE;
		for(int i: jumsu)
			if(min > i)
				min = i;
		
		return min;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기 입력 : ");
		int arr_length = sc.nextInt();
		
		int[] arr = new int[arr_length];
		System.out.print("원소들의 값을 입력해주세요 : ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		System.out.print("정수들 : ");
		MethodLab7.printArray(arr);
		
		GradeExpr grade = new GradeExpr(arr);
		System.out.println("총점 : " + grade.getTotal());
		System.out.println("평균 : " + grade.getAverage());
		System.out.println("최고 점수 : " + grade.getGoodScore());
		System.out.println("최저 점수 : " + grade.getBadScore());
	}

}
