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

public class purchaseinfoAdmin extends ActionSupport implements ModelDriven<newPurchase> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newPurchase purchase=new newPurchase();
	newDistrict district=new newDistrict();
	
	public newPurchase getModel() {
		// TODO Auto-generated method stub
		return purchase;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newPurchase> allpurchaseinfo = null;
    
    public String admin_purchaseInfoAdd() throws Exception{
    	return SUCCESS;
    	}
    
    
    public String admin_purchaseinfoEditSave() throws Exception{
    	String sql1="select Max(C_id) from client";
    	HttpServletRequest request=ServletActionContext.getRequest();
 	    String P_user=(String) request.getSession().getAttribute("username");
      	 String P_info=purchase.getP_info();
      	 String M_name=purchase.getM_name();
      	 String P_name=purchase.getP_name();
      	 String P_province=purchase.getP_province();
      	 String P_iphone=purchase.getP_iphone();
      	 String D_district=purchase.getD_company();
      	 
      	 
      	P_info = P_info.replaceAll("\\s+", "");
      	P_name = P_name.replaceAll("\\s+", "");
      	P_province = P_province.replaceAll("\\s+", "");
      	P_iphone = P_iphone.replaceAll("\\s+", "");
      	D_district = D_district.replaceAll("\\s+", "");
      	M_name = M_name.replaceAll("\\s+", "");
      	
      	P_info.replace("\n","");
      	P_info.replace("\t","");
      	P_info.replace(" ","");
      	P_info.trim();
      	P_info = P_info.replaceAll("%", "%25");
      	
      	P_info = P_info.replaceAll(">", "大于");
      	P_info = P_info.replaceAll("<", "小于");
       	 
      	 
      	 
      	 String P_date;
      	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
      	 P_date=sdf.format(new Date());
      	 System.out.println("跪求不为空"+D_district);
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
   		String sql3;
   		C_id=C_id+1;
   	 
   	 
      	 
      	 sql3="insert into client (C_id) values ("+C_id+")";
         	 db3.doUpdate(sql3);
   		
   		 //ResultSet re2=db2.doQuery(sql2);
   		
   		 //if(re2.next()){
   		//	 this.addFieldError("Q_id","不能重复添加代理信息" );
   	     //   }else{
      	String sql2;
      
      	 sql2="insert into purchaseinfo (P_info,P_id,M_name,P_date,P_province,P_name,P_iphone,D_district,P_user) values ('"+P_info+"',"+C_id+",'"+M_name+"','"+P_date+"','"+P_province+"','"+P_name+"','"+P_iphone+"','"+D_district+"','"+P_user+"')";
       	 db2.doUpdate(sql2);
      	 this.addActionMessage("成功保存添加数据");
      	String P_date2;
      	P_date2=P_date;
   	 
   	 String M_name2;
   	 String P_name2;
   	 String P_iphone2;
   	 
   	 P_name2=P_name;
   	 P_iphone2=P_iphone;
   	 M_name2=M_name;
   	 
   	 String D_district2;
        String P_info2="";
        
        
        D_district2=D_district;
   	 P_info2=P_info;
 	P_info2.replace("\n","");
  	P_info2.replace("\t","");
  	P_info2.replace(" ","");
  	P_info2.trim();
  	P_info2 = P_info2.replaceAll("%", "%25");
  	
  	P_info2 = P_info2.replaceAll(">", "大于");
  	P_info2 = P_info2.replaceAll("<", "小于");
  	System.out.println("你是猪");
  	System.out.println(P_info);
   	 
      	sql3="update client set C_id="+C_id+",C_Date='"+P_date2+"',C_phone='"+P_iphone2+"',M_name='"+M_name2+"',C_name='"+P_name2+"',C_district='"+D_district2+"',C_info='"+P_info2+"' ,C_province='"+P_province+"',C_user='"+P_user+"'  where C_id="+C_id+"";
   	 db4.doUpdate(sql3);
   	 db4.close();
      	
      	
      
      	 db.close();
           db2.close();
           db3.close();
      	 return SUCCESS;
   	     
    
    } 
    
  
   
    
    private List<newDistrict> allDistrict2 = null;	    
    
    	    public List<newDistrict> getAllDistrict2() throws Exception {
    	        
    	    	allDistrict2 = new ArrayList<newDistrict>();//创建数组列表集合对象
    	        doSqlDb db = new doSqlDb();//创建数据库模型对象
    	        String M_name=district.getM_name();
    	        ResultSet rs = db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，返回新闻栏目记录
    	        int id;
    	      
    	        String D_company;
    	        String D_district;
    	        String D_form;
    	        String D_phone1;
    	        String D_email1;
    	        String D_phone2;
    	        String D_email2;
    	        while (rs.next()) {
    	        	 id=rs.getInt("id");
    	        	 
    	        	 D_company = rs.getString("D_company");
    	        	 D_district = rs.getString("D_district");
    	        	 D_form = rs.getString("D_form");
    	        	 D_phone1 = rs.getString("D_phone1");
    	        	 D_email1 = rs.getString("D_email1");
    	        	 D_phone2 = rs.getString("D_phone2");
    	        	 D_email2 = rs.getString("D_email2");
    	        	 
    	        	 
    	        	 
    	        	 System.out.println("D_districtD_district,,,"+D_district);
    	        	 
    	        	 
    	             allDistrict2.add(new newDistrict(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
    	             
    	        }
    	        db.close();//清理数据库模型对象
    	        return allDistrict2;
    	    }

    
    
   /* 
    
    public List<newPurchase> getAlldistrictinfo() throws Exception{
    	allpurchaseinfo=new ArrayList<newPurchase>();
    	int id;
    	int P_id;
    	String P_info;
    	doSqlDb db=new doSqlDb();
    	ResultSet rs=db.doQuery("select * from purchaseinfo");
    	while(rs.next()){
    		P_id=rs.getInt("P_id");
    		id=rs.getInt("id");
    		P_info=rs.getString("P_info");
    		
    		allpurchaseinfo.add(new newPurchase(id,P_id,P_info));
    	}
    	return allpurchaseinfo;
 
    }
    */
}