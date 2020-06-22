package projectPlanet;

public class UnderstandingToString {

	public static void main(String[] args) {
		Car myCar = new Car(true);
		myCar.setTireCount(4);
		System.out.println(myCar.toString());
		Train smallTrain = new Train(false);
		
		System.out.println("Does my train have storage? " + smallTrain.haveStorage());
	}

}
