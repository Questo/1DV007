package lab1.uppg2;

import java.util.ArrayList;
import java.util.Iterator;

public class Stenaline implements Ferry {

	// Arraylist som sparar alla våra objekt från Vehicle
	ArrayList<Vehicle> pVehicle = new ArrayList<>();
	
	ArrayList<Passenger> pPass = new ArrayList<>();
	
	@Override
	public int countPassengers() {
		int pSum = 0; // summan av passangerare
		
		// Loopar igenom alla passengers och lägger till dem i pSum
		for (int i = 0; i < pPass.size(); i++) {
			pSum += pPass.get(i).getPass();
		}
		
		// Loopar igenom alla bilar och lägger till deras passengers i pSum
		for (int i = 0; i < pVehicle.size(); i++) {
			pSum += pVehicle.get(i).getPass();
		}
		
		return pSum;
	}

	@Override
	public int countVehicleSpace() {
		// Returnerar summan av hur mycket yta alla fordon tar upp i färjan
		int sizeSum = 0;
		
		// Loopar igenom alla fordon och lägger till deras storlek i sizeSum
		for (int i = 0; i < pVehicle.size(); i++) {
			sizeSum += pVehicle.get(i).getSize();
		}
		
		return sizeSum;
	}

	@Override
	public int countMoney() {
		int sum = 0; // total sum
		
		// Loopar igenom alla fordon vi har och lägger till priset får varje i sum
		for (int i = 0; i < pVehicle.size(); i++) {
			sum += pVehicle.get(i).getPrize();
		}
		
		for (int i = 0; i < pPass.size(); i++) {
			sum += pPass.get(i).getPrize();
		}
		
		return sum;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void embark(Vehicle v) {
		// Lägger till vårt fordon på färjan
		
		if (hasRoomforPassenger() && hasSpaceFor(v)) {
			pVehicle.add(v);
			countMoney();
		}
		else
			System.err.println("Vi har inte plats för mer fordon på färjan");
		
	}

	@Override
	public void embark(Passenger p) {
		// Lägger till vår pass. på färjan
		if (hasRoomforPassenger()) {
			pPass.add(p);
			countMoney();
		}
		else
			System.err.println("Vi har inte plats för mer passagerare");		
	}

	@Override
	public void disembark() {
		// Tömmer pVehicle / Passengers på fordon, sparar pengarna
		pPass.clear();
		pVehicle.clear();
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		// Tittar om fordonets storlek + nuvarande storleken är mindre än 40
		
		if (v.getSize() + countVehicleSpace() <= 40)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean hasRoomforPassenger() {
		// Tittar om vi har rum för alla passagerare
		
		if (this.countPassengers() + countPassengers() <= 200)
			return true;
		else
			return false;
	}

}
