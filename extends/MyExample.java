package example;

public class MyExample {

	public static void main(String[] args) {
		Person[] people = new Person[2]; // Create a list of Objects of type Person.

		people[0] = new Bob(); // Create a new Bob Object who is a Person Object
		                       // and assign it to index 0 of the Person array.

		people[1] = new Fred(); // Create a new Fred Object who is a Person Object
		                        // and assign it to index 1 of the Person array.

		for(Person person : people) { // Loop through the Person array.

			System.out.println(person.getClass().getName()); // Print the Object type of
									 // the person.

			person.speak(); // Call the speak method of each Person Object
					// which is overwritten by the extended SubClass.
		}
	}

}
