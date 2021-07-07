package java_Array;

public class Test {
	public static void main( String[] args ) {
		int a = 0, b =5;
		outer : for( a=0;a<5;a++ ) {
		inner : for( b=0;b<5;b++ ) {
			if(a==1&&b==0) { break outer; }
			if(a==2&&b==1) {continue inner; }
			}
		}
		System.out.println( a+b );
	}
}
