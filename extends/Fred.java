package example;

public class Fred extends Person {

	public void speak() {
		System.out.println("Hello my name is Fred."); // Not calling super compleatly overwrites the
							      // Person class speak method.
	}
}
