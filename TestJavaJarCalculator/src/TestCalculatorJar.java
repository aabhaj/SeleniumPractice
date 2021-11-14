import textPackage.Calculator;

public class TestCalculatorJar {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();  //object creation, "cal" is the object
		// we are using the jar out side the actual  project i.e. 'seleniumtraining'
		cal.addition(15,20);
		cal.multiplication(15,20);
		cal.substraction(40, 80);
		cal.division(30, 60);

	}
	
}
