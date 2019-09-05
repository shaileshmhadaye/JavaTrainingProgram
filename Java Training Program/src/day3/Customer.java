package day3;

class RBI{
	
	private float InterestRate;
	
	public void setInterestRate(float Rate) {
		if(Rate>=4) this.InterestRate=Rate;
	}
	
	public float getInterestRate() {
		return(InterestRate);
	}
}

class SBI extends RBI{
	
	public float getInterestRate() {
		return(8.4f);
	}
}

class ICICI extends RBI{
	public float getInterestRate() {
		return(7.5f);
	}
}

class PNB extends RBI{
	public float getInterestRate() {
		return(8.9f);
	}
}

public class Customer {

	public static void main(String[] args) {
		
		SBI objsbi = new SBI();
		ICICI objicici = new ICICI();
		PNB objpnb = new PNB();
		
		System.out.println(objsbi.getInterestRate());
		System.out.println(objicici.getInterestRate());
		System.out.println(objpnb.getInterestRate());
		
	}

}
