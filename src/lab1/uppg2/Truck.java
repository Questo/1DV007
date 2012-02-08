package lab1.uppg2;

public class Truck extends Vehicle {
	
	/*
	 * Car: holds 4 passengers, 100kr for embark + 15kr/passenger
	 */
	
	private final int costPass = 15; // kostnad får varje passagerare i fordonet
	private final int costVehicle = 300; // konstad får att borda färjan
	private final int pMax = 2; // max antal passagerare
	private final int vSize = 8;
	
	
	public Truck(int p) { 
		
		if (p > pMax)
			System.err.println("En lastbill kan max ta " + pMax + "  passagerare!");
		else {
			setPass(p);
			setPrize(costVehicle + (costPass * p));
			setSize(vSize);
		}
		
		
	}
	
}
