package java_homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력합니다.");
		String str = sc.nextLine();
		
		int sCore = Integer.parseInt(str); 
		char grade = 0; 
		//String grade = new String();
		//String grade = ""; 초기화
		
		if( sCore >= 90 & sCore <= 100 ) {
			grade = 'A';
			System.out.println("A");
		}
		else if( sCore >= 80 & sCore <= 100 ) {
			grade = 'B';
			System.out.println("B");
		}
		else if( sCore >= 70 & sCore <= 100 ) {
			grade = 'C';
			System.out.println("C");
		}
		else if( sCore >= 60 & sCore <= 100 ) {
			grade = 'D';
			System.out.println("D");
		}
		else if( sCore < 60 & sCore <= 100){
			grade = 'F';
			System.out.println("F");	
		}
		else {
			System.out.println("100점 이상은 계산에 넣지 않습니다.");
		}
		
		System.out.println(sCore + "점의 등급은" + grade + "입니다");

	}
	}

