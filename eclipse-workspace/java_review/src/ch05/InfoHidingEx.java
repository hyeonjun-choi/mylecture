package ch05;

public class InfoHidingEx {

	public static void main(String[] args) {
		// 접근제한다 : public > protected > package > private

		Student st1 = new Student();
		st1.name = "홍길동";
		st1.address = "";
		
		review.Student2 st2 = new review.Student2();
		//package 의 가시성
		// st2.name = "홍길동";
		st2.address = "";
		
		
	}

}
