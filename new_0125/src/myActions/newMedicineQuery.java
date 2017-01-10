package myActions;
public class newMedicineQuery{
	int id;
	int MQ_id;
	String MQ_info;
	
	public newMedicineQuery(){}
	
	public newMedicineQuery(int id,int MQ_id,String MQ_info){
		this.id=id;
		this.MQ_id=MQ_id;
		this.MQ_info=MQ_info;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMQ_id() {
		return MQ_id;
	}
	public void setMQ_id(int mQ_id) {
		MQ_id = mQ_id;
	}
	public String getMQ_info() {
		return MQ_info;
	}
	public void setMQ_info(String mQ_info) {
		MQ_info = mQ_info;
	}
	
	
}