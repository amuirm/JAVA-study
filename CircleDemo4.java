package practice;

class Circle5 {
	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;
	
	public Circle5(double radius) {
		this.radius = radius;
		numOfCircles++;
		numCircles++;
	}
}

public class CircleDemo4 {
	public static void main(String[] args) {
		Circle5 myCircle = new Circle5(10.0);
		Circle5 yourCircle = new Circle5(5.0);
		
		//print
		System.out.println("원의 개수 : " + Circle5.numOfCircles);
		System.out.println("원의 개수 : " + yourCircle.numCircles);
	}
	
	void print() {
		System.out.println("인스턴스 메서드입니다.");
	}
}
