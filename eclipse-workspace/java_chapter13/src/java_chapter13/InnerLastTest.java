package java_chapter13;

// outer class 외부클래스
public class InnerLastTest {

	public InnerLastTest() {
	 o.toString()
	}
	
	
	
	
	
	
	
	
	
	
	
	// 메서드 내부 클래스
	void method() {
		class ABC {
		
			int a = 10;
			//static int b = 100;
			
			public ABC() {
				
			}
		}
		
		ABC abc = new ABC();
		abc.a = 1000;
		
	}
	
	
	Runnable method3() {
		return new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	
	
	//인스턴스 내부 클래스
	public class InstanceInner {
		
		
		int abc;
		static final  int a = 10;
		
		public InstanceInner() {
			
		}
		
		public void print() {
			abc = 1000;
			System.out.println(abc);
		
		}
	}

	// 정적 내부 클래스
	static class StaticInner {
		
		int abc;
		static int abcd = 100;
		
		
		public StaticInner() {
			System.out.println(abc);
			System.out.println(StaticInner.abcd);
			
		}
		
		static void info() {
			// System.out.println(abc);
			System.out.println(abcd);
			
		}
	
	
	
	}
	



}