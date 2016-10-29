class RevNum
{
	public static void main(String args[])
	{
		int num,rev=0;
		num=Integer.parseInt(args[0]);
		while(num!=0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
}