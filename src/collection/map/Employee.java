package collection.map;

public class Employee {
	private int id;
	private String name;
	private Address add;
	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
@Override
public String toString() {
	return String.format("id: " +this.id+", name: "+this.name+", Adress: {"+this.add.getPincode()+","
			+ this.add.getStreet()+"}");
}

}
