
public class OperatoinEx4 {

	public static void main(String[] args) {
		System.out.println("Length: " + args.length);
		
		System.out.println( args[0] );
		System.out.println( args[1] );
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println( (a / b) + "..." + ( a % b ) );
		
		

	}

}
