package myActions;

public class newComplain {
     int id;
     int Co_id;
     String Co_info;
     String Co_department;
     String Co_deliver;
     String Co_dealer;
     String Co_category;
     String Co_replay;
     String Co_result;
     String Co_replenish;
     
     String M_name;
 	String D_district;
 	String Co_date;
 	String Co_province;
 	String Co_name;
 	String Co_iphone;
     
     public newComplain (){}

	public newComplain(int id, int co_id, String co_info, String co_department,
			String co_deliver, String co_dealer, String co_category,
			String co_replay, String co_result, String co_replenish,
			String m_name, String D_district, String co_date,
			String co_province, String co_name, String co_iphone) {
		super();
		this.id = id;
		Co_id = co_id;
		Co_info = co_info;
		Co_department = co_department;
		Co_deliver = co_deliver;
		Co_dealer = co_dealer;
		Co_category = co_category;
		Co_replay = co_replay;
		Co_result = co_result;
		Co_replenish = co_replenish;
		M_name = m_name;
		this.D_district = D_district;
		Co_date = co_date;
		Co_province = co_province;
		Co_name = co_name;
		Co_iphone = co_iphone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCo_id() {
		return Co_id;
	}

	public void setCo_id(int co_id) {
		Co_id = co_id;
	}

	public String getCo_info() {
		return Co_info;
	}

	public void setCo_info(String co_info) {
		Co_info = co_info;
	}

	public String getCo_department() {
		return Co_department;
	}

	public void setCo_department(String co_department) {
		Co_department = co_department;
	}

	public String getCo_deliver() {
		return Co_deliver;
	}

	public void setCo_deliver(String co_deliver) {
		Co_deliver = co_deliver;
	}

	public String getCo_dealer() {
		return Co_dealer;
	}

	public void setCo_dealer(String co_dealer) {
		Co_dealer = co_dealer;
	}

	public String getCo_category() {
		return Co_category;
	}

	public void setCo_category(String co_category) {
		Co_category = co_category;
	}

	public String getCo_replay() {
		return Co_replay;
	}

	public void setCo_replay(String co_replay) {
		Co_replay = co_replay;
	}

	public String getCo_result() {
		return Co_result;
	}

	public void setCo_result(String co_result) {
		Co_result = co_result;
	}

	public String getCo_replenish() {
		return Co_replenish;
	}

	public void setCo_replenish(String co_replenish) {
		Co_replenish = co_replenish;
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

	public String getCo_date() {
		return Co_date;
	}

	public void setCo_date(String co_date) {
		Co_date = co_date;
	}

	public String getCo_province() {
		return Co_province;
	}

	public void setCo_province(String co_province) {
		Co_province = co_province;
	}

	public String getCo_name() {
		return Co_name;
	}

	public void setCo_name(String co_name) {
		Co_name = co_name;
	}

	public String getCo_iphone() {
		return Co_iphone;
	}

	public void setCo_iphone(String co_iphone) {
		Co_iphone = co_iphone;
	}
	
}
    