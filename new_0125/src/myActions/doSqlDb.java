package myActions;
import java.sql.*;


public class doSqlDb {
    Connection Con;  		//连接对象，用于建立和管理数据库连接
    Statement St;   		//语句对象，用于执行SQL命令，完成数据库操作
    ResultSet Rs;   		//记录集对象，用于保存查询结果
    public doSqlDb() throws Exception {
        //构造函数，创建数据库连接、创建执行SQL命令的语句对象
        //设置数据源对象参数
        SQLServerDataSource ds = new SQLServerDataSource();  

     
        this.Con = ds.getconnection();//创建数据库连接
       // System.out.println("Con ="+Con);
        //St=Con.createStatement();
        St=ds.getconnection().createStatement();
        //System.out.println("St = "+St);
        
        this.Rs = null;
    }
    public int doUpdate(String sql) throws Exception {
        //执行SQL添加、删除和修改等更新命令
        return this.St.executeUpdate(sql);
    }
    public ResultSet doQuery(String sql) throws Exception {
        //执行SQL查询命令，返回查询结果集对象
    	//System.out.println("doQuery"+sql);
        return this.St.executeQuery(sql);
    }
    public void close() throws Exception {//执行清理操作        
        this.Rs=null;        
        //if(!this.St.isClosed()){   不知道为什么isClosed()报错。所以加了if(this.St!=null){
        if(this.St!=null){
            this.St.close();
            this.St=null;
        }
        if (!this.Con.isClosed()) {
            this.Con.close();
            this.Con = null;
        }
    }
    public ResultSet  Search(String sql, String str[]) {
    	//doSqlDb();
        ResultSet res = null;
		try {
            PreparedStatement pst =Con.prepareStatement(sql);
            if (str != null) {
                for (int i = 0; i < str.length; i++) {
                    pst.setString(i + 1, str[i]);
                }
            }
            res = pst.executeQuery();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return res;
    }


}
