package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			
			int localNum = 10;
			
			@Override
			public void run() {
				
			}
		}
	}
}
public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
