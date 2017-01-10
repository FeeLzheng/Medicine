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

public class queryAdmin extends ActionSupport implements ModelDriven<newQuery> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newQuery query=new newQuery();
	newDistrict district=new newDistrict();
	
	public newQuery getModel() {
		return query;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newQuery> allQuery = null;
    
    
    
   /* public List<newQuery> getAllQuery() throws Exception{
    	allQuery=new ArrayList<newQuery>();
    	doSqlDb db = new doSqlDb();
    	String sql="select * from query";
    	ResultSet rs = db.doQuery(sql);
    	
    	String Q_info;
    	int id;
    	int C_id;
    	while(rs.next()){
    		Q_info=rs.getString("Q_id");
    		id=rs.getInt("id");
    		C_id=rs.getInt("C_id");
    		allQuery.add(new newQuery(id,C_id,Q_info));
    		
    	}
    	db.close();
    	
    	return allQuery;
    }
 */
    public String admin_queryAdd(){
    	
    	return SUCCESS;
    }
    
    public String admin_queryEditSave() throws Exception{
    	 HttpServletRequest request=ServletActionContext.getRequest();
  	    String Q_user=(String) request.getSession().getAttribute("username");
    	String sql1="select Max(C_id) from client";
   	 String Q_info=query.getQ_info();
   	 String M_name=query.getM_name();
   	 String Q_name=query.getQ_name();
   	 String Q_province=query.getQ_province();
   	 String Q_iphone=query.getQ_iphone();
   	 String D_district=query.getD_company();
   	 
   	Q_info = Q_info.replaceAll("\\s+", "");
   	M_name = M_name.replaceAll("\\s+", "");
   	Q_name = Q_name.replaceAll("\\s+", "");
   	Q_province = Q_province.replaceAll("\\s+", "");
   	Q_iphone = Q_iphone.replaceAll("\\s+", "");
   	D_district = D_district.replaceAll("\\s+", "");
   	 
   	Q_info.replace("\n","");
   	Q_info.replace("\t","");
   	Q_info.replace(" ","");
   	Q_info.trim();
   	Q_info = Q_info.replaceAll("%", "%25");
   	Q_info = Q_info.replaceAll(">", "大于");
   	Q_info = Q_info.replaceAll("<", "小于");

   	 String Q_date;
   	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
   	 Q_date=sdf.format(new Date());
   	 System.out.println(Q_user);
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
   
   	 sql2="insert into query (Q_info,Q_id,M_name,Q_date,Q_province,Q_name,Q_iphone,D_district,Q_user) values ('"+Q_info+"',"+C_id+",'"+M_name+"','"+Q_date+"','"+Q_province+"','"+Q_name+"','"+Q_iphone+"','"+D_district+"','"+Q_user+"')";
    	 db2.doUpdate(sql2);
   	 this.addActionMessage("成功保存添加数据");
   	String Q_date2;
	 Q_date2=Q_date;
	 String M_name2;
	 String Q_name2;
	 String Q_iphone2;

	 String D_district2;
    String Q_info2;
    
    D_district2=D_district;
	 Q_info2=Q_info;
	 
	 Q_name2=Q_name;
	 Q_iphone2=Q_iphone;
	 M_name2=M_name;
   	 
   	sql3="update client set C_id="+C_id+",C_Date='"+Q_date2+"',C_phone='"+Q_iphone+"',M_name='"+M_name2+"',C_name='"+Q_name2+"',C_district='"+D_district2+"',C_info='"+Q_info2+"',C_province='"+Q_province+"',C_user='"+Q_user+"'  where C_id="+C_id+"";
	 db4.doUpdate(sql3);
	 db4.close();
   	 
   	 
   	 db.close();
        db2.close();
        db3.close();
   	 return SUCCESS;
	     
   
    }
    

      //  db.close();
      //  db2.close();
   	 //return INPUT;
   
    

}