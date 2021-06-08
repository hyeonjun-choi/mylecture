package ch06;

public class VariableScopeEx {
	
	// 변수/식별자/객체
	// 맴버변수 == 인스턴스 변수
	int a = 0;
	
	
	public static void main(String[] args) {
	
	}

	public void test() {
		this.a = 10;
		
	}
	// 지역변수: 메서드 내부에서 선어노딘 변수
	// - 메서드 매개변수
	public void local(String a, int b) {
		int c = 10;
		c = b + 100;
	}
}
