package tv;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTV saleTv = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rentalTv = new RentalTV(100000, "RENTALTV-10", 42, 1);
		
		saleTv.channelUp();
		saleTv.channelUp();
		
		for(int i=0; i<3;i++)
			rentalTv.channelDown
			();
		
		printAll(saleTv);
		printAll(rentalTv);
		printRentalTV(rentalTv);
		
	}

	public static void printAll(TV tv) {
		System.out.print(tv.toString());
		if(tv instanceof SaleTV) {
			((SaleTV)tv).play();
			((SaleTV)tv).sale();
		}
		else {
			((RentalTV)tv).play();
		}
	}
	
	public static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
