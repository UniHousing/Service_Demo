package houserent;

public abstract class Person {
	private String name;
	protected Request request;
	protected PersonType type;
	protected Person(String n) {
		// TODO Auto-generated constructor stub
		this.setName(n);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public void makeRequest(HouseType type){
		RentSystem.getInstance().makeRequest(this,type);
	}
	public PersonType getType() {
		return type;
	}
	public void setType(PersonType type) {
		this.type = type;
	}
	
	
}
