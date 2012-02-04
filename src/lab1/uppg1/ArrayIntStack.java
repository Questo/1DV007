package lab1.uppg1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	
	@Override
	public void push(int n) {
		if (size<values.length) { //Om stacken stor nog läggs värdet till direkt annars körs resize först.
			values[size++] = n;
		}
		else {
			resize();
			values[size++] = n;
		}
	}

	@Override
	public int pop() {
		int i = size-1; //Sparar värdet på topelementet
		values[size-1] = 0; //Tar bort topelementet
		size--; //Minskar size
		return i; //Returnerar det sparade topelementet
	}

	@Override
	public int peek() {
		
		return values[size];
	}
	
}
