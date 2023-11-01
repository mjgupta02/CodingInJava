package javacoding;

public class ChildClass extends ParentClass {

	// super keyword is used to call parent class constructor
	// It should be the first statement and
	// It should always be in the child class only

	public ChildClass() {
		super();
	}

	public ChildClass(int a) {
		super(a);
	}

	public ChildClass(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		ChildClass obj1 = new ChildClass(100);
		ChildClass obj2 = new ChildClass(200, 300);

	}

}
