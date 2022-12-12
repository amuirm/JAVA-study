package Banbok;

public class solve7 {
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++)
		{
			if(i % 2 == 1)
				continue;
			else if(i % 2 == 0)
				System.out.println(i);
		}
	}
}
