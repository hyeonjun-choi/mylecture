package chapter10;

class Employee {
	int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee" + eno + " 생성");
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee" + eno + " 삭제");
	}
}


public class SystemGcExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
	}

}
