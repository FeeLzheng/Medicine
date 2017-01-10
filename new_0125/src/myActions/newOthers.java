package myActions;
public class newOthers{
	int id;
	int O_id;
	String O_info;
	String M_name;
	String D_district;
	String O_date;
	String O_province;
	String O_name;
	String O_iphone;
	String D_company;
	String O_user;
	
	public newOthers(){}

	public newOthers(int id, int o_id, String o_info, String m_name,
			String D_district, String o_date, String o_province, String o_name,
			String o_iphone,String d_company,String o_user) {
		super();
		this.id = id;
		O_id = o_id;
		O_info = o_info;
		M_name = m_name;
		this.D_district = D_district;
		O_date = o_date;
		O_province = o_province;
		O_name = o_name;
		O_iphone = o_iphone;
		D_company=d_company;
		O_user=o_user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getO_id() {
		return O_id;
	}

	public void setO_id(int o_id) {
		O_id = o_id;
	}

	public String getO_info() {
		return O_info;
	}

	public void setO_info(String o_info) {
		O_info = o_info;
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

	public void setD_district(String D_district) {
		this.D_district = D_district;
	}

	public String getO_date() {
		return O_date;
	}

	public void setO_date(String o_date) {
		O_date = o_date;
	}

	public String getO_province() {
		return O_province;
	}

	public void setO_province(String o_province) {
		O_province = o_province;
	}

	public String getO_name() {
		return O_name;
	}

	public void setO_name(String o_name) {
		O_name = o_name;
	}

	public String getO_iphone() {
		return O_iphone;
	}

	public void setO_iphone(String o_iphone) {
		O_iphone = o_iphone;
	}
	
	public String getO_user() {
		return O_user;
	}

	public void setO_user(String o_user) {
		O_user = o_user;
	}
	
	public String getD_company() {
		return D_company;
	}

	public void setD_company(String d_company) {
		D_company = d_company;
	}
	
}