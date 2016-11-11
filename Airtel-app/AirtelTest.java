class AirtelTest{
	public static void main(String[] args){
		Prepaid con1 = new Prepaid("chiru","bangalore");

		assert(con1.rechargePhoneBalance(100) == 1);
		assert(con1.rechargePhoneBalance(8) == 0);
		assert(con1.rechargeData(799) == 0);
		assert(con1.rechargeData(299) == 1);
		assert(con1.rechargeMessage(29) == 1);
		assert(con1.rechargeMessage(179) == 0);
		con1.displayBalance();

		Postpaid con2 = new Postpaid("chiru","bangalore",299);
		assert(con2.calculateBill(200,300,400) == 510.0);
		assert(con2.payBill(300) == 210.0);
	}
}