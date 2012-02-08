/*
 * Författare: Simon Metsi & Mathias Andreasen
 * NewsMain.java
 */
package lab1.uppg3;

import java.util.ArrayList;

public class NewsMain {

	public static void main(String[] args) {
		// Demonstrerar NewsPaper och NewsAgency

		NewsPaper dn = new NewsPaper("Dagens Nyheter");
		NewsPaper ab = new NewsPaper("Aftonbladet");

		dn.addNews("Detta är en sträng");
		ab.addNews("Detta är en nyhet på aftonbladet");
		System.out.println(dn.printNews());
		
	}
}
