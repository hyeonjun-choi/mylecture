package java_day8;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalArray { 

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		 System.out.println("이름을 입력하시오");
		 String str= sc.nextLine();
		 
		String[] nick= {"White","Black", "Bear", "Sesame", "Gift"};
		String[] name= {"희둥이", "까만콩", "곰돌이", "깨소금", "복돌이"};		 
		 
				 
	for(int i=0;i<5;i++) {
		if(str.equals(name[i])) {
			System.out.println("> " + nick[i]);
			break;
		 
					}
	}
		
		  
		  
	}
		  
		  
	}

		
