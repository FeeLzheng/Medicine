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

public class passwordEdit extends ActionSupport implements ModelDriven<user> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private user user=new user();
	
	public user getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<user> alluser = null;

    
   /* public List<newDistrict> getAllDistrict() throws Exception {
        
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
  /*  public String admin_districtDelete() throws Exception {
    	
        String precontent;
    	
    	//取到系统时间并转为string
    	Date time1=new Date();
    	String time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(time1);
    	String sqlWorkLog;
    	
        String name = district.getM_name();
        String D_district=district.getD_district();
        String D_company=district.getD_company();
        String D_email1=district.getD_email1();
    	String D_email2=district.getD_email2();
    	String D_form=district.getD_form();
    	String D_phone1=district.getD_phone1();
    	String D_phone2=district.getD_phone2();
    	
	    precontent="药名:"+name+"/原销售公司:"+D_company+"/原销售地区:"+D_district+"/原销售形式:"+D_form+"/原地区经理电话:"+D_phone1+"/原地区经理邮箱:"+D_email1+"/原商务经理电话:"+D_phone2+"/原商务经理邮箱:"+D_email2+"";

	  //获取登陆名
	    HttpServletRequest request=ServletActionContext.getRequest();
	    String operator=(String) request.getSession().getAttribute("username");
    	
        String sql;
        doSqlDb db = new doSqlDb();
       
        sql = "delete from district where M_name='"+name+"' and D_district='"+D_district+"'";
        db.doUpdate(sql);
        
      //执行SQL 插入worklog命令修改记录  id自增不填  
   	     sqlWorkLog="insert into worklog (operator,precontent,aftcontent,time,location,action) values ('"+operator+"','"+precontent+"','none','"+time+"','销售地区','删除')";
   	     db.doUpdate(sqlWorkLog);
            
        db.close();//清理数据库模型对象
        //返回SUCCESS，表示完成上述操作后，客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicDelete.jsp
        return SUCCESS;
    }*/

    //admin_topicEdit为请求进入新闻栏目编辑页面的同名Action方法，
    //在Action方法中未执行任何操作，主要是利用模型传递请求参数中的欲编辑记录数据
    //在编辑页面中，使用模型字段名称的OGNL表达式获得记录各个字段的值
    public String passwordEdit() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
        return SUCCESS;
    }

    public String passwordEditSave() throws Exception {
    	//获取登陆名
    	String userid;
	    HttpServletRequest request=ServletActionContext.getRequest();
	    String User_getSession=(String) request.getSession().getAttribute("username");
	    
    	String User_input=user.getUsername();
    	
    	//神逻辑，若不是管理员改密码用户名是写死不能改会导致user.getUsername()传值为null，
    	//不能用User_input.equals(User_getSession)来作为判断，因为若User_input=null,则程序会报错
    	/*if(User_input==null)
    	{
    		userid=User_getSession;
    	}
    	else if(User_getSession.equals(User_input)){
	       userid=User_getSession;
    	}else{
    		userid=User_input;
    	} */
    	//此逻辑效率更高
    	if(User_input==null||User_getSession.equals(User_input)){
    		userid=User_getSession;
    	}else{
    		userid=User_input;
    	}
    	System.out.println(userid);
    		
	    String password =user.getPassword();
	    
	    System.out.println("密码是"+password);
	    
	    doSqlDb db = new doSqlDb();//创建数据库模型对象
        db.doUpdate("update admins set userid='"+userid+"',password='"+password+"'  where userid='"+userid+"'");
    
    
    
    return SUCCESS;
	
}
    //admin_topicEditSave为完成保存修改后的新闻栏目记录操作的同名Action方法，
    //需要加入数据库的新闻栏目记录数据通过请求参数传入模型，
    //Action方法从模型中取得传入的请求参数值。
   /* public String admin_districtEditSave() throws Exception {
    	
        String sqlWorkLog;
        
        String precontent;
    	String aftcontent;
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
    	//取到系统时间并转为string
    	Date time1=new Date();
    	String time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(time1);
    	
    	//获取登陆名
	    HttpServletRequest request=ServletActionContext.getRequest();
	    String operator=(String) request.getSession().getAttribute("username");
	    
	    
	    
	    //记录更改之前的内容
	    String M_name=district.getM_name();
    	doSqlDb Predb = new doSqlDb();
    	ResultSet rs = Predb.doQuery("select * from district where M_name='"+M_name+"'");//执行查询
    	
    	
        String PreD_district;
        String PreD_company;
        String PreD_email1;
    	String PreD_email2;
    	String PreD_form;
    	String PreD_phone1;
    	String PreD_phone2;
    	if(rs.next()){
    		PreD_district=rs.getString("D_district");
    		PreD_company=rs.getString("D_company");
    		PreD_email1=rs.getString("D_email1");
    		PreD_email2=rs.getString("D_email2");
    		PreD_form=rs.getString("D_form");
    		PreD_phone1=rs.getString("D_phone1");
    		PreD_phone2=rs.getString("D_phone2");
    	
    	
    	 String D_company =district.getD_company();
         String D_district=district.getD_district();
         String D_form=district.getD_form();
         String D_phone1=district.getD_phone1();
         String D_email1=district.getD_email1();
         String D_phone2=district.getD_phone2();
         String D_email2=district.getD_email2();
         
         if(!PreD_district.equals(D_district)){
        	 precontent1="/現药品名称:"+PreD_district+"";
             aftcontent1="/药品名称:"+D_district+"";
         } if(!PreD_company.equals(D_company)){
             precontent2="/原销售公司:"+PreD_company+"";
             aftcontent2="/现销售公司:"+D_company+"";
         } if(!PreD_form.equals(D_form)){
             precontent3="/原销售形式:"+PreD_form+"";
             aftcontent3="/现销售形式:"+D_form+"";
         } if(!PreD_phone1.equals(D_phone1)){
             precontent4="/原地区经理电话:"+PreD_phone1+"";
             aftcontent4="/现地区经理电话:"+D_phone1+"";
         } if(!PreD_email1.equals(D_email1)){
             precontent5="/原地区经理邮箱:"+PreD_email1+"";
             aftcontent5="/现地区经理邮箱:"+D_email1+"";
         } if(!PreD_phone2.equals(D_phone2)){
             precontent6="/原商务经理电话:"+PreD_phone2+"";
             aftcontent6="/现商务经理电话:"+D_phone2+"";
         } if(!PreD_email2.equals(D_email2)){
             precontent7="/原商务经理邮箱:"+PreD_email2+"";
             aftcontent7="/现商务经理邮箱:"+D_email2+"";
         }
    	
         precontent="药名:"+M_name+""+precontent2+""+precontent1+""+precontent3+""+precontent4+""+precontent5+""+precontent6+""+precontent7+"";
         aftcontent="药名:"+M_name+""+aftcontent2+""+aftcontent1+""+aftcontent3+""+aftcontent4+""+aftcontent5+""+aftcontent6+""+aftcontent7+"";
         //precontent="药名:"+M_name+"/原销售公司:"+precontent2+"/原销售地区:"+precontent1+"/原销售形式:"+precontent3+"/原地区经理电话:"+precontent4+"/原地区经理邮箱:"+precontent5+"/原商务经理电话:"+precontent6+"/原商务经理邮箱:"+precontent7+"";
         //aftcontent="药名:"+M_name+"/原销售公司:"+aftcontent2+"/原销售地区:"+aftcontent1+"/原销售形式:"+aftcontent3+"/原地区经理电话:"+aftcontent4+"/原地区经理邮箱:"+aftcontent5+"/原商务经理电话:"+aftcontent6+"/原商务经理邮箱:"+aftcontent7+"";

       
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
            db.doUpdate(sql);
            
            Predb.close();  
          //执行SQL 插入worklog命令修改记录  id自增不填  
        	sqlWorkLog="insert into worklog (operator,precontent,aftcontent,time,location,action) values ('"+operator+"','"+precontent+"','"+aftcontent+"','"+time+"','销售地区','修改')";
        	db.doUpdate(sqlWorkLog);
         
        db.close();//清理数据库模型对象
    	}
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
    public String client_districtAdmin() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    public String client_districtview() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    
    
    private String keyword;//保存请求参数中的新闻搜索关键字

    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) {this.keyword = keyword;}
    
    private List<newDistrict> searchDistrictList=null;
    
    public List<newDistrict> getSearchList() throws Exception{
    	this.searchDistrictList=new ArrayList<newDistrict>();
    
    	String sql="select * from district where M_name='"+keyword+"'";
    	doSqlDb db=new doSqlDb();
    	ResultSet rs=db.doQuery(sql);
    	int id;
        String M_name;
        String D_company;
        String D_district;
        String D_form;
        String D_phone1;
        String D_email1;
        String D_phone2;
        String D_email2;
    	while(rs.next()){
    		 id=rs.getInt("id");
        	 M_name = rs.getString("M_name");
        	 D_company = rs.getString("D_company");
        	 D_district = rs.getString("D_district");
        	 D_form = rs.getString("D_form");
        	 D_phone1 = rs.getString("D_phone1");
        	 D_email1 = rs.getString("D_email1");
        	 D_phone2 = rs.getString("D_phone2");
        	 D_email2 = rs.getString("D_email2");
        	 searchDistrictList.add(new newDistrict(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
             
    		
    		
    	}
    	db.close();
    	return searchDistrictList;
    }
  public String search() throws Exception{
	
	return SUCCESS;
	
}

*/
}
 