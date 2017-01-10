package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;


import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类

public class register extends ActionSupport implements ModelDriven<user> {
   
    //声明模型
	private user user=new user();
	
	public user getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
    
 public String admin_register() throws Exception{
    	
    	System.out.println("进来了");
    	 String userid = user.getUsername();
         String password = user.getPassword();
        System.out.println(userid);
    	String statue="1";
    	String sql="select * from admins where userid='"+userid+"'";
		 doSqlDb db=new doSqlDb();
		 ResultSet re=db.doQuery(sql);
		  System.out.println(userid);
		  
		  if(re.next()||user.getUsername()==""||user.getUsername()==null||user.getPassword()==""||user.getPassword()==null){
			 this.addFieldError("","用户名已经存在或为空，请换一个名字" );
			 return "duplicate";
			 
	     }
		  else {
		    	 
			   sql="insert into admins (userid,password,statue) values ('"+userid+"','"+password+"','"+statue+"')";
			  db.doUpdate(sql);
			  this.addActionMessage("成功保存添加数据");

			 db.close();
			 return SUCCESS;
			 
			 } 
	} 
}
 