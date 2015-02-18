package houserent;

public abstract class Student extends Person{
	protected long sid;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	protected Student(String n,long id){
		super(n);
		this.sid=id;
		type=PersonType.STUDENT;
	}
}
