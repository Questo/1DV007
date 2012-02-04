/*
 * IntStack.java
 * Date: 23 nov 2007
 * Author: Jonas Lundberg
 */

package lab1.uppg1;

/* A simple interface describing an integer stack. */

public interface IntStack extends Iterable<Integer> {
	/* Add integer at top of stack. */
	public void push(int n);
	
	/* Returns and removes integer at top of stack  */
	public int pop();
	
	/* Returns without removing integer at top of stack */
	public int peek();
	
	/* Number of integers currently stored. */
	public int size();
	
	/* Returns true if collection is empty. */
	public boolean isEmpty();
	
	/* String of type "[ 7 56 -45 68 ... ]" */
	public String toString();
}
