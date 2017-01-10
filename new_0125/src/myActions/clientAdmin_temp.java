package myActions;
//导入需要的库
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
//声明支持模型驱动的的业务控制器类

public class clientAdmin_temp extends ActionSupport implements ModelDriven<newClient> {
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
    private List<newClient> allclient = null;

    
    public List<newClient> getAllClient() throws Exception {
        
    	allclient = new ArrayList<newClient>();//创建数组列表集合对象
        doSqlDb db = new doSqlDb();//创建数据库模型对象
        ResultSet rs = db.doQuery("select * from Client");//执行查询，返回新闻栏目记录
        int C_id;
    	String M_name;
    	String C_phone;
    	String C_name;
    	String C_other;
    	String C_other2;
        while (rs.next()) {
        	 C_id=rs.getInt("C_id");
        	 M_name = rs.getString("M_name");
        	 C_name = rs.getString("C_name");
        	 C_phone = rs.getString("C_phone");
        	 C_other = rs.getString("C_other");
        	 C_other2 = rs.getString("C_other2");
        
             allclient.add(new newClient(C_id,M_name, C_name, C_phone, C_other, C_other2));//创建新闻栏目对象，加入列表对象
             
        }
        db.close();//清理数据库模型对象
        return allclient;
    }

    public String admin_clientAdd() throws Exception {        
    	 String M_name=client.getM_name();
    	 String C_phone =client.getC_phone();
         String C_name=client.getC_name();
         String C_other=client.getC_other();
         String C_other2=client.getC_other2();
        
    	
    	 doSqlDb db=new doSqlDb();
    
    	  String sql="insert into Client (M_name,C_name,C_phone,C_other,C_other2) values ('"+M_name+"','"+C_name+"','"+C_phone+"','"+C_other+"','"+C_other2+"')";
    	  db.doUpdate(sql);
    	  this.addActionMessage("成功保存添加数据");
    	
    
    	 db.close();
         
    	 return INPUT;
    }

    //admin_topicDelete为完成删除新闻栏目记录操作的同名Action方法，
    //欲删除新闻栏目记录的信息通过请求参数数传入模型，
    //Action方法从模型中取得传入的请求参数值。
   

    //admin_topicEdit为请求进入新闻栏目编辑页面的同名Action方法，
    //在Action方法中未执行任何操作，主要是利用模型传递请求参数中的欲编辑记录数据
    //在编辑页面中，使用模型字段名称的OGNL表达式获得记录各个字段的值
    public String admin_ClientEdit() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicEdit.jsp
        return SUCCESS;
    }

    //admin_topicEditSave为完成保存修改后的新闻栏目记录操作的同名Action方法，
    //需要加入数据库的新闻栏目记录数据通过请求参数传入模型，
    //Action方法从模型中取得传入的请求参数值。
    public String admin_ClientEditSave() throws Exception {
    	 String M_name=client.getM_name();
    	 String D_company =client.getD_company();
         String D_Client=client.getD_Client();
         String D_form=client.getD_form();
         String D_phone1=client.getD_phone1();
         String D_email1=client.getD_email1();
         String D_phone2=client.getD_phone2();
         String D_email2=client.getD_email2();
       
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
            sql = "update Client set D_company='"+D_company+"', D_Client='"+D_Client+"',D_form='"+D_form+"',D_phone1='"+D_phone1+"',D_email1='"+D_email1+"',D_phone2='"+D_phone2+"',D_email2='"+D_email2+"' where M_name='"+M_name+"'";
            
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
    public String admin_ClientAdmin() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    public String Client_ClientAdmin() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    public String Client_Clientview() throws Exception {
        //返回SUCCESS，表示客户端跳转到Action的success结果视图
        //根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
        return SUCCESS;
    }
    
    private List<newClient> searchClientList=null;
    
    public List<newClient> getSearchList() throws Exception{
    	this.searchClientList=new ArrayList<newClient>();
    	String M_name=Client.getM_name();
    	String sql="select * from Client where M_name='"+M_name+"'";
    	doSqlDb db=new doSqlDb();
    	ResultSet rs=db.doQuery(sql);
    	int id;
        
        String D_company;
        String D_Client;
        String D_form;
        String D_phone1;
        String D_email1;
        String D_phone2;
        String D_email2;
    	while(rs.next()){
    		 id=rs.getInt("id");
        	 M_name = rs.getString("M_name");
        	 D_company = rs.getString("D_company");
        	 D_Client = rs.getString("D_Client");
        	 D_form = rs.getString("D_form");
        	 D_phone1 = rs.getString("D_phone1");
        	 D_email1 = rs.getString("D_email1");
        	 D_phone2 = rs.getString("D_phone2");
        	 D_email2 = rs.getString("D_email2");
        	 searchClientList.add(new newClient(id,M_name, D_company, D_Client, D_form, D_phone1, D_email1, D_phone2, D_email2));//创建新闻栏目对象，加入列表对象
             
    		
    		
    	}
    	db.close();
    	return searchClientList;
    }
  public String search() throws Exception{
	
	return SUCCESS;
	
}


}
 