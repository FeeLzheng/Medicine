package myActions;

public class Java{
	private String a ;
	String b;
	
	
	
	public void setA(String a){
		this.a =a; 
	}
	public void setB(String b){
		this.b=b;
	}
	public String getA(){
		return a;
	}
	public String getB(){
		return b;
	}
	public static void main(String[] args){
		new Java().getA();
	}
}