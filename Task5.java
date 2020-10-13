public class Task5 
{
	public static void main (String[] args)
	{
		int number = 0;
		int power = 1;
		int max = 100;
		do
		{
			if(power % 2 == 0)
			{
				number += power;
			}		
		}while(power++ <= max);
		System.out.print(number);
	}
}
