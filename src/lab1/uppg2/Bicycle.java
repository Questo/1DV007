package lab1.uppg2;

public class Bicycle extends Vehicle {
	/*
	 * Cykel: holds 20 passengers, 200kr for embark + 10kr/passenger
	*/
	 
	private final int costPass = 0; // kostnad får varje passagerare i fordonet
	private final int costVehicle = 40; // konstad får att borda färjan
	private final int pMax = 1; // max antal passagerare
	private final int vSize = 1/5; // ytan en bil tar upp
	
	public Bicycle(int p) {
		if (p > pMax)
			System.err.println("En cykel kan max ta "+ pMax +" passagerare!");
		else {
			setPass(p);
			setPrize(costVehicle + (costPass * p));
			setSize(vSize);
		}
	}	 
}