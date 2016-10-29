import java.util.Scanner;
class Area
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		double area = 0;
		System.out.println("enter choice 1.circle 2. triangle");
		int choice = input.nextInt();
		switch(choice)
		{
			case 1: System.out.println("enter the radius of circle");
					double radi = input.nextDouble();
					area = 3.14 * radi * radi;
					System.out.println(area);
					break;

			case 2: System.out.println("enter the breadth and height of the triangle");
					double breadth = input.nextDouble();
					double height = input.nextDouble();
					area = 0.5 * breadth * height;
					System.out.println(area);
					break;

			default : return;
		}


	}
}
