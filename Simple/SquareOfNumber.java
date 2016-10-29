import java.util.Scanner;
class SquareOfNumber
{
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		System.out.println("enter the number ");
		double num = i.nextDouble();
		double squarednumber = num * num;
		assert(squarednumber == num * num);
		System.out.println("square of the numbaer = "+ squarednumber);
	}
}
