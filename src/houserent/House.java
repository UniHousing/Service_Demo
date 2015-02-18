package houserent;

public abstract class House {
	private String name;
	protected Request req;
	private int size;
	private long rid;
	private long did;
	protected HouseType type;
	protected House(String n,int s,long rid,long did) {
		// TODO Auto-generated constructor stub
		this.name=n;
		this.size=s;
		this.rid=rid;
		this.did=did;
		req=null;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public long getRid() {
		return rid;
	}
	public void setRid(long rid) {
		this.rid = rid;
	}
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public boolean isVacant(){
		return req==null;
	}
	public void acceptRequest(Request request){
		if (req==null) {
			req=request;
		}
	}
	public HouseType getType() {
		return type;
	}
	
	
}
