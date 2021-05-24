package TypeCastingEx1;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';	// 유니코드의 Escape sequence 형식
		
 		char ch3 = '글';
		char ch4 = '\uAE00';	// 
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println("\uD55C" + "\uAE00");
		
		
		int	ich = -66;
//		char ch3 = -66;
//		System.out.println(ch3);
		
		System.out.println(ich);
	}

}
