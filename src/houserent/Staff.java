package houserent;

public class Staff extends Person{
	private long sid;
	public Staff(String n,long id){
		super(n);
		this.setSid(id);
		type=PersonType.STAFF;
	}
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
}
