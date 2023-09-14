package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] plane = new Plane[2];
		plane[0] = new Airplane("L747", 1000);
		plane[1] = new Cargoplane
				("C40", 1000);
		printInfo(plane);
		
		System.out.println("\n[100 운항]");
		for(Plane p: plane)
			p.flight(100);
		printInfo(plane);
		
		System.out.println("\n[200 주유]");
		for(Plane p: plane)
			p.refuel(200);
		printInfo(plane);
		
	}
	
	public static void printInfo(Plane[] list) {
		System.out.println("Plane\t fuelSize");
		System.out.println("---------------------");
		
		for(Plane p: list)
			System.out.printf("%s\t %d\n",p.getPlanName(), p.getFuelSize());
	}

}
