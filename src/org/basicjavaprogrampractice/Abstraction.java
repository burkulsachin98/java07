package org.basicjavaprogrampractice;

abstract class Bike {

	abstract void hero();

	public void splender() {
		System.out.println("Splender Price is 90000");

	}

}

class Shine extends Bike {

	public void hero() {

		System.out.println("Glamour price is 10000");
	}

}

public class Abstraction {

	public static void main(String[] args) {

		Shine sh = new Shine();

		sh.hero();
		sh.splender();

	}

}
