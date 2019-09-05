package day3;

import java.util.Scanner;

public class VendingMachine {
	
	public static boolean ValidateMoney(double money, double price) {
		
			if(money-price>=0) return true;
			else return false;
	}
	
	public static boolean ValidateCoin(int coin) {
		switch(coin) {
		
		case 1 : return true;
		case 5 : return true;
		case 10 : return true;
		case 25 : return true;
		case 50 : return true;
		case 100 : return true;
		case 200 : return true;
		default : return false;

		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Vending Machine---------");
		
		int ch=0;
		double money=0.0;
		double price[]= {.10, .50, .90, .25, .35, .45};
		String items[]= {"Candy","Snack","Nuts","Coke","Pepsi","Soda"};
		
		do {
			System.out.println("----------Menu---------");
			System.out.println("1. Candy  - 10cents");
			System.out.println("2. Snack  - 50cents");
			System.out.println("3. Nuts   - 90cents");
			System.out.println("4. Coke   - 25cents");
			System.out.println("5. Pepsi  - 35cents");
			System.out.println("6. Soda   - 45cents");
			System.out.println("7. Exit\n");
			System.out.println("Choose your food:");
			
			ch=sc.nextInt();
			System.out.println("\n You've selected "+items[ch-1]+"\n\n");
			int temp=0;
			
			do {
				
				System.out.println("Enter Coin Value in cents(1,5,10,25,50,100,200):");
				int coin=sc.nextInt();
				if(ValidateCoin(coin)) { 
				
						System.out.println("Enter total number of coins:");
						int nCoin=sc.nextInt();
						money +=(coin*nCoin)/100.0;
						//System.out.println("money"+money+" "+(coin)+" "+nCoin);
						if(ValidateMoney(money,price[ch-1])) {
							if(money>price[ch-1]) System.out.println("Here's your remaining "+String.format("%.2f", (money-price[ch-1]))+"$");
							System.out.println("Enjoy your food!!!\n\n");
							break;
						}
				
						else {
							System.out.println("Please Insert "+String.format("%.2f", (price[ch-1]-money))+"$ more"); 
							temp=1;
							}
				
				}
				else System.out.println("invalid Coin");
				
			}while(temp==1);
			System.out.println("Press 0 to Cancel Order and press any key to continue");
			if(sc.nextInt()==0) {System.out.println("Your order is cancelled and your "+money+"$ are refunded.\n\n\n");}
			
		}while(ch>=1 && ch<=6);
		
		sc.close();

	}

}
