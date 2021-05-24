package java_day8;

import javax.xml.transform.Source;

public class ASCIICord {

	public static void main(String[] args) {
		String source = "HELLO WORLD";
		
		String[] morse = {"....", ".", ".-..", ".-..", "---",
				    ".--", "---", ".-.", ".-..", "-.."} ;
		String result="";
		int i = 1;
		
		for (int i = 0; i < source.length(); i++);
	
		result+=morse[source.charAt(i)-'A'];

		System.out.println("source:"+ source);
		System.out.println("morse:"+ result);

}
}
