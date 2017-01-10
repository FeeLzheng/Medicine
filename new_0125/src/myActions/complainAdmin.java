package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类

public class complainAdmin extends ActionSupport implements ModelDriven<newComplain> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newComplain complain=new newComplain();
	
	public newComplain getModel() {
		// TODO Auto-generated method stub
		return complain;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newComplain> allComplain = null;

    
   /** public List<newComplain> getAllDistrict() throws Exception {
        
    	allComplain = new ArrayList<newComplain>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from complain");//执行查询，返回新闻栏目记录
        int id;
        int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish;
        while (rs.next()) {
        	 id=rs.getInt("id");
        	 Co_id = rs.getInt("Co_id");
        	 Co_info = rs.getString("Co_info");
        	 Co_department = rs.getString("Co_department");
        	 Co_deliver = rs.getString("Co_deliver");
        	 Co_dealer = rs.getString("Co_dealer");
        	 Co_category = rs.getString("Co_category");
        	 Co_replay = rs.getString("Co_replay");
        	 Co_result = rs.getString("Co_result");
        	 Co_replenish = rs.getString("Co_replenish");
        	 allComplain.add(new newComplain(id,Co_id, Co_info, Co_department, Co_deliver, Co_dealer, Co_category, Co_replay, Co_result,Co_replenish));//创建新闻栏目对象，加入列表对象
             
        }
        db.close();//清理数据库模型对象
        return allComplain;
    }
**/
    public String admin_ComplainAdd(){
    	
    	return SUCCESS;
    }
    

    public String admin_complainEditSave() throws Exception {        
    	 String Co_info=complain.getCo_info();
    	 String Co_department =complain.getCo_department();
         String Co_deliver=complain.getCo_deliver();
         String Co_dealer=complain.getCo_dealer();
         String Co_category=complain.getCo_category();
         String Co_replay=complain.getCo_replay();
         String Co_result=complain.getCo_result();
         String Co_replenish=complain.getCo_replenish();
         
         String sql1="select Max(C_id) from client";
    	 
    	 String M_name=complain.getM_name();
    	 String Co_name=complain.getCo_name();
    	 String Co_province=complain.getCo_province();
    	 String Co_iphone=complain.getCo_iphone();
    	 String D_district=complain.getD_district();
    	 
    	 
    	 Co_info = Co_info.replaceAll("\\s+", "");
    	 Co_department = Co_department.replaceAll("\\s+", "");
    	 Co_deliver = Co_deliver.replaceAll("\\s+", "");
    	 Co_dealer = Co_dealer.replaceAll("\\s+", "");
    	 Co_category = Co_category.replaceAll("\\s+", "");
    	 Co_replay = Co_replay.replaceAll("\\s+", "");
    	 Co_result = Co_result.replaceAll("\\s+", "");
    	 Co_replenish = Co_replenish.replaceAll("\\s+", "");
    	 Co_name = Co_name.replaceAll("\\s+", "");
    	 Co_province = Co_province.replaceAll("\\s+", "");
    	 Co_iphone = Co_iphone.replaceAll("\\s+", "");
    	 D_district = D_district.replaceAll("\\s+", "");
    	 
    	 Co_info.replace("\n","");
    	 Co_info.replace("\t","");
    	 Co_info.replace(" ","");
    	 Co_info.trim();
    	 Co_info = Co_info.replaceAll("%", "%25");
    	 Co_info = Co_info.replaceAll(">", "大于");
    	 Co_info = Co_info.replaceAll("<", "小于");
    	 
    	 
    	 String Co_date;
    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd hh:mm:ss");
    	 Co_date=sdf.format(new Date());
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
    	
    	   sql2="insert into complain (Co_id, Co_info,M_name,D_district,Co_date,Co_province,Co_name,Co_iphone,Co_department, Co_deliver, Co_dealer, Co_category, Co_replay, Co_result,Co_replenish) values ("+C_id+",'"+Co_info+"','"+M_name+"','"+D_district+"','"+Co_date+"','"+Co_province+"','"+Co_name+"','"+Co_iphone+"','"+Co_department+"','"+Co_deliver+"','"+Co_dealer+"','"+Co_category+"','"+Co_replay+"','"+Co_result+"','"+Co_replenish+"')";
    	   db2.doUpdate(sql2);
    	   
      	 this.addActionMessage("成功保存添加数据");
     	String Co_date2;
      	 Co_date2=Co_date;
      	 
      	 
      	String M_name2;
   	 String Co_name2;
   	 String Co_iphone2;
   	 
   	 Co_name2=Co_name;
   	 Co_iphone2=Co_iphone;
   	 M_name2=M_name;
   	 
   	 String D_district2;
        String Co_info2;
        
        D_district2=D_district;
   	 Co_info2=null;
   	 
      	sql3="update client set C_id="+C_id+",C_Date='"+Co_date2+"',C_phone='"+Co_iphone2+"',M_name='"+M_name2+"',C_name='"+Co_name2+"',C_district='"+D_district2+"',C_info='"+Co_info2+"' ,C_province='"+Co_province+"' where C_id="+C_id+"";
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