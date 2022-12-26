package 동적배열;

import java.util.ArrayList;

public class basic1 {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(5);
		myList.add(10);
		myList.add(12);				// 리스트에 데이터를 추가
		
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i) + " ");
		}
		
		System.out.println("\n변경 후 : ");
		
		myList.set(2,  15);
		myList.remove(0);
		
		for (Integer i : myList) {
			System.out.println(i + " ");
		}
		
		}
}
