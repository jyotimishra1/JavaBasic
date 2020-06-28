package collection.List;

public class Address {
	private String pincode;
	private String Street;
	public Address(String pincode, String street) {
		super();
		this.pincode = pincode;
		Street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}

}
