import java.util.Scanner;

class CompareValues
{
	public static void main(String args[])
	{
		Scanner I = new Scanner(System.in);
		System.out.println("enter the values");
		int a = I.nextInt();
		int b = I.nextInt();
		assert(a == b);
		//System.out.println("a and b are equal");

	}
}
