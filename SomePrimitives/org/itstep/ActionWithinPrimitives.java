package org.itstep;

public class ActionWithinPrimitives {

	public static void main(String[] args) {
		SomePrimitives somePrimitives = new SomePrimitives();
		somePrimitives.setNumber1(100);
		somePrimitives.setNumber2();

		System.out.println(somePrimitives.getNumber1() + somePrimitives.getNumber2());
	}

}
