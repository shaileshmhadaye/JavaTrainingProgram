package day1;
import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu Driven Program");
		System.out.println("Enter two numbers:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ch=0;
		
		do {
			System.out.println("1.Add");
			System.out.println("2.Subtract");
			System.out.println("3.Multiply");
			System.out.println("4.Divide");
			System.out.println("5.Remainder");
			System.out.println("6.Exit");
			System.out.println("Enter Your choice:");
			
			ch=sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("result="+(a+b)); break;
			case 2: System.out.println("result="+Math.abs(a-b)); break;
			case 3: System.out.println("result="+(a*b)); break;
			case 4: System.out.println("result="+Math.floor(a/b)); break;
			case 5: System.out.println("result="+(a%b)); break;
			default : break;
			}
			
		}while(ch>=1 && ch<=5);
		
		sc.close();
	}

}
