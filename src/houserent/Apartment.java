package houserent;

public abstract class Apartment extends House{
	protected Apartment(String n, int s, long rid, long did) {
		super(n, s, rid, did);
		type=HouseType.APARTMENT;
		// TODO Auto-generated constructor stub
	}

}
