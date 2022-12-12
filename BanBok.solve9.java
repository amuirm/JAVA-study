package Banbok;

public class solve9 {
	public static void main(String[] args) {
		int i = 1;
		do {
			if(i % 2 == 0)
			{
				System.out.println(i);
				i++;
			}
			else
			{
				i++;
				continue;
			}
		}while(i < 11);
	}
}
