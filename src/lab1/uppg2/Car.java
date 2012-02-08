package lab1.uppg2;

public class Car extends Vehicle {
	
	/*
	 * Car: holds 4 passengers, 100kr for embark + 15kr/passenger
	 */
	
	private final int costPassenger = 15; // kostnad får varje passagerare i fordonet
	private final int costVehicle = 100; // konstad får att borda färjan
	private final int pMax = 4; // max antal passagerare
	private final int vSize = 1; // ytan en bil tar upp
	
	 /* 
	  * Konstruktorn skapar ett Car objekt och tar antal passagerare som inparametrar
	  */
	public Car(int p) { 
		
		if (p > pMax)
			System.err.println("En bil kan max ta " + pMax + " passagerare!");
		else {
			setPass(p);
			setPrize(costVehicle + (costPassenger * p));
			setSize(vSize);
		}		
	}
	
}
