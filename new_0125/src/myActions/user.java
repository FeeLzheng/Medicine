package myActions;
public class user {
    private String username;//封装用户名字段
    private String password;//封装密码字段
    private String statue;
    
    private String statue3;
    //字段的getXXX和setXXX方法
    
    public user(){}
    public user(String username,String password,String statue3,String statue){
    	this.username=username;
    	this.password=password;
    	this.statue=statue;
    	this.statue3=statue3;
    	
    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	
	public String getStatue3() {
		return statue3;
	}
	public void setStatue3(String statue3) {
		this.statue3 = statue3;
	}
    
   
    
}
