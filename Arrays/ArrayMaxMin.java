import java.util.Scanner;
class ArrayMaxMin
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("enter the size of the matrix");
		int n = input.nextInt();
		int a[] = new int[n];
		int max = 0;
		int min = 999;
		System.out.println("enter the array inputs");


		for(int i = 0; i < n; i++)
		{
			a[i] = input.nextInt();
			if(a[i] > max)
				max = a[i];
			if(a[i] < min)
				min = a[i];
		}
		System.out.println("max = " + max + "min = "+ min);
	}
}