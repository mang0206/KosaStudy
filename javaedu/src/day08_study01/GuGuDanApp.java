package day08_study01;
import day06_study01.MethodLab5;

class GuGuDanExpr extends Multiplication{
	
	GuGuDanExpr(){ }
	GuGuDanExpr(int dan) {
		super(dan);
	}
	GuGuDanExpr(int dan, int number){
		super(dan, number);
	}
	
	public void printAll() {
		Multiplication mul;
		for(int i=1; i<10;i++) {
			mul = new Multiplication(i);
			mul.printPart();
		}
	}
	
}
public class GuGuDanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = MethodLab5.getRandom(20), number = MethodLab5.getRandom(20);
		System.out.println(dan + "  " + number);
		GuGuDanExpr ggd;
		if(dan >= 10) {
			ggd = new GuGuDanExpr();
			ggd.printAll();
		}
		else if(dan <10 & number < 10) {
			ggd = new GuGuDanExpr(dan, number);
			System.out.printf("%d * %d = ", dan, number);
			ggd.printPart();
		}
		else {
			ggd = new GuGuDanExpr(dan);
			ggd.printPart();
		}

	}

}
