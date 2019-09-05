package day2;

class Bank{
	public int getBalance() {
		return 0;
	}
}

class BankA extends Bank{
	public int getBalance() {
		return 1000;
	}
}

class BankB extends Bank{
	public int getBalance() {
		return 1500;
	}
}

class BankC extends Bank{
	public int getBalance() {
		return 2000;
	}
}

public class CustomerView {

	public static void main(String[] args) {
		
		BankA objA=new BankA();
		BankB objB=new BankB();
		BankC objC=new BankC();
		
		System.out.println(objA.getBalance());
		System.out.println(objB.getBalance());
		System.out.println(objC.getBalance());

	}

}
