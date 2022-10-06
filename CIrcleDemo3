package practice;

public class CiecleDemo3 {
	public static void main(String[] args) {
		Circle3 myCircle = new Circle3();
		
		myCircle.setRadius(10.0);
		
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
	}
}

class Circle3 {
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
	}
}
