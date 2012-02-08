package lab1.uppg2;

public class Vehicle {
	
	protected int prize = 0; // pris att borda
	protected int size = 0; // yta för varje fordon
	protected int nPass = 0; // passagerare
	
	// Hjälp metoder för ärvande klasser
	protected void setPrize(int n) { prize = n; }
	protected void setPass(int n) { nPass = n; }
	protected void setSize(int n) { size = n; }
	
	protected int getPass() { return nPass; }
	protected int getPrize() { return prize; }
	protected int getSize() { return size; }
}
