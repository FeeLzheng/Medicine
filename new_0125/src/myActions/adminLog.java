package myActions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class adminLog extends ActionSupport implements ModelDriven<user> {
    //声明模型，URL请求参数传入同名的模型字段
    private user admin = new user();
    
    
    
    //实现getModel()方法
    public user getModel() {
        return admin;
    }
    //实现Action接口的execute()方法
    public String execute() throws Exception {
        //实现简单的验证操作
    	
    	
        String username = admin.getUsername();
        String password = admin.getPassword();
        String sql="select * from admins where userid='"+username+
                "' and password='"+password+"'";
        //查询数据库，验证用户登录信息
        doSqlDb db=new doSqlDb();
        ResultSet rs=db.doQuery(sql);
        if(rs.next()){
            //登录信息正确，将登录信息存入session
            ActionContext.getContext().getSession().put("username", username);
            ActionContext.getContext().getSession().put("password", password);
            db.close();
            return SUCCESS;
        }else{
            //登录信息错误，写入字段错误信息
            this.addFieldError("username","用户名或密码错误！");
             db.close();
            return INPUT;
        }
    }
    
    
 public String admin_register() throws Exception{
    	
    	System.out.println("进来了");
    	 String userid = admin.getUsername();
         String password = admin.getPassword();
        System.out.println(userid);
    	String statue="1";
    	String sql="select * from admins where userid='"+userid+"'";
		 doSqlDb db=new doSqlDb();
		 ResultSet re=db.doQuery(sql);
		  System.out.println(userid);
		 if(re.next()){
			 this.addFieldError("用户名已经存在","，请换一个名字" );
	     }else{
		   sql="insert into admins (userid,password,statue) values ('"+userid+"','"+password+"','"+statue+"')";
		  db.doUpdate(sql);
		  this.addActionMessage("成功保存添加数据");
		System.out.println(123);
}
		 db.close();
		 return SUCCESS;
	} 
    
    
    private List<user> alluser = null;
    public List<user> getAlluser() throws Exception{
    	alluser=new ArrayList<user>();
    	doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from admins");
        String username;
        String password;
        String statue=null;
        String statue3=null;
        int statue2;
        
        
        while(rs.next()){
        	username=rs.getString("userid");
        	password=rs.getString("password");
        	statue2=Integer.valueOf(rs.getString("statue")).intValue();
        	
        	if(statue2==2){
        		statue3="超级管理员" ;
        		
        	}if(statue2==0){
        		statue3="管理员用户"; 
        	}if(statue2==1){
        		statue3="普通用户" ;
        	}
        	statue=String.valueOf(statue2);
       alluser.add(new user(username,password,statue3,statue));
       System.out.println(username);
        }
    	
    	return alluser;
    }
    
    public String admin_permission(){
    	return SUCCESS;
    }
   
    	
    	
 
    
    
    public String admin_permissionEdit(){
    	return SUCCESS;
    }
    
    
    public String admin_permissionEditSave() throws Exception{
    	
    	String username;
    	String statue;
    	String sql=null;
    	
    	
    	username=admin.getUsername();
    	statue=admin.getStatue();
    	
    	if(statue.equals("1")||statue.equals("2")||statue.equals("0")){
    		
    		sql="update admins set statue='"+statue+"' where userid='"+username+"' ";
    	    
        	doSqlDb db = new doSqlDb();
        	db.doUpdate(sql);
        	return SUCCESS;
    				 
    }else{
    	 this.addFieldError("","请输入正确的权限指令" );
    	 System.out.println("你是猪");
		 return INPUT; 
    }
    }
    
}
