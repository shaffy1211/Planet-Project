package projectPlanet;

public abstract class VehicleAbstract {
	//instance variable (Fields)++++++++++++++++++++++++
	private int _tireCount;

	public int getTireCount() {
		return _tireCount;
	}

	public void setTireCount(int _tireCount) {
		this._tireCount = _tireCount;
	}	
	
	//constructor++++++++++++++++++++++++++++++++++++++++
	public void VehicleAbstract() {
		getTireCount();
	}
}
