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

public class reactionAdmin extends ActionSupport implements ModelDriven<newReaction> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newReaction reaction=new newReaction();
	
	public newReaction getModel() {
		// TODO Auto-generated method stub
		return reaction;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newReaction> allReaction = null;

    
   /** public List<newReaction> getAllReaction() throws Exception {
        
    	allReaction = new ArrayList<newReaction>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from reaction");//执行查询，返回新闻栏目记录
        int id;
        int Re_id;
        String Re_name;
        String Re_sex;
        String Re_age;
        String Re_nation;
        String Re_weight;
        String Re_disease;
        String Re_reactionN;
        String Re_reactionD;
        String Re_timeM;
        String Re_use;
        String Re_time;
        String Re_result;
        String Re_number;
        String Re_merge;
        String Re_family;
        String Re_reactionP;
        String Re_others;
        String Re_hospital;
        String Re_case;
        String Re_phone;
        
        
        while (rs.next()) {
        	 id=rs.getInt("id");
        	 Re_id = rs.getInt("Re_id");
        	 Re_name = rs.getString("Re_name");
        	 Re_sex = rs.getString("Re_sex");
        	 Re_age = rs.getString("Re_age");
        	 Re_nation = rs.getString("Re_nation");
        	 Re_weight = rs.getString("Re_weight");
        	 Re_disease = rs.getString("Re_disease");
        	 Re_reactionN = rs.getString("Re_reactionN");
        	 Re_reactionD = rs.getString("Re_reactionD");
        	 Re_timeM = rs.getString("Re_timeM");
        	 Re_use = rs.getString("Re_use");
        	 Re_time = rs.getString("Re_time");
        	 Re_result = rs.getString("Re_result");
        	 Re_number = rs.getString("Re_number");
        	 Re_merge = rs.getString("Re_merge");
        	 Re_family = rs.getString("Re_family");
        	 Re_reactionP = rs.getString("Re_reactionP");
        	 Re_others = rs.getString("Re_others");
        	
        	 Re_hospital = rs.getString("Re_hospital");
        	 Re_case = rs.getString("Re_case");
        	 Re_phone = rs.getString("Re_phone");
        	 allReaction.add(new newReaction(id,Re_id, Re_name, Re_sex, Re_age, Re_nation, Re_weight,Re_disease ,Re_reactionN, Re_reactionD,Re_timeM, Re_use, Re_time, Re_result, Re_number, Re_merge,Re_family, Re_reactionP, Re_others, Re_hospital, Re_case,Re_phone));//创建新闻栏目对象，加入列表对象
             
        }
        db.close();//清理数据库模型对象
        return allReaction;
    }

   **/
    public String admin_ReactionAdd(){
    	return SUCCESS;
    }

    public String admin_reactionEditSave() throws Exception {     
       
    	
    	
    	 String Re_name=reaction.getRe_name();
    	 String Re_sex =reaction.getRe_sex();
         String Re_age=reaction.getRe_age();
         String Re_nation=reaction.getRe_nation();
         String Re_weight=reaction.getRe_weight();
         String Re_disease=reaction.getRe_disease();
         String Re_reactionN=reaction.getRe_reactionN();
         String Re_reactionD=reaction.getRe_reactionD();
         String Re_timeM=reaction.getRe_timeM();
    	 String Re_use =reaction.getRe_use();
         String Re_time=reaction.getRe_time();
         String Re_result=reaction.getRe_result();
         String Re_number=reaction.getRe_number();
         String Re_merge=reaction.getRe_merge();
         String Re_family=reaction.getRe_family();
         String Re_reactionP=reaction.getRe_reactionP();
         String Re_others=reaction.getRe_others();
         String Re_hospital=reaction.getRe_hospital();
         String Re_case=reaction.getRe_case();
         String Re_phone=reaction.getRe_phone();
         
         
         Re_name = Re_name.replaceAll("\\s+", "");
         Re_sex = Re_sex.replaceAll("\\s+", "");
         Re_age = Re_age.replaceAll("\\s+", "");
         Re_nation = Re_nation.replaceAll("\\s+", "");
         Re_weight = Re_weight.replaceAll("\\s+", "");
         Re_disease = Re_disease.replaceAll("\\s+", "");
         Re_reactionN = Re_reactionN.replaceAll("\\s+", "");
         Re_reactionD = Re_reactionD.replaceAll("\\s+", "");
         Re_timeM = Re_timeM.replaceAll("\\s+", "");
         Re_use = Re_use.replaceAll("\\s+", "");
         Re_time = Re_time.replaceAll("\\s+", "");
         Re_result = Re_result.replaceAll("\\s+", "");
         Re_number = Re_number.replaceAll("\\s+", "");
         Re_merge = Re_merge.replaceAll("\\s+", "");
         Re_family = Re_family.replaceAll("\\s+", "");
         Re_reactionP = Re_reactionP.replaceAll("\\s+", "");
         Re_others = Re_others.replaceAll("\\s+", "");
         Re_hospital = Re_hospital.replaceAll("\\s+", "");
         Re_case = Re_case.replaceAll("\\s+", "");
         Re_phone = Re_phone.replaceAll("\\s+", "");
         
         
         
         
         
         
         
         
         
         
         String sql1="select Max(C_id) from client";
    	
    	 String M_name=reaction.getM_name();
    	 String RC_name=reaction.getRC_name();
    	 String Re_province=reaction.getRe_province();
    	 String Re_iphone=reaction.getRe_iphone();
    	 String D_district=reaction.getD_district();
    	 String Re_date;
    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    	 Re_date=sdf.format(new Date());
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
    	
   	    
   
    
    	   sql2="insert into reaction (Re_id,M_name,RC_name,D_district,Re_date,Re_province, Re_iphone,Re_name, Re_sex, Re_age, Re_nation, Re_weight,Re_disease ,Re_reactionN, Re_reactionD,Re_timeM, Re_use, Re_time, Re_result, Re_number, Re_merge,Re_family, Re_reactionP, Re_others, Re_hospital, Re_case,Re_phone) values"+" ("+C_id+",'"+M_name+"','"+RC_name+"','"+D_district+"','"+Re_date+"','"+Re_province+"','"+Re_iphone+"','"+Re_name+"','"+Re_sex+"','"+Re_age+"','"+Re_nation+"','"+Re_weight+"','"+Re_disease+"','"+Re_reactionN+"','"+Re_reactionD+"','"+Re_timeM+"','"+Re_use+"','"+Re_time+"','"+Re_result+"','"+Re_number+"','"+Re_merge+"','"+Re_family+"','"+Re_reactionP+"','"+Re_others+"','"+Re_hospital+"','"+Re_case+"','"+Re_phone+"')";
    	   db2.doUpdate(sql2);
      	 this.addActionMessage("成功保存添加数据");
      	 
      	 
      	String Re_date2;
      	Re_date2=Re_date;
    	 
    	 System.out.println(Re_iphone);
    	 String M_name2;
    	 String Re_name2;
    	 String Re_iphone2;
    	 
    	 Re_name2=Re_name;
    	 Re_iphone2=Re_iphone;
    	 M_name2=M_name;
    	 
    	 
    	 String D_district2;
         String Re_info2;
         
         D_district2=D_district;
         
      	 
      	sql3="update client set C_id="+C_id+",C_Date='"+Re_date2+"',C_phone='"+Re_iphone+"',M_name='"+M_name2+"',C_name='"+RC_name+"',C_district='"+D_district2+"' ,C_province='"+Re_province+"' where C_id="+C_id+"";
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