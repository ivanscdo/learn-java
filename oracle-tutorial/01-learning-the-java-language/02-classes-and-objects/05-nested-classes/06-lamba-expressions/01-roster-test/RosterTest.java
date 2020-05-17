import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.function.Predicate;
import java.lang.Iterable;
import java.time.chrono.IsoChronology;

public class RosterTest {

	interface CheckPerson {
		boolean test(Person p);
	}

	// Approach 1: Create Methods that Search for Persons that Match One Characteristic

	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	// Approach 2: Create More Generalized Search Methods

	public static void printPersonsWithinAgeRange(
		List<Person> roster, int low, int high) {
		for(Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

	// Aproach 3: Specify Search Criteria Code in a Local Class
	// Approach 4: Speficy Search Criteria Code in an Anonymous Class
	// Approach 5: Specify Search Criteria Code with a Lambda Expression

	public static void printPerson(
		List<Person> roster, CheckPerson tester) {
		for(Person p : roster) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 6: Use Standard Function Interfaces with Lambda Expressions

	public static void printPersonsWithPredicate(
		List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if(tester.test(p)) {
				p.printPerson();
			}
		}
	}

	// Approach 7: Use Lambda Expressions

	public static void processPersons(
		List<Person> roster, Predicate<Person> tester, 
		Consumer<Person> block) {
		for(Person p : roster) {
			if(tester.test(p)) {
				block.accept(p);
			}
		}
	}

	// Approach 7, second example

	public static void processPersonsWithFunction() {

	}
}
