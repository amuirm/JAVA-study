package practice;

public class LocalVariableDemo {
	public static void main(String[] args) {
		int a = 0;
		double b;
		
		//System.out.print(b); 초기화되지 않고 사용할 수 없음 
		//System.out.print(a + c); c변수는 아직 선언되지 않았기 때문에 사용할 수 없다
		
		int c = 0;
		
		//public double d = 0.0; 지역변수는 public으로 지정할 수 없다
		
		for (int e = 0; e < 10; e++) {
			//int a = 1; 5행에서 선언된 지역 변수 이름 / 블록이 달라도 같은 이름으로는 다시 만들 수 없다
			System.out.print(e);
		}
	}
}
