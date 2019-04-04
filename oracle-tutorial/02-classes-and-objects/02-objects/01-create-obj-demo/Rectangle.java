public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;

	// four constructors
	public Rectangle() {
		origin = new Point(0,0);
	}
	public Rectangle(Point p) {
		origin = p;
	}
	public Rectangle(int w, int h) {
		origin = new Point(0,0);
		width = w;
		height = h;
	}
	public Rectangle(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}

	// a method for moving the rectangle
	// return type void
	// doesn't return value or need return statement
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}
	
	// a method for computing the area of the rectangle
	// return type int (primitive)
	// must have return value
	public int getArea() {
		return width * height;
	}

	// test field without object reference
	public void printFields() {
		System.out.println("height & width: " + height + " & " + width);
	}
}
