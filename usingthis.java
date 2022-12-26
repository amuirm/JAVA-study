package practice;

public class usingthis {

}
	
class Circle4 {
	double radius;
	String color;
	
	public Circle4(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public Circle4(double radius) {
		this(radius, "파랑");
	}
	
	public Circle4(String color) {
		this(10.0, color);
	}
	
	public Circle4() {
		this(10.0, "빨강");
	}
}
