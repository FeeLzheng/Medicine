package myActions;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.opensymphony.xwork2.ModelDriven;
import jxl.Sheet;
import jxl.Workbook;



/**
 * @author Javen
 * @Email zyw205@gmail.com
 * 
 */
public class importData extends ActionSupport implements ModelDriven{
    /**
     * 查询stu表中所有的数据
     * @return 
     */
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
               
                //System.out.println(id+" "+name+" "+sex+ " "+num);
                list.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction));//创建新闻栏目对象，加入列表对象
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
        List<newMedicine> list=new ArrayList<newMedicine>();
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
                    
                    
                    
                    list.add(new newMedicine(M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction));//创建新闻栏目对象，加入列表对象
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        return list;
        
    }
    
    /**
     * 通过Id判断是否存在
     * @param id
     * @return
     */
    public boolean isExist(String M_name){
        try {
        	doSqlDb db = new doSqlDb();
            ResultSet rs=db.Search("select * from medicine where M_name=?", new String[]{M_name+""});
            if (rs.next()) {
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
        List<newMedicine> listExcel=getAllByExcel("d://HZ.xlsx");
        /*//得到数据库表中所有的数据
        List<StuEntity> listDb=StuService.getAllByDb();*/
        
        doSqlDb db = new doSqlDb();
        System.out.println("成功导入 ");
        for (newMedicine newmedicine : listExcel) {
            String M_name=newmedicine.getM_name();
            if (!isExist(M_name)) {
                //不存在就添加
                String sql="insert into medicine (M_name, M_id, M_standard1, M_standard2, M_adaptation, M_use, M_effect, M_execute, M_instruction) values(?,?,?,?,?,?,?,?,?)";
                db.doUpdate(sql);
              
            }
            
            /*else {
                //存在就更新
                String sql="update stu set name=?,sex=?,num=? where id=?";
                String[] str=new String[]{stuEntity.getName(),stuEntity.getSex(),stuEntity.getNum()+"",id+""};
                db.AddU(sql, str);
            }*/
        }
        this.addActionMessage("成功保存添加数据");
        db.close();
		 return SUCCESS;
    }

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return null;
	}

    
}