package Practice;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mach = in.nextInt();
		float radius = in.nextFloat();
		System.out.println("소리가 1시간 동안 가는 거리 : " + mach * 60 * 60 + "m");
		System.out.printf("반지름이 "+ radius +"인 원의 넓이 : "+ radius * radius * 3.14);
	}
}
