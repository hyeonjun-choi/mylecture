package chapter10;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class StringFormatTest {

	public static void main(String[] args) {
		
		/*
		 *  필수 값 : conversion
		 *  
		 */
		
		
		
		
		
		
		
		
		
		System.out.printf("%s [%d] %s [%d]", "홍길동", 100, "고길동", 200);
		System.out.println();
		
		String str = String.format("%s [%d] %s [%d]", "홍길동", 100, "고길동", 200);
		System.out.println(str);
		
		System.out.printf("%3$s", "%1$s", "홍길동", "고길동");
		System.out.println();
		
		System.out.println(String.format("%10d%10d", 12345, 67890));
		
		
		// 날씨 포맷팅
		
		String form = "YYYY년 MM월 DD일 HH시 NN분 SS초";
		SimpleDateFormat sdf = new SimpleDateFormat(form);
		
		// 날짜
		Date dt = new Date(0);
		String now = dt.toString();
		System.out.println(now);
		System.out.println(sdf.format(dt));
		
		
		// 숫자 포매팅
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(1234459.99);
		System.out.println(result);
		
		
	}

}
