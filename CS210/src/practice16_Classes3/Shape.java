package practice16_Classes3;

public class Shape {

	private  int width;
	private  int height;
	
	public Shape (int w, int h) {
		width = w;
		height = h;
	}
	
	public int getArea() {
		return width * height;
	}
}
