package conditions;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//create condition variable
		String cdn="yes";
		//check condition
		while(cdn.equals("yes")) {
			System.out.println("Enter the amount:");
			
			int amount=sc.nextInt();
			System.out.println("please collect rs: "+amount);
			
			//change value of condition variable
			
			System.out.println("do you want to condition(yes/no)");
			cdn=sc.next();
		}
	}

}
