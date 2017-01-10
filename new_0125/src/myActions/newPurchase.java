package myActions;
public class newPurchase{
	int id;
	int P_id;
	String P_info;
	String M_name;
	String D_district;
	String P_date;
	String P_province;
	String P_name;
	String P_iphone;
	String D_company;
	String P_user;
	public newPurchase(){}
	public newPurchase(int id, int p_id, String p_info, String m_name,
			String d_district, String p_date, String p_province, String p_name,
			String p_iphone,String D_company,String P_user) {
		super();
		this.id = id;
		P_id = p_id;
		P_info = p_info;
		M_name = m_name;
		D_district = d_district;
		P_date = p_date;
		P_province = p_province;
		P_name = p_name;
		P_iphone = p_iphone;
		D_company=D_company;
		P_user=P_user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getP_id() {
		return P_id;
	}
	public void setP_id(int p_id) {
		P_id = p_id;
	}
	public String getP_info() {
		return P_info;
	}
	
	
	public void setP_user(String p_user) {
		P_user = p_user;
	}
	public String getP_user() {
		return P_user;
	}	public void setD_company(String d_company) {
		D_company =d_company;
	}
	public String getD_company() {
		return D_company;
	}
	public void setP_info(String p_info) {
		P_info = p_info;
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
	public String getP_date() {
		return P_date;
	}
	public void setP_date(String p_date) {
		P_date = p_date;
	}
	public String getP_province() {
		return P_province;
	}
	public void setP_province(String p_province) {
		P_province = p_province;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	public String getP_iphone() {
		return P_iphone;
	}
	public void setP_iphone(String p_iphone) {
		P_iphone = p_iphone;
	}
}
	