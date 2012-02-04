package lab1.uppg1;


public class ArrayIntList extends AbstractIntCollection implements IntList {

	@Override
	public void add(int n) {
		if (size<values.length) { // Om arrayen �r l�ng nog, l�gg till 'n' p� plats 'size' och �ka 'size' med 1.
			values[size++] = n;
		}
		else { // Annars kallar vi p� resize-funktionen som dubblar l�ngden p� arrayen. Sen l�gger vi till 'n' p� plats 'size' och �kar 'size'.
			resize();
			values[size++] = n;
		}
	}

	@Override
	public void addAt(int n, int index) {
		int temp = size+1;
		
		if (size+1<values.length) { //Kontrollerar om arrayen �r l�ng nog.
			if (size<index) { //Om inget finns p� platsen 'index' l�ggs v�rdet p� 'n' till p� plats 'index' och �kar size med 1.
				values[index] = n; 
				size++;
			}
			else { // Flyttar sista talet till sista platsen++ och g�r samma sak f�r talet till v�nster �nda tills vi kommer till index-1.
				for (int i=size; i>index-1; i--) {
					values[temp--] = values[i];
				}
				values[index] = n;  // L�gger till 'n' p� plats 'index'.
				size++;
			}
		}
		else { // Om listan inte �r l�ng nog k�rs denna if-sats.
			resize(); // Dubblar storleken p� arrayen.

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
		for (int i=index; i<size; i++) { //Tar v�rdet p� index och byter med v�rdet till h�ger.
			values[i] = values[i+1];
		}
		size--; // Minskar listan d� vi tagit bort ett v�rde.
	}

	@Override
	public int get(int index) {
		
		// Returerar v�rdet av index
		return values[index];
	}

	@Override
	public int indexOf(int n) {
		
		// Skapar en array om det �r s� att vi hittar flera n
		int[] array = new int[size];
		int pos = 0;
		
		// Loopa igenom hela listan efter heltalet n
		for (int i = 0; i <=size; i++) {
			
			// Check om siffran finns p� pos, return om sant
			if (get(i) == n) {
				array[pos] = i;
				return pos = array[pos];
			}
		}
		
		return -1;
	}
	
}
