package lab1.uppg1;


public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
		if (size<values.length) { // Om arrayen är lång nog, lägg till 'n' på plats 'size' och öka 'size' med 1.
			values[size++] = n;
		}
		else { // Annars kallar vi på resize-funktionen som dubblar längden på arrayen. Sen lägger vi till 'n' på plats 'size' och ökar 'size'.
			resize();
			values[size++] = n;
		}
	}

	@Override
	public void addAt(int n, int index) {
		int temp = size+1;
		
		if (size+1<values.length) { //Kontrollerar om arrayen är lång nog.
			if (size<index) { //Om inget finns på platsen 'index' läggs värdet på 'n' till på plats 'index' och ökar size med 1.
				values[index] = n; 
				size++;
			}
			else { // Flyttar sista talet till sista platsen++ och gör samma sak för talet till vänster ända tills vi kommer till index-1.
				for (int i=size; i>index-1; i--) {
					values[temp--] = values[i];
				}
				values[index] = n;  // Lägger till 'n' på plats 'index'.
				size++;
			}
		}
		else { // Om listan inte är lång nog körs denna if-sats.
			resize(); // Dubblar storleken på arrayen.

			if (size<index) { // Samma kod som if-delen ovan.
				values[index] = n;
				size++;
			}
			else {
				for (int i=size; i>index-1; i--) {
					values[temp--] = values[i];
				}
				values[index] = n;
				size++;
			}
		}
	}

	@Override
	public void remove(int index) {
		for (int i=index; i<size; i++) { //Tar värdet på index och byter med värdet till höger.
			values[i] = values[i+1];
		}
		size--; // Minskar listan då vi tagit bort ett värde.
	}

	@Override
	public int get(int index) {
		
		// Returerar värdet av index
		return values[index];
	}

	@Override
	public int indexOf(int n) {
		
		// Skapar en array om det är så att vi hittar flera n
		int[] array = new int[size];
		int pos = 0;
		
		// Loopa igenom hela listan efter heltalet n
		for (int i = 0; i <=size; i++) {
			
			// Check om siffran finns på pos, return om sant
			if (get(i) == n) {
				array[pos] = i;
				return pos = array[pos];
			}
		}
		
		return -1;
	}
	
}
