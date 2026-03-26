package creditCard;

public class CCFraudRecord {

	protected int time;
	protected double amount;
	protected int fraudClass;
	
	public CCFraudRecord(int time, double amount, int fraudClass) {
		this.time = time;
		this.amount = amount;
		this.fraudClass = fraudClass;
	}
	
}
