package myActions;

import java.util.Date;


public class newWorkLog {
	int id;
	String operator;
	String precontent;
	String aftcontent;
	String time;
	String action;
	String location;

	public newWorkLog() {
	}

	public newWorkLog(int id,String operator, String precontent,
			String aftcontent, String time, String location,String action) {
		this.id = id;
		
		//System.out.println(id);
		
		this.operator = operator;
		this.precontent = precontent;
		this.aftcontent = aftcontent;
		this.time = time;
		this.action = action;
		this.location=location;
		
		
		System.out.println("time ="+time);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPrecontent() {
		return precontent;
	}

	public void setPrecontent(String precontent) {
		this.precontent = precontent;
	}

	public String getAftcontent() {
		return aftcontent;
	}

	public void setAftcontent(String aftcontent) {
		this.aftcontent = aftcontent;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setLocation(String location){
		this.location=location;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
