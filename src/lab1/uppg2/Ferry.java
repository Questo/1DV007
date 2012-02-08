package lab1.uppg2;

import java.util.Iterator;

public interface Ferry {
	int countPassengers(); // Number of passengers on board
	int countVehicleSpace(); // Used vehicle space. One car is 1.
	int countMoney(); // Earned money
	Iterator iterator(); // Vehicle iterator
	
	void embark(Vehicle v); // Embark vehicle, warning if not enough space
	void embark(Passenger p); // Embark passenger, warning if not enough space
	void disembark();	// Clear (empty) ferry. The money earned remains,
								// i.e., is not reset to zero
	
	boolean hasSpaceFor(Vehicle v); // True if we can embark vehicle v
	boolean hasRoomforPassenger(); // True if we can embark another passenger
	String toString();	// Nice looking ferry status print out
}
