package myActions;

public class newClient{
	
	int C_id;
	String M_name;
	String C_phone;
	String C_name;
	String C_districtinfo;
	String C_query;
	String C_purchase;
	String C_medicinequery;
	String C_complain;
	String C_department;
	String C_reaction;
	String C_other;
	String C_Date;
	String C_user;
    int Di_id;
	String Di_info;
	String Di_name;
String Di_district;
    int Q_id;
	String Q_info;
    int P_id;
	String P_info;
	
	
	
	int MQ_id;
	String MQ_info;
	
	int Co_id;
    String Co_info;
    String Co_department;
    String Co_deliver;
    String Co_dealer;
    String Co_category;
    String Co_replay;
    String Co_result;
    String Co_replenish;
    
	int Da_id;
	String Da_info;
	
    int Re_id;
    String Re_name;
    String Re_sex;
    String Re_age;
    String Re_nation;
    String Re_weight;
    String Re_disease;
    String Re_reactionN;
    String Re_reactionD;
    String Re_timeM;
    String Re_use;
    String Re_time;
    String Re_result;
    String Re_number;
    String Re_merge;
    String Re_family;
    String Re_reactionP;
    String Re_others;
    String Re_hospital;
    String Re_case;
    String Re_phone;
    
	int O_id;
	String O_info;
	String property;
	String C_info;
	String C_province;
	String C_district;
	
	public newClient(){}

	

	



	public newClient(int c_id, String m_name, String c_name, String c_phone,
			String c_districtinfo, String c_query, String c_purchase,
			String c_medicinequery, String c_complain, String c_department,
			String c_reaction, String c_other, String c_Date, String c_user,int di_id,
			String di_info, String di_name, String di_district, int q_id,
			String q_info, int p_id, String p_info, int mQ_id, String mQ_info,
			int co_id, String co_info, String co_department, String co_deliver,
			String co_dealer, String co_category, String co_replay,
			String co_result, String co_replenish, int da_id, String da_info,
			int re_id, String re_name, String re_sex, String re_age,
			String re_nation, String re_weight, String re_disease,
			String re_reactionN, String re_reactionD, String re_timeM,
			String re_use, String re_time, String re_result, String re_number,
			String re_merge, String re_family, String re_reactionP,
			String re_others, String re_hospital, String re_case,
			String re_phone, int o_id, String o_info, String property,
			String c_info, String c_province, String c_district) {
		super();
		C_id = c_id;
		M_name = m_name;
		C_phone = c_phone;
		C_name = c_name;
		C_districtinfo = c_districtinfo;
		C_query = c_query;
		C_purchase = c_purchase;
		C_medicinequery = c_medicinequery;
		C_complain = c_complain;
		C_department = c_department;
		C_reaction = c_reaction;
		C_other = c_other;
		C_Date = c_Date;
		C_user = c_user;
		Di_id = di_id;
		Di_info = di_info;
		Di_name = di_name;
		Di_district = di_district;
		Q_id = q_id;
		Q_info = q_info;
		P_id = p_id;
		P_info = p_info;
		MQ_id = mQ_id;
		MQ_info = mQ_info;
		Co_id = co_id;
		Co_info = co_info;
		Co_department = co_department;
		Co_deliver = co_deliver;
		Co_dealer = co_dealer;
		Co_category = co_category;
		Co_replay = co_replay;
		Co_result = co_result;
		Co_replenish = co_replenish;
		Da_id = da_id;
		Da_info = da_info;
		Re_id = re_id;
		Re_name = re_name;
		Re_sex = re_sex;
		Re_age = re_age;
		Re_nation = re_nation;
		Re_weight = re_weight;
		Re_disease = re_disease;
		Re_reactionN = re_reactionN;
		Re_reactionD = re_reactionD;
		Re_timeM = re_timeM;
		Re_use = re_use;
		Re_time = re_time;
		Re_result = re_result;
		Re_number = re_number;
		Re_merge = re_merge;
		Re_family = re_family;
		Re_reactionP = re_reactionP;
		Re_others = re_others;
		Re_hospital = re_hospital;
		Re_case = re_case;
		Re_phone = re_phone;
		O_id = o_id;
		O_info = o_info;
		this.property = property;
		C_info = c_info;
		C_province = c_province;
		C_district = c_district;
	}







	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		C_id = c_id;
	}

	public String getM_name() {
		return M_name;
	}

	public void setM_name(String m_name) {
		M_name = m_name;
	}

	public String getC_phone() {
		return C_phone;
	}

	public void setC_phone(String c_phone) {
		C_phone = c_phone;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	public String getC_districtinfo() {
		return C_districtinfo;
	}

	public void setC_districtinfo(String c_districtinfo) {
		C_districtinfo = c_districtinfo;
	}

	public String getC_query() {
		return C_query;
	}

	public void setC_query(String c_query) {
		C_query = c_query;
	}

	public String getC_purchase() {
		return C_purchase;
	}

	public void setC_purchase(String c_purchase) {
		C_purchase = c_purchase;
	}

	public String getC_medicinequery() {
		return C_medicinequery;
	}

	public void setC_medicinequery(String c_medicinequery) {
		C_medicinequery = c_medicinequery;
	}

	public String getC_complain() {
		return C_complain;
	}

	public void setC_complain(String c_complain) {
		C_complain = c_complain;
	}

	public String getC_department() {
		return C_department;
	}

	public void setC_department(String c_department) {
		C_department = c_department;
	}

	public String getC_reaction() {
		return C_reaction;
	}

	public void setC_reaction(String c_reaction) {
		C_reaction = c_reaction;
	}

	public String getC_other() {
		return C_other;
	}

	public void setC_other(String c_other) {
		C_other = c_other;
	}

	public String getC_Date() {
		return C_Date;
	}

	public void setC_Date(String c_Date) {
		C_Date = c_Date;
	}
	
	
	public String getC_user() {
		return C_user;
	}

	public void setC_user(String c_user) {
		C_user = c_user;
	}
	

	public int getDi_id() {
		return Di_id;
	}

	public void setDi_id(int di_id) {
		Di_id = di_id;
	}

	public String getDi_info() {
		return Di_info;
	}

	public void setDi_info(String di_info) {
		Di_info = di_info;
	}

	public String getDi_name() {
		return Di_name;
	}

	public void setDi_name(String di_name) {
		Di_name = di_name;
	}

	public String getDi_district() {
		return Di_district;
	}

	public void setDi_district(String di_district) {
		Di_district = di_district;
	}

	public int getQ_id() {
		return Q_id;
	}

	public void setQ_id(int q_id) {
		Q_id = q_id;
	}

	public String getQ_info() {
		return Q_info;
	}

	public void setQ_info(String q_info) {
		Q_info = q_info;
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

	public void setP_info(String p_info) {
		P_info = p_info;
	}

	public int getMQ_id() {
		return MQ_id;
	}

	public void setMQ_id(int mQ_id) {
		MQ_id = mQ_id;
	}

	public String getMQ_info() {
		return MQ_info;
	}

	public void setMQ_info(String mQ_info) {
		MQ_info = mQ_info;
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

	public int getDa_id() {
		return Da_id;
	}

	public void setDa_id(int da_id) {
		Da_id = da_id;
	}

	public String getDa_info() {
		return Da_info;
	}

	public void setDa_info(String da_info) {
		Da_info = da_info;
	}

	public int getRe_id() {
		return Re_id;
	}

	public void setRe_id(int re_id) {
		Re_id = re_id;
	}

	public String getRe_name() {
		return Re_name;
	}

	public void setRe_name(String re_name) {
		Re_name = re_name;
	}

	public String getRe_sex() {
		return Re_sex;
	}

	public void setRe_sex(String re_sex) {
		Re_sex = re_sex;
	}

	public String getRe_age() {
		return Re_age;
	}

	public void setRe_age(String re_age) {
		Re_age = re_age;
	}

	public String getRe_nation() {
		return Re_nation;
	}

	public void setRe_nation(String re_nation) {
		Re_nation = re_nation;
	}

	public String getRe_weight() {
		return Re_weight;
	}

	public void setRe_weight(String re_weight) {
		Re_weight = re_weight;
	}

	public String getRe_disease() {
		return Re_disease;
	}

	public void setRe_disease(String re_disease) {
		Re_disease = re_disease;
	}

	public String getRe_reactionN() {
		return Re_reactionN;
	}

	public void setRe_reactionN(String re_reactionN) {
		Re_reactionN = re_reactionN;
	}

	public String getRe_reactionD() {
		return Re_reactionD;
	}

	public void setRe_reactionD(String re_reactionD) {
		Re_reactionD = re_reactionD;
	}

	public String getRe_timeM() {
		return Re_timeM;
	}

	public void setRe_timeM(String re_timeM) {
		Re_timeM = re_timeM;
	}

	public String getRe_use() {
		return Re_use;
	}

	public void setRe_use(String re_use) {
		Re_use = re_use;
	}

	public String getRe_time() {
		return Re_time;
	}

	public void setRe_time(String re_time) {
		Re_time = re_time;
	}

	public String getRe_result() {
		return Re_result;
	}

	public void setRe_result(String re_result) {
		Re_result = re_result;
	}

	public String getRe_number() {
		return Re_number;
	}

	public void setRe_number(String re_number) {
		Re_number = re_number;
	}

	public String getRe_merge() {
		return Re_merge;
	}

	public void setRe_merge(String re_merge) {
		Re_merge = re_merge;
	}

	public String getRe_family() {
		return Re_family;
	}

	public void setRe_family(String re_family) {
		Re_family = re_family;
	}

	public String getRe_reactionP() {
		return Re_reactionP;
	}

	public void setRe_reactionP(String re_reactionP) {
		Re_reactionP = re_reactionP;
	}

	public String getRe_others() {
		return Re_others;
	}

	public void setRe_others(String re_others) {
		Re_others = re_others;
	}

	public String getRe_hospital() {
		return Re_hospital;
	}

	public void setRe_hospital(String re_hospital) {
		Re_hospital = re_hospital;
	}

	public String getRe_case() {
		return Re_case;
	}

	public void setRe_case(String re_case) {
		Re_case = re_case;
	}

	public String getRe_phone() {
		return Re_phone;
	}

	public void setRe_phone(String re_phone) {
		Re_phone = re_phone;
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

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getC_info() {
		return C_info;
	}

	public void setC_info(String c_info) {
		C_info = c_info;
	}

	public String getC_Province() {
		return C_province;
	}

	public void setProvince(String C_province) {
		this.C_province = C_province;
	}







	public String getC_province() {
		return C_province;
	}







	public void setC_province(String c_province) {
		C_province = c_province;
	}







	public String getC_district() {
		return C_district;
	}







	public void setC_district(String c_district) {
		C_district = c_district;
	}

	

}