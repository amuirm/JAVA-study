package String배열;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char name[] = {'A', 'B' , 'C', 'D', 'E'};
		int score[] = new int[name.length];
		int sum = 0; char high = ' '; int max = 0;
		for (int i = 0; i < name.length; i++)
		{
			System.out.print(name[i] + " 학생의 점수를 입력하세요 : ");
			score[i] = in.nextInt();
			sum += score[i];
			if (max < score[i]) {
				max = score[i];
				high = name[i];
			}
		}
		System.out.print("5명 점수 출력 : [");
		for (int i = 0; i < name.length - 1; i++) {
			System.out.print(score[i] + ", ");
		}
		System.out.print(score[name.length - 1]);
		System.out.println("]");
		System.out.println("5명 점수 출력 : " + Arrays.toString(score));
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (float)sum / name.length);
		System.out.println("최고 점수 받은 학생 이름 : " + high);
	}
}
