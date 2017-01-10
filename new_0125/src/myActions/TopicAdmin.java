package myActions;
import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;

import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类
public class TopicAdmin extends ActionSupport implements ModelDriven {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newMedicine medicine=new newMedicine();
    //声明模型方法
   
   public newMedicine getModel() {
        return medicine;
        
    }
   
    private newDistrict district=new newDistrict();
    
    
    
    private List<newDistrict> allDistrict = null;
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newMedicine> MedicineList = null;
    private String Keyword;//保存请求参数中的新闻搜索关键字

    public String getKeyword() { return Keyword; }
    public void setKeyword(String Keyword) {this.Keyword = Keyword;}
    //getAllTopic()方法执行数据库查询操作，返回所有新闻栏目记录，
    //并将所有记录封装到列表对象allTopic中。
    private String Keyword2;//保存请求参数中的新闻搜索关键字

    public String getKeyword2() { return Keyword2; }
    public void setKeyword2(String Keyword2) {this.Keyword2 = Keyword2;}   
    
    private List<newMedicine> allMedicine = null;

    //getAllTopic()方法执行数据库查询操作，返回所有新闻栏目记录，
    //并将所有记录封装到列表对象allTopic中。
    public List<newMedicine> getAllMedicine() throws Exception {
    
        allMedicine = new ArrayList<newMedicine>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        String M_date;
      	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      	 M_date=sdf.format(new Date());
        
        ResultSet rs = db.doQuery("select * from medicine order by M_name");//执行查询，返回新闻栏目记录
      //System.out.println("药品查询");
        String M_name;
        String M_id;
        String M_standard1;
        String M_standard2;
        String M_adaptation;
        String M_use;
        String M_effect;
        String M_execute;
        String M_instruction;
        while (rs.next()) {
        	//System.out.println("药品查询+1");
        	 M_name = rs.getString("M_name");
        	// System.out.println("药品查询+2");
             M_id = rs.getString("M_id");
             M_standard1 = rs.getString("M_standard1");
             M_standard2 = rs.getString("M_standard2");
             M_adaptation = rs.getString("M_adaptation");
             M_use = rs.getString("M_use");
             M_effect = rs.getString("M_effect");
             M_execute = rs.getString("M_execute");
             M_instruction = rs.getString("M_instruction");
             M_date=rs.getString("M_date");
             
           //  System.out.println(M_instruction);
             
            allMedicine.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
       
        }
        db.close();//清理数据库模型对象
        return allMedicine;
    }

    private List<newMedicine> allMedicine2 = null;
    public List<newMedicine> getAllMedicine2() throws Exception {
        
        allMedicine2 = new ArrayList<newMedicine>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        int sum=0;
        int i=1;
        ResultSet rs = db.doQuery("select * from medicine where M_name='"+Keyword2+"'");//执行查询，返回新闻栏目记录
        String M_name;
        String M_id;
        String M_standard1;
        String M_standard2;
        String M_adaptation;
        String M_use;
        String M_effect;
        String M_execute;
        String M_instruction;
        String M_date=null;
        while (rs.next()) {
        	
        	 M_name = rs.getString("M_name");
             M_id = rs.getString("M_id");
             M_standard1 = rs.getString("M_standard1");
             M_standard2 = rs.getString("M_standard2");
             M_adaptation = rs.getString("M_adaptation");
             M_use = rs.getString("M_use");
             M_effect = rs.getString("M_effect");
             M_execute = rs.getString("M_execute");
             M_instruction = rs.getString("M_instruction");
             
             
             
            allMedicine2.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
       
        }
       
        db.close();//清理数据库模型对象
        return allMedicine2;
    }
    
    //药品详情
    private List<newMedicine> allMedicine4 = null;
    public List<newMedicine> getAllMedicine4() throws Exception {
        
        allMedicine4 = new ArrayList<newMedicine>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        int sum=0;
        int i=1;
        String M_name =medicine.getM_name();
        ResultSet rs = db.doQuery("select * from medicine where M_name='"+M_name+"'");//执行查询，返回新闻栏目记录
        
        String M_id;
        String M_standard1;
        String M_standard2;
        String M_adaptation;
        String M_use;
        String M_effect;
        String M_execute;
        String M_instruction;
        String M_date=null;
        while (rs.next()) {
        	
        	 M_name = rs.getString("M_name");
             M_id = rs.getString("M_id");
             M_standard1 = rs.getString("M_standard1");
             M_standard2 = rs.getString("M_standard2");
             M_adaptation = rs.getString("M_adaptation");
             M_use = rs.getString("M_use");
             M_effect = rs.getString("M_effect");
             M_execute = rs.getString("M_execute");
             M_instruction = rs.getString("M_instruction");
             
             
             
            allMedicine4.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
           
        }
       
        db.close();//清理数据库模型对象
        return allMedicine4;
    }
    
  //实现药品模糊查询，返回allMedicine3集合
    private List<newMedicine> allMedicine3 = null;
    public List<newMedicine> getAllMedicine3() throws Exception {
        
        allMedicine3 = new ArrayList<newMedicine>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        int sum=0;
        int i=1;
        ResultSet rs = db.doQuery("select * from medicine where M_name like'%"+Keyword+"%'");//执行查询，返回新闻栏目记录
        String M_name;
        String M_id;
        String M_standard1;
        String M_standard2;
        String M_adaptation;
        String M_use;
        String M_effect;
        String M_execute;
        String M_instruction;
        String M_date=null;
        while (rs.next()) {
        	
        	 M_name = rs.getString("M_name");
             M_id = rs.getString("M_id");
             M_standard1 = rs.getString("M_standard1");
             M_standard2 = rs.getString("M_standard2");
             M_adaptation = rs.getString("M_adaptation");
             M_use = rs.getString("M_use");
             M_effect = rs.getString("M_effect");
             M_execute = rs.getString("M_execute");
             M_instruction = rs.getString("M_instruction");
             
           //  System.out.println(M_name);
             
            allMedicine3.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
       
        }
        db.close();//清理数据库模型对象
        return allMedicine3;
    }



    public String admin_medicineAdd() throws Exception {        
    	 String M_name=medicine.getM_name();
		 String M_id =medicine.getM_id();
	     String M_standard1=medicine.getM_standard1();
	     String M_standard2=medicine.getM_standard2();
	     String M_adaptation=medicine.getM_adaptation();
	     String M_use=medicine.getM_use();
	     String M_effect=medicine.getM_effect();
	     String M_execute=medicine.getM_execute();
	     String M_instruction=medicine.getM_instruction();
	     String M_date;
	     M_instruction = M_instruction.replaceAll("\\s+", "");
	        M_execute = M_execute.replaceAll("\\s+", "");
	        M_name = M_name.replaceAll("\\s+", "");
	        M_id = M_id.replaceAll("\\s+", "");
	        M_standard1 = M_standard1.replaceAll("\\s+", "");
	        M_standard2 = M_standard2.replaceAll("\\s+", "");
	        M_use = M_use.replaceAll("\\s+", "");
	        M_effect = M_effect.replaceAll("\\s+", "");
	        M_adaptation = M_adaptation.replaceAll("\\s+", "");
	        M_instruction = M_instruction.replaceAll(">", "大于");
	        M_instruction = M_instruction.replaceAll("<", "小于");
	        M_instruction = M_instruction.replaceAll("%", "%25");
	        M_adaptation = M_adaptation.replaceAll("%", "%25");
	        M_instruction.replace("\n","");
            M_instruction.replace("\t","");
            M_instruction.replace(" ","");
            M_instruction.trim();
            
            M_adaptation.replace("\n","");
	        M_adaptation.replace("\t","");
	        M_adaptation.replace(" ","");
	        M_adaptation.trim();
	        M_adaptation = M_adaptation.replaceAll(">", "大于");
	        M_adaptation = M_adaptation.replaceAll("<", "小于");
	        M_adaptation = M_adaptation.replaceAll("%", "%25");
            
            
	      //  System.out.println(M_standard1);
		 
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	      	 M_date=sdf.format(new Date());
	        
	        String sql="select * from medicine where M_name='"+M_name+"'";
		 doSqlDb db=new doSqlDb();
		 ResultSet re=db.doQuery(sql);
		  
		 if(re.next()){
			 this.addFieldError("M_name","药品名字重复，请换一个名字" );
	     }else{
		   sql="insert into medicine (M_name,M_id,M_standard1,M_standard2,M_adaptation,M_use,M_effect,M_execute,M_instruction,M_date) values ('"+M_name+"','"+M_id+"','"+M_standard1+"','"+M_standard2+"','"+M_adaptation+"','"+M_use+"','"+M_effect+"','"+M_execute+"','"+M_instruction+"','"+M_date+"')";
		  db.doUpdate(sql);
		  this.addActionMessage("成功保存添加数据");
		
}
		 db.close();
		 return INPUT;
	}

    //admin_topicDelete为完成删除新闻栏目记录操作的同名Action方法，
    //欲删除新闻栏目记录的信息通过请求参数数传入模型，
    //Action方法从模型中取得传入的请求参数值。
    public String admin_medicineDelete() throws Exception {
        String name = medicine.getM_name();//获取请求的新闻栏目名称
        String sql;
        doSqlDb db = new doSqlDb();
       
            sql = "delete from medicine where M_name='"+name+"'";
            db.doUpdate(sql);
        
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示完成上述操作后，客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicDelete.jsp
        return SUCCESS;
    }

    //admin_topicEdit为请求进入新闻栏目编辑页面的同名Action方法，
    //在Action方法中未执行任何操作，主要是利用模型传递请求参数中的欲编辑记录数据
    //在编辑页面中，使用模型字段名称的OGNL表达式获得记录各个字段的值
    public String admin_medicineEdit() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
        return SUCCESS;
    }
    public String admin_medicineEdit2() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
        return SUCCESS;
    }
    public String client_medicineview() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
        return SUCCESS;
    }
    
    public String admin_clientAdd() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
        return SUCCESS;
    }

    //admin_topicEditSave为完成保存修改后的新闻栏目记录操作的同名Action方法，
    //需要加入数据库的新闻栏目记录数据通过请求参数传入模型，
    //Action方法从模型中取得传入的请求参数值。
    public String admin_medicineEditSave() throws Exception {
    	String M_name=medicine.getM_name();
		 String M_id =medicine.getM_id();
		    String M_standard1=medicine.getM_standard1();
		     String M_standard2=medicine.getM_standard2();
	     String M_adaptation=medicine.getM_adaptation();
	     String M_use=medicine.getM_use();
	     String M_effect=medicine.getM_effect();
	     String M_execute=medicine.getM_execute();
	     String M_instruction=medicine.getM_instruction();
	     M_instruction = M_instruction.replaceAll("\\s+", "");
	        M_execute = M_execute.replaceAll("\\s+", "");
	        
	        M_adaptation = M_adaptation.replaceAll("\\s+", "");
	        M_name = M_name.replaceAll("\\s+", "");
	        M_id = M_id.replaceAll("\\s+", "");
	        M_standard1 = M_standard1.replaceAll("\\s+", "");
	        M_standard2 = M_standard2.replaceAll("\\s+", "");
	        M_use = M_use.replaceAll("\\s+", "");
	        M_effect = M_effect.replaceAll("\\s+", "");
	        M_instruction = M_instruction.replaceAll(">", "大于");
	        M_instruction = M_instruction.replaceAll("<", "小于");
	        M_instruction = M_instruction.replaceAll("%", "%25");
	        M_adaptation.replace("\n","");
	        M_adaptation.replace("\t","");
	        M_adaptation.replace(" ","");
	        M_adaptation.trim();
	        M_adaptation = M_adaptation.replaceAll(">", "大于");
	        M_adaptation = M_adaptation.replaceAll("<", "小于");
	        M_adaptation = M_adaptation.replaceAll("%", "%25");
	        M_instruction.replace("\n","");
            M_instruction.replace("\t","");
            M_instruction.replace(" ","");
            M_instruction.trim();
	        

        String sql;     
        doSqlDb db = new doSqlDb();
       
            //在新闻栏目名称重复时，不执行记录修改操作。
            //添加Action信息，该信息显示在结果视图中提示用户
           
            //admin_topicEditSave的Action配置没有使用动态配置，
            //返回INPUT表示在不能完成保存保存时，客户端跳转到input视图，
            //input视图的Action配为：
            //<result name="input" type="chain">
            //    <param name="actionName">admin_topicEdit</param>
            //</result>
            //chain表示结果为Action链，即客户端跳转到admin_topicEdit，
            //使用Action链是为了将当前Action中的数据传入下一个Action，
            //即可在创新进入编辑页面时，使页面显示之前提交的数据
             
            // System.out.println(M_standard1);
            // System.out.println(M_standard2);
            // System.out.println(M_id);
            //执行SQL UPDATE命令修改记录
            sql = "update medicine set M_id='"+M_id+"', M_standard1='"+M_standard1+"',M_standard2='"+M_standard2+"',M_adaptation='"+M_adaptation+"',M_use='"+M_use+"',M_effect='"+M_effect+"',M_execute='"+M_execute+"',M_instruction='"+M_instruction+"' where M_name='"+M_name+"'";
            
            int A =db.doUpdate(sql);
           // System.out.println(A);
         
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
        return SUCCESS;
    }
    public String admin_medicineEditSave2() throws Exception {
    	String M_name=medicine.getM_name();
		 String M_id =medicine.getM_id();
		    String M_standard1=medicine.getM_standard1();
		     String M_standard2=medicine.getM_standard2();
	     String M_adaptation=medicine.getM_adaptation();
	     String M_use=medicine.getM_use();
	     String M_effect=medicine.getM_effect();
	     String M_execute=medicine.getM_execute();
	     String M_instruction=medicine.getM_instruction();
	     M_instruction = M_instruction.replaceAll("\\s+", "");
	        M_execute = M_execute.replaceAll("\\s+", "");
	        
	        M_adaptation = M_adaptation.replaceAll("\\s+", "");
	        M_name = M_name.replaceAll("\\s+", "");
	        M_id = M_id.replaceAll("\\s+", "");
	        M_standard1 = M_standard1.replaceAll("\\s+", "");
	        M_standard2 = M_standard2.replaceAll("\\s+", "");
	        M_use = M_use.replaceAll("\\s+", "");
	        M_effect = M_effect.replaceAll("\\s+", "");
	        M_instruction = M_instruction.replaceAll(">", "大于");
	        M_instruction = M_instruction.replaceAll("<", "小于");
	        M_instruction = M_instruction.replaceAll("%", "%25");
	        M_adaptation.replace("\n","");
	        M_adaptation.replace("\t","");
	        M_adaptation.replace(" ","");
	        M_adaptation.trim();
	        M_adaptation = M_adaptation.replaceAll(">", "大于");
	        M_adaptation = M_adaptation.replaceAll("<", "小于");
	        M_adaptation = M_adaptation.replaceAll("%", "%25");
	        M_instruction.replace("\n","");
            M_instruction.replace("\t","");
            M_instruction.replace(" ","");
            M_instruction.trim();
	        

        String sql;     
        doSqlDb db = new doSqlDb();
       
            //在新闻栏目名称重复时，不执行记录修改操作。
            //添加Action信息，该信息显示在结果视图中提示用户
           
            //admin_topicEditSave的Action配置没有使用动态配置，
            //返回INPUT表示在不能完成保存保存时，客户端跳转到input视图，
            //input视图的Action配为：
            //<result name="input" type="chain">
            //    <param name="actionName">admin_topicEdit</param>
            //</result>
            //chain表示结果为Action链，即客户端跳转到admin_topicEdit，
            //使用Action链是为了将当前Action中的数据传入下一个Action，
            //即可在创新进入编辑页面时，使页面显示之前提交的数据
             
            // System.out.println(M_standard1);
            // System.out.println(M_standard2);
            // System.out.println(M_id);
            //执行SQL UPDATE命令修改记录
            sql = "update medicine set M_id='"+M_id+"', M_standard1='"+M_standard1+"',M_standard2='"+M_standard2+"',M_adaptation='"+M_adaptation+"',M_use='"+M_use+"',M_effect='"+M_effect+"',M_execute='"+M_execute+"',M_instruction='"+M_instruction+"' where M_name='"+M_name+"'";
            
            int A =db.doUpdate(sql);
           // System.out.println(A);
         
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
        return SUCCESS;
    }
    
    //该类中的Action均通过命名方法访问，execute() 在此可以省略
    public String execute() throws Exception {
        return SUCCESS;
    }

    //admin_topicAdmin为请求进入新闻栏目管理页面的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String admin_medicineAdmin() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    
    public String admin_medicineAdmin2() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    public String client_medicineAdmin() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }

    //getNewsBar为用于生成新闻栏目导航栏的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String getNewsBar() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为getNewsBar.jsp
        return SUCCESS;
    }

    //admin_getNewsAdminList为用于生成新闻栏目管理链接的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String admin_getNewsAdminList() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_getNewsAdminList.jsp
        return SUCCESS;
    }
    
    //admin_showTopicList为用于生成添加、修改新闻栏目页面中的下拉列表的同名Action方法，
    //在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
    public String admin_showTopicList() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_showTopicList.jsp
        return SUCCESS;
    }







public List<newDistrict> getAllDistrict() throws Exception {
    
	allDistrict = new ArrayList<newDistrict>();//创建数组列表集合对象
    doSqlDb db = new doSqlDb();//创建数据库模型对象
    ResultSet rs = db.doQuery("select * from district");//执行查询，返回新闻栏目记录
    int id;
    String M_name;
    String D_company;
    String D_district;
    String D_form;
    String D_phone1;
    String D_email1;
    String D_phone2;
    String D_email2;
    while (rs.next()) {
    	 id=rs.getInt("id");
    	 M_name = rs.getString("M_name");
    	 D_company = rs.getString("D_company");
    	 D_district = rs.getString("D_district");
    	 D_form = rs.getString("D_form");
    	 D_phone1 = rs.getString("D_phone1");
    	 D_email1 = rs.getString("D_email1");
    	 D_phone2 = rs.getString("D_phone2");
    	 D_email2 = rs.getString("D_email2");
         allDistrict.add(new newDistrict(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
         //System.out.println(M_name);
    }
    db.close();//清理数据库模型对象
    return allDistrict;
}

public String admin_districtAdd() throws Exception {        
	 String M_name=district.getM_name();
	 String D_company =district.getD_company();
     String D_district=district.getD_district();
     String D_form=district.getD_form();
     String D_phone1=district.getD_phone1();
     String D_email1=district.getD_email1();
     String D_phone2=district.getD_phone2();
     String D_email2=district.getD_email2();
    // System.out.println(M_name+"1");
	 String sql="select * from district where M_name='"+M_name+"'";
	 doSqlDb db=new doSqlDb();
	 ResultSet re=db.doQuery(sql);
	  if(re.next()){
		 this.addFieldError("M_name","药品名字重复，请换一个名字" );
     }
     
	 else{
	   sql="insert into district (M_name,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2) values ('"+M_name+"','"+D_company+"','"+D_district+"','"+D_form+"','"+D_phone1+"','"+D_email1+"','"+D_phone2+"','"+D_email2+"')";
	  db.doUpdate(sql);
	  this.addActionMessage("成功保存添加数据");
	
}
	 db.close();
     
	 return INPUT;
}

//admin_topicDelete为完成删除新闻栏目记录操作的同名Action方法，
//欲删除新闻栏目记录的信息通过请求参数数传入模型，
//Action方法从模型中取得传入的请求参数值。
public String admin_districtDelete() throws Exception {
    String name = district.getM_name();
    String D_district=district.getD_district();
    String sql;
    doSqlDb db = new doSqlDb();
   
        sql = "delete from district where M_name='"+name+"'&D_district='"+D_district+"'";
        db.doUpdate(sql);
    
    db.close();//清理数据库模型对象
    //返回SUCCESS，表示完成上述操作后，客户端跳转到Action的success结果视图
    //根据Action动态配置规则，结果视图为admin_topicDelete.jsp
    return SUCCESS;
}

//admin_topicEdit为请求进入新闻栏目编辑页面的同名Action方法，
//在Action方法中未执行任何操作，主要是利用模型传递请求参数中的欲编辑记录数据
//在编辑页面中，使用模型字段名称的OGNL表达式获得记录各个字段的值
public String admin_districtEdit() throws Exception {
    //返回SUCCESS，表示客户端跳转到Action的success结果视图
    //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
    return SUCCESS;
}

//admin_topicEditSave为完成保存修改后的新闻栏目记录操作的同名Action方法，
//需要加入数据库的新闻栏目记录数据通过请求参数传入模型，
//Action方法从模型中取得传入的请求参数值。
public String admin_districtEditSave() throws Exception {
	 String M_name=district.getM_name();
	 String D_company =district.getD_company();
     String D_district=district.getD_district();
     String D_form=district.getD_form();
     String D_phone1=district.getD_phone1();
     String D_email1=district.getD_email1();
     String D_phone2=district.getD_phone2();
     String D_email2=district.getD_email2();
   
    String sql;     
    doSqlDb db = new doSqlDb();
   
        //在新闻栏目名称重复时，不执行记录修改操作。
        //添加Action信息，该信息显示在结果视图中提示用户
       
        //admin_topicEditSave的Action配置没有使用动态配置，
        //返回INPUT表示在不能完成保存保存时，客户端跳转到input视图，
        //input视图的Action配为：
        //<result name="input" type="chain">
        //    <param name="actionName">admin_topicEdit</param>
        //</result>
        //chain表示结果为Action链，即客户端跳转到admin_topicEdit，
        //使用Action链是为了将当前Action中的数据传入下一个Action，
        //即可在创新进入编辑页面时，使页面显示之前提交的数据
         
     
        //执行SQL UPDATE命令修改记录
        sql = "update district set D_company='"+D_company+"', D_district='"+D_district+"',D_form='"+D_form+"',D_phone1='"+D_phone1+"',D_email1='"+D_email1+"',D_phone2='"+D_phone2+"',D_email2='"+D_email2+"' where M_name='"+M_name+"'";
        
        int A =db.doUpdate(sql);
        //System.out.println(A);
     
    db.close();//清理数据库模型对象
    //返回SUCCESS，表示客户端跳转到Action的success结果视图
    //结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
    return SUCCESS;
}
//该类中的Action均通过命名方法访问，execute() 在此可以省略



//admin_topicAdmin为请求进入新闻栏目管理页面的同名Action方法，
//在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
public String admin_districtAdmin() throws Exception {
    //返回SUCCESS，表示客户端跳转到Action的success结果视图
    //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
    return SUCCESS;
}
private List<newMedicine> searchMedicineList=null;
public List<newMedicine> getSearchList2() throws Exception{
	this.searchMedicineList=new ArrayList<newMedicine>();
	
	String sql="select * from medicine ";
	doSqlDb db=new doSqlDb();
	ResultSet rs=db.doQuery(sql);
	
    
       String M_name;
       String M_id;
       String M_standard1;
       String M_standard2;
       String M_adaptation;
       String M_use;
       String M_effect;
       String M_execute;
       String M_instruction;
       String M_date=null;
	while(rs.next()){
		 
		M_name = rs.getString("M_name");
        M_id = rs.getString("M_id");
        M_standard1 = rs.getString("M_standard1");
        M_standard2 = rs.getString("M_standard2");
        M_adaptation = rs.getString("M_adaptation");
        M_use = rs.getString("M_use");
        M_effect = rs.getString("M_effect");
        M_execute = rs.getString("M_execute");
        M_instruction = rs.getString("M_instruction");
       // System.out.println(M_name);
	        searchMedicineList.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
	        
		
		
	}
	db.close();
	return searchMedicineList;
}


//实现地区查询，返回allDistrict2集合,实现locationphonesearch的方法以及匹配到的值的集合
private List<newDistrict> allDistrict2 = null;
public List<newDistrict> getAllDistrict2() throws Exception {
  
  allDistrict2 = new ArrayList<newDistrict>();//创建数组列表集合对象
  doSqlDb db = new doSqlDb();//创建数据库模型对象
  int sum=0;
  int i=1;
  
  //System.out.println("allDistrict2進來了");
  //System.out.println(Keyword2+"Keyword2進來了");
  
  ResultSet rs = db.doQuery("select * from district where  D_district like'"+Keyword2+"'");//执行查询，返回新闻栏目记录
  String M_name;
  int id;
  String D_company;
  String D_district;
  String D_form;
  String D_phone1;
  String D_email1;
  String D_phone2;
  String D_email2;
  while (rs.next()) {
  	
  	//System.out.println("allDistrict2 rs.next()");
  	
   id=rs.getInt("id");
 	 M_name = rs.getString("M_name");
 	 D_company = rs.getString("D_company");
 	 D_district = rs.getString("D_district");
 	 D_form = rs.getString("D_form");
 	 D_phone1 = rs.getString("D_phone1");
 	 D_email1 = rs.getString("D_email1");
 	 D_phone2 = rs.getString("D_phone2");
 	 D_email2 = rs.getString("D_email2");
 	 
 
 	
       //System.out.println(M_name);
       
       allDistrict2.add(new newDistrict(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
 
  }
  db.close();//清理数据库模型对象
  return allDistrict2;
}


public String search() throws Exception{
	
	return SUCCESS;
} 

public String search4() throws Exception{
	
	return SUCCESS;
} 

public String search5() throws Exception{
	
	return SUCCESS;
} 

public String medicineDetail() throws Exception{
	
	return SUCCESS;
} 

public String search2() throws Exception{
	
	return SUCCESS;
} 

public String search3() throws Exception{
	
	return SUCCESS;
} 

public List<newMedicine> getAllByDb(){
    List<newMedicine> list=new ArrayList<newMedicine>();
    
    try {
    	doSqlDb db = new doSqlDb();
        String sql="select * from stu";
        ResultSet rs= db.Search(sql, null);
        
        while (rs.next()) {
            
            String M_name=rs.getString("M_name");
            String M_id=rs.getString("M_id");
            String M_standard1=rs.getString("M_standard1");
            String M_standard2=rs.getString("M_standard2");
            String M_adaptation=rs.getString("M_adaptation");
            String M_use=rs.getString("M_use");
            String M_effect=rs.getString("M_effect");
            String M_execute=rs.getString("M_execute");
            String M_instruction=rs.getString("M_instruction");
            String M_date=null;
            //System.out.println(id+" "+name+" "+sex+ " "+num);
            list.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
        }
        
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return list;
}

/**
 * 查询指定目录中电子表格中所有的数据
 * @param file 文件完整路径
 * @return
 */
public List<newMedicine> getAllByExcel(String file){
	List<newMedicine> list2=null;
     list2=new ArrayList<newMedicine>();
    try {
        Workbook rwb=Workbook.getWorkbook(new File(file));
        Sheet rs=rwb.getSheet(0);//或者rwb.getSheet(0)
        int clos=rs.getColumns();//得到所有的列
        int rows=rs.getRows();//得到所有的行
        
        System.out.println(clos+" rows:"+rows);
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < clos; j++) {
                //第一个是列数，第二个是行数
            	String M_id=rs.getCell(j++, i).getContents();//产品编码
            	String M_name=rs.getCell(j++, i).getContents();//默认最左边编号也算一列 所以这里得j++
            	 String M_use=rs.getCell(j++, i).getContents();//商品名
                 String M_effect=rs.getCell(j++, i).getContents();//规格
                String M_standard1=rs.getCell(j++, i).getContents();//物价文号
                String M_standard2=rs.getCell(j++, i).getContents();//批准文号
                String M_execute=rs.getCell(j++, i).getContents();//执行标准
                
               
                String M_adaptation=rs.getCell(j++, i).getContents();//适应症
                String M_instruction=rs.getCell(j++, i).getContents();//用法用量
                String M_date=null;
                M_instruction = M_instruction.replaceAll("\\s+", "");
                M_execute = M_execute.replaceAll("\\s+", "");
               // M_instruction = Replace(M_instruction,vbCrlf, "<br/>" ) 
                M_adaptation = M_adaptation.replaceAll("\\s+", "");
                M_adaptation = M_adaptation.replaceAll("、", ",");
                M_name = M_name.replaceAll("\\s+", "");
                M_id = M_id.replaceAll("\\s+", "");
                M_standard1 = M_standard1.replaceAll("\\s+", "");
                M_standard2 = M_standard2.replaceAll("\\s+", "");
                M_use = M_use.replaceAll("\\s+", "");
                M_effect = M_effect.replaceAll("\\s+", "");
                
                M_adaptation.replace("\n","");
    	        M_adaptation.replace("\t","");
    	        M_adaptation.replace(" ","");
    	        M_adaptation.trim();
    	        M_adaptation = M_adaptation.replaceAll(">", "大于");
    	        M_adaptation = M_adaptation.replaceAll("<", "小于");
    	        M_adaptation = M_adaptation.replaceAll("%", "%25");
                
                
                M_instruction.replace("\n","");
                M_instruction.replace("\t","");
                M_instruction.replace(" ","");
                M_instruction.trim();
                M_instruction = M_instruction.replaceAll("%", "%25");
                M_adaptation = M_adaptation.replaceAll("%", "%25");
                System.out.println(M_id);
                list2.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date));//创建新闻栏目对象，加入列表对象
            }
        }
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } 
    return list2;
    
}

/**
 * 通过Id判断是否存在
 * @param id
 * @return
 */
public boolean isExist(String M_name){
    try {
    	String sql="select * from medicine where M_name='"+M_name+"'";
   	    doSqlDb db=new doSqlDb();
   	    ResultSet re=db.doQuery(sql);
   	       if (re.next()) {
            return true;
        }
   	       
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return false;
}

public String admin_importD() throws Exception {
    //得到表格中所有的数据
    List<newMedicine> listExcel=getAllByExcel("d://HZ.xls");
    /*//得到数据库表中所有的数据
    List<StuEntity> listDb=StuService.getAllByDb();*/
    
    doSqlDb db = new doSqlDb();
    //System.out.println("成功导入 ");
    String M_name=null;
    String M_id=null;
    String M_standard1=null;
    String M_standard2=null;
    String M_adaptation=null;
    String M_use=null;
    String M_effect=null;
    String M_execute=null;
    String M_instruction=null;
    String M_date;
    for (int i=0;i<listExcel.size();i++) {
    	M_id=listExcel.get(i).getM_id();
        M_name=listExcel.get(i).getM_name();
        M_instruction=listExcel.get(i).getM_instruction();
        M_effect=listExcel.get(i).getM_effect();
        M_standard1=listExcel.get(i).getM_standard1();
        M_standard2=listExcel.get(i).getM_standard2();
        M_adaptation=listExcel.get(i).getM_adaptation();
        M_use=listExcel.get(i).getM_use();
        M_effect=listExcel.get(i).getM_effect();
        M_execute=listExcel.get(i).getM_execute();
        M_instruction = M_instruction.replaceAll("\\s+", "");
        M_execute = M_execute.replaceAll("\\s+", "");
       // M_instruction = Replace(M_instruction,vbCrlf, "<br/>" ) 
        M_adaptation = M_adaptation.replaceAll("\\s+", "");
        M_adaptation = M_adaptation.replaceAll("、", ",");
        M_name = M_name.replaceAll("\\s+", "");
        M_id = M_id.replaceAll("\\s+", "");
        M_standard1 = M_standard1.replaceAll("\\s+", "");
        M_standard2 = M_standard2.replaceAll("\\s+", "");
        M_use = M_use.replaceAll("\\s+", "");
        M_effect = M_effect.replaceAll("\\s+", "");
        
        
        M_instruction.replace("\n","");
        M_instruction.replace("\t","");
        M_instruction.replace(" ","");
        M_instruction.trim();
        
        M_instruction = M_instruction.replaceAll(">", "大于");
        M_instruction = M_instruction.replaceAll("<", "小于");
        
      	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      	 M_date=sdf.format(new Date());
        
        System.out.println(M_name);
        if (!isExist(M_name)) {
            //不存在就添加
        	System.out.println("tianjia ");
            String sql="insert into medicine (M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction,M_date) values('"+M_name+"','"+M_id+"','"+M_standard1+"','"+M_standard2+"','"+M_adaptation+"','"+M_use+"','"+M_effect+"','"+M_execute+"','"+M_instruction+"','"+M_date+"')";
            db.doUpdate(sql);
            System.out.println("成功导入2 ");
        }
        
        else {
            //存在就更新
           // String sql="update medicine set name=?,sex=?,num=? where id=?";
        	String sql = "update medicine set M_id='"+M_id+"', M_standard1='"+M_standard1+"',M_standard2='"+M_standard2+"',M_adaptation='"+M_adaptation+"',M_use='"+M_use+"',M_effect='"+M_effect+"',M_execute='"+M_execute+"',M_instruction='"+M_instruction+"' where M_name='"+M_name+"'"; 
            //String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+"",id+""};
            //db.AddU(sql, str);
        	try{ db.doUpdate(sql);
             System.out.println("更新成功");
        	}catch (Exception e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        }
        }
    }
    this.addActionMessage("成功保存添加数据");
    db.close();
	 return SUCCESS;
}
/*
private File upload;  
    private String uploadContentType;// 要上传的文件的类型  
    private String uploadFileName;// 要上传的文件  
    private ContactsManager manager;  
    private Contacts cbean;  
    private Persons pbean;  
    private Long gid;  
    private String result;  
public String execute() throws Exception {  
        // 检查后缀名是否符合条件,同时更改上传文件的文件名  
        int filesize = this.getUploadFileName().length();  
        String fileEx = this.getUploadFileName().substring(  
                this.getUploadFileName().indexOf("."), filesize);  
        //获取文件名  
        String fileName=uploadFileName.substring(0,uploadFileName.indexOf(".")); 
        // 获得上传路径  
        String realPath = ServletActionContext.getServletContext().getRealPath( 
                "/UploadFile/");  
        File saveFile=null;  
        if (upload != null) {  
            // 修改文件名，使上传后不至于重复替代  
            // this.uploadFileName = new Date().getTime() + fileEx;  
            saveFile = new File(new File(realPath), uploadFileName);  
            if (!saveFile.getParentFile().exists()) {  
                saveFile.getParentFile().mkdirs();  
            }  
  
            FileUtils.copyFile(upload, saveFile);// 到这里，文件已上传成功  
            // 下面进行判断文件是否是rar文件，是就需要解压  
            if (fileEx.equals(".rar")) {  
                System.out.println("saveFile：" + saveFile);//rar文件所在保存路径  
                System.out.println("realPath：" + realPath);//解压后保存路径  
                // 定义解压字符串，用于解压上传的rar文件，注意此处需要一个unrar.exe文件  
                String rarpath = ServletActionContext.getServletContext()  
                        .getRealPath("/rarFile/UNRAR.exe x -t -o+ -p- \"");  
                String jieya = rarpath + saveFile + "\" \"" + realPath + "\""; 
                Process p1 = Runtime.getRuntime().exec(jieya);// 将传输的rar文件解压 
                 p1.waitFor();  
               p1.destroy();  
                FileUtils.deleteQuietly(saveFile);// 删除rar文件  
               saveFile=new File(new File(realPath),fileName+".xls");  
                System.out.println("解压后："+saveFile);  
                ServletActionContext.getResponse().getWriter().println(  
                        "success!!");  
           }  
            if (fileEx.equals(".xls") || fileEx.equals(".xlsx")) {  
                // 开始读取文件了，获得第一列手机号码  
               Workbook persons = Workbook.getWorkbook(saveFile);// 获得xls文件 
                Sheet sheet = persons.getSheet(0);// 获得第一个工作簿  
                System.out.println("列数：" + sheet.getColumns());  
                int count = sheet.getRows();// 取得记录数，count行  
               String cphone;  
                // 遍历行，获得列数据  
                for (int i = 0; i < count; i++) {  
                    cphone = sheet.getCell(0, i).getContents();// 第一列的所有行  
                   pbean = manager.getPerson(cphone);// 获得该用户，查询别的信息  
                   cbean = new Contacts();  
                    Long contactsid = pbean.getId();  
                    Long pid = 10002L;  
                    cbean.setContactsid(contactsid);// 联系人id  
                    cbean.setPid(pid);// 用户本身的PID  
                    cbean.setCid("cid");// 关系的学校ID  
                    cbean.setGid(gid);// 分组id  
                    manager.addPerson(cbean);  
                    this.contactsLog.writeLog("10002", "批量添加联系人", "批量添加联系人操作", "");  
                    System.out.println("添加成功！");  
                }  
           }  
            return SUCCESS;  
        } else {  
            return INPUT;  
        }  
    }  
}


*/
}
