package lab1.uppg2;

public class Car extends Vehicle {
	/*
	 * Car: holds 4 passengers, 100kr for embark + 15kr/passenger
	*/
	 
	private final int costPassenger = 15;
	private final int costVehicle = 100;
	private final int pMax = 4;
	private final int vSize = 1;
	
	public Car(int p) {
		if (p > pMax)
			System.err.println("En bil kan max ta "+ pMax +" passagerare!");
		else {
			setPassenger(p);
			setPrize(costVehicle + (costPassenger * p));
			setSize(vSize);
		}
	}	 
}