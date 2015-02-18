package houserent;

public enum HouseType {
	APARTMENT(0,0),HALL(1,0),
	GENERALAPARTMENT(0,1),FAMILYAPARTMENT(0,2),
	GENERALHALL(1,1),SPECIFICHALL(1,2);
	private int gvalue;
	private int svalue;
	private HouseType(int u,int v) {
		// TODO Auto-generated constructor stub
		gvalue=u;
		svalue=v;
	}
	public int getGeneralValue() {
		return gvalue;
	}
	public int getSpecificValue() {
		return svalue;
	}
	public String allowAccess(){
		if (gvalue==0 && svalue==2) {
			return "FAMILY";
		}
		else return "GENERAL";
	}
}
