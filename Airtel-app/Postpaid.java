class Postpaid extends Airtel {
//member variables
	private float billAmount;
	private float billDue;
	private int plan;
	private double freeCallBalance;
	private double freeDataBalance;
	private double freeMessageBalance;
	private double callCharge;
	private double datacharge;
	private double messageCharge;

//member funtions

	public Postpaid(String name,String address,int plan)
	{
		this.newPostpaidConnection(name,address,plan);	
	}

//get new prepaid connection
	public int newPostpaidConnection(String name,String address,int plan) {

		if(name != null && address != null)
			{
			this.addNewConnection(name,address,"Postpaid");
			this.billAmount = 0;
			this.plan = plan;
			this.setMonthlyLimit(plan);
			this.callCharge = 0;
			this.datacharge = 0;
			this.messageCharge = 0;
			return 0;
			}
		else return 1;
	}

	private void setMonthlyLimit(int plan) {

		switch(plan){
			case 299:this.freeMessageBalance = 100;
					 this.freeDataBalance = 100;
					 this.freeCallBalance = 100;
					 break;
			case 399:this.freeMessageBalance = 200;
					 this.freeDataBalance = 200;
					 this.freeCallBalance = 200;
					 break;
			case 499:this.freeMessageBalance = 300;
					 this.freeDataBalance = 300;
					 this.freeCallBalance = 300;
					 break;
		}

	}

	public double calculateBill(double call,double data,double message ) {

		this.callCharge = call - freeCallBalance;
		this.datacharge = data - freeDataBalance;
		this.messageCharge = message - freeMessageBalance;
		this.billAmount += this.callCharge*0.85 + this.datacharge*0.85 + this.messageCharge *.85;
		return this.billAmount;
	}

	public double payBill(double amount) {
		this.billAmount -= amount;
		return this.billAmount;
	}

	public void displayBill() {
		System.out.println(this.billAmount);
	}
}