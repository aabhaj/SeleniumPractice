package textPackage;

// Class is the template where in main method we give diff inputs
public class Calculator {

	public static void addition(int a, int b) {
		// int a =10;
		// int b =20;
		int c = a + b;
		System.out.println("Addition of two numbers:- " + c);
	}

	public static void substraction(int a, int b) {
		int c = b - a;
		System.out.println("Substraction of two numbers: - " + c);
	}

	public static void multiplication(int a, int b) {
		int c = b * a;
		System.out.println("Multiplication of two numbers - " + c);
	}

	public static void division(int a, int b) {
		int c = b / a;
		System.out.println("Division of two numbers - " + c);
	}	
		
	public static void squareRoot(double a) {
			double c = Math.sqrt(a);
			System.out.println("squareroot of a number-  " + c);
		
	}

// main method where we call all other functions and methods
	public static void main(String[] args) {
		System.out.println("Hello world!");

//		addition(9, 4);
//		substraction(10, 20);
//		multiplication(10, 20);
//		division(10, 20);
//			
		
		System.out.println("********************");
		Calculator cal = new Calculator();  //object creation, "cal" is the object
		// out side the class we have to use this method
		cal.addition(15,20);
		cal.multiplication(15,20);
		cal.substraction(40, 80);
		cal.division(30, 60);
		cal.squareRoot(25);
		
		
//		System.out.println("********************");
//		//not recommended , can be used within you package/project only
//		new Calculator().addition(40, 60);
//		new Calculator().substraction(4, 5);
//		new Calculator().multiplication(20, 40);
//		new Calculator().division(2, 10);
//	}
	}
	}
