package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类

public class districtAdmin2 extends ActionSupport implements ModelDriven<newQuery> {
    //模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
    //和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
    //并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
    //如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
    //声明模型
	private newQuery district=new newQuery();
	
	public newQuery getModel() {
		// TODO Auto-generated method stub
		return district;
	}
	
    //声明模型方法
    
    //列表对象allTopic字段，用于存储所有新闻栏目主题记录，
    //主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
    private List<newQuery> allDistrict = null;

    
    public List<newQuery> getAllDistrict() throws Exception {
        
    	allDistrict = new ArrayList<newQuery>();//创建数组列表集合对象
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
             allDistrict.add(new newQuery(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
             
        }
        db.close();//清理数据库模型对象
        return allDistrict;
    }
  private List<newQuery> allDistrict2 = null;

  public String admin_districtinfoadmin(){
  	return SUCCESS;	
  }
  public String admin_purchaseinfoadmin(){
	  	return SUCCESS;	
	  }
    
    public List<newQuery> getAllDistrict2() throws Exception {
        
    	allDistrict2 = new ArrayList<newQuery>();//创建数组列表集合对象
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
             allDistrict2.add(new newQuery(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
             
        }
        db.close();//清理数据库模型对象
        return allDistrict2;
    }

    public String admin_queryAdd() throws Exception {        
    	 String Q_info=district.getQ_Info();
         System.out.println(Q_info);
    	 
    	 doSqlDb db=new doSqlDb();
    	 String sql="insert into query (Q_info) values ('"+Q_info+"')";
         db.doUpdate(sql);
    	
    	
    
    	 db.close();
         
    	 return INPUT;
    }

    //admin_topicDelete为完成删除新闻栏目记录操作的同名Action方法，
    //欲删除新闻栏目记录的信息通过请求参数数传入模型，
    //Action方法从模型中取得传入的请求参数值。
    public String admin_districtDelete() throws Exception {
    	int id =district.getId();
        String name = district.getM_name();
        String D_district=district.getD_district();
        String sql;
        doSqlDb db = new doSqlDb();
       
            sql = "delete from district where id="+id;
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
    
    private List<newQuery> searchDistrictList=null;
    
    public List<newQuery> getSearchList() throws Exception{
    	this.searchDistrictList=new ArrayList<newQuery>();
    
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
        	 searchDistrictList.add(new newQuery(id,M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
             
    		
    		
    	}
    	db.close();
    	return searchDistrictList;
    }
  public String search() throws Exception{
	
	return SUCCESS;
	
}


}
 