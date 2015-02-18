package houserent;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentSystem rs= RentSystem.getInstance();
		GeneralApartment generalApartment=new GeneralApartment("general apt", 10, 1, 1);
		FamilyApartment familyApartment=new FamilyApartment("family apt", 10, 1, 2);
		GeneralHall generalHall=new GeneralHall("general hall", 10, 1, 3);
		SpecificHall specificHall=new SpecificHall("specific hall", 10, 3, 1);
		FamilyStudent familyStudent= new FamilyStudent("jess", 01);
		NormalStudent normalStudent=new NormalStudent("tom", 02);
		Staff staff=new Staff("staff", 03);
		rs.addUser(familyStudent);rs.addUser(normalStudent);rs.addUser(staff);
		rs.addHouse(familyApartment);rs.addHouse(generalApartment);rs.addHouse(generalHall);rs.addHouse(specificHall);
		normalStudent.makeRequest(HouseType.FAMILYAPARTMENT);
		normalStudent.makeRequest(HouseType.GENERALAPARTMENT);
		normalStudent.makeRequest(HouseType.GENERALHALL);
		rs.traverseHouse();rs.traverseUser();
	}

}
