package myActions;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class writeExcel extends ActionSupport{
	public String admin_DayoutPut() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		clientAdmin.admin_DayoutPut2(response);
		
		return SUCCESS;
	}
	
	public String admin_MonthoutPut() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		clientAdmin.admin_MonthoutPut2(response);
		
		return SUCCESS;
	}
	public String admin_YearoutPut() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		clientAdmin.admin_YearoutPut2(response);
		
		return SUCCESS;
	}
	public String admin_outPut() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		clientAdmin.admin_outPut2(response);
		
		return SUCCESS;
	}
}