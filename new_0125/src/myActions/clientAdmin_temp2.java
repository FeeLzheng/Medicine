package myActions;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类
public class clientAdmin_temp2 extends ActionSupport implements ModelDriven {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newClient client=new newClient();
    //声明模型方法
   
   public newClient getModel() {
        return client;
        
    }

    
    

   
    private List<newClient> allMedicine = null;

    //getAllTopic()方法执行数据库查询操作，返回所有新闻栏目记录，
    //并将所有记录封装到列表对象allTopic中。
    public List<newClient> getAllMedicine() throws Exception {
    
        allMedicine = new ArrayList<newClient>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from client");//执行查询，返回新闻栏目记录
        System.out.println("客服服务记录查询");
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
        	
        	 M_name = rs.getString("M_name");
             M_id = rs.getString("M_id");
             M_standard1 = rs.getString("M_standard1");
             M_standard2 = rs.getString("M_standard2");
             M_adaptation = rs.getString("M_adaptation");
             M_use = rs.getString("M_use");
             M_effect = rs.getString("M_effect");
             M_execute = rs.getString("M_execute");
             M_instruction = rs.getString("M_instruction");
             
             
  
             
            allMedicine.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction));//创建新闻栏目对象，加入列表对象
       
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
        ResultSet rs = db.doQuery("select * from medicine where M_name='"+Keyword+"'");//执行查询，返回新闻栏目记录
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
        	
        	 M_name = rs.getString("M_name");
             M_id = rs.getString("M_id");
             M_standard1 = rs.getString("M_standard1");
             M_standard2 = rs.getString("M_standard2");
             M_adaptation = rs.getString("M_adaptation");
             M_use = rs.getString("M_use");
             M_effect = rs.getString("M_effect");
             M_execute = rs.getString("M_execute");
             M_instruction = rs.getString("M_instruction");
             
             
             
            allMedicine2.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction));//创建新闻栏目对象，加入列表对象
       
        }
       
        db.close();//清理数据库模型对象
        return allMedicine2;
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
	     System.out.println(M_standard1);
		 String sql="select * from medicine where M_name='"+M_name+"'";
		 doSqlDb db=new doSqlDb();
		 ResultSet re=db.doQuery(sql);
		  
		 if(re.next()){
			 this.addFieldError("M_name","药品名字重复，请换一个名字" );
	     }else{
		   sql="insert into medicine (M_name,M_id,M_standard1,M_standard2,M_adaptation,M_use,M_effect,M_execute,M_instruction) values ('"+M_name+"','"+M_id+"','"+M_standard1+"','"+M_standard2+"','"+M_adaptation+"','"+M_use+"','"+M_effect+"','"+M_execute+"','"+M_instruction+"')";
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
             
             System.out.println(M_standard1);
             System.out.println(M_standard2);
             System.out.println(M_id);
            //执行SQL UPDATE命令修改记录
            sql = "update medicine set M_id='"+M_id+"', M_standard1='"+M_standard1+"',M_standard2='"+M_standard2+"',M_adaptation='"+M_adaptation+"',M_use='"+M_use+"',M_effect='"+M_effect+"',M_execute='"+M_execute+"',M_instruction='"+M_instruction+"' where M_name='"+M_name+"'";
            
            int A =db.doUpdate(sql);
            System.out.println(A);
         
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
    public String admin_clinetAdmin() throws Exception {
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
         System.out.println(M_name);
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
     System.out.println(M_name+"1");
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
        System.out.println(A);
     
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
        System.out.println(M_name);
	        searchMedicineList.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction));//创建新闻栏目对象，加入列表对象
	        
		
		
	}
	db.close();
	return searchMedicineList;
}

public String search() throws Exception{
	
	return SUCCESS;
} 

}
