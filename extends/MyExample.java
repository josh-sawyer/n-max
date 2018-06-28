package example;

public class MyExample {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		people[0] = new Bob();
		people[1] = new Fred();
		for(Person person : people) {
			person.speak();
		}
	}

}
