package java_chapter13;

import java.util.Date;

public class InnerClassExample3 {

	public void printStatus() {
	
		
		
		class DataFormat {
			private Date date;
			
			
			public DataFormat(Date date) {
				this.date = date;
				
			}
			public String getDateFormat() {
				return date.toString();
			}
		}
	}
	Dateformat format = new DateFormat(new Date());

	
	
	
	public static void main(String[] args) {
		InnerClassExample3 example = new InnerClassExample3();
		example.printStatus();
	}

}
