package projectPlanet;

public class Car extends VehicleAbstract implements IUseRoads, IHaveStorage {
	//Instance Variables+++++++++++++++++++++++++++++++
	private Boolean _trunk;
	
	public Car(Boolean trunk) {
		this._trunk = trunk;
	}

@Override
	public Boolean haveStorage() {
		
		return (this._trunk == true)? true : false;
	}

	@Override
	public Boolean useRoads() {
		return (this.getTireCount()>0)? true : false;
	}

}
