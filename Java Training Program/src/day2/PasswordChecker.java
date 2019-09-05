package day2;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter password:");
		
		String password= sc.next();
		int digitCount=0;
		boolean flag=true;
		
		for(int i=0;i<password.length();i++) {
			char temp=password.charAt(i);
			
			if(temp>='a' && temp<='z' || temp>='A' && temp<='Z' || temp>='0' && temp<='9') {
				if(temp>='0' && temp<='9') digitCount++;
			}
			else flag=false;
		}
		
		if(password.length()>=10 && digitCount>=2 && flag) {
			System.out.println("password is valid : "+password);
		}
		else System.out.println("password is invalid!!!");
		
		sc.close();

	}

}
