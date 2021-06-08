package review;

public class Student3 {
	// 필드 : 가능하면 private 선언
		// package modifier
		
		private int age;
		private String name;
		private String address;
		
		public Student3() {
			//this.age = 0;
			//this.name = "";
			
		//	this(n, age, "");
			
		}
		
		public Student3(String n, int age, String adr) {
			this.age = age;
			this.name = n;
			this.address = adr;
		}
		
		public int getAge() {
			return age;
			
			
		// 필드에 접근하는 메서드를  get, set 접두어로
		// 메서드를 선언해 사용.
		
	}


}
