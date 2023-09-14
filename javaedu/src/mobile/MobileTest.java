package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile otab = new Otab("Otab", 1000, "XZY-20");
		
		printMobile(ltab, otab);
		
		ltab.charge(10);
		otab.charge(10);
		
		System.out.println("\n[10분 충전]");
		printMobile(ltab, otab);
		
		ltab.operate(5);
		otab.operate(5);
		
		System.out.println("\n[5분 통화]");
		printMobile(ltab, otab);
	}
	
	public static void printMobile(Mobile... mobile) {
		printTitle();
		for(Mobile m : mobile)
			System.out.printf("%s\t %d\t %s\n", m.getMobileName(),
					m.getBatterySize(), m.getOsType());
	}
	
	public static void printTitle() {
		System.out.println("Mobile\t Battery\t OS");
		System.out.println("--------------------------------");
	}
}
