import java.util.Scanner;
import java.lang.Math;
class Findx
{
	public static void main(String args[])
	{
		Scanner i = new Scanner(System.in);
		System.out.println("enter the input");
		int a = i.nextInt();
		int b = i.nextInt();
		int c = i.nextInt();
		double val1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		double val2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
		System.out.println(val1 + " " + val2);	
	}
}
