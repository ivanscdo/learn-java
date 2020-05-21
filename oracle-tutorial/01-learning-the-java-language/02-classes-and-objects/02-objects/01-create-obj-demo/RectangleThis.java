public class RectangleThis{
	public int x, y;
	public int width, height;

	public RectangleThis() {
		this(0, 0, 1, 1);
	}
	public RectangleThis(int width, int height) {
		this(0, 0, width, height);
	}
	public RectangleThis(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int getArea() {
		return width * height;
	}
	public void printFields() {
		System.out.println("height: " + height + ". width: " + width);
	}
}
