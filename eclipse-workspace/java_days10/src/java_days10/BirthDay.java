package java_days10;

public class BirthDay {

	int days;
	int month;
	int year;
	
	public void setYear(int year) {
		 this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public void test(int month) {
		this.month = month;
	}
	
	public void test1(int j) {
		int month = 100;
		this.month = j;
		
		month = month;
		this month = month;
		
	}
		 
	
	
	public static void main(String[] args) {
		
	}

}
