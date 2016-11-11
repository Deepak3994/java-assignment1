class Airtel {

//member variables
protected long phoneNumber;
protected String customerName;
protected String customerAddress;
protected String typeOfConnection;
protected final long startingseries = 90000000;
protected final long lastNumber = 99999999;
protected static long numberOfCustomers = 0;

//Add new connection
protected void addNewConnection(String name,String address,String connectionType) {

	this.phoneNumber = this.getNewPhoneNumber();
	this.customerName = name;
	this.customerAddress = address;
	this.typeOfConnection = connectionType;	
}

//Generate new phine number
protected long getNewPhoneNumber() {

	long phoneNumber = this.startingseries + this.numberOfCustomers;
	//check the generated number is within series
	if(phoneNumber <= lastNumber)
	{
		numberOfCustomers += 1;
		return phoneNumber;
	}
	else
		return 0;
}

}

