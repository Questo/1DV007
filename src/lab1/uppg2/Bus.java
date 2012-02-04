package lab1.uppg2;

public class Bus extends Vehicle {
	/*
	 * Bus: holds 20 passengers, 200kr for embark + 10kr/passenger
	*/
	 
	private final int costPassenger = 10;
	private final int costVehicle = 200;
	private final int pMax = 20;
	private final int vSize = 4;
	
	public Bus(int p) {
		if (p > pMax)
			System.err.println("En buss kan max ta "+ pMax +" passagerare!");
		else {
			setPassenger(p);
			setPrize(costVehicle + (costPassenger * p));
			setSize(vSize);
		}
	}	 
}