package java_chapter13;

import java_chapter13.MyClass1;

public class InnerClassTest {

	public static void main(String[] args) {
		MyClass obj = new MyClass1();
		
		MyInnerClass innerOjb = obj.new MyInnerClass();
		}
	}

}
