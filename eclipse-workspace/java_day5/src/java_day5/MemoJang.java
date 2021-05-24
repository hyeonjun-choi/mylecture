package java_day5;

public class MemoJang {

	public static void main(String[] args) {
		//Math class의 pow() 사용
	
		Integer.parseInt("1");
		Integer.parseInt("-1");
		Integer.parseInt(" ");
		
	//	if( 'A' == 65) {
		
		
		
	double sum = 0;
	
	for(int i = 1; i < 13; i++ ) {
		if( 1 % 3 != 0) continue;
		
		 sum += Math.pow(i*2, i);
		 
	}
	System.out.println(sum);
	
	
	
	
	
	
	}
	
	

}
