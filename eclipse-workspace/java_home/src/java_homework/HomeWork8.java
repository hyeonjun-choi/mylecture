package java_homework;

import java.util.Scanner;

public class HomeWork8 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		String oper;

		
		System.out.println("숫자.");
		num1 = scan.nextInt();
		
		System.out.println("부호.");
		oper = scan.next();
		
		System.out.println("숫자.");
		num2 = scan.nextInt();
		
		

		switch(oper) {
		
		case "+":
			System.out.println("계산값 : " + (num1 + num2) );
			break;
			
		case "-":
			System.out.println("계산값 : " + (num1 - num2) );
			break;
			
		case "*":
			System.out.println("계산값 : " + (num1 * num2) );
			break;	
		
		case "/":
			System.out.println("계산값 : " + (num1 / num2) );
			break;	
		}
		
	}

}