package conditions;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
		System.out.println("Enter your pin number:");
		int pinNumber=sc.nextInt();
		if(pinNumber==12345) {
			System.out.println("Welcome");
			break;
		}else {
			System.out.println("Invalid Pin Numbe");
			if(i==2) {
				System.out.println("your card is bloced");
			}
		}
	}
}
}
