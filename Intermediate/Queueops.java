class Queueops
{
	private int queue[];
	private int front,rear,len;
	public static final int max = 10;

	public Queueops()
	{
		createnew();
	}

	public void createnew()
	{
		queue = new int[max];
		front = rear = -1;  
	}

	public void add(int x)
	{
		assert(rear == max);
		queue[++rear] = x;
	}

	public int isEmpty()
	{
		if(front < 0)
			return 1;
		else 
			return 0;
	}

	public int remove()
	{
		assert((isEmpty()) == 0);
		return queue[++front]; 
	}

	public void display()
	{
		for(int i=0; i <= front; i++)
			System.out.println(queue[i]);
	}
}

