package houserent;

public abstract class Hall extends House {
	
	protected Hall(String n, int s, long rid, long did) {
		super(n, s, rid, did);
		type=HouseType.HALL;
		// TODO Auto-generated constructor stub
	}
	
}
