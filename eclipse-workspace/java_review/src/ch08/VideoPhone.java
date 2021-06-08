package ch08;

public class VideoPhone extends Phone {

	
	// defualt 생성자가 상속하는 쪽에 있으면
	// super();
	
	public VideoPhone() {
		super("", "" , "" );
	
		
	}
	
	public void videoCall() { System.out.println("영상통화");
	}
	
	public void info() {
		
		String a = super.model;
	}
}
