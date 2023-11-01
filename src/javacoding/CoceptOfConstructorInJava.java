package javacoding;

public class CoceptOfConstructorInJava {
	
	// Constructor has the same name as the class it belongs
	// It has no return type, not even void
	// It is automatically called at the moment the object of the class is created
	// It can be overloaded using different parameters
	// While creating a class default constructor is always there in hidden form

	public CoceptOfConstructorInJava() {
		System.out.println("This is a Default Constructor");
	}

	public CoceptOfConstructorInJava(String a) {
		System.out.println("This is a Single parameterised constructor");
		System.out.println("The name of Programmer: " + a);
	}

	public CoceptOfConstructorInJava(int b, int c) {
		System.out.println("This is a Double parameterised constructor");
		System.out.println("The value of b: " + b);
		System.out.print("The value of c: " + c);
	}

	public static void main(String[] args) {

		CoceptOfConstructorInJava cc = new CoceptOfConstructorInJava();
		CoceptOfConstructorInJava cc1 = new CoceptOfConstructorInJava("Manoj");
		CoceptOfConstructorInJava cc2 = new CoceptOfConstructorInJava(100, 200);
	}
}