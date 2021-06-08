package ch02;

public class Variable1 {
	
	//1. 맴버 필드(속성, 변수)
	//자료형 이름;
	//자료형 이름 = ""; - 리터럴;
	//자료형 : 기본자료형, 클래스, 배열, Enum
	//리터럴 : 자료의 표기 방법

	
	char ch; // 선언함
	char ch1 = 'A'; // 65
	
	float  f_name;
	float f_name2 = 1.0F;
	double d_name = 1.0;
	
	double d_name3 = Double.MAX_VALUE;
	// double d_name4 = Double.MAX_VALUE + 1.0
	
	// 네이트: -128~127
	byte b1 = -128;
	byte b2 = 127;
	//byte b3 = 128;
	
	int i = 10;
	long l = Long.MAX_VALUE;
	long l2 = 10L;
	
	
	//2. 맴버 메소드
	// Modifier [static] 니런형식 이름(매개변수) {}
	// Modifier: public, protected, package, private
	// 리턴형식 : void, 자료형
	
	public void printinfo(int i) {
		System.out.println(ch1);
		System.out.println(b2);


	}
	public void printinfo2(int i, long l, short s, byte b) {
		// 코드ㅜ 블럭
	}
	{
		// 코드 블럭
	}
	
	public int getNumber() {
		return 0; // return 리턴자료형
	}
	
	static int k = 100;
	
	// Starting point. 시작점
	public  void main(String[] args) {
	//	System.out.println(ch1);
		System.out.println(k);

		
		
		
	int j = 100;	
	char c = 'a';
	
	
	char ch2;
	char ch3 = 'A'; // 65
	
	//System.out.println(ch2));
	System.out.println(ch3);
	}

}




















