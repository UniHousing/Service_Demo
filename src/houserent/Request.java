package houserent;

public class Request {
	private House house;
	private Person person;
	private HouseType houseType;

	public Request(Person person,HouseType type) {
		// TODO Auto-generated constructor stub
		this.person=person;
		houseType=type;
	}
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public HouseType requestHouseType() {
		return houseType;
	}
	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}
	
	public void setHouse(House house) {
		this.house = house;
	}
	
}
