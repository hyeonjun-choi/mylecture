package java_day5;

import java.util.Scanner;

public class StringPractice2 {

	public static void main(String[] args) {
	//숫자 n값을 입력받아 1부터 n까지 소수를 구하는 프로그램을 작성 
	//1에서 n까지 소수 출력.
		
	//1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수다.
	//1과 그 수 자신 이외의 자연수로는 나눌 수 없는 자연수로 정의하기도 한다.
		
		Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int i = 2; // i : 나눌 대상
 
       boolean isPrime = true;
 
      for ( int n1 = 2; n1 < i; n1++ ) {
	
	 if (i % n1 == 0) {
		 isPrime = false;
		 
	 }
	 continue;
 }
if (isPrime == true) {
	System.out.print(i);
}
i++;
System.out.println("");
}
	
}

