package com.fullstacktraining.controlflows;

public class ControlStatementsDemo {

	public static void main(String[] args) {
		int a = 0;
		if (a == 0) {
			System.out.println("Given number is neither Even nor Odd");
		} else if (a % 2 == 0) {
			System.out.println("Given number is Even number");
		} else {
			System.out.println("Given number is odd number");
		}

		int[] arr = { 10, 2, 30, 4 , 0 , 5};

		int length = arr.length; // 4

		int i = 0;

		// 0[T], 1[T] , 2[T] , 3[T] , 4{F}

		while (i < length) {
			if (arr[i] == 0) {
				System.out.println("Given number is neither Even nor Odd");
			} else if (arr[i] % 2 == 0) {
				System.out.println("Given number is Even number");
			} else {
				System.out.println("Given number is odd number");
			}
			i++;
		}
	}

}
