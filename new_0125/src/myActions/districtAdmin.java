package myActions;

//导入需要的库
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

public class districtAdmin extends ActionSupport implements
		ModelDriven<newDistrict> {
	// 模型封装了新闻栏目的ID（字段名称id）、父栏目ID（字段名称parentId）
	// 和栏目名称（字段名称title），在通过视图请求控制器时，同名的请求参数保存到对应字段中，
	// 并将字段对象存放于ActionContext中，在结果视图中使用字段名称的OGNL表达式获得字段值
	// 如果请求参数中无同名参数，模型的int字段默认为0，String字段默认为空字符串。
	// 声明模型
	private newDistrict district = new newDistrict();

	public newDistrict getModel() {
		// TODO Auto-generated method stub
		return district;
	}

	// 声明模型方法

	// 列表对象allTopic字段，用于存储所有新闻栏目主题记录，
	// 主要用于在新闻栏目管理页面中，输出新闻栏目信息列表。
	private List<newDistrict> allDistrict = null;

	public List<newDistrict> getAllDistrict() throws Exception {

		allDistrict = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY M_name order by convert(M_name USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
		System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allDistrict.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allDistrict;
	}
	
	private List<newDistrict> allDistrict20 = null;

	public List<newDistrict> getAllDistrict20() throws Exception {

		allDistrict20 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_phone1,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_phone1 order by convert(D_phone1 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
//		System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allDistrict20.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allDistrict20;
	}
	private List<newDistrict> allDistrict21 = null;

	public List<newDistrict> getAllDistrict21() throws Exception {

		allDistrict21 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_email1,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_email1 order by convert(D_email1 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
//		System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allDistrict21.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allDistrict21;
	}
		
	private List<newDistrict> allDistrict22 = null;

	public List<newDistrict> getAllDistrict22() throws Exception {

		allDistrict22 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_phone2,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_phone2 order by convert(D_phone2 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
//		System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allDistrict22.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allDistrict22;
	}
	
	private List<newDistrict> allDistrict23 = null;

	public List<newDistrict> getAllDistrict23() throws Exception {

		allDistrict23 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_email2,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_email2 order by convert(D_email2 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
//		System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allDistrict23.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allDistrict23;
	}
	
	
	
	private List<newDistrict> Manager1 = null;

	public List<newDistrict> getallManager1() throws Exception {

		Manager1 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		System.out.println("0");
		
		ResultSet rs = db.doQuery("select D_phone1,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_phone1 order by convert(D_phone1 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
		System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			Manager1.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return Manager1;
	}
	
	
	private List<newDistrict> allManager2 = null;

	public List<newDistrict> getallManager2() throws Exception {

		allManager2 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_email1,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_email1 order by convert(D_email1 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
		//System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allManager2.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allManager2;
	}
	
	private List<newDistrict> allManager3 = null;

	public List<newDistrict> getallManager3() throws Exception {

		allManager3 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_phone2,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_phone2 order by convert(D_phone2 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
		//System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allManager3.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allManager3;
	}
	
	private List<newDistrict> allManager4 = null;

	public List<newDistrict> getallManager4() throws Exception {

		allManager4 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select D_email2,M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district group BY D_email2 order by convert(D_email2 USING gbk)");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
		//System.out.println("1");
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(D_company);
			allManager4.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//int n=0;
			//allDistrict.get(n).getD_company();
			//n++;
		}
		db.close();// 清理数据库模型对象
		return allManager4;
	}
	//药品地址统一修改
	private List<newDistrict> allDistrict9 = null;

	public List<newDistrict> getAllDistrict9() throws Exception {

		allDistrict9 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		//ResultSet rs = db.doQuery("select M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district GROUP BY  M_name ");// 执行查询，返回新闻栏目记录
		//ResultSet rs = db.doQuery("select distinct M_name,id,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2 from district");
		//System.out.println("1");
		String M_name = district.getM_name();
		//System.out.print(M_name+1);
		ResultSet rs = db.doQuery("select * from district where M_name='"
				+ M_name + "'");
		//System.out.print(M_name+2);
		
		int id;
		//String M_name;
		String D_company;
		String D_district;
		String D_form;
		String D_phone1;
		String D_email1;
		String D_phone2;
		String D_email2;
		while (rs.next()) {
			id = rs.getInt("id");
			//M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			//System.out.println(M_name+3);
			//System.out.println(D_company+3);
			//System.out.println(D_district+3);
			//System.out.println(D_phone1+3);
			//System.out.println(D_phone2+3);
			//System.out.println(D_phone1);
			//System.out.println(id+3);
			
			allDistrict9.add(new newDistrict(id, M_name, D_company, D_district,D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象
			//System.out.println(M_name+5);
		}
		db.close();// 清理数据库模型对象
		return allDistrict9;
	}
	
	
	
	
	private List<String> allDistrict_only = null;

	public List<String> getAllDistrict_only() throws Exception {

		allDistrict = new ArrayList();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		ResultSet rs = db.doQuery("select distinct M_name from district ");// 执行查询，返回新闻栏目记录
		int id=0;
		String M_name;
		
		while (rs.next()) {
			id=id++;
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			
			allDistrict_only.add(M_name);// 创建新闻栏目对象，加入列表对象

		}
		db.close();// 清理数据库模型对象
		return allDistrict_only;
	}
	

	private List<newDistrict> allDistrict2 = null;

	/**
	 * private List<newDistrict> allDistrict3 = null; private List<newDistrict>
	 * allDistrict4 = null; private List<newDistrict> allDistrict5 = null;
	 * private List<newDistrict> allDistrict6 = null; private List<newDistrict>
	 * allDistrict7 = null; private List<newDistrict> allDistrict8 = null;
	 **/
	public String admin_districtinfoadmin() {
		return SUCCESS;
	}
	public String admin_districtinfoadmin2() {
		return SUCCESS;
	}

	public String admin_purchaseinfoadmin() {
		return SUCCESS;
	}
	public String admin_purchaseinfoadmin2() {
		return SUCCESS;
	}

	public String admin_queryadmin() {
		return SUCCESS;
	}
	public String admin_queryadmin2() {
		return SUCCESS;
	}

	public String admin_Complainadmin() {
		return SUCCESS;
	}
	public String admin_Complainadmin2() {
		return SUCCESS;
	}
	
	public String admin_department() {
		return SUCCESS;
	}
	public String admin_department2() {
		return SUCCESS;
	}
    public String admin_departmentadmin(){
    	return SUCCESS;
    }
    public String admin_departmentadmin2(){
    	return SUCCESS;
    }
    
	public String admin_othersadmin() {
		return SUCCESS;
	}
	public String admin_othersadmin2() {
		return SUCCESS;
	}
	
	public String admin_Reactionadmin() {
		return SUCCESS;
	}
	public String admin_Reactionadmin2() {
		return SUCCESS;
	}

	public List<newDistrict> getAllDistrict2() throws Exception {

		allDistrict2 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		String M_name = district.getM_name();
		ResultSet rs = db.doQuery("select * from district where M_name='"
				+ M_name + "'order by convert(D_district USING gbk)");// 执行查询，返回新闻栏目记录
		int id;

		String D_company;
		String D_district;
		String D_form;
		String D_phone1;
		String D_email1;
		String D_phone2;
		String D_email2;
		while (rs.next()) {
			id = rs.getInt("id");

			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			System.out.println(D_district);
			allDistrict2.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象

		}
		db.close();// 清理数据库模型对象
		return allDistrict2;
	}
	
	//地址详情
	private List<newDistrict> allDistrict4 = null;
	public List<newDistrict> getAllDistrict4() throws Exception {

		allDistrict4 = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		String M_name = district.getM_name();
		int id=district.getId();
		String D_district=district.getD_district();
		System.out.println("District4  "+id);
		ResultSet rs = db.doQuery("select * from district where id='"
				+ id + "'");// 执行查询，返回新闻栏目记录
		

		String D_company;
		
		String D_form;
		String D_phone1;
		String D_email1;
		String D_phone2;
		String D_email2;
		while (rs.next()) {
			id = rs.getInt("id");

			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			
			allDistrict4.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象

		}
		db.close();// 清理数据库模型对象
		return allDistrict4;
	}
	 private String Di_province;//保存请求参数中的新闻搜索关键字

	    public String getDi_province() { return Di_province; }
	    public void setDi_province(String Di_province) {this.Di_province = Di_province;}
	
	private List<newDistrict> alliphone = null;
	public List<newDistrict> getAllIphone() throws Exception {

		alliphone = new ArrayList<newDistrict>();// 创建数组列表集合对象
		doSqlDb db = new doSqlDb();// 创建数据库模型对象
		
	
	//System.out.println("客户所在省"+Di_province);
		ResultSet rs = db.doQuery("select * from district where D_district='"
				+ Di_province + "'");// 执行查询，返回新闻栏目记录
		
		String M_name=null; 
		String D_district=Di_province; 
		int id;
		String D_company;
		
		String D_form;
		String D_phone1;
		String D_email1;
		String D_phone2;
		String D_email2;
		while (rs.next()) {
			id = rs.getInt("id");

			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			
			alliphone.add(new newDistrict(id, M_name, D_company, D_district,
					D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象

		}
		db.close();// 清理数据库模型对象
		return alliphone;
	}
	
	
	public String districtDetail() throws Exception{
		
		return SUCCESS;
	} 
	
	 private List<newMedicine> allMedicine2 = null;
	    public List<newMedicine> getAllMedicine2() throws Exception {
	        
	        allMedicine2 = new ArrayList<newMedicine>();//创建数组列表集合对象
	        String M_name = district.getM_name();
	        doSqlDb db = new doSqlDb();//创建数据库模型对象
	        int sum=0;
	        int i=1;
	        ResultSet rs = db.doQuery("select * from medicine where M_name='"+M_name+"'");//执行查询，返回新闻栏目记录
	        //String M_name;
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
	/**
	 * public List<newDistrict> getAllDistrict3() throws Exception {
	 * 
	 * allDistrict3 = new ArrayList<newDistrict>();//创建数组列表集合对象 doSqlDb db = new
	 * doSqlDb();//创建数据库模型对象 String M_name=district.getM_name(); ResultSet rs =
	 * db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，
	 * 返回新闻栏目记录 int id;
	 * 
	 * String D_company; String D_district; String D_form; String D_phone1;
	 * String D_email1; String D_phone2; String D_email2; while (rs.next()) {
	 * id=rs.getInt("id");
	 * 
	 * D_company = rs.getString("D_company"); D_district =
	 * rs.getString("D_district"); D_form = rs.getString("D_form"); D_phone1 =
	 * rs.getString("D_phone1"); D_email1 = rs.getString("D_email1"); D_phone2 =
	 * rs.getString("D_phone2"); D_email2 = rs.getString("D_email2");
	 * System.out.println(D_email2); allDistrict3.add(new newDistrict(id,M_name,
	 * D_company, D_district, D_form, D_phone1, D_email1, D_phone2,
	 * D_email2));//创建新闻栏目对象，加入列表对象
	 * 
	 * } db.close();//清理数据库模型对象 return allDistrict3; } public List<newDistrict>
	 * getAllDistrict4() throws Exception {
	 * 
	 * allDistrict4 = new ArrayList<newDistrict>();//创建数组列表集合对象 doSqlDb db = new
	 * doSqlDb();//创建数据库模型对象 String M_name=district.getM_name(); ResultSet rs =
	 * db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，
	 * 返回新闻栏目记录 int id;
	 * 
	 * String D_company; String D_district; String D_form; String D_phone1;
	 * String D_email1; String D_phone2; String D_email2; while (rs.next()) {
	 * id=rs.getInt("id");
	 * 
	 * D_company = rs.getString("D_company"); D_district =
	 * rs.getString("D_district"); D_form = rs.getString("D_form"); D_phone1 =
	 * rs.getString("D_phone1"); D_email1 = rs.getString("D_email1"); D_phone2 =
	 * rs.getString("D_phone2"); D_email2 = rs.getString("D_email2");
	 * System.out.println(D_email2); allDistrict4.add(new newDistrict(id,M_name,
	 * D_company, D_district, D_form, D_phone1, D_email1, D_phone2,
	 * D_email2));//创建新闻栏目对象，加入列表对象
	 * 
	 * } db.close();//清理数据库模型对象 return allDistrict4; } public List<newDistrict>
	 * getAllDistrict5() throws Exception {
	 * 
	 * allDistrict5 = new ArrayList<newDistrict>();//创建数组列表集合对象 doSqlDb db = new
	 * doSqlDb();//创建数据库模型对象 String M_name=district.getM_name(); ResultSet rs =
	 * db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，
	 * 返回新闻栏目记录 int id;
	 * 
	 * String D_company; String D_district; String D_form; String D_phone1;
	 * String D_email1; String D_phone2; String D_email2; while (rs.next()) {
	 * id=rs.getInt("id");
	 * 
	 * D_company = rs.getString("D_company"); D_district =
	 * rs.getString("D_district"); D_form = rs.getString("D_form"); D_phone1 =
	 * rs.getString("D_phone1"); D_email1 = rs.getString("D_email1"); D_phone2 =
	 * rs.getString("D_phone2"); D_email2 = rs.getString("D_email2");
	 * System.out.println(D_email2); allDistrict5.add(new newDistrict(id,M_name,
	 * D_company, D_district, D_form, D_phone1, D_email1, D_phone2,
	 * D_email2));//创建新闻栏目对象，加入列表对象
	 * 
	 * } db.close();//清理数据库模型对象 return allDistrict5; } public List<newDistrict>
	 * getAllDistrict6() throws Exception {
	 * 
	 * allDistrict6 = new ArrayList<newDistrict>();//创建数组列表集合对象 doSqlDb db = new
	 * doSqlDb();//创建数据库模型对象 String M_name=district.getM_name(); ResultSet rs =
	 * db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，
	 * 返回新闻栏目记录 int id;
	 * 
	 * String D_company; String D_district; String D_form; String D_phone1;
	 * String D_email1; String D_phone2; String D_email2; while (rs.next()) {
	 * id=rs.getInt("id");
	 * 
	 * D_company = rs.getString("D_company"); D_district =
	 * rs.getString("D_district"); D_form = rs.getString("D_form"); D_phone1 =
	 * rs.getString("D_phone1"); D_email1 = rs.getString("D_email1"); D_phone2 =
	 * rs.getString("D_phone2"); D_email2 = rs.getString("D_email2");
	 * System.out.println(D_email2); allDistrict6.add(new newDistrict(id,M_name,
	 * D_company, D_district, D_form, D_phone1, D_email1, D_phone2,
	 * D_email2));//创建新闻栏目对象，加入列表对象
	 * 
	 * } db.close();//清理数据库模型对象 return allDistrict6; } public List<newDistrict>
	 * getAllDistrict7() throws Exception {
	 * 
	 * allDistrict7 = new ArrayList<newDistrict>();//创建数组列表集合对象 doSqlDb db = new
	 * doSqlDb();//创建数据库模型对象 String M_name=district.getM_name(); ResultSet rs =
	 * db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，
	 * 返回新闻栏目记录 int id;
	 * 
	 * String D_company; String D_district; String D_form; String D_phone1;
	 * String D_email1; String D_phone2; String D_email2; while (rs.next()) {
	 * id=rs.getInt("id");
	 * 
	 * D_company = rs.getString("D_company"); D_district =
	 * rs.getString("D_district"); D_form = rs.getString("D_form"); D_phone1 =
	 * rs.getString("D_phone1"); D_email1 = rs.getString("D_email1"); D_phone2 =
	 * rs.getString("D_phone2"); D_email2 = rs.getString("D_email2");
	 * System.out.println(D_email2); allDistrict7.add(new newDistrict(id,M_name,
	 * D_company, D_district, D_form, D_phone1, D_email1, D_phone2,
	 * D_email2));//创建新闻栏目对象，加入列表对象
	 * 
	 * } db.close();//清理数据库模型对象 return allDistrict7; } public List<newDistrict>
	 * getAllDistrict8() throws Exception {
	 * 
	 * allDistrict8 = new ArrayList<newDistrict>();//创建数组列表集合对象 doSqlDb db = new
	 * doSqlDb();//创建数据库模型对象 String M_name=district.getM_name(); ResultSet rs =
	 * db.doQuery("select * from district where M_name='"+M_name+"'");//执行查询，
	 * 返回新闻栏目记录 int id;
	 * 
	 * String D_company; String D_district; String D_form; String D_phone1;
	 * String D_email1; String D_phone2; String D_email2; while (rs.next()) {
	 * id=rs.getInt("id");
	 * 
	 * D_company = rs.getString("D_company"); D_district =
	 * rs.getString("D_district"); D_form = rs.getString("D_form"); D_phone1 =
	 * rs.getString("D_phone1"); D_email1 = rs.getString("D_email1"); D_phone2 =
	 * rs.getString("D_phone2"); D_email2 = rs.getString("D_email2");
	 * System.out.println(D_email2); allDistrict8.add(new newDistrict(id,M_name,
	 * D_company, D_district, D_form, D_phone1, D_email1, D_phone2,
	 * D_email2));//创建新闻栏目对象，加入列表对象
	 * 
	 * } db.close();//清理数据库模型对象 return allDistrict8; }
	 **/

	public String admin_districtAdd() throws Exception {
		int id = district.getId();
		
		String M_name = district.getM_name();
		String D_company = district.getD_company();
		String D_district = district.getD_district();
		String D_form = district.getD_form();
		String D_phone1 = district.getD_phone1();
		String D_email1 = district.getD_email1();
		String D_phone2 = district.getD_phone2();
		String D_email2 = district.getD_email2();
		System.out.println(M_name + "1");
		String sql = "select * from district where M_name='" + M_name + "'";
		doSqlDb db = new doSqlDb();
		ResultSet re = db.doQuery(sql);

		sql = "insert into district (M_name,D_company,D_district,D_form,D_phone1,D_email1,D_phone2,D_email2) values ('"
				+ M_name
				+ "','"
				+ D_company
				+ "','"
				+ D_district
				+ "','"
				+ D_form
				+ "','"
				+ D_phone1
				+ "','"
				+ D_email1
				+ "','"
				+ D_phone2 + "','" + D_email2 + "')";
		db.doUpdate(sql);
		this.addActionMessage("成功保存添加数据");

		db.close();

		return INPUT;
	}
	
	public String admin_managerEditSave1() throws Exception {
		String D_form = district.getD_form();
		String D_phone1 = district.getD_phone1();
		//String M_name = district.getM_name();
		//String D_company = district.getD_company();
//		String D_district = district.getD_district();
//		String D_form = district.getD_form();
//		String D_phone1 = district.getD_phone1();
//		String D_email1 = district.getD_email1();
//		String D_phone2 = district.getD_phone2();
//		String D_email2 = district.getD_email2();

		String sql;
		doSqlDb db = new doSqlDb();
		System.out.print(D_form);
		System.out.print(D_phone1);
      sql = "update district set D_phone1='"+D_phone1+"' where D_phone1= '" +D_form+"'" ;
      System.out.print(sql);
		int A = db.doUpdate(sql);
		//System.out.println(A);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
		return SUCCESS;
	}
	
	public String admin_managerEditSave2() throws Exception {
		String D_form = district.getD_form();
		String D_phone1 = district.getD_email1();
		//String M_name = district.getM_name();
		//String D_company = district.getD_company();
//		String D_district = district.getD_district();
//		String D_form = district.getD_form();
//		String D_phone1 = district.getD_phone1();
//		String D_email1 = district.getD_email1();
//		String D_phone2 = district.getD_phone2();
//		String D_email2 = district.getD_email2();

		String sql;
		doSqlDb db = new doSqlDb();
     
      sql = "update district set D_email1='"+D_phone1+"' where D_phone1= '" +D_form+"'" ;
      
		int A = db.doUpdate(sql);
		//System.out.println(A);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
		return SUCCESS;
	}
	
	public String admin_managerEditSave3() throws Exception {
		String D_form = district.getD_form();
		String D_phone1 = district.getD_phone2();
		//String M_name = district.getM_name();
		//String D_company = district.getD_company();
//		String D_district = district.getD_district();
//		String D_form = district.getD_form();
//		String D_phone1 = district.getD_phone1();
//		String D_email1 = district.getD_email1();
//		String D_phone2 = district.getD_phone2();
//		String D_email2 = district.getD_email2();

		String sql;
		doSqlDb db = new doSqlDb();
     
      sql = "update district set D_phone2='"+D_phone1+"' where D_phone1= '" +D_form+"'" ;
      
		int A = db.doUpdate(sql);
		//System.out.println(A);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
		return SUCCESS;
	}
	
	public String admin_managerEditSave4() throws Exception {
		String D_form = district.getD_form();
		String D_phone1 = district.getD_email2();
		//String M_name = district.getM_name();
		//String D_company = district.getD_company();
//		String D_district = district.getD_district();
//		String D_form = district.getD_form();
//		String D_phone1 = district.getD_phone1();
//		String D_email1 = district.getD_email1();
//		String D_phone2 = district.getD_phone2();
//		String D_email2 = district.getD_email2();

		String sql;
		doSqlDb db = new doSqlDb();
     
      sql = "update district set D_email2='"+D_phone1+"' where D_phone1= '" +D_form+"'" ;
      
		int A = db.doUpdate(sql);
		//System.out.println(A);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
		return SUCCESS;
	}
	

	// admin_topicDelete为完成删除新闻栏目记录操作的同名Action方法，
	// 欲删除新闻栏目记录的信息通过请求参数数传入模型，
	// Action方法从模型中取得传入的请求参数值。
	public String admin_districtDelete() throws Exception {
		int id = district.getId();
		String name = district.getM_name();
		String D_district = district.getD_district();
		String sql;
		doSqlDb db = new doSqlDb();
		 System.out.println(id);
		sql = "delete from district where id=" + id;
		db.doUpdate(sql);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示完成上述操作后，客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicDelete.jsp
		return SUCCESS;
	}

	// admin_topicEdit为请求进入新闻栏目编辑页面的同名Action方法，
	// 在Action方法中未执行任何操作，主要是利用模型传递请求参数中的欲编辑记录数据
	// 在编辑页面中，使用模型字段名称的OGNL表达式获得记录各个字段的值
	public String admin_districtEdit() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicEdit.jsp
		//System.out.println("我来过");
		return SUCCESS;
	}
	public String admin_districtEdit2() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicEdit.jsp
		//System.out.println("我来过");
		return SUCCESS;
	}

	// admin_topicEditSave为完成保存修改后的新闻栏目记录操作的同名Action方法，
	// 需要加入数据库的新闻栏目记录数据通过请求参数传入模型，
	// Action方法从模型中取得传入的请求参数值。
	public String admin_districtEditSave() throws Exception {
		int id = district.getId();
		//String M_name = district.getM_name();
		//String D_company = district.getD_company();
		String D_district = district.getD_district();
		//String D_form = district.getD_form();
		String D_phone1 = district.getD_phone1();
		String D_email1 = district.getD_email1();
		String D_phone2 = district.getD_phone2();
		String D_email2 = district.getD_email2();

		String sql;
		doSqlDb db = new doSqlDb();
     
		// 在新闻栏目名称重复时，不执行记录修改操作。
		// 添加Action信息，该信息显示在结果视图中提示用户

		// admin_topicEditSave的Action配置没有使用动态配置，
		// 返回INPUT表示在不能完成保存保存时，客户端跳转到input视图，
		// input视图的Action配为：
		// <result name="input" type="chain">
		// <param name="actionName">admin_topicEdit</param>
		// </result>
		// chain表示结果为Action链，即客户端跳转到admin_topicEdit，
		// 使用Action链是为了将当前Action中的数据传入下一个Action，
		// 即可在创新进入编辑页面时，使页面显示之前提交的数据

		// 执行SQL UPDATE命令修改记录
		//sql = "update district set D_company='" + D_company + "', D_district='"
			//	+ D_district + "',D_form='" + D_form + "',D_phone1='"
			//	+ D_phone1 + "',D_email1='" + D_email1 + "',D_phone2='"
			//	+ D_phone2 + "',D_email2='" + D_email2 + "' where id=" +id;

      sql = "update district set D_district='"
  			+ D_district + "',D_phone1='"+ D_phone1 + "',D_email1='" + D_email1 + "',D_phone2='"
      + D_phone2 + "',D_email2='" + D_email2 + "' where id=" +id;
      
		int A = db.doUpdate(sql);
		//System.out.println(A);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
		return SUCCESS;
	}

	
	public String admin_districtEditSave2() throws Exception {
		int id = district.getId();
		String M_name = district.getM_name();
		String D_company = district.getD_company();
		//String D_district = district.getD_district();
		String D_form = district.getD_form();
		//String D_phone1 = district.getD_phone1();
		//String D_email1 = district.getD_email1();
		//String D_phone2 = district.getD_phone2();
		//String D_email2 = district.getD_email2();
System.out.println(id);
System.out.println(M_name);
System.out.println(D_company);
		String sql;
		doSqlDb db = new doSqlDb();
     
		// 在新闻栏目名称重复时，不执行记录修改操作。
		// 添加Action信息，该信息显示在结果视图中提示用户

		// admin_topicEditSave的Action配置没有使用动态配置，
		// 返回INPUT表示在不能完成保存保存时，客户端跳转到input视图，
		// input视图的Action配为：
		// <result name="input" type="chain">
		// <param name="actionName">admin_topicEdit</param>
		// </result>
		// chain表示结果为Action链，即客户端跳转到admin_topicEdit，
		// 使用Action链是为了将当前Action中的数据传入下一个Action，
		// 即可在创新进入编辑页面时，使页面显示之前提交的数据

		// 执行SQL UPDATE命令修改记录
		//sql = "update district set D_company='" + D_company + "', D_district='"
			//	+ D_district + "',D_form='" + D_form + "',D_phone1='"
			//	+ D_phone1 + "',D_email1='" + D_email1 + "',D_phone2='"
			//	+ D_phone2 + "',D_email2='" + D_email2 + "' where id=" +id;

      sql = "update district set D_company='"
  			+ D_company + "',D_form='"+ D_form + "' where id=" +id;
      
		int A = db.doUpdate(sql);
		//System.out.println(A);

		db.close();// 清理数据库模型对象
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 结果视图为admin_topicAdmin.jsp，即重新进入新闻栏目管理页面
		return SUCCESS;
	}
	
	// 该类中的Action均通过命名方法访问，execute() 在此可以省略

	// admin_topicAdmin为请求进入新闻栏目管理页面的同名Action方法，
	// 在Action方法中未执行任何操作，只是通过Action类的各个字段传递数据
	public String admin_districtAdmin() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}

	public String client_districtAdmin() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	public String admin_managerAdmin1() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	public String admin_managerAdmin2() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	public String admin_managerAdmin3() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}

	public String admin_managerAdmin4() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	
	public String admin_managerEdit1() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	public String admin_managerEdit3() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	public String admin_managerEdit2() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}
	public String admin_managerEdit4() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}

	
	public String client_districtview() throws Exception {
		// 返回SUCCESS，表示客户端跳转到Action的success结果视图
		// 根据Action动态配置规则，结果视图为admin_topicAdmin.jsp
		return SUCCESS;
	}

	private String keyword;// 保存请求参数中的新闻搜索关键字

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	private List<newDistrict> searchDistrictList = null;

	public List<newDistrict> getSearchList() throws Exception {
		this.searchDistrictList = new ArrayList<newDistrict>();

		String sql = "select * from district where M_name='" + keyword + "'";
		doSqlDb db = new doSqlDb();
		ResultSet rs = db.doQuery(sql);
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
			id = rs.getInt("id");
			M_name = rs.getString("M_name");
			D_company = rs.getString("D_company");
			D_district = rs.getString("D_district");
			D_form = rs.getString("D_form");
			D_phone1 = rs.getString("D_phone1");
			D_email1 = rs.getString("D_email1");
			D_phone2 = rs.getString("D_phone2");
			D_email2 = rs.getString("D_email2");
			searchDistrictList
					.add(new newDistrict(id, M_name, D_company, D_district,
							D_form, D_phone1, D_email1, D_phone2, D_email2));// 创建新闻栏目对象，加入列表对象

		}
		db.close();
		return searchDistrictList;
	}
	public String search5() throws Exception{
		
		return SUCCESS;
	} 
	
	public String search() throws Exception {

		return SUCCESS;

	}
	public String iphoneDetail() throws Exception {

		return SUCCESS;

	}
	public String admin_mains_districtInfo() throws Exception {
		
		return SUCCESS;
	}
	
	
	public List<newDistrict> getAllByExcel(String file){
		List<newDistrict> list2=null;
	     list2=new ArrayList<newDistrict>();
	    try {
	        Workbook rwb1=Workbook.getWorkbook(new File(file));
	        Sheet rs=rwb1.getSheet(0);//或者rwb.getSheet(0)
	        int clos=rs.getColumns();//得到所有的列
	        int rows=rs.getRows();//得到所有的行
	        System.out.println("123");
	        System.out.println(clos+" rows:"+rows);
	       // int j=0;
	        for (int i = 1; i < rows-1; i++) {
	            for (int j = 0; j < clos; j++) {
	        	
	                //第一个是列数，第二个是行数
	            	String M_name=rs.getCell(j++, i).getContents();//药品名称
	            	System.out.println(i);
	            	System.out.println("1");
	            	String D_company=rs.getCell(j++, i).getContents();//销售公司
	            	 String D_district=rs.getCell(j++, i).getContents();//经销产地
	            	 System.out.println("2");
	                 String D_form=rs.getCell(j++, i).getContents();//形式
	                String D_phone1=rs.getCell(j++, i).getContents();//电话1
	                String D_email1=rs.getCell(j++, i).getContents();//邮件1
	                String D_phone2=rs.getCell(j++, i).getContents();//电话2
	                System.out.println("3");
	                String D_email2=rs.getCell(j++, i).getContents();//邮件2
	                int id=0;
	                //j=j++;
	                System.out.println("4");
	                String M_date=null;
	               
	                list2.add(new newDistrict(id,M_name,D_company, D_district, D_form, D_phone1,D_email1,D_phone2,D_email2));//创建新闻栏目对象，加入列表对象
	            }
	        System.out.println("5");
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
	    	String sql="select * from district where M_name='"+M_name+"'";
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

	public String admin_importD2() throws Exception {
	    //得到表格中所有的数据
	    List<newDistrict> listExcel2=getAllByExcel("d://HZ_district.xls");
	    /*//得到数据库表中所有的数据
	    List<StuEntity> listDb=StuService.getAllByDb();*/
	    
	    doSqlDb db = new doSqlDb();
	    //System.out.println("成功导入 ");
	    String M_name=null;
	    String D_district=null;
	    String D_form=null;
	    String D_company=null;
	    String D_phone1=null;
	    String D_phone2=null;
	    String D_email1=null;
	    String D_email2=null;
	    
	    for (int i=1;i<=listExcel2.size();i++) {
	    	//M_name=listExcel.get(i).getM_id();
	        M_name=listExcel2.get(i).getM_name();
	        D_company=listExcel2.get(i).getD_company();
	        D_district=listExcel2.get(i).getD_district();
	        D_form=listExcel2.get(i).getD_form();
	        D_phone1=listExcel2.get(i).getD_phone1();
	        D_email1=listExcel2.get(i).getD_email1();
	        D_phone2=listExcel2.get(i).getD_phone2();
	        D_email2=listExcel2.get(i).getD_email2();
	       
	        String M_date=null;
	      	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	      	 M_date=sdf.format(new Date());
	        
	        System.out.println(M_name);
	       
	            //不存在就添加
	        	System.out.println("tianjia ");
	            String sql="insert into district (M_name, D_company, D_district, D_form, D_phone1, D_email1, D_phone2, D_email2) values('"+M_name+"','"+D_company+"','"+D_district+"','"+D_form+"','"+D_phone1+"','"+D_email1+"','"+D_phone2+"','"+D_email2+"')";
	            db.doUpdate(sql);
	            System.out.println("成功导入2 ");
	        
	       	        
	        
	    }
	    this.addActionMessage("成功保存添加数据");
	    db.close();
		 return SUCCESS;
	}
}
