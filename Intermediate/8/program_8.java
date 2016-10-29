class program_8{
	public static void main(String args[]){
		int variable=0;
		for(int i=100;i<=200;i++){
			if(i%7==0)
				variable+=i;
		}
		System.out.println("The sum of all integers are: "+variable);
	}
}
