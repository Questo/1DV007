package lab1.uppg1;

public class CollectionMain {
	public static void main(String[] args) {
		//ArrayIntList
		ArrayIntList list = new ArrayIntList();
		
		for (int i=0; i<20; i++) { //L�gger till v�rde i listan.
			list.add(i);
		}

		System.out.println("Listans element �r: "+list);
		System.out.println("Listans storlek �r: "+list.size);

		list.addAt(10,13); //L�gger till 10 p� plats 13
		
		System.out.println("Listans element �r: "+list);
		System.out.println("Listans storlek �r: "+list.size);
		
		list.remove(7); //Ta bort v�rdet p� plats 7
		
		System.out.println("Listans element �r: "+list);
		System.out.println("Listans storlek �r: "+list.size);
		
		System.out.println("Siffran p� den femte platsen �r : " + list.get(5));
		System.out.println("Siffran '10' finns p� plats : " + list.indexOf(10));
		
		//ArrayIntStack
		ArrayIntStack stack = new ArrayIntStack();
		for (int i=0; i<5; i++) {
			stack.push(i);
		}
		
		System.out.println("\n\nArrayIntStack: ");
		
		System.out.println("Stackens storlek �r: "+stack.size);
		System.out.println("Stackens element �r: "+stack);
		
		stack.pop(); //Tar bort elementet h�gst upp i stacken
		System.out.println("Elementet h�gst upp i stacken �r: "+stack.peek());
		System.out.println("Stackens element �r: "+stack);
	}

}
