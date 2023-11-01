package javacoding;

public class ThisKeywordInConstructor {

	String name;
	int id;

	public ThisKeywordInConstructor(String name, int id) {

		// this keyword is used to initialize class or global variable

		this.name = name;
		this.id = id;

		System.out.println(name);
		System.out.println(id);
	}

	public static void main(String[] args) {

		ThisKeywordInConstructor obj = new ThisKeywordInConstructor("Sanjay", 101);
	}

}
