<%@page contentType="text/html" pageEncoding="utf-8"  import="java.sql.*"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%!

    	String userid="";
	   //  String ss=(String) request.getSession().getAttribute("statue");
	   //  String s=ss;
	  //   int mark=Integer.valueOf(s).intValue();
	     
	    public void User(){
	        
	    }
	     public int User (String userid) throws Exception{
	     
	     //获取登陆名
	    HttpServletRequest request=ServletActionContext.getRequest();
	    String User=(String) request.getSession().getAttribute("username");
	    
	    
	    
	    String userid1=User;
	     
	   doSqlDb query = new doSqlDb();
    	ResultSet rs = query.doQuery("select statue from admins where userid ='"+userid1+"'");//执行查询
    	int mark_int; //mark_int=1是普通用户，为0是管理员
    	if(rs.next()){
	    String mark_string=rs.getString("statue");
	    
	     mark_int=Integer.valueOf(mark_string).intValue();
	     return mark_int;
	    }else{
	    mark_int=1;
	    return mark_int;
	    }
	}
	     %>
<html>
    <head>
        <title>管理系统</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    </head>
    <body>
  <!--  
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="tl"></td>
            <td class="tm">
                <span class="tt">&nbsp;用户权限管理 </span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="userCount" value="0"/>
                <s:iterator id="user" value="alluser" status="status">
                    <s:set var="userCount" value="status.count"/>
                </s:iterator>
                <s:if test="#userCount==0">
                    当前无用户,请添加！！！！
                </s:if>
                <s:else>
                    用户信息：
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="10%">序号</th>
                               
                                <th width="40%">名称</th>
                                <th width="20%">密码</th>
                                <th width="20%">权限</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="user" value="alluser" status="status">
                                <tr>
                                    <td>${status.count}</td>
                                    
                                   
                                    <td>${user.getUsername()}</td>
                                    <td>${user.getPassword()}</td>
                                    <td>${user.getstatue() }</td>
                                    <td>
                                        <a  href=admin_medicineEdit.action?M_name=${medicine.getM_name()}&M_id=${medicine.getM_id()}&M_standard1=${medicine.getM_standard1()}&M_standard2=${medicine.getM_standard2()}&M_adaptation=${medicine.getM_adaptation()}&M_use=${medicine.getM_use()}&M_effect=${medicine.getM_effect()}&M_execute=${medicine.getM_execute()}&M_instruction=${medicine.getM_instruction()}>修改</a>
                                        &nbsp;&nbsp;
                                        <a  href=admin_medicineDelete.action?M_name=${medicine.getM_name()}&M_id=${medicine.getM_id()}&M_standard1=${medicine.getM_standard1()}&M_standard2=${medicine.getM_standard2()}&M_adaptation=${medicine.getM_adaptation()}&M_use=${medicine.getM_use()}&M_effect=${medicine.getM_effect()}&M_execute=${medicine.getM_execute()}&M_instruction=${medicine.getM_instruction()} >删除</a>
                                    </td>
                                </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                </s:else>
                <s:if test="hasFieldErrors()">
                    <hr/>
                    <div align=center style="color:red"><s:fielderror/></div>
                </s:if>
                <s:if test="hasActionMessages()">
                    <hr/><div align=center style="color:red">
                        <s:actionmessage/></div>
                    </s:if>
            </td>
            <td class="mr"></td>
        </tr>
    </table>

-->
   
        <div class="mframe">
            <br/>
            <table width="90%" align="center" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="tl"></td>
                    <td class="tm">
                        <span class="tt">&nbsp;  管理页面!!!!</span>
                    </td>
                    <td class="tr"></td>
                </tr>
            </table>
            <table width="90%" align="center" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="ml"></td>
                    <td class="mm">
                        <span id="SysInfo" style="line-height:150%; padding:10px 20px; display:block">
                           <% if(User(userid)==0){ %>
                            <b>你的权限：</b>你是普通管理员，拥有修改权限<br/>
                             <%}if(User(userid)==2) {%>
                             <b>你的权限：</b>你是超级系统管理员，拥有所有权限<br/>
                            <%}else{ %>
                            <b>你的权限：</b>你是普通用户，拥有浏览<br/>
                          
                            <%} %>
                            </span>
                    </td>
                    <td class="mr"></td>
                </tr>
            </table>
            <table width="90%" align="center" cellspacing="0" cellpadding="0" >
                <tr>
                    <td class="bl"></td>
                    <td class="bm">&nbsp;</td>
                    <td class="br"></td>
                </tr>
            </table>            
        </div>
       
        </body>
</html>