package lab1.uppg2;

public class Bicycle extends Vehicle {
	/*
	 * Cykel: holds 20 passengers, 200kr for embark + 10kr/passenger
	*/
	 
	private final int costPassenger = 0;
	private final int costVehicle = 40;
	private final int pMax = 1;
	private final int vSize = 1/5;
	
	public Bicycle(int p) {
		if (p > pMax)
			System.err.println("En cykel kan max ta "+ pMax +" passagerare!");
		else {
			setPassenger(p);
			setPrize(costVehicle + (costPassenger * p));
			setSize(vSize);
		}
	}	 
}