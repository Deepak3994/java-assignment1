class NumDivByse
{
	public static void main(String args[])
	{
		int sum=0,num=0;

		for(int i=100;i>=100&&i<=200;i++)
		{
			if(i%7==0)
			{
				num++;
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Number of integers div by 7="+num);
		System.out.println("Sum of integers div by 7="+sum);
	}
}