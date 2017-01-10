package myActions;
public class newDistrictinfo{
	int id;
	int C_id;
	String Di_info;
	String M_name;
	String D_district;
	String D_company;
	String Di_date;
	String Di_province;
	String Di_name;
	String Di_iphone;
	String Di_user;
	public newDistrictinfo(){}
	public newDistrictinfo(int id, int c_id, String di_info, String m_name,
			String d_district, String di_date, String di_province,
			String di_name, String di_iphone,String d_company,String di_user) {
		super();
		this.id = id;
		C_id = c_id;
		Di_info = di_info;
		M_name = m_name;
		D_district = d_district;
		Di_date = di_date;            
		Di_province = di_province;
		Di_name = di_name;
		Di_iphone = di_iphone;
		D_company=d_company;
		Di_user=Di_user;
	}
	
	public String getDi_user() {
		return Di_user;
	}
	public void setDi_user(String Di_user) {
		D_company = Di_user;
	}
	
	public String getD_company() {
		return D_company;
	}
	public void setD_company(String d_company) {
		D_company = d_company;
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
	public String getDi_info() {
		return Di_info;
	}
	public void setDi_info(String di_info) {
		Di_info = di_info;
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
	public String getDi_date() {
		return Di_date;
	}
	public void setDi_date(String di_date) {
		Di_date = di_date;
	}
	public String getDi_province() {
		return Di_province;
	}
	public void setDi_province(String di_province) {
		Di_province = di_province;
	}
	public String getDi_name() {
		return Di_name;
	}
	public void setDi_name(String di_name) {
		Di_name = di_name;
	}
	public String getDi_iphone() {
		return Di_iphone;
	}
	public void setDi_iphone(String di_iphone) {
		Di_iphone = di_iphone;
	}
	
}