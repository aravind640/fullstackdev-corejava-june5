
public class Calculator {

	public static void main(String[] args) {

		System.out.println("Calculator");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition result is : " + (a + b));
		System.out.println("Subtraction result is : " + (a - b));
		System.out.println("Mutiplication result is : " + (a * b));
		System.out.println("Division result is : " + (a / b));
	}

}
