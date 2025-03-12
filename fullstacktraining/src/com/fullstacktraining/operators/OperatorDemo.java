package com.fullstacktraining.operators;

public class OperatorDemo {

	public static void main(String[] args) {

		int a = 10;
		
		a = a + 20;
		a += 20; // a = a + 20;
		System.out.println(++a); // pre increment - first increment the value and then print
		System.out.println(a++); // unary operator operating on single operand, post increment
		System.out.println(a);
		
		boolean bool = true;
		System.out.println(!bool); // negate or not sysmbol does the opposite action
		
		System.out.println(10 % 5); // remainder value
		System.out.println(10 / 5); // quotient value
		
		// bit manipulation - mostly used in manipulation of memory allocation
		
		System.out.println(2 << 2); // left shift operator
		System.out.println(2 >> 2); // right shift operator
		
		
	}

}
