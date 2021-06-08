package ch08;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone("전화", "붉은색", "11111");
		phone1.powerOn();
		phone1.ring();
		phone1.send();
		phone1.powerOff();
		
//		VideoPhone phone2 = new VideoPhone("영상통화", "노랑", "11112");
//		phone2.powerOn();
//		phone2.ring();
//		phone2.send();
//		phone2.videoCall();
//		
//		phone2.powerOff();

		
		Phone phone3 = new VideoPhone();  // Up - Casting (Auto-Boxing)
		((VideoPhone)phone3).videoCall(); // Down - Casting
		
		Phone phone4 = new Phone("전화", "붉은색", "11111");
		// Runtime Error 발생.
		((VideoPhone)phone4).videoCall();

	}

}
