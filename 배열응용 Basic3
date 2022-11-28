package 배열응용;

public class Basic3 {
	public static void main(String[] args) {
		Circle cc = new Circle(10.0);
		System.out.println("원의 넓이 : " + cc.findArea());
		
		Circle[] c = new Circle[5];
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i + 1.0);
			System.out.printf("반지름 : %.1f, 넓이 : %.2f\n", c[i].radius, c[i].findArea());
		}
	}
}

class Circle{
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
}
