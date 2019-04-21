public class HelloWorldAnonymousClasses {
	
	interface HelloWorld {
		public void greet();
		public void greetSomeone(String someone);
	}

	public void sayHello() {
				
		class EnglishGreeting implements HelloWorld {
			String name = "world";
			public void greet() {
				greetSomeone("world");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		// uses a local class for the initialization of the variable englishGreeting
		HelloWorld englishGreeting = new EnglishGreeting();

		// uses anonymous classes in the initialization statements of local variables frenchGreeting & spanishGreeting
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			public void greet() {
				greetSomeone("tout le monde");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		// anonymous class definition is an express and must be part of a statement
		// this is why there is a semicolon after the closing brace
		};

		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";
			public void greet() {
				greetSomeone("mundo");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};

		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}
}
