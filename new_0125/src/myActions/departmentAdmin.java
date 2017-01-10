package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类

public class departmentAdmin extends ActionSupport implements ModelDriven<newDepartment> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newDepartment department=new newDepartment();
	
	
	public newDepartment getModel() {
		// TODO Auto-generated method stub
		return department;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newDepartment> allDepartment = null;
    
    public String admin_departmentAdd() throws Exception{
    	return SUCCESS;
    	}
    public String admin_departmentadmin() throws Exception{
    	return SUCCESS;
    }
    
    public String admin_departmentEditSave() throws Exception{
    	String sql1="select Max(C_id) from client";
    	HttpServletRequest request=ServletActionContext.getRequest();
 	    String Da_user=(String) request.getSession().getAttribute("username");
   	 String Da_info=department.getDa_info();
   	 String M_name=department.getM_name();
   	 String Da_name=department.getDa_name();
   	 String Da_province=department.getDa_province();
   	 String Da_iphone=department.getDa_iphone();
   	 String D_district=department.getD_company();
   	 
   	 
   	Da_info = Da_info.replaceAll("\\s+", "");
   	M_name = M_name.replaceAll("\\s+", "");
   	Da_name = Da_name.replaceAll("\\s+", "");
   	Da_province = Da_province.replaceAll("\\s+", "");
   	Da_iphone = Da_iphone.replaceAll("\\s+", "");
   	D_district = D_district.replaceAll("\\s+", "");
   	
   	Da_info.replace("\n","");
   	Da_info.replace("\t","");
   	Da_info.replace(" ","");
   	Da_info.trim();
   	Da_info = Da_info.replaceAll("%", "%25");
   	Da_info = Da_info.replaceAll(">", "大于");
   	Da_info = Da_info.replaceAll("<", "小于");
   	 
   	 String Da_date;
   	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
   	 Da_date=sdf.format(new Date());
   	 System.out.println("跪求不为空");
   	 doSqlDb db=new doSqlDb();
   	 ResultSet re=db.doQuery(sql1);
   	 int C_id=0;
   	 while(re.next()){
   		 C_id=re.getInt("Max(C_id)");
   		
   	 }
   	 
   	// String sql2="select * from districtinfo where C_id='"+id+"'";
		 doSqlDb db2=new doSqlDb();
		 doSqlDb db3=new doSqlDb();
		 doSqlDb db4=new doSqlDb();
		 //ResultSet re2=db2.doQuery(sql2);
		 String sql3;
		 C_id=C_id+1;
		   	
		 sql3="insert into client (C_id) values ("+C_id+")";
	   	 db3.doUpdate(sql3);
		 
		 //if(re2.next()){
		//	 this.addFieldError("Q_id","不能重复添加代理信息" );
	     //   }else{
   	String sql2;
   	
   	 sql2="insert into department (Da_info,Da_id,M_name,Da_date,Da_province,Da_name,Da_iphone,D_district) values ('"+Da_info+"',"+C_id+",'"+M_name+"','"+Da_date+"','"+Da_province+"','"+Da_name+"','"+Da_iphone+"','"+D_district+"')";
    	 db2.doUpdate(sql2);
   	 this.addActionMessage("成功保存添加数据");
   	 
   	String Da_date2;
   	Da_date2=Da_date;
	 
	 
	 String M_name2;
	 String Da_name2;
	 String Da_iphone2;
	 
	 Da_name2=Da_name;
	 Da_iphone2=Da_iphone;
	 M_name2=M_name;
	 
	 String D_district2;
     String Da_info2;
     
     D_district2=D_district;
	 Da_info2=Da_info;
	 
   	 
   	sql3="update client set C_id="+C_id+",C_Date='"+Da_date2+"',C_phone='"+Da_iphone2+"',M_name='"+M_name2+"',C_name='"+Da_name2+"',C_district='"+D_district2+"',C_info='"+Da_info2+"' ,C_province='"+Da_province+"',C_user='"+Da_user+"' where C_id="+C_id+"";
	 db4.doUpdate(sql3);
	 db4.close();
   	 
   	 
   	 
   	 
   	 db.close();
        db2.close();
        db3.close();
   	 return SUCCESS;
	     
   	 
      //  db.close();
      //  db2.close();
   	 //return INPUT;
   
	   


    } 
    
 
}