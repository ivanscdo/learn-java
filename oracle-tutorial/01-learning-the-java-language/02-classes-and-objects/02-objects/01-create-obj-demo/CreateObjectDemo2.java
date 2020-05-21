public class CreateObjectDemo2 {
	public static void main(String[] args) {
		RectangleThis rectThree = new RectangleThis();

		System.out.println("x: " + rectThree.x);
		System.out.println("y: " + rectThree.y);
		System.out.println("height: " + rectThree.height);
		System.out.println("width: " + rectThree.width);

		rectThree.height = 10;
		rectThree.width = 20;

		System.out.println("height: " + rectThree.height);
		System.out.println("width: " + rectThree.width);

		// test 1
		// fizz and foo never declared
		// will throw error
		// rectThree.fizz = "buzz";
		// rectThree.foo = "bar";
		// System.out.println("fizz: " + rectThree.fizz);
		// System.out.println("foo: " + rectThree.foo);

		// test 2
		// simple fields used within Rectangle class
		// will print
		rectThree.printFields();
		// simple fields used outside of Rectangle class
		// will not print and will throw compile error
		// System.out.println(height);
		// System.out.println(width);

		// test 3
		// creates new Rectangle object and immediately gets height
		// afterwards, program no longer has a reference to the created Rectangle
		int height = new RectangleThis().height;
		System.out.println("int height: " + height);

		// test 4
		// assign value returned by getArea() to variable
		int areaOfRectangle = new RectangleThis(100, 50).getArea();
		System.out.println("int areaOfRectangle: " + areaOfRectangle);
	}
}
