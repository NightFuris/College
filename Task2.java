import java.util.Scanner;

public class Task2
{
	public static void main (String[] args)
	{
	    Scanner in =new Scanner(System.in);
	    int a;System.out.print("a:");a=in.nextInt();
	    int b;System.out.print("b:");b=in.nextInt();
	    System.out.print(a!=b ? a > b ? "a" :  "b" : "a==b");
	}
}
