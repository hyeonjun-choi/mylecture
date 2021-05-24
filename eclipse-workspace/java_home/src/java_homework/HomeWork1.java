package java_homework;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("층수를 입력합니다.");
		String floor = sc.nextLine();
		// "1층"
	// String floor = sc.next();
		
		switch(floor) {
		case "1층":
		System.out.println("1층 약국입니다.");
		break;
		case "2층":
		System.out.println("2층 정형외과입니다.");
		break;
		case "3층":
		System.out.println("3층 피부과입니다.");
		break;
		case "4층":
		System.out.println("4층 치과입니다.");
		break;
		case "5층":
		System.out.println("5층 헬스 클럽입니다.");
		break;
		default:
		System.out.println("건물이 없습니다.");
		break;
		
		
		
		}
		
		
	}
}