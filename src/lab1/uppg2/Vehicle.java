package lab1.uppg2;

public class Vehicle {
	
	protected int prize = 0; // Prize to embark
	protected int size = 0; // Space of vehicle
	protected int nPass = 0; // Amount of passengers the vehicle can hold
	
	/* Help methods to that can be used by extending classes */
	protected void setPrize(int n) {
			prize+=n;
		}
	protected void setPassenger(int n) {
			nPass+=n;
		}
	protected void setSize(int n) {
			size+=n;
		}
	public void addCar(int n) {
		
	}
	
	
}
