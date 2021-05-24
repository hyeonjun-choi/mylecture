package TypeCastingEx1;

public class TypeCastingEx1 {

	public static void main(String[] args) {
		// 1. 암묵적 타입캐스팅.
		// 파충류 파1 = 고릴라1;

		byte b = 25;
		short s = b;
		int i = s;
		long ㅣ = i;
		// 실수
		float f = i;
		double d = f;
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
		
		// 명시적
		// 파충류 파1 = (파충류)고릴라1;
	}

}
