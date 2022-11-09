package 동적배열;

import java.util.ArrayList;
import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		int count = 0;
		boolean b = false;
		
		for(;;) {
			String temp = in.next();
			if(temp.equals("종료")) {
				break;
			}
			for(int i = 0; i < myList.size(); i++) {
				if(temp.equals(myList.get(i))) {
					System.out.println("중복된 문자열입니다.");
					b = true;
					break;
				}
				else 
					b = false;
			}
			if (b == false) {
				myList.add(temp);
			}
		}
		System.out.println("<<출력 결과 : ");
		for(int i = 0; i < myList.size(); i++) {
			System.out.print(myList.get(i)+ " ");
		}		

	}
}
//	if(list.contains(temp)) {
//		System.out.println("중복된 문자열입니다.");
//	}
//	else{
//		list.add(temp);
//	}
