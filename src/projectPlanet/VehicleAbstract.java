package projectPlanet;

public abstract class VehicleAbstract {
	//instance variable (Fields)++++++++++++++++++++++++
	private int _tireCount;
	private int _passengerCount;
	
	
	//Getters and Setters
	public int getTireCount() {
		return _tireCount;
	}

	public void setTireCount(int _tireCount) {
		this._tireCount = _tireCount;
	}	
	
	public int getPassengerCount() {
		return _passengerCount;
	}

	public void setPassengerCount(int _passengerCount) {
		this._passengerCount = _passengerCount;
	}
	
	//constructor++++++++++++++++++++++++++++++++++++++++
	public void VehicleAbstract() {
		getTireCount();
	}
	
	//Override public method toString Derived from Object Superclass
	@Override
	public String toString() {
		return "The Vehicle has " + this.getTireCount() + " tires";
	}




}
