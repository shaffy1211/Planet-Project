package projectPlanet;

public class Train extends VehicleAbstract implements IUseRails, IHaveStorage {
	//Instance Variables++++++++++++++++++++++++++++++++++++++
	private Boolean _storageCompartment;
	
	
	//Constructor +++++++++++++++++++++++++++++++++++++++++++++
	public Train(Boolean storage) {
		this._storageCompartment = storage;
	}
	//public overridden methods ++++++++++++++++++++++++++++
	
	
	@Override
	public Boolean haveStorage() {
	return (this._storageCompartment == true)? true : false;
	}

	@Override
	public Boolean useRails() {
		return (this.getPassengerCount()> 10)? true : false;
	}

}
