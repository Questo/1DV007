package lab1.uppg2;

public class Truck extends Vehicle {
	/*
	 * Lastbil: holds 20 passengers, 200kr for embark + 10kr/passenger
	*/
	 
	private final int costPassenger = 15;
	private final int costVehicle = 300;
	private final int pMax = 2;
	private final int vSize = 8;
	
	public Truck(int p) {
		if (p > pMax)
			System.err.println("En lastbil kan max ta "+ pMax +" passagerare!");
		else {
			setPassenger(p);
			setPrize(costVehicle + (costPassenger * p));
			setSize(vSize);
		}
	}	 
}