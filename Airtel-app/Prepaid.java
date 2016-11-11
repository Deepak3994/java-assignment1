class Prepaid extends Airtel{

	
//memeber variables
	private double phoneBalance;
	private double dataBalance;
	private int messageBalance;
		
//member funtions
	public Prepaid(String name,String address)
		{
			this.newPrepaidConnection(name,address);
			System.out.println(this.phoneNumber);	
		}

//get new prepaid connection
	public int newPrepaidConnection(String name,String address) {

		if(name != null && address != null)
			{
			this.addNewConnection(name,address,"Prepaid");
			this.phoneBalance = 0;
			this.dataBalance = 0;
			this.messageBalance = 0;
			return 0;
			}
		else return 1;
	}


//recharge phone balance without plan
	public int rechargePhoneBalance(double amount){
		double rechargeAmount = 0;
		if(amount > 10)
		{
			rechargeAmount = amount * 0.85;
			this.phoneBalance = this.phoneBalance + rechargeAmount;
			return 1;
		}
		else return 0;
	}

	public int rechargeData(int plan)
	{
		long data = 0;
		if(validDataPlan(plan) == 1)
			{
				data = getData(plan);
				dataBalance += data;
				return 1; 
			}
		return 0;

	}

	public int rechargeMessage(int plan)
	{
		long message = 0;
		if(validMessagePlan(plan) == 1)
		{
			message = getmessage(plan);
			messageBalance += message;
			return 1; 
		}
		return 0;
	}

	private int validDataPlan(int plan) {
		switch(plan){
			case 299:
			case 399:
			case 499:return 1;					
			default: return 0;
		}
	}

	private int validMessagePlan(int plan) {
		switch(plan){
			case 29:
			case 39:
			case 49:return 1;
			default: return 0;
		}	
	}

	private long getmessage(int plan) {
		switch(plan){
			case 29: return 100;
			case 39: return 200;
			case 49: return 300;
		}
		return 0;
	}

	private long getData(int plan){
		switch(plan){
			case 299: return 100;
			case 399: return 200;
			case 499: return 300;
		}
		return 0;	
	}

	public void displayBalance(){
		System.out.println(this.phoneBalance); 
		System.out.println(this.dataBalance);
		System.out.println(this.messageBalance);

	}
}