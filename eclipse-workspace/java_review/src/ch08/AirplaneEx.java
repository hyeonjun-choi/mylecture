package ch08;

// 비행기. 일반. 초음속.
// 비행기 -> Airplane 
//				+ takeoff()
//				+ land()
//				+ fly()

// 초음속 -> Supersonic extends Airplane
//			+ mode: NORMAL, SUPERSONIC (상수)
//			+ @override fly()

public class AirplaneEx {

	public static void main(String[] args) {
		Airplane plane = new Airplane();
		plane.takeOff();
		plane.fly();
		plane.land();
		
		
		SupersonicAirplane splane = new SupersonicAirplane();
		splane.takeOff();
		splane.fly();
		splane.setMode(SupersonicAirplane.SUPERSONIC);
		splane.fly();
		splane.setMode(SupersonicAirplane.NORMAL);
		splane.fly();
		splane.land();
		
		

	}

}



class Busplane extends Airplane {
	
}

class Boatplane extends Airplane {
	
}



