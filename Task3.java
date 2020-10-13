public class Task3
{
	public static void main (String[] args)
	{
		int number = 0;
		for(int i = 1; i <= 100; i++)
		{
			if(i % 2 == 0)
			{
				number += i;
			}
		}
		System.out.print(number);
	}
}
