import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		System.out.println("enter the number");
		int n = i.nextInt();
		double fact = 1;
		for( int i = 0; n > 0; i++)
		{
			fact = fact * n;
			n = n-1;
		}
		System.out.println("factorial = "+ fact);
	}
}
