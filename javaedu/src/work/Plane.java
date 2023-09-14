package work;

public abstract class Plane {
	private String planName;
	private int fuelSize;
	
	public Plane() { }
	
	public Plane(String planeName, int fuelSize) {
		this.planName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
		if(this.fuelSize < 0)
			this.fuelSize = 0;
	}
	
	public void refuel(int fuel) {
		fuelSize += fuel;
	}
	
	public abstract void flight(int distance);
}
