class StackOperations 
{
	private int stack[];
	private int top;
	public static final int max = 10;

	public StackOperations()
	{
		createnew();
	}

	//Creating a stack with max size
	public void createnew()
	{
		stack = new int[max];
		top = -1;  
	}

	//Pushing an element on the stack
	public StackOperations push(int element)
	{
        assert(top == max);
	    stack[++top] = element;
	    return this;
	}

	//Checking whether the stack is empty
	public int isEmpty()
	{
		if(top < 0)
			return 1;
		else 
			return 0;
	}

	//Removing an element from the stack
	public StackOperations pop()
	{
		assert((isEmpty()) == 0);
		top--; 
		return this;
	}

	//Displaying the contents fo the stack
	public void display()
	{
		for(int i=0; i <= top; i++)
			System.out.println(stack[i]);
	}
}


