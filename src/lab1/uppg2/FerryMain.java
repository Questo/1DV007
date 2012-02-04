package lab1.uppg2;
import java.util.Scanner;

public class FerryMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stenaline ferry = new Stenaline();
		
		int val = 0;
		int pVal = 0;
		
		while(true) {
			System.out.println("Välj vad du vill göra: \n1. Borda fordon\n2. Borda passagerare\n3.Töm båten(Spara pengarna)");
			System.out.print("Ditt val: ");
				val = input.nextInt();
				switch (val) {
					case 1: 
							System.out.println("Välj fordon:\n1. Bil\n2. Lastbil\n3. Buss\n4. Cykel");
							System.out.print("Ditt val: ");
						val = input.nextInt();
						switch (val) {
							case 1: 
									System.out.println("Hur många passagerare bilen?");
									System.out.print("Ditt val: ");
									pVal = input.nextInt();
									Car bil = new Car(pVal);
									ferry.embark(bil);
									System.out.println("\nAntal passagerare: "+ ferry.countPassengers()+"\n");
									break;
							case 2:
									System.out.println("Hur många passagerare har lastbilen?");
									System.out.print("Ditt val: ");
									pVal = input.nextInt();
									Truck lastbil = new Truck(pVal);
									ferry.embark(lastbil);
									System.out.println("\nAntal passagerare: "+ ferry.countPassengers()+"\n");
									break;
							case 3:
									System.out.println("Hur många passagerare har bussen?");
									System.out.print("Ditt val: ");
									pVal = input.nextInt();
									Bus bus = new Bus(pVal);
									ferry.embark(bus);
									System.out.println("\nAntal passagerare: "+ ferry.countPassengers()+"\n");
									break;
							case 4:
									Bicycle cykel = new Bicycle(1);
									ferry.embark(cykel);
									System.out.println("\nAntal passagerare: "+ ferry.countPassengers()+"\n");
									break;
							default:
									System.err.println("Det valet finns inte");
									break;
						}
					case 2:
							System.out.println("Hur många passagerare vill du borda?");
							System.out.print("Ditt val: ");
							pVal = input.nextInt();
							Pass pass = new Pass(pVal);
							ferry.embark(pass);
							System.out.println("\nAntal passagerare: "+ ferry.countPassengers()+"\n");
					case 3:
							ferry.disembark();
							System.out.println("\nAntal passagerare: "+ ferry.countPassengers()+"\n");
				}
		}
	}

}
