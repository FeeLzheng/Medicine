package myActions;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import javax.servlet.http.HttpServletRequest;
public class LoginedInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation ai) throws Exception {
        HttpServletRequest request=ServletActionContext.getRequest();
        String url=request.getRequestURL().toString();
        //对各种管理操作访问进行拦截，验证是否登录
        if(url.indexOf("admin_")>=0){
            Object username=request.getSession().getAttribute("username");
            if(username==null){
                return "gologin";//没有登录，转至登录页面
            }
        }
        //其他访问直接放行
        return ai.invoke();
    }
}
