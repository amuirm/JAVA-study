package 배열응용;

import java.util.Arrays;

public class Basic1 {
	public static void main(String[] args) {
		System.out.println(args);
		System.out.println("배열 길이 : " + args.length);
		System.out.println("배열 출력 : " + Arrays.toString(args));
		
		int x = Integer.valueOf(args[1]);
		
		if(args.length == 2) {
			for (int i = 0; i < x; i++) {
				System.out.print(args[0]);
			}
		}
		else
			System.out.println("어이쿠");
	}
}
