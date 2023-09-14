package day07_study01;
import java.util.Scanner;

class SalaryExpr{
	int bonus;
	
	SalaryExpr(){
		this(0);
	}
	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}
	
	int getSalary() {
		return bonus;
	}
	int getSalary(int grade) {
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		default:
			bonus += 70;
		}
		return bonus;
	}
}

public class SalaryExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 정보 입력 : ");
		int month = sc.nextInt();
		System.out.print("등급 정보 입력(1~4) : ");
		int grade = sc.nextInt();
		sc.close();
		
		SalaryExpr salary;
		int bonus;
		if(month%2==0) {
			salary = new SalaryExpr(100);
			bonus = salary.getSalary();
		}
		else {
			salary = new SalaryExpr();
			bonus = salary.getSalary(grade);
		}
		System.out.printf("%d월 %d 등급의 월급은 %d입니다.\n", month, grade, bonus);
	}

}
