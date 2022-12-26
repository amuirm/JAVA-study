package 다차원배열;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n을 입력하세요");
		int n = in.nextInt();
		int [][]arr = new int[n][n];
		int a = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[j][i] = a;
				a++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d",  arr[i][j]);
			}
			System.out.println();
		}
	}
}
