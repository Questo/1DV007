package lab1.uppg2;

public class Bus extends Vehicle {
	/*
	 * Bus: holds 20 passengers, 200kr for embark + 10kr/passenger
	*/
	 
	private final int costPass = 10; // kostnad f�r varje passagerare i fordonet
	private final int costVehicle = 200; // konstad f�r att borda f�rjan
	private final int pMax = 20; // max antal passagerare
	private final int vSize = 4; // ytan en bil tar upp
	
	public Bus(int p) {
		if (p > pMax)
			System.err.println("En buss kan max ta "+ pMax +" passagerare!");
		else {
			setPass(p);
			setPrize(costVehicle + (costPass * p));
			setSize(vSize);
		}
	}	 
}