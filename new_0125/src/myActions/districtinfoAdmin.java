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

public class districtinfoAdmin extends ActionSupport implements ModelDriven<newDistrictinfo> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newDistrictinfo districtinfo=new newDistrictinfo();
	newDistrict district=new newDistrict();
	
	public newDistrictinfo getModel() {
		// TODO Auto-generated method stub
		return districtinfo;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newDistrictinfo> allDistrictinfo = null;
    
   
    
    
    public String admin_districtinfoEditSave() throws Exception{
        HttpServletRequest request=ServletActionContext.getRequest();
 	    String Di_user=(String) request.getSession().getAttribute("username");
    	 String sql1="select Max(C_id) from client";
    	 String Di_info=districtinfo.getDi_info();
    	 String M_name=districtinfo.getM_name();
    	 String D_company=districtinfo.getD_company();
    	 String Di_name=districtinfo.getDi_name();
    	 String Di_province=districtinfo.getDi_province();
    	 String Di_iphone=districtinfo.getDi_iphone();
    	 String Di_date;
    	 String D_district=D_company;
    	  
    	 
    	 Di_info = Di_info.replaceAll("\\s+", "");
    	 Di_name = Di_name.replaceAll("\\s+", "");
    	 Di_province = Di_province.replaceAll("\\s+", "");
    	 Di_iphone = Di_iphone.replaceAll("\\s+", "");
    	
    	 Di_info.replace("\n","");
    	 Di_info.replace("\t","");
    	 Di_info.replace(" ","");
    	 Di_info.trim();
    	 Di_info = Di_info.replaceAll("%", "%25");
    	 Di_info = Di_info.replaceAll(">", "大于");
    	 Di_info = Di_info.replaceAll("<", "小于");
    	 
    	 
    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    	 Di_date=sdf.format(new Date());
    	 System.out.println("跪求不为空");
    	 System.out.println(M_name);
    	 System.out.println(D_company);
    	 System.out.println(D_district);
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
    	 sql2="insert into districtinfo (Di_info,C_id,M_name,Di_date,Di_province,Di_name,Di_iphone,D_district,Di_user) values ('"+Di_info+"',"+C_id+",'"+M_name+"','"+Di_date+"','"+Di_province+"','"+Di_name+"','"+Di_iphone+"','"+D_district+"','"+Di_user+"')";
     	 db2.doUpdate(sql2);
    	 this.addActionMessage("成功保存添加数据");
    	 
    	 String Di_date2;
    	 String M_name2;
    	 String Di_name2;
    	 String Di_iphone2;
    	 String D_district2;
         String Di_info2;
         M_name2=M_name;
         D_district2=D_district;
    	 Di_info2=Di_info;
         
    	 Di_date2=Di_date;
    	 Di_name2=Di_name;
    	 Di_iphone2=Di_iphone;
    	 
    	 System.out.println("+++++++++++++++D_district2"+D_district2);
    	 System.out.println("+++++++++++++++D_district"+D_district);
    	 
    	 
    	 sql3="update client set C_id="+C_id+",C_Date='"+Di_date2+"',C_phone='"+Di_iphone+"',M_name='"+M_name2+"',C_name='"+Di_name+"',C_district='"+D_district2+"',C_info='"+Di_info2+"',C_province='"+Di_province+"',C_user='"+Di_user+"' where C_id="+C_id+"";
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
    
    public String admin_districtinfoadmin(){
    	return SUCCESS;	
    }
    
    public String admin_districtInfoAdd(){
    	return SUCCESS;
    	
    }
   
  /**  private List<newDistrictinfo> allDistrict2 = null;	    
    
    	    public List<newDistrictinfo> getAllDistrict2() throws Exception {
    	        
    	    	allDistrict2 = new ArrayList<newDistrictinfo>();//创建数组列表集合对象
    	        doSqlDb db = new doSqlDb();//创建数据库模型对象
    	        String M_name=district.getM_name();
    	        ResultSet rs = db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，返回新闻栏目记录
    	        int id;
    	        int C_id=0;
    	        String info=null;
    	        String D_district;
    	     
    	      
    	        while (rs.next()) {
    	        	 id=rs.getInt("id");
    	        	 
    	        
    	        	 D_district = rs.getString("D_district");
    	      
    	             allDistrict2.add(new newDistrictinfo(id,C_id,info,M_name,D_district));//创建新闻栏目对象，加入列表对象
    	             
    	        }
    	        db.close();//清理数据库模型对象
    	        return allDistrict2;
    	    }

    **/
    
    
    
   /** public List<newDistrictinfo> getAlldistrictinfo() throws Exception{
    	allDistrictinfo=new ArrayList<newDistrictinfo>();
    	int id;
    	int C_id;
    	String info;
    	String M_name;
    	String D_district;
    	doSqlDb db=new doSqlDb();
    	ResultSet rs=db.doQuery("select * from districtinfo");
    	while(rs.next()){
    		C_id=rs.getInt("C_id");
    		id=rs.getInt("id");
    		info=rs.getString("info");
    		M_name=rs.getString("M_name");
    		D_district=rs.getString("D_district");
    		allDistrictinfo.add(new newDistrictinfo(id,C_id,info,M_name,D_district));
    	}
    	return allDistrictinfo;
 
    }
    **/
}