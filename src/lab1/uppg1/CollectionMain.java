package lab1.uppg1;

public class CollectionMain {
	public static void main(String[] args) {
		//ArrayIntList
		ArrayIntList list = new ArrayIntList();
		
		for (int i=0; i<20; i++) { //Lägger till värde i listan.
			list.add(i);
		}

		System.out.println("Listans element är: "+list);
		System.out.println("Listans storlek är: "+list.size);

		list.addAt(10,13); //Lägger till 10 på plats 13
		
		System.out.println("Listans element är: "+list);
		System.out.println("Listans storlek är: "+list.size);
		
		list.remove(7); //Ta bort värdet på plats 7
		
		System.out.println("Listans element är: "+list);
		System.out.println("Listans storlek är: "+list.size);
		
		System.out.println("Siffran på den femte platsen är : " + list.get(5));
		System.out.println("Siffran '10' finns på plats : " + list.indexOf(10));
		
		//ArrayIntStack
		ArrayIntStack stack = new ArrayIntStack();
		for (int i=0; i<5; i++) {
			stack.push(i);
		}
		
		System.out.println("\n\nArrayIntStack: ");
		
		System.out.println("Stackens storlek är: "+stack.size);
		System.out.println("Stackens element är: "+stack);
		
		stack.pop(); //Tar bort elementet högst upp i stacken
		System.out.println("Elementet högst upp i stacken är: "+stack.peek());
		System.out.println("Stackens element är: "+stack);
	}

}
