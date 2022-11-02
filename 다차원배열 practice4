package 다차원배열;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char arr[][] = {{'O','O','O','O','O'},{'O','O','O','O','O'},{'O','O','O','O','O'},{'O','O','O','O','O'},{'O','O','O','O','O'}};
		for(;;){
			int y = 0; int x = 0;
			System.out.printf("좌표 입력(11~55까지, 종료는 00) : ");
			String addr = in.next();
			int addrint = Integer.valueOf(addr);
			if (addr.equals("00")) {
				break;
			}
			else if (addrint == 0) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
			else if (addrint < 11 || addrint > 55) {
				System.out.println("범위 초과 다시 입력");
			}
			else {
				x = addrint / 10;
				y = addrint % 10;
				arr[x-1][y-1] = 'X';
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
