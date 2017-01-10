package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//声明支持模型驱动的的业务控制器类

public class clientAdmin extends ActionSupport implements ModelDriven<newClient> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newClient client=new newClient();
	
	public newClient getModel() {
		// TODO Auto-generated method stub
		return client;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private  List<newClient> allClient = null;
    private static List<newClient> allClient2= null;
    private static List<newClient> MClient= null;
    private static List<newClient> DClient= null;
    private static List<newClient> YClient= null;
    
    public  List<newClient> getAllClient() throws Exception {
        
    	allClient = new ArrayList<newClient>();//创建数组列表集合对象
    	String Mdate;
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
    	Mdate=sdf.format(new Date());
    	//System.out.println(Mdate);	
    			
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from client LEFT JOIN districtinfo on client.C_id =districtinfo.C_id LEFT JOIN query on client.C_id=query.Q_id LEFT JOIN purchaseinfo on client.C_id=purchaseinfo.P_id LEFT JOIN complain on client.C_id=complain.Co_id LEFT JOIN department ON client.C_id=department.Da_id LEFT JOIN reaction on  client.C_id=reaction.Re_id LEFT JOIN others on client.C_id=others.O_id order by Client.C_id desc limit 100");//执行查询，返回新闻栏目记录
        //System.out.println("服务记录查询+1");
        int C_id;
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_districtinfo=null;
    	String C_query=null;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;
    	String C_user;
        int Di_id;
    	String Di_info;
    	String Di_name;
    	String Di_district;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id=0;
    	String MQ_info=null;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
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
    	int O_id;
    	String O_info;
    	String property="无";
    	String Di_data;
    	String Q_data;
    	String P_data;
    	String O_data;
    	String Co_data;
    	String Da_data;
    	String Re_data;
    	String C_info;
    	String C_province;
    	String C_district;
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        		
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
        	 
        	 C_department = rs.getString("C_department");
        	 
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	 C_user = rs.getString("C_user");
        	
        	 
        	  Di_id=rs.getInt("C_id");
        	 // System.out.println("服务记录查询+2");
         	Di_info=rs.getString("Di_info");
           // System.out.println("服务记录查询+2");
            Di_name=rs.getString("M_name");
           // System.out.println("服务记录查询+3");
        	Di_district=rs.getString("D_district");
           // System.out.println("服务记录查询+4");
         	Q_id=rs.getInt("Q_id");
         	
         	Q_info=rs.getString("Q_info");
         	
         	P_id=rs.getInt("P_id");
         //	System.out.println("服务记录查询+5");
         	P_info=rs.getString("P_info");
         	
         	//System.out.println("服务记录查询+6");
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
          //    System.out.println("服务记录查询+7");
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
           //  System.out.println("服务记录查询+8");
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
         //	System.out.println("服务记录查询+9");
         	C_info=rs.getString("C_info");
         	C_province=rs.getString("C_province");
         	
         	 Di_data=rs.getString("Di_date");
        	Q_data=rs.getString("Q_date");
        	 P_data=rs.getString("P_date");
        	O_data=rs.getString("O_date");
        	Co_data=rs.getString("Co_date");
        	Da_data=rs.getString("Da_date");
        	Re_data=rs.getString("Re_date");
        	C_info=rs.getString("C_info");
        	C_province=rs.getString("C_province");
         	C_district=rs.getString("C_district");
         	if (Di_data!=null){
         		property="产品代理";
         	}else if (P_data!=null){
         		property="个人购买";
         	}else if (Q_data!=null){
         		property="个人咨询";
         	}else if (Co_data!=null){
         		property="投诉";
         	}else if (Da_data!=null){
         		property="药监部门";
         	}else if (Re_data!=null){
         		property="不良反应";
         	}else if (O_data!=null){
         		property="其他注意事项";
         	}
         	
         	//System.out.println(property);
        
         	//System.out.println(C_name + "ewaew ewwe");
        
        	allClient.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,C_user,
        			 Di_id,Di_info,Di_name,Di_district,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info,property,C_info,C_province,C_district));//创建新闻栏目对象，加入列表对象
          
       
      
        }
//System.out.println("服务记录查询+3");
        db.close();//清理数据库模型对象
        return allClient;
    }

    
    
 public static  List<newClient> getAllClient2() throws Exception {
        
    	allClient2 = new ArrayList<newClient>();//创建数组列表集合对象
    	String Mdate;
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
    	Mdate=sdf.format(new Date());
    	//System.out.println(Mdate);	
    			
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from client LEFT JOIN districtinfo on client.C_id =districtinfo.C_id LEFT JOIN query on client.C_id=query.Q_id LEFT JOIN purchaseinfo on client.C_id=purchaseinfo.P_id LEFT JOIN complain on client.C_id=complain.Co_id LEFT JOIN department ON client.C_id=department.Da_id LEFT JOIN reaction on  client.C_id=reaction.Re_id LEFT JOIN others on client.C_id=others.O_id order by Client.C_id");//执行查询，返回新闻栏目记录
      //  System.out.println("服务记录查询+1");
        int C_id;
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_districtinfo=null;
    	String C_query=null;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;
    	String C_user;
        int Di_id;
    	String Di_info;
    	String Di_name;
    	String Di_district;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id=0;
    	String MQ_info=null;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
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
    	int O_id;
    	String O_info;
    	String property="无";
    	String Di_data;
    	String Q_data;
    	String P_data;
    	String O_data;
    	String Co_data;
    	String Da_data;
    	String Re_data;
    	String C_info;
    	String C_province;
    	String C_district;
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        		
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
        	 
        	 C_department = rs.getString("C_department");
        	 
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	 C_user = rs.getString("C_user");
        	 
        	  Di_id=rs.getInt("C_id");
        	 // System.out.println("服务记录查询+2");
         	Di_info=rs.getString("Di_info");
           // System.out.println("服务记录查询+2");
            Di_name=rs.getString("M_name");
           // System.out.println("服务记录查询+3");
        	Di_district=rs.getString("D_district");
           // System.out.println("服务记录查询+4");
         	Q_id=rs.getInt("Q_id");
         	
         	Q_info=rs.getString("Q_info");
         	
         	P_id=rs.getInt("P_id");
         	//System.out.println("服务记录查询+5");
         	P_info=rs.getString("P_info");
         	
         	//System.out.println("服务记录查询+6");
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
            //  System.out.println("服务记录查询+7");
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
            // System.out.println("服务记录查询+8");
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
         	//System.out.println("服务记录查询+9");
         	C_info=rs.getString("C_info");
         	C_province=rs.getString("C_province");
         	
         	 Di_data=rs.getString("Di_date");
        	Q_data=rs.getString("Q_date");
        	 P_data=rs.getString("P_date");
        	O_data=rs.getString("O_date");
        	Co_data=rs.getString("Co_date");
        	Da_data=rs.getString("Da_date");
        	Re_data=rs.getString("Re_date");
        	C_info=rs.getString("C_info");
        	C_province=rs.getString("C_province");
         	C_district=rs.getString("C_district");
         	if (Di_data!=null){
         		property="产品代理";
         	}else if (P_data!=null){
         		property="个人购买";
         	}else if (Q_data!=null){
         		property="个人咨询";
         	}else if (Co_data!=null){
         		property="投诉";
         	}else if (Da_data!=null){
         		property="药监部门";
         	}else if (Re_data!=null){
         		property="不良反应";
         	}else if (O_data!=null){
         		property="其他注意事项";
         	}
         	
         //	System.out.println(property);
        
         //	System.out.println(property + "ewaew ewwe");
        
        	allClient2.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,C_user,
        			 Di_id,Di_info,Di_name,Di_district,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info,property,C_info,C_province,C_district));//创建新闻栏目对象，加入列表对象
          
       
      
        }
//System.out.println("服务记录查询+4");
        db.close();//清理数据库模型对象
        return allClient2;
    }
    
    
    //获取天数据
    public static List<newClient> getDClient() throws Exception {
        
    	DClient = new ArrayList<newClient>();//创建数组列表集合对象
    	String Ddate;
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
    	Ddate=sdf.format(new Date());
    	//System.out.println(Ddate);	
    			
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from client LEFT JOIN districtinfo on client.C_id =districtinfo.C_id LEFT JOIN query on client.C_id=query.Q_id LEFT JOIN purchaseinfo on client.C_id=purchaseinfo.P_id LEFT JOIN complain on client.C_id=complain.Co_id LEFT JOIN department ON client.C_id=department.Da_id LEFT JOIN reaction on  client.C_id=reaction.Re_id LEFT JOIN others on client.C_id=others.O_id WHERE C_Date LIKE '%"+Ddate+"%' order by Client.C_id");//执行查询，返回新闻栏目记录
       // System.out.println("服务记录查询+1");
        int C_id;
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_districtinfo=null;
    	String C_query=null;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;
    	String C_user;
        int Di_id;
    	String Di_info;
    	String Di_name;
    	String Di_district;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id=0;
    	String MQ_info=null;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
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
    	int O_id;
    	String O_info;
    	String property="无";
    	String Di_data;
    	String Q_data;
    	String P_data;
    	String O_data;
    	String Co_data;
    	String Da_data;
    	String Re_data;
    	String C_info;
    	String C_province;
    	String C_district;
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        		
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
        	 
        	 C_department = rs.getString("C_department");
        	 
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	 C_user=rs.getString("C_user");
        	 
        	  Di_id=rs.getInt("C_id");
        	 // System.out.println("服务记录查询+2");
         	Di_info=rs.getString("Di_info");
           // System.out.println("服务记录查询+2");
            Di_name=rs.getString("M_name");
           // System.out.println("服务记录查询+3");
        	Di_district=rs.getString("D_district");
           // System.out.println("服务记录查询+4");
         	Q_id=rs.getInt("Q_id");
         	
         	Q_info=rs.getString("Q_info");
         	
         	P_id=rs.getInt("P_id");
         	//System.out.println("服务记录查询+5");
         	P_info=rs.getString("P_info");
         	
         	//System.out.println("服务记录查询+6");
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
             // System.out.println("服务记录查询+7");
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
           //  System.out.println("服务记录查询+8");
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
         	//System.out.println("服务记录查询+9");
         	C_info=rs.getString("C_info");
         	C_province=rs.getString("C_province");
         	
         	 Di_data=rs.getString("Di_date");
        	Q_data=rs.getString("Q_date");
        	 P_data=rs.getString("P_date");
        	O_data=rs.getString("O_date");
        	Co_data=rs.getString("Co_date");
        	Da_data=rs.getString("Da_date");
        	Re_data=rs.getString("Re_date");
        	C_info=rs.getString("C_info");
        	C_province=rs.getString("C_province");
         	C_district=rs.getString("C_district");
         	if (Di_data!=null){
         		property="产品代理";
         	}else if (P_data!=null){
         		property="个人购买";
         	}else if (Q_data!=null){
         		property="个人咨询";
         	}else if (Co_data!=null){
         		property="投诉";
         	}else if (Da_data!=null){
         		property="药监部门";
         	}else if (Re_data!=null){
         		property="不良反应";
         	}else if (O_data!=null){
         		property="其他注意事项";
         	}
         	
         //	System.out.println(property);
        
         //	System.out.println(property + "ewaew ewwe");
        
         	DClient.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,C_user,
        			 Di_id,Di_info,Di_name,Di_district,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info,property,C_info,C_province,C_district));//创建新闻栏目对象，加入列表对象
          
       
      
        }
//System.out.println("服务记录查询+333333333333333333333333333333333333333333");
        db.close();//清理数据库模型对象
        return DClient;
    }      
    
    
    
    
    
// 当月数据集合
    public static List<newClient> getMClient() throws Exception {
        
    	MClient = new ArrayList<newClient>();//创建数组列表集合对象
    	String Mdate;
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
    	Mdate=sdf.format(new Date());
    //	System.out.println(Mdate);	
    			
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from client LEFT JOIN districtinfo on client.C_id =districtinfo.C_id LEFT JOIN query on client.C_id=query.Q_id LEFT JOIN purchaseinfo on client.C_id=purchaseinfo.P_id LEFT JOIN complain on client.C_id=complain.Co_id LEFT JOIN department ON client.C_id=department.Da_id LEFT JOIN reaction on  client.C_id=reaction.Re_id LEFT JOIN others on client.C_id=others.O_id WHERE C_Date LIKE '%"+Mdate+"%' order by Client.C_id");//执行查询，返回新闻栏目记录
        
     //   System.out.println("服务记录查询+1");
        int C_id;
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_districtinfo=null;
    	String C_query=null;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;
    	String C_user;
        int Di_id;
    	String Di_info;
    	String Di_name;
    	String Di_district;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id=0;
    	String MQ_info=null;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
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
    	int O_id;
    	String O_info;
    	String property="无";
    	String Di_data;
    	String Q_data;
    	String P_data;
    	String O_data;
    	String Co_data;
    	String Da_data;
    	String Re_data;
    	String C_info;
    	String C_province;
    	String C_district;
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        		
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
        	 
        	 C_department = rs.getString("C_department");
        	 
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	 C_user = rs.getString("C_user");
        	
        	 
        	  Di_id=rs.getInt("C_id");
        	 // System.out.println("服务记录查询+2");
         	Di_info=rs.getString("Di_info");
          //  System.out.println("服务记录查询+2");
            Di_name=rs.getString("M_name");
            System.out.println("服务记录查询+3");
        	Di_district=rs.getString("D_district");
            System.out.println("服务记录查询+4");
         	Q_id=rs.getInt("Q_id");
         	
         	Q_info=rs.getString("Q_info");
         	
         	P_id=rs.getInt("P_id");
         	System.out.println("服务记录查询+5");
         	P_info=rs.getString("P_info");
         	
         	System.out.println("服务记录查询+6");
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
              System.out.println("服务记录查询+7");
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
             System.out.println("服务记录查询+8");
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
         	System.out.println("服务记录查询+9");
         	C_info=rs.getString("C_info");
         	C_province=rs.getString("C_province");
         	
         	 Di_data=rs.getString("Di_date");
        	Q_data=rs.getString("Q_date");
        	 P_data=rs.getString("P_date");
        	O_data=rs.getString("O_date");
        	Co_data=rs.getString("Co_date");
        	Da_data=rs.getString("Da_date");
        	Re_data=rs.getString("Re_date");
        	C_info=rs.getString("C_info");
        	C_province=rs.getString("C_province");
         	C_district=rs.getString("C_district");
         	if (Di_data!=null){
         		property="产品代理";
         	}else if (P_data!=null){
         		property="个人购买";
         	}else if (Q_data!=null){
         		property="个人咨询";
         	}else if (Co_data!=null){
         		property="投诉";
         	}else if (Da_data!=null){
         		property="药监部门";
         	}else if (Re_data!=null){
         		property="不良反应";
         	}else if (O_data!=null){
         		property="其他注意事项";
         	}
         	
         	//System.out.println(property);
        
         	//System.out.println(property + "ewaew ewwe");
        
         	MClient.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,C_user,
        			 Di_id,Di_info,Di_name,Di_district,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info,property,C_info,C_province,C_district));//创建新闻栏目对象，加入列表对象
          
       
      
        }
System.out.println("服务记录查询+3");
        db.close();//清理数据库模型对象
        return MClient;
    }   
    
    
public static List<newClient> getYClient() throws Exception {
        
    	YClient = new ArrayList<newClient>();//创建数组列表集合对象
    	String Ydate;
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
    	Ydate=sdf.format(new Date());
    	System.out.println(Ydate);	
    			
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from client LEFT JOIN districtinfo on client.C_id =districtinfo.C_id LEFT JOIN query on client.C_id=query.Q_id LEFT JOIN purchaseinfo on client.C_id=purchaseinfo.P_id LEFT JOIN complain on client.C_id=complain.Co_id LEFT JOIN department ON client.C_id=department.Da_id LEFT JOIN reaction on  client.C_id=reaction.Re_id LEFT JOIN others on client.C_id=others.O_id WHERE C_Date LIKE '%"+Ydate+"%' order by Client.C_id");//执行查询，返回新闻栏目记录
        System.out.println("服务记录查询+1");
        int C_id;
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_districtinfo=null;
    	String C_query=null;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;
    	String C_user;
        int Di_id;
    	String Di_info;
    	String Di_name;
    	String Di_district;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id=0;
    	String MQ_info=null;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
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
    	int O_id;
    	String O_info;
    	String property="无";
    	String Di_data;
    	String Q_data;
    	String P_data;
    	String O_data;
    	String Co_data;
    	String Da_data;
    	String Re_data;
    	String C_info;
    	String C_province;
    	String C_district;
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        		
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
        	 
        	 C_department = rs.getString("C_department");
        	 
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	 C_user = rs.getString("C_user");
        	
        	 
        	  Di_id=rs.getInt("C_id");
        	  System.out.println("服务记录查询+2");
         	Di_info=rs.getString("Di_info");
            System.out.println("服务记录查询+2");
            Di_name=rs.getString("M_name");
            System.out.println("服务记录查询+3");
        	Di_district=rs.getString("D_district");
            System.out.println("服务记录查询+4");
         	Q_id=rs.getInt("Q_id");
         	
         	Q_info=rs.getString("Q_info");
         	
         	P_id=rs.getInt("P_id");
         	System.out.println("服务记录查询+5");
         	P_info=rs.getString("P_info");
         	
         	System.out.println("服务记录查询+6");
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
              System.out.println("服务记录查询+7");
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
             System.out.println("服务记录查询+8");
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
         	System.out.println("服务记录查询+9");
         	C_info=rs.getString("C_info");
         	C_province=rs.getString("C_province");
         	
         	 Di_data=rs.getString("Di_date");
        	Q_data=rs.getString("Q_date");
        	 P_data=rs.getString("P_date");
        	O_data=rs.getString("O_date");
        	Co_data=rs.getString("Co_date");
        	Da_data=rs.getString("Da_date");
        	Re_data=rs.getString("Re_date");
        	C_info=rs.getString("C_info");
        	C_province=rs.getString("C_province");
         	C_district=rs.getString("C_district");
         	if (Di_data!=null){
         		property="产品代理";
         	}else if (P_data!=null){
         		property="个人购买";
         	}else if (Q_data!=null){
         		property="个人咨询";
         	}else if (Co_data!=null){
         		property="投诉";
         	}else if (Da_data!=null){
         		property="药监部门";
         	}else if (Re_data!=null){
         		property="不良反应";
         	}else if (O_data!=null){
         		property="其他注意事项";
         	}
         	
         	//System.out.println(property);
        
         	//System.out.println(property + "ewaew ewwe");
        
         	YClient.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,C_user,
        			 Di_id,Di_info,Di_name,Di_district,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info,property,C_info,C_province,C_district));//创建新闻栏目对象，加入列表对象
          
       
      
        }
System.out.println("服务记录查询+3");
        db.close();//清理数据库模型对象
        return YClient;
    }      
    
    
    
    public String admin_clientAdd2() throws Exception {        
    	 String M_name=client.getM_name();
    	 String C_phone =client.getC_phone();
         String C_name=client.getC_name();
         String C_districtinfo;
    	 String C_query;
    	 String C_purchase;
    	 String C_medicinequery;
    	 String C_complain;
    	 String C_department;
    	 String C_reaction;
         String C_other;
         String C_Date;
         SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
         C_Date=sdf.format(new Date());
         System.out.println(C_Date);
         int C_id =0;
         int id=0;
         doSqlDb db1=new doSqlDb();
         doSqlDb db2=new doSqlDb();
         doSqlDb db3=new doSqlDb();
         doSqlDb db4=new doSqlDb();
         doSqlDb db5=new doSqlDb();
         doSqlDb db6=new doSqlDb();
         doSqlDb db7=new doSqlDb();
         doSqlDb db8=new doSqlDb();
         doSqlDb db9=new doSqlDb();
         doSqlDb db10=new doSqlDb();
         doSqlDb db11=new doSqlDb();
         doSqlDb db12=new doSqlDb();
         doSqlDb db13=new doSqlDb();
         doSqlDb db14=new doSqlDb();
         doSqlDb db15=new doSqlDb();
         doSqlDb db16=new doSqlDb();
         doSqlDb db17=new doSqlDb();
         doSqlDb db18=new doSqlDb();

         
         
         
         
         ResultSet re2=null;
       	String sql1="select Max(C_id) from client";
     	  
   	    
   	    ResultSet re=db1.doQuery(sql1);
   	    while(re.next()){
   		 C_id=re.getInt("Max(C_id)");}
   	     C_id=C_id+1;
   		 System.out.println(C_id);
   		 
   	    String sql="select Max(C_id) from districtinfo";
   	     re2=db2.doQuery(sql);
   	     while(re2.next()){
    	 id=re2.getInt("Max(C_id)");}
   	     if(id==C_id){
   	     C_districtinfo="Y";
   	     }else{
   	     C_districtinfo="N";
   	     db11.doUpdate("insert into districtinfo (C_id) values ("+C_id+")");
   	     
   	     }
 
   	    sql="select Max(Q_id) from query";
 	    re2=db3.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(Q_id)");}
 	     if(id==C_id){
 	    	C_query="Y";
 	     }else{
 	    	C_query="N";
 	    	db12.doUpdate("insert into query (Q_id) values ("+C_id+")");
 	     }
 	
 	    sql="select Max(P_id) from purchaseinfo";
 	    re2=db4.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(P_id)");}
 	     if(id==C_id){
 	    	C_purchase="Y";
 	     }else{
 	    	C_purchase="N";
 	    	db13.doUpdate("insert into purchaseinfo (P_id) values ("+C_id+")");
 	    	
 	     }
 	
 	    sql="select Max(MD_id) from medicinequery";
 	    re2=db5.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(MD_id)");}
 	     if(id==C_id){
 	    	C_medicinequery="Y";
 	     }else{
 	    	C_medicinequery="N";
 	    	db14.doUpdate("insert into medicinequery (MD_id) values ("+C_id+")");
 	     }
 
 	    sql="select Max(Co_id) from complain";
 	    re2=db6.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(Co_id)");}
 	     if(id==C_id){
 	    	C_complain="Y";
 	     }else{
 	    	C_complain="N";
 	    	db15.doUpdate("insert into complain (Co_id) values ("+C_id+")");
 	     }
 	 
 	    sql="select Max(Da_id) from department";
 	    re2=db7.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(Da_id)");}
 	     if(id==C_id){
 	    	C_department="Y";
 	     }else{
 	    	C_department="N";
 	    	db16.doUpdate("insert into department (Da_id) values ("+C_id+")");
 	     }
 	   
 	    sql="select Max(Re_id) from reaction";
 	    re2=db8.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(Re_id)");}
 	     if(id==C_id){
 	    	C_reaction="Y";
 	     }else{
 	    	C_reaction="N";
 	    	db17.doUpdate("insert into reaction (Re_id) values ("+C_id+")");
 	     }
 	   
 	    sql="select Max(O_id) from others";
 	    re2=db9.doQuery(sql);
 	     while(re2.next()){
  	     id=re2.getInt("Max(O_id)");}
 	     if(id==C_id){
 	    	C_other="Y";
 	     }else{
 	    	C_other="N";
 	    	db18.doUpdate("insert into others (O_id) values ("+C_id+")");
 	     }
 	  
 	     
    
    	  String sql3="insert into client (M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_department,C_complain,C_reaction,C_other,C_Date) values " +"('"+M_name+"','"+C_name+"','"+C_phone+"','"+C_districtinfo+"','"+C_query+"','"+C_purchase+"','"+C_medicinequery+"','"+C_complain+"','"+C_department+"','"+C_reaction+"','"+C_other+"','"+C_Date+"')";
    	  db10.doUpdate(sql3);
    	  this.addActionMessage("成功保存添加数据");
    	
    
    	 db1.close();
    	 db2.close();
    	 db3.close();
    	 
    	 db4.close();
    	 
    	 db5.close();
    	 db6.close();
    	 db7.close();
    	 db8.close();
    	 db9.close();
    	 db10.close();
         
    	 return SUCCESS;
    }

 public String admin_clientEditSave() throws Exception {
    	
    	allClient = new ArrayList<newClient>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        doSqlDb db2 = new doSqlDb();//创建数据库模型对象
        doSqlDb db3 = new doSqlDb();//创建数据库模型对象
        doSqlDb db4 = new doSqlDb();//创建数据库模型对象
        doSqlDb db5 = new doSqlDb();//创建数据库模型对象
        doSqlDb db6 = new doSqlDb();//创建数据库模型对象
        doSqlDb db7 = new doSqlDb();//创建数据库模型对象
        doSqlDb db8 = new doSqlDb();//创建数据库模型对象
        
     // ResultSet rs = db.doQuery("SELECT client.*,districtinfo.*,query.*,purchaseinfo.*,medicinequery.*,complain.*,department.*,reaction.*,others.* FROM client,districtinfo,query,purchaseinfo,medicinequery,complain,department,reaction,others WHERE client.C_id=districtinfo.C_id and client.C_id=query.Q_id and client.C_id=purchaseinfo.P_id and client.C_id=medicinequery.MD_id and client.C_id=complain.Co_id and client.C_id=department.Da_id and client.C_id=reaction.Re_id and  client.C_id=others.O_id;");//执行查询，返回新闻栏目记录
        int C_id;
        String M_name1=client.getM_name();
        System.out.println("修改日志记录————————"+M_name1);
        //问题：可能用M_name1去select 有误，因为有些没有药品名
        C_id =client.getC_id();
        ResultSet prers = db.doQuery("select * from client LEFT JOIN districtinfo on client.C_id =districtinfo.C_id LEFT JOIN query on client.C_id=query.Q_id LEFT JOIN purchaseinfo on client.C_id=purchaseinfo.P_id LEFT JOIN complain on client.C_id=complain.Co_id LEFT JOIN department ON client.C_id=department.Da_id LEFT JOIN reaction on  client.C_id=reaction.Re_id LEFT JOIN others on client.C_id=others.O_id where client.C_id="+C_id+";");//执行查询，返回新闻栏目记录
        
        
    	String sql=null;     
        int PreC_id;

        String PreM_name;
    	String PreC_phone;
    	String PreC_name;
    	String PreC_districtinfo;
    	String PreC_query;
    	String PreC_purchase;
    	String PreC_medicinequery;
    	String PreC_complain;
    	String PreC_department;
    	String PreC_reaction;
    	String PreC_other;
    	String PreC_Date;

    	int PreDi_id;
    	String PreDi_info;
    	int PreQ_id;
    	String PreQ_info;
    	int PreP_id;
    	String PreP_info;
    	int PreMQ_id;
    	String PreMQ_info;
    	int PreCo_id;
        String PreCo_info;
        String PreCo_department;
        String PreCo_deliver;
        String PreCo_dealer;
        String PreCo_category;
        String PreCo_replay;
        String PreCo_result;
        String PreCo_replenish;
    	int PreDa_id;
    	String PreDa_info;
        int PreRe_id;
        String PreRe_name;
        String PreRe_sex;
        String PreRe_age;
        String PreRe_nation;
        String PreRe_weight;
        String PreRe_disease;
        String PreRe_reactionN;
        String PreRe_reactionD;
        String PreRe_timeM;
        String PreRe_use;
        String PreRe_time;
        String PreRe_result;
        String PreRe_number;
        String PreRe_merge;
        String PreRe_family;
        String PreRe_reactionP;
        String PreRe_others;
        String PreRe_hospital;
        String PreRe_case;
        String PreRe_phone; 
    	int PreO_id;
    	String PreO_info;
    	
    	System.out.println("修改日志记录————————"+M_name1+"_2");
    	
    	//取到系统时间并转为string
        Date time1=new Date();
        String time = new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(time1);
   	    //获取登陆名
	     HttpServletRequest request=ServletActionContext.getRequest();
	     String operator=(String) request.getSession().getAttribute("username");
if (prers.next()) {
    		  
        	 PreC_id=prers.getInt("C_id");
        	 System.out.println("PreC_id=="+PreC_id);
        	 PreM_name = prers.getString("M_name");
        	 System.out.println("PreM_name=="+PreM_name);
        	 
        	 PreC_name = prers.getString("C_name");
         	PreC_phone = prers.getString("C_phone");       		
         	PreC_districtinfo = prers.getString("C_district");       	
         	//PreC_query = prers.getString("C_query");        	
         	//PreC_purchase = prers.getString("C_purchase");        	
         	//PreC_medicinequery = prers.getString("C_medicinequery");        	
         	//PreC_complain = prers.getString("C_complain");
         	 
         	//PreC_department = prers.getString("C_department");
         	 
         	//PreC_reaction = prers.getString("C_reaction");
         	//PreC_other = prers.getString("C_other");
         	//PreC_Date = prers.getString("C_Date");
        	
        	 
        	  PreDi_id=prers.getInt("C_id");
        	 
        	  PreDi_info=prers.getString("Di_info");
          	
        	  PreQ_id=prers.getInt("Q_id");
         	
        	  PreQ_info=prers.getString("Q_info");
        	  PreP_id=prers.getInt("P_id");
        	
        	  PreP_info=prers.getString("P_info");
        	  //PreMQ_id=prers.getInt("MD_id");
        	  //PreMQ_info=prers.getString("MD_info");
        	
        	  PreCo_id=prers.getInt("Co_id");
        	  PreCo_info=prers.getString("Co_info");
        	  PreCo_department=prers.getString("Co_department");
          	
        	  PreCo_deliver=prers.getString("Co_deliver");
        	  PreCo_dealer=prers.getString("Co_dealer");
        	  PreCo_category=prers.getString("Co_category");
        	  PreCo_replay=prers.getString("Co_replay");
        	  PreCo_result=prers.getString("Co_result");
        	  PreCo_replenish=prers.getString("Co_replenish");
          
        	  PreDa_id=prers.getInt("Da_id");
        	  PreDa_info=prers.getString("Da_info");
              PreRe_id=prers.getInt("Re_id");
              PreRe_name=prers.getString("Re_name");
              PreRe_sex=prers.getString("Re_sex");
              PreRe_age=prers.getString("Re_age");
              PreRe_nation=prers.getString("Re_nation");
              PreRe_weight=prers.getString("Re_weight");
              PreRe_disease=prers.getString("Re_disease");
              PreRe_reactionN=prers.getString("Re_reactionN");
              PreRe_reactionD=prers.getString("Re_reactionD");
              PreRe_timeM=prers.getString("Re_timeM");
              PreRe_use=prers.getString("Re_use");
              PreRe_time=prers.getString("Re_time");
              PreRe_result=prers.getString("Re_result");
              PreRe_number=prers.getString("Re_number");
              PreRe_merge=prers.getString("Re_merge");
              PreRe_family=prers.getString("Re_family");
              PreRe_reactionP=prers.getString("Re_reactionP");
              PreRe_others=prers.getString("Re_others");
              PreRe_hospital=prers.getString("Re_hospital");
              PreRe_case=prers.getString("Re_case");
              PreRe_phone=prers.getString("Re_phone");
         	PreO_id=prers.getInt("O_id");
         	PreO_info=prers.getString("O_info");
    	
    	
    	
    	System.out.println("C_id=="+C_id);
    	
    	
    	
    	System.out.println("修改日志记录————————"+M_name1+"_2");
    	String C_phone=client.getC_phone();
    	String C_name=client.getC_name();
    	String C_province=client.getC_province();
    	String C_districtinfo=client.getC_districtinfo();
    	String C_query=client.getC_query();
    	String C_purchase=client.getC_purchase();
    	String C_medicinequery=client.getC_medicinequery();
    	String C_complain=client.getC_complain();
    	String C_department=client.getC_department();
    	String C_reaction=client.getC_reaction();
    	String C_other=client.getC_other();
    	String C_Date=client.getC_Date();

    	int Di_id=client.getDi_id();
    	String Di_info=client.getDi_info();
    	int Q_id=client.getQ_id();
    	String Q_info=client.getQ_info();
    	int P_id=client.getP_id();
    	String P_info=client.getP_info();
    	int MQ_id=client.getMQ_id();
    	String MQ_info=client.getMQ_info();
    	int Co_id=client.getCo_id();
        String Co_info=client.getCo_info();
        String Co_department=client.getCo_department();
        String Co_deliver=client.getCo_deliver();
        String Co_dealer=client.getCo_dealer();
        String Co_category=client.getCo_category();
        String Co_replay=client.getCo_replay();
        String Co_result=client.getCo_result();
        String Co_replenish=client.getCo_replenish();
    	int Da_id=client.getDa_id();
    	String Da_info=client.getDa_info();
        int Re_id=client.getRe_id();
        String Re_name=client.getRe_name();
        String Re_sex=client.getRe_sex();
        String Re_age=client.getRe_age();
        String Re_nation=client.getRe_nation();
        String Re_weight=client.getRe_weight();
        String Re_disease=client.getRe_disease();
        String Re_reactionN=client.getRe_reactionN();
        String Re_reactionD=client.getRe_reactionD();
        String Re_timeM=client.getRe_timeM();
        String Re_use=client.getRe_use();
        String Re_time=client.getRe_time();
        String Re_result=client.getRe_result();
        String Re_number=client.getRe_number();
        String Re_merge=client.getRe_merge();
        String Re_family=client.getRe_family();
        String Re_reactionP=client.getRe_reactionP();
        String Re_others=client.getRe_others();
        String Re_hospital=client.getRe_hospital();
        String Re_case=client.getRe_case();
        String Re_phone=client.getRe_phone();
    	int O_id=client.getO_id();
    	String O_info=client.getO_info();
    	
    	Di_info.replace("\n","");
    	Di_info.replace("\t","");
    	Di_info.replace(" ","");
    	Di_info.trim();
    	Di_info = Di_info.replaceAll(">", "大于");
    	Di_info = Di_info.replaceAll("<", "小于");
    	Di_info = Di_info.replaceAll("%", "%25");
    	Di_info = Di_info.replaceAll("\\s+", "");
	        
    	Q_info.replace("\n","");
    	Q_info.replace("\t","");
    	Q_info.replace(" ","");
    	Q_info.trim();
    	Q_info = Q_info.replaceAll(">", "大于");
    	Q_info = Q_info.replaceAll("<", "小于");
    	Q_info = Q_info.replaceAll("%", "%25");
    	Q_info = Q_info.replaceAll("\\s+", "");
    	
    	
    	P_info.replace("\n","");
    	P_info.replace("\t","");
    	P_info.replace(" ","");
    	P_info.trim();
    	P_info = P_info.replaceAll(">", "大于");
    	P_info = P_info.replaceAll("<", "小于");
    	P_info = P_info.replaceAll("%", "%25");
    	P_info = P_info.replaceAll("\\s+", "");
    	
    	Da_info.replace("\n","");
    	Da_info.replace("\t","");
    	Da_info.replace(" ","");
    	Da_info.trim();
    	Da_info = Da_info.replaceAll(">", "大于");
    	Da_info = Da_info.replaceAll("<", "小于");
    	Da_info = Da_info.replaceAll("%", "%25");
    	Da_info = Da_info.replaceAll("\\s+", "");
    	
    	Co_info.replace("\n","");
    	Co_info.replace("\t","");
    	Co_info.replace(" ","");
    	Co_info.trim();
    	Co_info = Co_info.replaceAll(">", "大于");
    	Co_info = Co_info.replaceAll("<", "小于");
    	Co_info = Co_info.replaceAll("%", "%25");
    	Co_info = Co_info.replaceAll("\\s+", "");
    	
    	O_info.replace("\n","");
    	O_info.replace("\t","");
    	O_info.replace(" ","");
    	O_info.trim();
    	O_info = O_info.replaceAll(">", "大于");
    	O_info = O_info.replaceAll("<", "小于");
    	O_info = O_info.replaceAll("%", "%25");
    	O_info = O_info.replaceAll("\\s+", "");
    	
    
    	
    	
    	
    	if(PreC_phone==null){
    		PreC_phone="";
    	}if(PreC_name==null){
    		PreC_name="";
    	}if(PreDi_info==null){
    		PreDi_info="";
    	}if(PreQ_info==null){
    		PreQ_info="";
    	}if(PreP_info==null){
    		PreP_info="";
    	
    	}if(PreCo_deliver==null){
    		PreCo_deliver="";
    	}if(PreCo_info==null){
    		PreCo_info="";
    	}if(PreCo_category==null){
    		PreCo_category="";
    	}if(PreCo_result==null){
    		PreCo_result="";
    	}if(PreCo_department==null){
    		PreCo_department="";
    	}if(PreCo_dealer==null){
    		PreCo_dealer="";
    	}if(PreCo_replay==null){
    		PreCo_replay="";
    	}if(PreCo_replenish==null){
    		PreCo_replenish="";
    	}if(PreDa_info==null){
    		PreDa_info="";
    	}if(PreRe_name==null){
    		PreRe_name="";
    	}if(PreRe_age==null){
    		PreRe_age="";
    	}if(PreRe_weight==null){
    		PreRe_weight="";
    	}if(PreRe_reactionN==null){
    		PreRe_reactionN="";
    	}if(PreRe_timeM==null){
    		PreRe_timeM="";
    	}if(PreRe_time==null){
    		PreRe_time="";
    	}if(PreRe_number==null){
    		PreRe_number="";
    	}if(PreRe_family==null){
    		PreRe_family="";
    	}if(PreRe_others==null){
    		PreRe_others="";
    	}if(PreRe_case==null){
    		PreRe_case="";
    	}if(PreRe_sex==null){
    		PreRe_sex="";
    	}if(PreRe_nation==null){
    		PreRe_nation="";
    	}if(PreRe_disease==null){
    		PreRe_disease="";
    	}if(PreRe_reactionD==null){
    		PreRe_reactionD="";
    	}if(PreRe_use==null){
    		PreRe_use="";
    	}if(PreRe_result==null){
    		PreRe_result="";
    	}if(PreRe_merge==null){
    		PreRe_merge="";
    	}if(PreRe_reactionP==null){
    		PreRe_reactionP="";
    	}if(PreRe_hospital==null){
    		PreRe_hospital="";
    	}if(PreRe_phone==null){
    		PreRe_phone="";
    	}if(PreO_info==null){
    		PreO_info="";
    	}
    	
    	
    	
    	String precontent="";
    	String aftcontent="";
    	String precontent1="";
    	String aftcontent1="";
    	String precontent2="";
    	String aftcontent2="";
    	String precontent3="";
    	String aftcontent3="";
    	String precontent4="";
    	String aftcontent4="";
    	String precontent5="";
    	String aftcontent5="";
    	String precontent6="";
    	String aftcontent6="";
    	String precontent7="";
    	String aftcontent7="";
    	
    	String precontent8="";
    	String aftcontent8="";
    	String precontent9="";
    	String aftcontent9="";
    	String precontent10="";
    	String aftcontent10="";
    	String precontent11="";
    	String aftcontent11="";
    	String precontent12="";
    	String aftcontent12="";
    	String precontent13="";
    	String aftcontent13="";
    	String precontent14="";
    	String aftcontent14="";
    	String precontent15="";
    	String aftcontent15="";
    	String precontent16="";
    	String aftcontent16="";
    	String precontent17="";
    	String aftcontent17="";
    	String precontent18="";
    	String aftcontent18="";
    	String precontent19="";
    	String aftcontent19="";
    	String precontent20="";
    	String aftcontent20="";
    	String precontent21="";
    	String aftcontent21="";
    	String precontent22="";
    	String aftcontent22="";
    	String precontent23="";
    	String aftcontent23="";
    	String precontent24="";
    	String aftcontent24="";
    	String precontent25="";
    	String aftcontent25="";
    	String precontent26="";
    	String aftcontent26="";
    	String precontent27="";
    	String aftcontent27="";
    	String precontent28="";
    	String aftcontent28="";
    	String precontent29="";
    	String aftcontent29="";
    	String precontent30="";
    	String aftcontent30="";
    	String precontent31="";
    	String aftcontent31="";
    	String precontent32="";
    	String aftcontent32="";
    	String precontent33="";
    	String aftcontent33="";
    	String precontent34="";
    	String aftcontent34="";
    	String precontent35="";
    	String aftcontent35="";
    	String precontent36="";
    	String aftcontent36="";
    	String precontent37="";
    	String aftcontent37="";
    	
    	System.out.println(C_name);
    	System.out.println("PreDi_info"+PreDi_info);
    	System.out.println("Co_category"+Co_category);
    	System.out.println("Co_category"+Co_category);
    	
        if(!PreC_phone.equals(C_phone)){
       	 precontent1="/原销售地区:"+PreC_phone+"";
            aftcontent1="/现销售地区:"+C_phone+"";
        } if(!PreC_name.equals(C_name)){
            precontent2="/原客户名称:"+PreC_name+"";
            aftcontent2="/现客户名称:"+C_name+"";
            
            
        } if(!PreDi_info.equals(Di_info)){
            precontent3="/原产品代理咨询信息:"+PreDi_info+"";
            aftcontent3="/现产品代理咨询信息:"+Di_info+"";
        } if(!PreQ_info.equals(Q_info)){
            precontent4="/原个人咨询信息:"+PreQ_info+"";
            aftcontent4="/现个人咨询信息:"+Q_info+"";
        } if(!PreP_info.equals(P_info)){
            precontent5="/原个人购买信息:"+PreP_info+"";
            aftcontent5="/现个人购买信息:"+P_info+"";
        
        } if(!PreCo_deliver.equals(Co_deliver)){
            precontent8="/原经销商信息:"+PreCo_deliver +"";
            aftcontent8="/现经销商信息:"+Co_deliver+"";
        } 
        if(!PreCo_info.equals(Co_info)){
            precontent37="/原产品信息:"+PreCo_info+"";
            aftcontent37="/现产品信息："+Co_info+"";
        }
        if(!PreCo_category.equals(Co_category)){
            precontent9="/原投诉类别:"+PreCo_category+"";
            aftcontent9="/现投诉类别:"+Co_category+"";
        } if(!PreCo_result.equals(Co_result)){
            precontent10="/原投诉处理结果:"+PreCo_result+"";
            aftcontent10="/现投诉处理结果:"+Co_result+"";
        } if(!PreCo_department.equals(Co_department)){
            precontent11="/原用药单位:"+PreCo_department+"";
            aftcontent11="/现用药单位:"+Co_department+"";
        } if(!PreCo_dealer.equals(Co_dealer)){
            precontent12="/原转交部门:"+PreCo_dealer+"";
            aftcontent12="/现转交部门:"+Co_dealer+"";
        } if(!PreCo_replay.equals(Co_replay)){
            precontent13="/原投诉回复:"+PreCo_replay+"";
            aftcontent13="/现投诉回复:"+Co_replay+"";
        } if(!PreCo_replenish.equals(Co_replenish)){
            precontent14="/原补货信息:"+PreCo_replenish+"";
            aftcontent14="/现补货信息:"+Co_replenish+"";
        }	if(!PreDa_info.equals(Da_info)){
            precontent15="/原具体内容信息:"+PreDa_info+"";
            aftcontent15="/现具体内容信息:"+Da_info+"";
        } if(!PreRe_name.equals(Re_name)){
            precontent16="/原患者姓名:"+PreRe_name+"";
            aftcontent16="/现患者姓名:"+Re_name+"";
        }if(!PreRe_age.equals(Re_age)){
            precontent17="/原年龄:"+PreRe_age+"";
            aftcontent17="/现年龄:"+Re_age+"";
        } if(!PreRe_weight.equals(Re_weight)){
            precontent18="/原体重:"+PreRe_weight+"";
            aftcontent18="/现体重:"+Re_weight+"";
        }	if(!PreRe_reactionN.equals(Re_reactionN)){
            precontent19="/原不良反应/事件名称:"+PreRe_reactionN+"";
            aftcontent19="/现不良反应/事件名称:"+Re_reactionN+"";
        } if(!PreRe_timeM.equals(Re_timeM)){
            precontent20="/原用药起止时间:"+PreRe_timeM+"";
            aftcontent20="/现用药起止时间:"+Re_timeM+"";
        }if(!PreRe_time.equals(Re_time)){
            precontent21="/原不良反应/事件发生时间:"+PreRe_time+"";
            aftcontent21="/现不良反应/事件发生时间:"+Re_time+"";
        }if(!PreRe_number.equals(Re_number)){
            precontent22="/原生产批号:"+PreRe_number+"";
            aftcontent22="/现生产批号:"+Re_number+"";
        }if(!PreRe_family.equals(Re_family)){
            precontent23="/原家族药品不良反应/事件:"+PreRe_family+"";
            aftcontent23="/现家族药品不良反应/事件:"+Re_family+"";
        }if(!PreRe_others.equals(Re_others)){
            precontent24="/原其他:"+PreRe_others+"";
            aftcontent24="/现其他:"+Re_others+"";
        }if(!PreRe_case.equals(Re_case)){
            precontent25="/原病历号/门诊号:"+PreRe_case+"";
            aftcontent25="/现病历号/门诊号:"+Re_case+"";
        }if(!PreRe_sex.equals(Re_sex)){
            precontent26="/原性别:"+PreRe_sex+"";
            aftcontent26="/现性别:"+Re_sex+"";
        }if(!PreRe_nation.equals(Re_nation)){
            precontent27="/原民族:"+PreRe_nation+"";
            aftcontent27="/现民族:"+Re_nation+"";
        }if(!PreRe_disease.equals(Re_disease)){
            precontent28="/原原患病情:"+PreRe_disease+"";
            aftcontent28="/现原患病情:"+Re_disease+"";
        }if(!PreRe_reactionD.equals(Re_reactionD)){
            precontent29="/原不良反应/事件过程描述:"+PreRe_reactionD+"";
            aftcontent29="/现不良反应/事件过程描述:"+Re_reactionD+"";
        }if(!PreRe_use.equals(Re_use)){
            precontent30="/原用法用量:"+PreRe_use+"";
            aftcontent30="/现用法用量:"+Re_use+"";
        }if(!PreRe_result.equals(Re_result)){
            precontent31="/原不良反应/事件的结果:"+PreRe_result+"";
            aftcontent31="/现不良反应/事件的结果:"+Re_result+"";
        }if(!PreRe_merge.equals(Re_merge)){
            precontent32="/原合并用药品情况:"+PreRe_merge+"";
            aftcontent32="/现合并用药品情况:"+Re_merge+"";
        }if(!PreRe_reactionP.equals(Re_reactionP)){
            precontent33="/原既往药品不良反应/事件:"+PreRe_reactionP+"";
            aftcontent33="/现既往药品不良反应/事件:"+Re_reactionP+"";
        }if(!PreRe_hospital.equals(Re_hospital)){
            precontent34="/原医院名称:"+PreRe_hospital+"";
            aftcontent34="/现医院名称:"+Re_hospital+"";
        }if(!PreRe_phone.equals(Re_phone)){
            precontent35="/原联系方式:"+PreRe_phone+"";
            aftcontent35="/现联系方式:"+Re_phone+"";
        }if(!PreO_info.equals(O_info)){
            precontent36="/原具体内容信息:"+PreO_info+"";
            aftcontent36="/现具体内容信息:"+O_info+"";
        }
        
        //用C_id来作为序号用于区分具体客户服务管理的修改，便于查询
        precontent="ID:"+PreC_id+"||药品名称:"+M_name1+""+precontent1+""+precontent2+""+precontent3+""+precontent4+""+precontent5+""+precontent6+""+precontent7+""+precontent8+""+precontent37+""+precontent9+""+precontent10+""+precontent11+""+precontent12+""+precontent13+""+precontent14+""+precontent15+""+precontent16+""+precontent17+""+precontent18+""+precontent19+""+precontent20+""+precontent21+""+precontent22+""+precontent23+""+precontent24+""+precontent25+""+precontent26+""+precontent27+""+precontent28+""+precontent29+""+precontent30+""+precontent31+""+precontent32+""+precontent33+""+precontent34+""+precontent35+""+precontent36+"";
        aftcontent="ID:"+C_id+"||药品名称:"+M_name1+""+aftcontent1+""+aftcontent2+""+aftcontent3+""+aftcontent4+""+aftcontent5+""+aftcontent6+""+aftcontent7+""+aftcontent8+""+aftcontent37+""+aftcontent9+""+aftcontent10+""+aftcontent11+""+aftcontent12+""+aftcontent13+""+aftcontent14+""+aftcontent15+""+aftcontent16+""+aftcontent17+""+aftcontent18+""+aftcontent19+""+aftcontent20+""+aftcontent21+""+aftcontent22+""+aftcontent23+""+aftcontent24+""+aftcontent25+""+aftcontent26+""+aftcontent27+""+aftcontent28+""+aftcontent29+""+aftcontent30+""+aftcontent31+""+aftcontent32+""+aftcontent33+""+aftcontent34+""+aftcontent35+""+aftcontent36+"";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
    	C_Date=sdf.format(new Date());
    	System.out.println(C_Date);
        String sql2="select C_id from districtinfo where C_id="+C_id+"";
        String sql3="select Q_id from query where Q_id="+C_id+"";
        String sql4="select P_id from purchaseinfo where P_id="+C_id+"";
        String sql5="select Co_id from complain where Co_id="+C_id+"";
        String sql6="select Da_id from department where Da_id="+C_id+"";
        String sql7="select Re_id from reaction where Re_id="+C_id+"";
        String sql8="select O_id from others where O_id="+C_id+"";
        
		 ResultSet re2=db2.doQuery(sql2);
		 ResultSet re3=db3.doQuery(sql3);
		 ResultSet re4=db4.doQuery(sql4);
		 ResultSet re5=db5.doQuery(sql5);
		 ResultSet re6=db6.doQuery(sql6);
		 ResultSet re7=db7.doQuery(sql7);
		 ResultSet re8=db8.doQuery(sql8);
		 
		  
        if (re2.next()){
        	
        	sql="update client,districtinfo set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',Di_info='"+Di_info+"',C_info='"+Di_info+"'where districtinfo.C_id="+C_id+" and client.C_id=districtinfo.C_id";
        }if (re3.next()){
        	sql="update client,query set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',Q_info='"+Q_info+"',C_info='"+Q_info+"'where query.Q_id="+C_id+" and client.C_id=query.Q_id";
        }if (re4.next()){
        	sql="update client,purchaseinfo set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',P_info='"+P_info+"',C_info='"+P_info+"'where purchaseinfo.P_id="+C_id+" and client.C_id=purchaseinfo.P_id";
        }if (re5.next()){
        	sql="update client,complain set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',Co_info='"+Co_info+"',Co_department='"+Co_department+"',Co_deliver='"+Co_deliver+"',Co_dealer='"+Co_dealer+"',Co_category='"+Co_category+"',Co_replay='"+Co_replay+"',Co_result='"+Co_result+"',Co_replenish='"+Co_replenish+"' where complain.Co_id="+C_id+" and client.C_id=complain.Co_id";
        }if (re6.next()){
        	sql="update client,department set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',Da_info='"+Da_info+"',C_info='"+Da_info+"'where department.Da_id="+C_id+" and client.C_id=department.Da_id";
        }if (re7.next()){
        	sql="update client,reaction set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',Re_name='"+Re_name+"',Re_sex='"+Re_sex+"',Re_age='"+Re_age+"',Re_nation='"+Re_nation+"',Re_weight='"+Re_weight+"',Re_disease='"+Re_disease+"',Re_reactionN='"+Re_reactionN+"',Re_reactionD='"+Re_reactionD+"',Re_timeM='"+Re_timeM+"',Re_use='"+Re_use+"',Re_time='"+Re_time+"',Re_result='"+Re_result+"',Re_number='"+Re_number+"',Re_merge='"+Re_merge+"',Re_family='"+Re_family+"',Re_reactionP='"+Re_reactionP+"',Re_others='"+Re_others+"',Re_hospital='"+Re_hospital+"',Re_case='"+Re_case+"',Re_phone='"+Re_phone+"'where reaction.Re_id="+C_id+" and client.C_id=reaction.Re_id";
        }if (re8.next()){
        	sql="update client,others set C_name='"+C_name+"',C_phone='"+C_phone+"',C_province='"+C_province+"',C_Date='"+C_Date+"',O_info='"+O_info+"',C_info='"+O_info+"'where others.O_id="+C_id+" and client.C_id=others.O_id";
        }
    	
    	
    	
    	//sql = "update client,districtinfo,query,purchaseinfo,complain,department,reaction,others set C_name='"+C_name+"',C_phone='"+C_phone+"',C_Date='"+C_Date+"',Di_info='"+Di_info+"',Q_info='"+Q_info+"',P_info='"+P_info+"',Co_info='"+Co_info+"',Co_department='"+Co_department+"',Co_deliver='"+Co_deliver+"',Co_dealer='"+Co_dealer+"',Co_category='"+Co_category+"',Co_replay='"+Co_replay+"',Co_result='"+Co_result+"',Co_replenish='"+Co_replenish+"',Da_info='"+Da_info+"', Re_name='"+Re_name+"',Re_sex='"+Re_sex+"',Re_age='"+Re_age+"',Re_nation='"+Re_nation+"',Re_weight='"+Re_weight+"',Re_disease='"+Re_disease+"',Re_reactionN='"+Re_reactionN+"',Re_reactionD='"+Re_reactionD+"',Re_timeM='"+Re_timeM+"',Re_use='"+Re_use+"',Re_time='"+Re_time+"',Re_result='"+Re_result+"',Re_number='"+Re_number+"',Re_merge='"+Re_merge+"',Re_family='"+Re_family+"',Re_reactionP='"+Re_reactionP+"',Re_others='"+Re_others+"',Re_hospital='"+Re_hospital+"',Re_case='"+Re_case+"',Re_phone='"+Re_phone+"',O_info='"+O_info+"' where client.C_id="+C_id+";";//where client.
    	db.doUpdate(sql);
    	System.out.println(sql);
    	//执行SQL 插入worklog命令修改记录  id自增不填  
     	String sqlWorkLog="insert into worklog (operator,precontent,aftcontent,time,location,action) values ('"+operator+"','"+precontent+"','"+aftcontent+"','"+time+"','管理服务记录','修改')";
     	db.doUpdate(sqlWorkLog);
     	
     	if(PreC_phone==""){
    		PreC_phone=null;
    	}if(PreC_name==""){
    		PreC_name=null;
    	}if(PreDi_info==""){
    		PreDi_info=null;
    	}if(PreQ_info==""){
    		PreQ_info=null;
    	}if(PreP_info==""){
    		PreP_info=null;
    	
    	}if(PreCo_deliver==""){
    		PreCo_deliver=null;
    	}if(PreCo_info==""){
    		PreCo_info=null;
    	}if(PreCo_category==""){
    		PreCo_category=null;
    	}if(PreCo_result==""){
    		PreCo_result=null;
    	}if(PreCo_department==""){
    		PreCo_department=null;
    	}if(PreCo_dealer==""){
    		PreCo_dealer=null;
    	}if(PreCo_replay==""){
    		PreCo_replay=null;
    	}if(PreCo_replenish==""){
    		PreCo_replenish=null;
    	}if(PreDa_info==""){
    		PreDa_info=null;
    	}if(PreRe_name==""){
    		PreRe_name=null;
    	}if(PreRe_age==""){
    		PreRe_age=null;
    	}if(PreRe_weight==""){
    		PreRe_weight=null;
    	}if(PreRe_reactionN==""){
    		PreRe_reactionN=null;
    	}if(PreRe_timeM==""){
    		PreRe_timeM=null;
    	}if(PreRe_time==""){
    		PreRe_time=null;
    	}if(PreRe_number==""){
    		PreRe_number=null;
    	}if(PreRe_family==""){
    		PreRe_family=null;
    	}if(PreRe_others==""){
    		PreRe_others=null;
    	}if(PreRe_case==""){
    		PreRe_case=null;
    	}if(PreRe_sex==""){
    		PreRe_sex=null;
    	}if(PreRe_nation==""){
    		PreRe_nation=null;
    	}if(PreRe_disease==""){
    		PreRe_disease=null;
    	}if(PreRe_reactionD==""){
    		PreRe_reactionD=null;
    	}if(PreRe_use==""){
    		PreRe_use=null;
    	}if(PreRe_result==""){
    		PreRe_result=null;
    	}if(PreRe_merge==""){
    		PreRe_merge=null;
    	}if(PreRe_reactionP==""){
    		PreRe_reactionP=null;
    	}if(PreRe_hospital==""){
    		PreRe_hospital=null;
    	}if(PreRe_phone==""){
    		PreRe_phone=null;
    	}if(PreO_info==""){
    		PreO_info=null;
    	}

   
}
db.close();//清理数据库模型对象
System.out.println("修改日志记录————————");
   //返回SUCCESS，表示客户端跳转到Action的success结果视图
   //结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
   return SUCCESS;
    
    	
    }  


    
    public String admin_clientAdmin() throws Exception{
    	return SUCCESS;
    }
    public String admin_clientEdit() throws Exception{
    	return SUCCESS;
    }
    
  /*  
 
public List<newClient> getClient2() throws Exception {
        
    	allClient2 = new ArrayList<newClient>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        String M_name=client.getM_name();
        int C_id =client.getC_id();
        
        
        
        ResultSet rs = db.doQuery("SELECT client.*,districtinfo.*,query.*,purchaseinfo.*,medicinequery.*,complain.*,department.*,reaction.*,others.* FROM client,districtinfo,query,purchaseinfo,medicinequery,complain,department,reaction,others WHERE client.C_id="+C_id+" and client.C_id=districtinfo.C_id and client.C_id=query.Q_id and client.C_id=purchaseinfo.P_id and client.C_id=medicinequery.MD_id and client.C_id=complain.Co_id and client.C_id=department.Da_id and client.C_id=reaction.Re_id and  client.C_id=others.O_id;");//执行查询，返回新闻栏目记录
  
       
    	
    	String C_phone;
    	String C_name;
    	String C_districtinfo;
    	String C_query;
    	String C_purchase;
    	String C_medicinequery;
    	String C_complain;
    	String C_department;
    	String C_reaction;
    	String C_other;
    	String C_Date;

    	int Di_id;
    	String Di_info;
    	int Q_id;
    	String Q_info;
    	int P_id;
    	String P_info;
    	int MQ_id;
    	String MQ_info;
    	int Co_id;
        String Co_info;
        String Co_department;
        String Co_deliver;
        String Co_dealer;
        String Co_category;
        String Co_replay;
        String Co_result;
        String Co_replenish; 
    	int Da_id;
    	String Da_info;
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
    	int O_id;
    	String O_info;
    	String Di_name;
    	String Di_district;
    
while (rs.next()) {
    		  
        	 C_id=rs.getInt("C_id");
        	 
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");       		
        	 C_districtinfo = rs.getString("C_districtinfo");       	
        	 C_query = rs.getString("C_query");        	
        	 C_purchase = rs.getString("C_purchase");        	
        	 C_medicinequery = rs.getString("C_medicinequery");        	
        	 C_complain = rs.getString("C_complain");
       
        	 C_department = rs.getString("C_department");
     
        	 C_reaction = rs.getString("C_reaction");
        	 C_other = rs.getString("C_other");
        	 C_Date = rs.getString("C_Date");
        	
        	 
        	  Di_id=rs.getInt("C_id");
        	 	
         	Di_info=rs.getString("info");
            Di_name=rs.getString("M_name1");
        	Di_district=rs.getString("D_district");
         	Q_id=rs.getInt("Q_id");
         	
         	
         	Q_info=rs.getString("Q_info");
         	P_id=rs.getInt("P_id");
        
         	P_info=rs.getString("P_info");
         	MQ_id=rs.getInt("MD_id");
         	MQ_info=rs.getString("MD_info");
        	
            Co_id=rs.getInt("Co_id");
              Co_info=rs.getString("Co_info");
              Co_department=rs.getString("Co_department");
       
              Co_deliver=rs.getString("Co_deliver");
              Co_dealer=rs.getString("Co_dealer");
              Co_category=rs.getString("Co_category");
              Co_replay=rs.getString("Co_replay");
              Co_result=rs.getString("Co_result");
             Co_replenish=rs.getString("Co_replenish");
           
         	 Da_id=rs.getInt("Da_id");
         	 Da_info=rs.getString("Da_info");
             Re_id=rs.getInt("Re_id");
             Re_name=rs.getString("Re_name");
             Re_sex=rs.getString("Re_sex");
             Re_age=rs.getString("Re_age");
             Re_nation=rs.getString("Re_nation");
             Re_weight=rs.getString("Re_weight");
             Re_disease=rs.getString("Re_disease");
             Re_reactionN=rs.getString("Re_reactionN");
             Re_reactionD=rs.getString("Re_reactionD");
             Re_timeM=rs.getString("Re_timeM");
              Re_use=rs.getString("Re_use");
             Re_time=rs.getString("Re_time");
             Re_result=rs.getString("Re_result");
             Re_number=rs.getString("Re_number");
             Re_merge=rs.getString("Re_merge");
             Re_family=rs.getString("Re_family");
             Re_reactionP=rs.getString("Re_reactionP");
             Re_others=rs.getString("Re_others");
             Re_hospital=rs.getString("Re_hospital");
             Re_case=rs.getString("Re_case");
             Re_phone=rs.getString("Re_phone");
         	O_id=rs.getInt("O_id");
         	O_info=rs.getString("O_info");
        	 
        
        	
        
        	allClient2.add(new newClient(C_id,M_name,C_name,C_phone,C_districtinfo,C_query,C_purchase,C_medicinequery,C_complain,C_department,C_reaction,C_other,C_Date,
        			 Di_id,Di_info,Di_name,Di_district,Q_id,Q_info,P_id,P_info,MQ_id,MQ_info,Co_id,Co_info,Co_department,Co_deliver,Co_dealer,
        			 Co_category,Co_replay,Co_result,Co_replenish,Da_id,Da_info,Re_id, Re_name,Re_sex,Re_age,Re_nation,Re_weight,Re_disease,Re_reactionN,Re_reactionD,Re_timeM,Re_use
        			 ,Re_time,Re_result,Re_number,Re_merge,Re_family,Re_reactionP,Re_others,Re_hospital,Re_case,Re_phone,O_id,O_info));//创建新闻栏目对象，加入列表对象
        	
        }
        System.out.println("allClient2");
        System.out.println(allClient2.get(0).getM_name());
        db.close();//清理数据库模型对象
        return allClient2;
    }


*/

    public static String admin_MonthoutPut2(HttpServletResponse response) throws Exception {
        try {
            WritableWorkbook wwb = null;
             
               // 创建可写入的Excel工作簿
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
            String C_Date=sdf.format(new Date());
               String fileName = "D://a//book"+C_Date+".xls";
               File file=new File(fileName);
               if (!file.exists()) {
                   file.createNewFile();
               }
               response.setContentType("application/msexcel; charset=gb2312");
               // filename = new String(filename.getBytes(), "ISO8859_1");
                //response.setHeader("Content-disposition", "attachment; filename="
                //        + filename);
                response.setHeader("Content-disposition", "inline; filename="
                      + C_Date+".xls");
                OutputStream os = response.getOutputStream();
               //以fileName为文件名来创建一个Workbook
               wwb = Workbook.createWorkbook(os);

               // 创建工作表
               WritableSheet ws = wwb.createSheet("Test Shee 1", 0);
               
               List<newClient> List=getMClient();
               
               //查询数据库中所有的数据
                
               HttpServletRequest request=ServletActionContext.getRequest();
         	    String User=(String) request.getSession().getAttribute("username");
               
               //要插入到的Excel表格的行号，默认从0开始
               Label labelstatus= new Label(0, 0, "序号");
               Label labelaccount= new Label(1, 0, "受理工号");
               Label labeldate= new Label(2, 0, "受理日期和时间");
             
               Label labelC_name= new Label(3, 0, "客户姓名");
               Label labelC_phone= new Label(4, 0, "客户电话");
               
               Label labelC_province= new Label(5, 0, "省份");
               Label labelproperty= new Label(6, 0, "客服服务性质");
               Label labeldistrictinfo= new Label(7, 0, "销售公司");
               Label labelM_name= new Label(8, 0, "药品名称");
               Label labelC_info= new Label(9, 0, "受理内容");
               Label labelC_others= new Label(10, 0, "投诉信息");
               Label labelC_others2= new Label(11, 0, "不良反应");
               ws.addCell(labelC_others);
               ws.addCell(labelC_others2);
               
               
               ws.addCell(labelstatus);
               ws.addCell(labelaccount);
               ws.addCell(labeldate);
               ws.addCell(labelC_name);
               ws.addCell(labelC_phone);
               ws.addCell(labelC_province);
               ws.addCell(labelproperty);
               ws.addCell(labeldistrictinfo);
               ws.addCell(labelM_name);
               ws.addCell(labelC_info);
  
               for (int i = 0; i < List.size(); i++) {

            	   Label labelId_i= new Label(0, i+1, List.get(i).getC_id()+"");
            	   Label labelAccount_i= new Label(1, i+1, List.get(i).getC_user()+"");
            	   Label labelDate_i= new Label(2, i+1, List.get(i).getC_Date()+"");
            	   Label labelC_name_i= new Label(3, i+1, List.get(i).getC_name()+"");
            	   Label labelC_iphone_i= new Label(4, i+1, List.get(i).getC_phone()+"");
            	   Label labelC_province_i= new Label(5, i+1, List.get(i).getC_Province()+"");
            	   Label labelproperty_i= new Label(6, i+1, List.get(i).getProperty()+"");
            	   Label labeldistrictinfo_i= new Label(7, i+1, List.get(i).getC_district()+"");
            	   Label labelM_name_i= new Label(8, i+1, List.get(i).getM_name()+"");
            	   Label labelC_info_i= new Label(9, i+1, List.get(i).getC_info()+"");
               
            	   
            	   Label labelC_others_i=new Label(10, i+1,"");;
            	   Label labelC_others2_i= new Label(11, i+1, "");
            	   
            	   if(List.get(i).getProperty()=="投诉"){
            	    labelC_others_i= new Label(10, i+1, "产品信息：" +List.get(i).getCo_info()+" 用药单位："+List.get(i).getCo_department()+" 经销商信息:"+List.get(i).getCo_dealer()+" 投诉类别:"+List.get(i).getCo_category()+" 转交部门:"+List.get(i).getCo_deliver()+" 投诉回复:"+List.get(i).getCo_replay()+ " 投诉处理结果:"+ List.get(i).getCo_result()+" 补货信息:"+List.get(i).getCo_replenish());
            	   }else if(List.get(i).getProperty()=="不良反应"){
            	   labelC_others2_i= new Label(11, i+1, " 患者姓名：" +List.get(i).getRe_name()+" 性别：" +List.get(i).getRe_sex()+" 年龄："+List.get(i).getRe_age()+" 民族："+List.get(i).getRe_nation()+" 体重："+List.get(i).getRe_weight()+" 原患疾病："+List.get(i).getRe_disease()+" 不良反应/事件名称："+List.get(i).getRe_reactionN()+ " 不良反应/事件过程描述："+ List.get(i).getRe_reactionD()+" 用药起止时间："+List.get(i).getRe_timeM()+" 用法用量：" +List.get(i).getRe_use()+" 不良反应/事件发生时间：" +List.get(i).getRe_time()+" 不良反应/时间结果： "+List.get(i).getRe_result()+" 生产批号："+List.get(i).getRe_number()+" 合并用药情况："+List.get(i).getRe_merge()+" 家族药品不良反应/事件："+List.get(i).getRe_family()+" 既往药品不良反应/事件："+List.get(i).getRe_reactionP()+ " 其他："+ List.get(i).getRe_others()+" 医院名称："+List.get(i).getRe_hospital()+ " 病历号/门诊号："+ List.get(i).getRe_case()+" 联系方式："+List.get(i).getRe_phone());
            	   }
            	   ws.addCell(labelC_others_i); 
            	  
            	   ws.addCell(labelC_others2_i);
            	   
            	   
            	   ws.addCell(labelId_i);
            	   ws.addCell(labelAccount_i);
            	   ws.addCell(labelDate_i);
            	   ws.addCell(labelC_name_i);
            	   ws.addCell(labelC_iphone_i);
            	   ws.addCell(labelC_province_i);
            	   ws.addCell(labeldistrictinfo_i);
            	   ws.addCell(labelM_name_i);
            	   ws.addCell(labelC_info_i);
            	   ws.addCell(labelproperty_i);
            	 
            	   
            	   
            	   
               
               }
               
         
             
              //写进文档
               wwb.write();
              // 关闭Excel工作簿对象
               wwb.close();
             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        return SUCCESS;
    }
    
    public static String admin_YearoutPut2(HttpServletResponse response) throws Exception {
        try {
            WritableWorkbook wwb = null;
             
               // 创建可写入的Excel工作簿
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
            String C_Date=sdf.format(new Date());
               String fileName = "D://a//book"+C_Date+".xls";
               File file=new File(fileName);
               if (!file.exists()) {
                   file.createNewFile();
               }
               
               response.setContentType("application/msexcel; charset=gb2312");
               // filename = new String(filename.getBytes(), "ISO8859_1");
                //response.setHeader("Content-disposition", "attachment; filename="
                //        + filename);
                response.setHeader("Content-disposition", "inline; filename=海正药业"
                		+C_Date+".xls");
                OutputStream os = response.getOutputStream();
               //以fileName为文件名来创建一个Workbook
               wwb = Workbook.createWorkbook(os);

               // 创建工作表
               WritableSheet ws = wwb.createSheet("Test Shee 1", 0);
               
               List<newClient> List=getYClient();
               
               //查询数据库中所有的数据
                
               HttpServletRequest request=ServletActionContext.getRequest();
         	    String User=(String) request.getSession().getAttribute("username");
               
               //要插入到的Excel表格的行号，默认从0开始
               Label labelstatus= new Label(0, 0, "序号");
               Label labelaccount= new Label(1, 0, "受理工号");
               Label labeldate= new Label(2, 0, "受理日期和时间");
             
               Label labelC_name= new Label(3, 0, "客户姓名");
               Label labelC_phone= new Label(4, 0, "客户电话");
               
               Label labelC_province= new Label(5, 0, "省份");
               Label labelproperty= new Label(6, 0, "客服服务性质");
               Label labeldistrictinfo= new Label(7, 0, "销售公司");
               Label labelM_name= new Label(8, 0, "药品名称");
               Label labelC_info= new Label(9, 0, "受理内容");
               Label labelC_others= new Label(10, 0, "投诉信息");
               Label labelC_others2= new Label(11, 0, "不良反应");
               ws.addCell(labelC_others);
               ws.addCell(labelC_others2);
               ws.addCell(labelstatus);
               ws.addCell(labelaccount);
               ws.addCell(labeldate);
               ws.addCell(labelC_name);
               ws.addCell(labelC_phone);
               ws.addCell(labelC_province);
               ws.addCell(labelproperty);
               ws.addCell(labeldistrictinfo);
               ws.addCell(labelM_name);
               ws.addCell(labelC_info);
  
               for (int i = 0; i < List.size(); i++) {

            	   Label labelId_i= new Label(0, i+1, List.get(i).getC_id()+"");
            	   Label labelAccount_i= new Label(1, i+1, List.get(i).getC_user()+"");
            	   Label labelDate_i= new Label(2, i+1, List.get(i).getC_Date()+"");
            	   Label labelC_name_i= new Label(3, i+1, List.get(i).getC_name()+"");
            	   Label labelC_iphone_i= new Label(4, i+1, List.get(i).getC_phone()+"");
            	   Label labelC_province_i= new Label(5, i+1, List.get(i).getC_Province()+"");
            	   Label labelproperty_i= new Label(6, i+1, List.get(i).getProperty()+"");
            	   Label labeldistrictinfo_i= new Label(7, i+1, List.get(i).getC_district()+"");
            	   Label labelM_name_i= new Label(8, i+1, List.get(i).getM_name()+"");
            	   Label labelC_info_i= new Label(9, i+1, List.get(i).getC_info()+"");
               
            	   
            	   Label labelC_others_i=new Label(10, i+1,"");;
            	   Label labelC_others2_i= new Label(11, i+1, "");
            	   
            	   if(List.get(i).getProperty()=="投诉"){
            	    labelC_others_i= new Label(10, i+1, "产品信息：" +List.get(i).getCo_info()+" 用药单位："+List.get(i).getCo_department()+" 经销商信息:"+List.get(i).getCo_dealer()+" 投诉类别:"+List.get(i).getCo_category()+" 转交部门:"+List.get(i).getCo_deliver()+" 投诉回复:"+List.get(i).getCo_replay()+ " 投诉处理结果:"+ List.get(i).getCo_result()+" 补货信息:"+List.get(i).getCo_replenish());
            	   }else if(List.get(i).getProperty()=="不良反应"){
            	   labelC_others2_i= new Label(11, i+1, " 患者姓名：" +List.get(i).getRe_name()+" 性别：" +List.get(i).getRe_sex()+" 年龄："+List.get(i).getRe_age()+" 民族："+List.get(i).getRe_nation()+" 体重："+List.get(i).getRe_weight()+" 原患疾病："+List.get(i).getRe_disease()+" 不良反应/事件名称："+List.get(i).getRe_reactionN()+ " 不良反应/事件过程描述："+ List.get(i).getRe_reactionD()+" 用药起止时间："+List.get(i).getRe_timeM()+" 用法用量：" +List.get(i).getRe_use()+" 不良反应/事件发生时间：" +List.get(i).getRe_time()+" 不良反应/时间结果： "+List.get(i).getRe_result()+" 生产批号："+List.get(i).getRe_number()+" 合并用药情况："+List.get(i).getRe_merge()+" 家族药品不良反应/事件："+List.get(i).getRe_family()+" 既往药品不良反应/事件："+List.get(i).getRe_reactionP()+ " 其他："+ List.get(i).getRe_others()+" 医院名称："+List.get(i).getRe_hospital()+ " 病历号/门诊号："+ List.get(i).getRe_case()+" 联系方式："+List.get(i).getRe_phone());
            	   }
            	   ws.addCell(labelC_others_i); 
            	  
            	   ws.addCell(labelC_others2_i);
            	   
            	   
            	   ws.addCell(labelId_i);
            	   ws.addCell(labelAccount_i);
            	   ws.addCell(labelDate_i);
            	   ws.addCell(labelC_name_i);
            	   ws.addCell(labelC_iphone_i);
            	   ws.addCell(labelC_province_i);
            	   ws.addCell(labeldistrictinfo_i);
            	   ws.addCell(labelM_name_i);
            	   ws.addCell(labelC_info_i);
            	   ws.addCell(labelproperty_i);
            	 
            	   
            	   
            	   
               
               }
               
         
             
              //写进文档
               wwb.write();
              // 关闭Excel工作簿对象
               wwb.close();
             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        return SUCCESS;
    }
    
    
    
    public static void admin_DayoutPut2(HttpServletResponse response) throws Exception {
        try {
        	  SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
              String C_Date=sdf.format(new Date());
                 String fileName = "D://a//book"+C_Date+".xls";
                 File file=new File(fileName);
                 if (!file.exists()) {
                     file.createNewFile();
                 }
                response.setContentType("application/msexcel; charset=gb2312");
               // filename = new String(filename.getBytes(), "ISO8859_1");
                //response.setHeader("Content-disposition", "attachment; filename="
                //        + filename);
                response.setHeader("Content-disposition", "inline; filename=海正药业"
                		+C_Date+".xls");
                OutputStream os = response.getOutputStream();
               // response.reset();
                //PrintWriter os = response.getWriter(); 
            WritableWorkbook wwb = null;
            WritableWorkbook wwb2= null;
               // 创建可写入的Excel工作簿
          
               //以fileName为文件名来创建一个Workbook
               wwb = Workbook.createWorkbook(os);
              // wwb2 = Workbook.createWorkbook(os);
               // 创建工作表
               WritableSheet ws = wwb.createSheet("Test Shee 1", 0);
               
               List<newClient> List=getDClient();
               
               //查询数据库中所有的数据
                
               HttpServletRequest request=ServletActionContext.getRequest();
          	    String User=(String) request.getSession().getAttribute("username");
               
               //要插入到的Excel表格的行号，默认从0开始
               Label labelstatus= new Label(0, 0, "序号");
               Label labelaccount= new Label(1, 0, "受理工号");
               Label labeldate= new Label(2, 0, "受理日期和时间");
             
               Label labelC_name= new Label(3, 0, "客户姓名");
               Label labelC_phone= new Label(4, 0, "客户电话");
               
               Label labelC_province= new Label(5, 0, "省份");
               Label labelproperty= new Label(6, 0, "客服服务性质");
               Label labeldistrictinfo= new Label(7, 0, "销售公司");
               Label labelM_name= new Label(8, 0, "药品名称");
               Label labelC_info= new Label(9, 0, "受理内容");
               Label labelC_others= new Label(10, 0, "投诉信息");
               Label labelC_others2= new Label(11, 0, "不良反应");
               ws.addCell(labelC_others);
               ws.addCell(labelC_others2);
               
               
               ws.addCell(labelstatus);
               ws.addCell(labelaccount);
               ws.addCell(labeldate);
               ws.addCell(labelC_name);
               ws.addCell(labelC_phone);
               ws.addCell(labelC_province);
               ws.addCell(labelproperty);
               ws.addCell(labeldistrictinfo);
               ws.addCell(labelM_name);
               ws.addCell(labelC_info);
               
               for (int i = 0; i < List.size(); i++) {

            	   Label labelId_i= new Label(0, i+1, List.get(i).getC_id()+"");
            	   Label labelAccount_i= new Label(1, i+1, List.get(i).getC_user()+"");
            	   Label labelDate_i= new Label(2, i+1, List.get(i).getC_Date()+"");
            	   Label labelC_name_i= new Label(3, i+1, List.get(i).getC_name()+"");
            	   Label labelC_iphone_i= new Label(4, i+1, List.get(i).getC_phone()+"");
            	   Label labelC_province_i= new Label(5, i+1, List.get(i).getC_Province()+"");
            	   Label labelproperty_i= new Label(6, i+1, List.get(i).getProperty()+"");
            	   Label labeldistrictinfo_i= new Label(7, i+1, List.get(i).getC_district()+"");
            	   Label labelM_name_i= new Label(8, i+1, List.get(i).getM_name()+"");
            	   Label labelC_info_i= new Label(9, i+1, List.get(i).getC_info()+"");
            	   
            	   
            	   Label labelC_others_i=new Label(10, i+1,"");;
            	   Label labelC_others2_i= new Label(11, i+1, "");
            	   
            	   if(List.get(i).getProperty()=="投诉"){
            	    labelC_others_i= new Label(10, i+1, "产品信息：" +List.get(i).getCo_info()+" 用药单位："+List.get(i).getCo_department()+" 经销商信息:"+List.get(i).getCo_dealer()+" 投诉类别:"+List.get(i).getCo_category()+" 转交部门:"+List.get(i).getCo_deliver()+" 投诉回复:"+List.get(i).getCo_replay()+ " 投诉处理结果:"+ List.get(i).getCo_result()+" 补货信息:"+List.get(i).getCo_replenish());
            	   }else if(List.get(i).getProperty()=="不良反应"){
            	   labelC_others2_i= new Label(11, i+1, " 患者姓名：" +List.get(i).getRe_name()+" 性别：" +List.get(i).getRe_sex()+" 年龄："+List.get(i).getRe_age()+" 民族："+List.get(i).getRe_nation()+" 体重："+List.get(i).getRe_weight()+" 原患疾病："+List.get(i).getRe_disease()+" 不良反应/事件名称："+List.get(i).getRe_reactionN()+ " 不良反应/事件过程描述："+ List.get(i).getRe_reactionD()+" 用药起止时间："+List.get(i).getRe_timeM()+" 用法用量：" +List.get(i).getRe_use()+" 不良反应/事件发生时间：" +List.get(i).getRe_time()+" 不良反应/时间结果： "+List.get(i).getRe_result()+" 生产批号："+List.get(i).getRe_number()+" 合并用药情况："+List.get(i).getRe_merge()+" 家族药品不良反应/事件："+List.get(i).getRe_family()+" 既往药品不良反应/事件："+List.get(i).getRe_reactionP()+ " 其他："+ List.get(i).getRe_others()+" 医院名称："+List.get(i).getRe_hospital()+ " 病历号/门诊号："+ List.get(i).getRe_case()+" 联系方式："+List.get(i).getRe_phone());
            	   }
            	   ws.addCell(labelC_others_i); 
            	  
            	   ws.addCell(labelC_others2_i);
            	   
            	   
            	   ws.addCell(labelId_i);
            	   ws.addCell(labelAccount_i);
            	   ws.addCell(labelDate_i);
            	   ws.addCell(labelC_name_i);
            	   ws.addCell(labelC_iphone_i);
            	   ws.addCell(labelC_province_i);
            	   ws.addCell(labeldistrictinfo_i);
            	   ws.addCell(labelM_name_i);
            	   ws.addCell(labelC_info_i);
            	   ws.addCell(labelproperty_i);
            	  

            	 
            	   
            	   
            	   
               
               }
               
         
             
              //写进文档
               wwb.write();
              // 关闭Excel工作簿对象
               wwb.close();
               os.flush();
               
           
               os.close();
             
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        System.out.println("end");
        
    }
    
    
    

public static String admin_outPut2(HttpServletResponse response) throws Exception {
            try {
            	
            	
            	
                WritableWorkbook wwb = null;
                 
                   // 创建可写入的Excel工作簿
                SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
                String C_Date=sdf.format(new Date());
                   String fileName = "D://a//book"+C_Date+"All.xls";
                   File file=new File(fileName);
                   if (!file.exists()) {
                       file.createNewFile();
                   }
                   response.setContentType("application/msexcel; charset=gb2312");
                   // filename = new String(filename.getBytes(), "ISO8859_1");
                    //response.setHeader("Content-disposition", "attachment; filename="
                    //        + filename);
                    response.setHeader("Content-disposition", "inline; filename=海正药业"
                    		+C_Date+".xls");
                    OutputStream os = response.getOutputStream();
                   //以fileName为文件名来创建一个Workbook
                   wwb = Workbook.createWorkbook(os);

                   // 创建工作表
                   WritableSheet ws = wwb.createSheet("Test Shee 1", 0);
                   
                   List<newClient> List=getAllClient2();
                   
                   //查询数据库中所有的数据
                    
                   //获取登陆名
           	    HttpServletRequest request=ServletActionContext.getRequest();
           	    String User=(String) request.getSession().getAttribute("username");
                   
                   //要插入到的Excel表格的行号，默认从0开始
                   Label labelstatus= new Label(0, 0, "序号");
                   Label labelaccount= new Label(1, 0, "受理工号");
                   Label labeldate= new Label(2, 0, "受理日期和时间");
                 
                   Label labelC_name= new Label(3, 0, "客户姓名");
                   Label labelC_phone= new Label(4, 0, "客户电话");
                   
                   Label labelC_province= new Label(5, 0, "省份");
                   Label labelproperty= new Label(6, 0, "客服服务性质");
                   Label labeldistrictinfo= new Label(7, 0, "销售公司");
                   Label labelM_name= new Label(8, 0, "药品名称");
                   Label labelC_info= new Label(9, 0, "受理内容");
                   Label labelC_others= new Label(10, 0, "投诉信息");
                   Label labelC_others2= new Label(11, 0, "不良反应");
                   ws.addCell(labelC_others);
                   ws.addCell(labelC_others2); 
                   
                   String a=List.get(0).getC_district();
                   
                   System.out.println("-------------------------"+a);
                   
                   ws.addCell(labelstatus);
                   ws.addCell(labelaccount);
                   ws.addCell(labeldate);
                   ws.addCell(labelC_name);
                   ws.addCell(labelC_phone);
                   ws.addCell(labelC_province);
                   ws.addCell(labelproperty);
                   ws.addCell(labeldistrictinfo);
                   ws.addCell(labelM_name);
                   ws.addCell(labelC_info);
                   
      
                   for (int i = 0; i < List.size(); i++) {

                	   Label labelId_i= new Label(0, i+1, List.get(i).getC_id()+"");
                	   Label labelAccount_i= new Label(1, i+1, List.get(i).getC_user()+"");//登陆用户名导出
                	   Label labelDate_i= new Label(2, i+1, List.get(i).getC_Date()+"");
                	   Label labelC_name_i= new Label(3, i+1, List.get(i).getC_name()+"");
                	   Label labelC_iphone_i= new Label(4, i+1, List.get(i).getC_phone()+"");
                	   Label labelC_province_i= new Label(5, i+1, List.get(i).getC_Province()+"");
                	   Label labelproperty_i= new Label(6, i+1, List.get(i).getProperty()+"");
                	   Label labeldistrictinfo_i= new Label(7, i+1, List.get(i).getC_district()+"");
                	   Label labelM_name_i= new Label(8, i+1, List.get(i).getM_name()+"");
                	   Label labelC_info_i= new Label(9, i+1, List.get(i).getC_info()+"");
                	   
                	   Label labelC_others_i=new Label(10, i+1,"");;
                	   Label labelC_others2_i= new Label(11, i+1, "");
                	   
                	   if(List.get(i).getProperty()=="投诉"){
                	    labelC_others_i= new Label(10, i+1, "产品信息：" +List.get(i).getCo_info()+" 用药单位："+List.get(i).getCo_department()+" 经销商信息:"+List.get(i).getCo_dealer()+" 投诉类别:"+List.get(i).getCo_category()+" 转交部门:"+List.get(i).getCo_deliver()+" 投诉回复:"+List.get(i).getCo_replay()+ " 投诉处理结果:"+ List.get(i).getCo_result()+" 补货信息:"+List.get(i).getCo_replenish());
                	   }else if(List.get(i).getProperty()=="不良反应"){
                	   labelC_others2_i= new Label(11, i+1, " 患者姓名：" +List.get(i).getRe_name()+" 性别：" +List.get(i).getRe_sex()+" 年龄："+List.get(i).getRe_age()+" 民族："+List.get(i).getRe_nation()+" 体重："+List.get(i).getRe_weight()+" 原患疾病："+List.get(i).getRe_disease()+" 不良反应/事件名称："+List.get(i).getRe_reactionN()+ " 不良反应/事件过程描述："+ List.get(i).getRe_reactionD()+" 用药起止时间："+List.get(i).getRe_timeM()+" 用法用量：" +List.get(i).getRe_use()+" 不良反应/事件发生时间：" +List.get(i).getRe_time()+" 不良反应/时间结果： "+List.get(i).getRe_result()+" 生产批号："+List.get(i).getRe_number()+" 合并用药情况："+List.get(i).getRe_merge()+" 家族药品不良反应/事件："+List.get(i).getRe_family()+" 既往药品不良反应/事件："+List.get(i).getRe_reactionP()+ " 其他："+ List.get(i).getRe_others()+" 医院名称："+List.get(i).getRe_hospital()+ " 病历号/门诊号："+ List.get(i).getRe_case()+" 联系方式："+List.get(i).getRe_phone());
                	   }
                	   ws.addCell(labelC_others_i); 
                	  
                	   ws.addCell(labelC_others2_i);
                	   
                	   ws.addCell(labelId_i);
                	   ws.addCell(labelAccount_i);
                	   ws.addCell(labelDate_i);
                	   ws.addCell(labelC_name_i);
                	   ws.addCell(labelC_iphone_i);
                	   ws.addCell(labelC_province_i);
                	   ws.addCell(labeldistrictinfo_i);
                	   ws.addCell(labelM_name_i);
                	   ws.addCell(labelC_info_i);
                	   ws.addCell(labelproperty_i);
                	   
                	   
                	   
                	   
                	   
                   
                   }
                   
             /*      
                   Label labeldinfo1= new Label(4, 1, "具体内容");
                   Label labelquery= new Label(3, 2, "个人咨询");
                   Label labeldinfo2= new Label(4, 2, "具体内容");
                   Label labelpurchase= new Label(3,3, "个人购买");
                   Label labeldinfo3= new Label(4, 3, "具体内容");
                   Label labelmedicinequery= new Label(3,4, "用药咨询");
                   Label labeldinfo4= new Label(4, 4, "具体内容");
                   
                   Label labelcomplain= new Label(3,4, "投诉");
                   Label labelCo_info= new Label(4, 5, "产品信息");
                   Label labelCo_department= new Label(4, 6, "用药单位");                 
                   Label labelCo_dealer= new Label(4, 7, "经销商信息");                
                   Label labelCo_category= new Label(4, 8, "投诉类别");
                   Label labelCo_deliver= new Label(4, 9, "转交部门");
                   Label labelCo_replay= new Label(4, 9, "投诉回复");                   
                   Label labelCo_result= new Label(4, 10, "投诉处理结果");
                   Label labelCo_replenish= new Label(4, 11, "补货信息");
                   Label labeldepartment= new Label(3,12, "药监部门");
                   Label labeldinfo5= new Label(4, 12, "具体内容");

                   Label labeldreaction= new Label(3,13, "不良反应");                
                   Label labelRe_name= new Label(4, 14, "患者姓名");
                   Label labelRe_sex= new Label(6, 14, "性别");               
                   Label labelRe_age= new Label(4, 15, "年龄");                   
                   Label labelRe_nation= new Label(6, 15, "民族");
                   Label labelRe_weight= new Label(4, 16, "体重");
                   Label labelRe_disease= new Label(6, 16, "原患疾病");                   
                   Label labelRe_reactionN= new Label(4, 17, "不良反应/事件名称");
                   Label labelRe_reactionD= new Label(4, 18, "不良反应/事件过程描述");                
                   Label labelRe_timeM= new Label(4, 19, "用药起止时间");
                   Label labelRe_use= new Label(4, 20, "用法用量");
                   Label labelRe_time= new Label(4, 21, "不良反应/事件发生时间");
                  
                   Label labelRe_result= new Label(4, 22, "不良反应/事件的结果");
                   Label labelRe_number= new Label(4, 23, "生产批号");
                   Label labelRe_merge= new Label(4, 24, "合并用药品情况");
                   Label labelRe_family= new Label(4, 25, "家族药品不良反应/事件");
                   Label labelRe_reactionP= new Label(6, 25, "既往药品不良反应/事件");                   
                   Label labelRe_others= new Label(4, 26, "其他");
                   Label labelRe_hospital= new Label(6, 26, "医院名称");
                   Label labelRe_case= new Label(4, 27, "病历号/门诊号");
                   Label labelRe_phone= new Label(6, 27, "联系方式");   
                   
                   Label labelothers= new Label(3, 28, "其它事项");
                   Label labelinfo6= new Label(4, 28, "具体内容");
         
                   
                   
                   ws.addCell(labelM_name);
                   ws.addCell(labelC_name);
                   ws.addCell(labelC_phone);
                   ws.addCell(labelRecord);
                   
                   ws.addCell(labeldistrictinfo);
                   ws.addCell(labeldinfo1);
                   
                   ws.addCell(labelquery);
                   ws.addCell(labeldinfo2);
                   
                   ws.addCell(labelmedicinequery);
                   ws.addCell(labeldinfo3);
                   
                   ws.addCell(labelpurchase);
                   ws.addCell(labeldinfo4);
                   
                   ws.addCell(labelcomplain);
                   ws.addCell(labelCo_info);
                   ws.addCell(labelCo_department);
                   ws.addCell(labelCo_dealer);
                   ws.addCell(labelCo_category);
                   ws.addCell(labelCo_deliver);
                   ws.addCell(labelCo_replay);
                   ws.addCell(labelCo_result);
                   ws.addCell(labelCo_replenish);
                   
                   ws.addCell(labeldepartment);
                   ws.addCell(labeldinfo5);
              
                   ws.addCell(labeldreaction);
                   ws.addCell(labelRe_name);
                   ws.addCell(labelRe_sex);
                   ws.addCell(labelRe_age);
                   ws.addCell(labelRe_nation);
                   ws.addCell(labelRe_weight);
                   ws.addCell(labelRe_disease);
                   ws.addCell(labelRe_reactionN);
                   ws.addCell(labelRe_reactionD);
                   ws.addCell(labelRe_timeM);
                   ws.addCell(labelRe_use);
                   ws.addCell(labelRe_time);
                   ws.addCell(labelRe_result);
                   ws.addCell(labelRe_number);
                   ws.addCell(labelRe_merge);
                   ws.addCell(labelRe_family);
                   ws.addCell(labelRe_reactionP);
                   ws.addCell(labelRe_others);
                   ws.addCell(labelRe_hospital);
                   ws.addCell(labelRe_case);
                   ws.addCell(labelRe_phone);
                   
                   ws.addCell(labelothers);
                   ws.addCell(labelinfo6);
                 //  getClient2();
                   
                   System.out.println(allClient2.get(0).getM_name());
                   Label labelM_name2= new Label(0, 1, allClient2.get(0).getM_name());
                   Label labelC_name2= new Label(1,1, allClient2.get(0).getC_name());
                   Label labelC_phone2= new Label(2, 1, allClient2.get(0).getC_phone());
                   
             
                   Label labeldinfo12= new Label(5, 1, allClient2.get(0).getDi_info());

                   Label labeldinfo22= new Label(5, 2, allClient2.get(0).getQ_info());
                
                   Label labeldinfo32= new Label(5, 3, allClient2.get(0).getP_info());

                   Label labeldinfo42= new Label(5, 4, allClient2.get(0).getMQ_info());
                   

                   Label labelCo_info2= new Label(5, 5, allClient2.get(0).getCo_info());
                   Label labelCo_department2= new Label(5, 6, allClient2.get(0).getCo_department());                 
                   Label labelCo_dealer2= new Label(5, 7, allClient2.get(0).getCo_dealer());                
                   Label labelCo_category2= new Label(5, 8, allClient2.get(0).getCo_category());
                   Label labelCo_deliver2= new Label(5, 9, allClient2.get(0).getCo_deliver());
                   Label labelCo_replay2= new Label(5, 9, allClient2.get(0).getCo_replay());                   
                   Label labelCo_result2= new Label(5, 10, allClient2.get(0).getCo_result());
                   Label labelCo_replenish2= new Label(5, 11, allClient2.get(0).getCo_replenish());
                
                   Label labeldinfo52= new Label(5, 12, allClient2.get(0).getDa_info());

                      
                   Label labelRe_name2= new Label(5, 14, allClient2.get(0).getRe_name());
                   Label labelRe_sex2= new Label(7, 14, allClient2.get(0).getRe_sex());               
                   Label labelRe_age2= new Label(5, 15, allClient2.get(0).getRe_age());                   
                   Label labelRe_nation2= new Label(7, 15, allClient2.get(0).getRe_nation());
                   Label labelRe_weight2= new Label(5, 16, allClient2.get(0).getRe_weight());
                   Label labelRe_disease2= new Label(7, 16, allClient2.get(0).getRe_disease());                   
                   Label labelRe_reactionN2= new Label(5, 17, allClient2.get(0).getRe_reactionN());
                   Label labelRe_reactionD2= new Label(5, 18, allClient2.get(0).getRe_reactionD());                
                   Label labelRe_timeM2= new Label(5, 19, allClient2.get(0).getRe_timeM());
                   Label labelRe_use2= new Label(5, 20, allClient2.get(0).getRe_use());
                   Label labelRe_time2= new Label(5, 21, allClient2.get(0).getRe_time());
                  
                   Label labelRe_result2= new Label(5, 22, allClient2.get(0).getRe_result());
                   Label labelRe_number2= new Label(5, 23, allClient2.get(0).getRe_number());
                   Label labelRe_merge2= new Label(5, 24, allClient2.get(0).getRe_merge());
                   Label labelRe_family2= new Label(5, 25, allClient2.get(0).getRe_family());
                   Label labelRe_reactionP2= new Label(7, 25, allClient2.get(0).getRe_reactionP());                   
                   Label labelRe_others2= new Label(5, 26, allClient2.get(0).getRe_others());
                   Label labelRe_hospital2= new Label(7, 26, allClient2.get(0).getRe_hospital());
                   Label labelRe_case2= new Label(5, 27, allClient2.get(0).getRe_case());
                   Label labelRe_phone2= new Label(7, 27, allClient2.get(0).getRe_phone());   
                   
 
                   Label labelinfo62= new Label(5, 28, allClient2.get(0).getO_info());
                   
  
                   ws.addCell(labelM_name2);
                   ws.addCell(labelC_name2);
                   ws.addCell(labelC_phone2);
                 
                   
           
                   ws.addCell(labeldinfo12);
                   
           
                   ws.addCell(labeldinfo22);
                   
                
                   ws.addCell(labeldinfo32);
                   
                 
                   ws.addCell(labeldinfo42);
                   
                   
                   ws.addCell(labelCo_info2);
                   ws.addCell(labelCo_department2);
                   ws.addCell(labelCo_dealer2);
                   ws.addCell(labelCo_category2);
                   ws.addCell(labelCo_deliver2);
                   ws.addCell(labelCo_replay2);
                   ws.addCell(labelCo_result2);
                   ws.addCell(labelCo_replenish2);
                   
                   
                   ws.addCell(labeldinfo52);
              
                 
                   ws.addCell(labelRe_name2);
                   ws.addCell(labelRe_sex2);
                   ws.addCell(labelRe_age2);
                   ws.addCell(labelRe_nation2);
                   ws.addCell(labelRe_weight2);
                   ws.addCell(labelRe_disease2);
                   ws.addCell(labelRe_reactionN2);
                   ws.addCell(labelRe_reactionD2);
                   ws.addCell(labelRe_timeM2);
                   ws.addCell(labelRe_use2);
                   ws.addCell(labelRe_time2);
                   ws.addCell(labelRe_result2);
                   ws.addCell(labelRe_number2);
                   ws.addCell(labelRe_merge2);
                   ws.addCell(labelRe_family2);
                   ws.addCell(labelRe_reactionP2);
                   ws.addCell(labelRe_others2);
                   ws.addCell(labelRe_hospital2);
                   ws.addCell(labelRe_case2);
                   ws.addCell(labelRe_phone2);

                   ws.addCell(labelinfo62);
                       
                      */
                   
                 
                  //写进文档
                   wwb.write();
                  // 关闭Excel工作簿对象
                   wwb.close();
                 
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            
            return SUCCESS;
        }
        
        
}
    

 