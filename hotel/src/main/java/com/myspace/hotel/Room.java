package com.myspace.hotel;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Room implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ROOM_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ROOM_ID_SEQ", name = "ROOM_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Number")
	private java.lang.Integer number;

	@org.kie.api.definition.type.Label("Price")
	private java.lang.Float price;

	@org.kie.api.definition.type.Label("Available")
	private java.lang.Boolean isAvailable;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Customer")
	private com.myspace.hotel.Customer customer;

	public Room() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Integer getNumber() {
		return this.number;
	}

	public void setNumber(java.lang.Integer number) {
		this.number = number;
	}

	public java.lang.Float getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Float price) {
		this.price = price;
	}

	public java.lang.Boolean getIsAvailable() {
		return this.isAvailable;
	}

	public void setIsAvailable(java.lang.Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public com.myspace.hotel.Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(com.myspace.hotel.Customer customer) {
		this.customer = customer;
	}

	public Room(java.lang.Long id, java.lang.Integer number,
			java.lang.Float price, java.lang.Boolean isAvailable,
			com.myspace.hotel.Customer customer) {
		this.id = id;
		this.number = number;
		this.price = price;
		this.isAvailable = isAvailable;
		this.customer = customer;
	}

}