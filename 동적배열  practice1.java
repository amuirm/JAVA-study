package 동적배열;

import java.util.ArrayList;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		int count = 0;
		for(;;) {
			int x = in.nextInt();
			myList.add(x);
			
			if(x == 0)
			{
				break;
			}
			count++;
		}
		for (int i = 0; i < count; i++) {
			System.out.print(myList.get(i) + " ");
		}
	}
}
