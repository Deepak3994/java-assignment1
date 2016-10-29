class StackTest extends StackOperations
{
	public static void main(String args[])
	{
		StackOperations s = new StackOperations();
		s.push(10).push(20).push(30);
		s.display();
		//s.pop();
		//s.display();
    }
}