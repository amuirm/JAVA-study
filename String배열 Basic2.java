package String배열;

public class Basic2 {
	public static void main(String[] args) {
	
		String[] name = new String[3];
		//String은 클래스이므로 new 연산자를 통해 객체 생성해야 하지만, 
		
		name[0] = new String("아름");
		//String의 경우 리터럴 방식으로 간략히 표현 가능
		name[1] = "다운";
		name[2] = "바다";
		
		//{} 괄호를 사용해서 간단히 초기화 가능
		String[] name2 = new String[] {"대한", "민국", "만세"};
		
		// new String []을 생략할 수 있음
		String[] name3 = {"대한", "민국", "만세"};
		
		//배열 name의 마지막 요소를 "산"로 변경
		name[name.length-1] = "산";
		
		//향상된 for문
		for (String n : name) {
			System.out.println(n);
		}
		
	}
}
