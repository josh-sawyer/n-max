package example;

public class Bob extends Person {
	
	public void speak() {
		super.speak(); // super accesses the Parent Object the Bob is extending
			       // and calles its speak method.

		System.out.println("My Name is Bob."); // following the execution of the super
						       // speak method call then prints message.
	}
}
