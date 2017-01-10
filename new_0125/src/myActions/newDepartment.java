package myActions;
public class newDepartment{
	int id;
	int C_id;
	String Da_info;
	String M_name;
	String D_district;
	String Da_date;
	String Da_province;
	String Da_name;
	String Da_iphone;
	String D_company;
	String Da_user;
	
	
	public newDepartment(){}


	public newDepartment(int id, int c_id, String da_info, String m_name,
			String d_district, String da_date, String da_province,
			String da_name, String da_iphone,String d_company,String da_user) {
		super();
		this.id = id;
		C_id = c_id;
		Da_info = da_info;
		M_name = m_name;
		D_district = d_district;
		Da_date = da_date;
		Da_province = da_province;
		Da_name = da_name;
		Da_iphone = da_iphone;
		D_company=d_company;
		Da_user=da_user;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getC_id() {
		return C_id;
	}


	public void setC_id(int c_id) {
		C_id = c_id;
	}


	public String getDa_info() {
		return Da_info;
	}


	public void setDa_info(String da_info) {
		Da_info = da_info;
	}


	public String getM_name() {
		return M_name;
	}


	public void setM_name(String m_name) {
		M_name = m_name;
	}


	public String getD_district() {
		return D_district;
	}


	public void setD_district(String d_district) {
		D_district = d_district;
	}


	public String getDa_date() {
		return Da_date;
	}


	public void setDa_date(String da_date) {
		Da_date = da_date;
	}


	public String getDa_province() {
		return Da_province;
	}


	public void setDa_province(String da_province) {
		Da_province = da_province;
	}


	public String getDa_name() {
		return Da_name;
	}


	public void setDa_name(String da_name) {
		Da_name = da_name;
	}


	public String getDa_iphone() {
		return Da_iphone;
	}


	public void setDa_iphone(String da_iphone) {
		Da_iphone = da_iphone;
	}
	
	public String getDa_user() {
		return Da_user;
	}


	public void setDa_user(String da_user) {
		Da_user = da_user;
	}
	
	public String getD_company() {
		return D_company;
	}


	public void setD_company(String d_company) {
		D_company = d_company;
	}
	
}