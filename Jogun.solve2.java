package Jogun;

import java.util.Scanner;

public class solve2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if (x % 3 == 0)
			System.out.println("3의 배수 입니다.");
		else if (x % 2 == 0)
			System.out.println("2의 배수 입니다.");
		else
			System.out.println("2의 배수도, 3의 배수도 아닙니다.");
	}
}
