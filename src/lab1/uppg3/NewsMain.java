/*
 * F�rfattare: Simon Metsi & Mathias Andreasen
 * NewsMain.java
 */
package lab1.uppg3;

import java.util.ArrayList;

public class NewsMain {

	public static void main(String[] args) {
		// Demonstrerar NewsPaper och NewsAgency
		
		NewsPaper dn = new NewsPaper("Dagens Nyheter");
		
		dn.addNews("Detta �r en str�ng");
		System.out.println(dn.printNews());
		
	}
}
