package houserent;

import java.util.ArrayList;
import java.util.List;


public class RentSystem {
	private static RentSystem instance;
	private List<Person> users;
	private List<List<House>> houses;
	private RentSystem() {
		// TODO Auto-generated constructor stub
		users=new ArrayList<>();
		houses=new ArrayList<>();
		List<House> apartments=new ArrayList<>();
		List<House> halls=new ArrayList<>();
		houses.add(apartments);
		houses.add(halls);
	}
	public static RentSystem getInstance(){
		if (instance==null) {
			instance=new RentSystem();
		}
		return instance;
	}
	public void addUser(Person person){
		users.add(person);
	}
	public void addHouse(House house){
		houses.get(house.type.getGeneralValue()).add(house);
	}
	public House arrangeHouse(Request request){
		if (request.requestHouseType()==null) {
			return null;
		}
		else if (request.requestHouseType()!=null) {
			List<House> houseList=houses.get(request.requestHouseType().getGeneralValue());
			for (House house : houseList) {
				if (house.getType()==request.requestHouseType() && house.isVacant()) {
					return house;
				}
			}
		}
		return null;
	}
	public void makeRequest(Person person,HouseType type){
		Request request = new Request(person,type);
		if (!person.getType().getAccess().equals(type.allowAccess())) {
			System.out.println("Invalid Request!!");
			return ;
		}
		person.setRequest(request);
		request.setPerson(person);
		makeRequest(request);
	}
	private void makeRequest(Request request) {
		// TODO Auto-generated method stub
		House house= arrangeHouse(request);
		if (house!=null) {
			house.acceptRequest(request);
			request.setHouse(house);
			System.out.println("arrange house for"+request.getPerson().getName()+", which is a "+request.getHouse().getName());
		}
		else {
			System.out.println("No house available");
		}
	}
	//test
	public void traverseUser(){
		System.out.println(users);
	}
	public void traverseHouse(){
		System.out.println(houses);
	}

}
