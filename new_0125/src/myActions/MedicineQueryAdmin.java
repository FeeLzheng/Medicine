package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类

public class MedicineQueryAdmin extends ActionSupport implements ModelDriven<newMedicineQuery> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newMedicineQuery medicinequery=new newMedicineQuery();
	
	
	public newMedicineQuery getModel() {
		// TODO Auto-generated method stub
		return medicinequery;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newMedicineQuery> allmedicinequery = null;
    
    public String MedicineQueryAdd() throws Exception{
    	return SUCCESS;
    	}
    
    
    public String admin_MedicineQueryEditSave() throws Exception{
    	String sql1="select Max(C_id) from client";
    	 String info=medicinequery.getMQ_info();
    	 System.out.println(info);
    	 System.out.println("跪求不为空");
    	 doSqlDb db=new doSqlDb();
    	 ResultSet re=db.doQuery(sql1);
    	 int id=0;
    	 while(re.next()){
    		 id=re.getInt("Max(C_id)");
    		 id=id+1;
    	 }
    	 String sql2="select * from medicinequery where MD_id='"+id+"'";
		 doSqlDb db2=new doSqlDb();
		 ResultSet re2=db2.doQuery(sql2);
		  
		 if(re2.next()){
			 this.addFieldError("Q_id","不能重复添加用药咨询信息" );
	     }else{
    	
    	sql2="insert into medicinequery (MD_info,MD_id) values ('"+info+"',"+id+")";
    	db2.doUpdate(sql2);
   	 this.addActionMessage("成功保存添加数据");
   	 db.close();
        db2.close();
   	 return SUCCESS;
	     }
   	 
        db.close();
        db2.close();
   	 return INPUT;
   
   } 
    
 
}