package Method;

public class solve3 {
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum("Hello", "World"));
		System.out.println(sum(5, 7, 9));
	}
// 메서드 오버로딩 : 매개변수 종류 또는 개수가 다를 때 같은 이름의 함수 선언 가능
	public static String sum(int a, int b) {
		return "입력된 숫자의 합 : " + (a + b);
	}

	public static String sum(String a, String b) {
		return "입력된 문자열 : " + (a + b);

	}

	public static String sum(int a, int b, int c) {
		return "입력된 숫자의 곱 : " + (a * b * c);

	}
}
