package org.basicjavaprogrampractice;

public class WhileLoop {
	// printing even number
	public static void main(String[] args) {
		int a = 0;
		while (a <= 10) {
			System.out.print(" "+a);
			a = a + 2;
		}
		System.out.print(" "+a);
	}
}
