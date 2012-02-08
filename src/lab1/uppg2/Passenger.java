package lab1.uppg2;

public class Passenger {
	
	private int nPass = 0;
	private int nPrize = 0;
	
	// Konstruktor som tar in hur många pass. som ska med
	public Passenger(int p) {
		setPass(p);
		setPrize(p);
	}
	
	public void setPass(int p) { nPass = p; }
	public void setPrize(int p) { nPrize = 20 * p; }
	
	public int getPass() { return nPass; }
	public int getPrize() { return nPrize; }
	

}
