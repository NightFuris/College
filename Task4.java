public class Task4 
{
	public static void main (String[] args)
	{
		int number = 0;
		int power = 1;
		int max = 100;
		while(power++ <= max)
		{
			number += power;
		}
		System.out.print(number);
	}
}
