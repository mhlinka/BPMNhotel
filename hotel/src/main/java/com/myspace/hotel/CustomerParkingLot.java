package com.myspace.hotel;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.xml.bind.annotation.XmlRootElement
public class CustomerParkingLot implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Customer ID")
	private java.lang.Integer id;
	@org.kie.api.definition.type.Label(value = "Parking Lot Number")
	private java.lang.Integer parkingLotNumber;

	public CustomerParkingLot() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getParkingLotNumber() {
		return this.parkingLotNumber;
	}

	public void setParkingLotNumber(java.lang.Integer parkingLotNumber) {
		this.parkingLotNumber = parkingLotNumber;
	}

	public CustomerParkingLot(java.lang.Integer id,
			java.lang.Integer parkingLotNumber) {
		this.id = id;
		this.parkingLotNumber = parkingLotNumber;
	}

}