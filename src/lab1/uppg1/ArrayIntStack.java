package lab1.uppg1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	
	@Override
	public void push(int n) {
		if (size<values.length) { //Om stacken stor nog l�ggs v�rdet till direkt annars k�rs resize f�rst.
			values[size++] = n;
		}
		else {
			resize();
			values[size++] = n;
		}
	}

	@Override
	public int pop() {
		int i = size-1; //Sparar v�rdet p� topelementet
		values[size-1] = 0; //Tar bort topelementet
		size--; //Minskar size
		return i; //Returnerar det sparade topelementet
	}

	@Override
	public int peek() {
		
		return values[size];
	}
	
}
