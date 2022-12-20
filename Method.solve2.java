package Method;

public class solve2 {
	public static void main(String[] args) {
		System.out.println(sum(1, 10));
		System.out.println(sum(10, 100));
		System.out.println(sum(100, 1000));
		
	}
	// static: 객체를 생성하지 않고도 메서드 사용 가능
	public static int sum(int start, int end) {
		int sum= 0;
		for (; start <= end;start++)
		{
			sum += start;
		}
		return sum;
	}
}
