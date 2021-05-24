package java_homework;

import java.util.Scanner;

public class HomeWork9 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
		String height;
		int weight;
	
		
	while(true)	{	
		
		System.out.println("키");
		height = scanner.next();
		
		if(height.equals("-1") ||height.equals("q")) {
			System.out.println("끝");
			break;
		}
		
		System.out.println("몸무게");
		weight = scanner.nextInt();
		
		// if - else 를 사용하였습니다.
		if( Integer.parseInt(height) + 100 - weight > 0) {
			System.out.println("비만수치 비만");
		}
		else {
			System.out.println("정상");
		}
			
	}	
	
	}

}