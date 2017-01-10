package myActions;
public class newQuery{
	int id;
	int C_id;
	String Q_info;
	String M_name;
	
	String Q_date;
	String Q_province;
	String Q_name;
	String Q_iphone;
	String D_district;
	String D_company;
	String Q_user;
	public newQuery(){}
	public newQuery(int id, int c_id, String q_info, String m_name,
			String q_date, String q_province, String q_name, String q_iphone,
			String d_district,String d_company,String q_user) {
		super();
		this.id = id;
		C_id = c_id;
		Q_info = q_info;
		M_name = m_name;
		Q_date = q_date;
		Q_province = q_province;
		Q_name = q_name;
		Q_iphone = q_iphone;
		D_district = d_district;
		D_company = d_company;
		Q_user = q_user;
		
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
	public String getQ_info() {
		return Q_info;
	}
	public void setQ_info(String q_info) {
		Q_info = q_info;
	}
	public String getM_name() {
		return M_name;
	}
	public void setM_name(String m_name) {
		M_name = m_name;
	}
	public String getQ_date() {
		return Q_date;
	}
	public void setQ_date(String q_date) {
		Q_date = q_date;
	}
	public String getQ_province() {
		return Q_province;
	}
	public void setQ_province(String q_province) {
		Q_province = q_province;
	}
	public String getQ_name() {
		return Q_name;
	}
	public void setQ_name(String q_name) {
		Q_name = q_name;
	}
	public String getQ_iphone() {
		return Q_iphone;
	}
	public void setQ_iphone(String q_iphone) {
		Q_iphone = q_iphone;
	}
	public String getD_district() {
		return D_district;
	}
	public void setD_district(String d_district) {
		D_district = d_district;
	}
	
	
	public String getD_company() {
		return D_company;
	}
	public void setD_company(String d_company) {
		D_company = d_company;
	}
	
	public String getQ_user() {
		return Q_user;
	}
	public void setQ_user(String q_user) {
		Q_user = q_user;
	}
	
}
	