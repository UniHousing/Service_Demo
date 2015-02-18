package houserent;

public enum PersonType {
	STUDENT(0,0),STAFF(1,1),
	NORMALSTUDENT(0,1),FAMILYSTUDENT(0,2),GUEST(0,3);
	private int generalType;
	private int specificType;
	private PersonType(int g,int s) {
		// TODO Auto-generated constructor stub
		generalType=g;
		specificType=s;
	}
	public int getGeneralType() {
		return generalType;
	}

	public int getSpecificType() {
		return specificType;
	}
	public String getAccess(){
		if (generalType==1) {
			return "STAFF";
		}
		else if (generalType==0 && specificType==2) {
			return "FAMILY";
		}
		else return "GENERAL";
	}

	
}
