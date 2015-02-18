package houserent;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentSystem rs= RentSystem.getInstance();
		GeneralApartment ga=new GeneralApartment("general apt", 10, 1, 1);
		FamilyApartment familyApartment=new FamilyApartment("family apt", 10, 1, 2);
		FamilyStudent familyStudent= new FamilyStudent("jess", 01);
		NormalStudent normalStudent=new NormalStudent("tom", 02);
		Staff staff=new Staff("nn", 03);
		rs.addUser(familyStudent);rs.addUser(normalStudent);rs.addUser(staff);
		rs.addHouse(familyApartment);rs.addHouse(ga);
		normalStudent.makeRequest(HouseType.FAMILYAPARTMENT);
		normalStudent.makeRequest(HouseType.GENERALAPARTMENT);
		rs.traverseHouse();rs.traverseUser();
	}

}
