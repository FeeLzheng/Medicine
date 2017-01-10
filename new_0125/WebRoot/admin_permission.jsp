<%@page contentType="text/html" pageEncoding="gb2312"  import="java.sql.*"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>



<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>

<html>
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

<head>
    <title>用户权限管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body><br/>
<div class="mframe">
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
                    当前用户名,请添加！！！！
                </s:if>
                <s:else>
                    用户信息：
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="10%">序号</th>
                               
                                <th width="20%">账号</th>
                                <th width="15%">密码</th>
                                <th width="15%">权限</th>
                                <th width="20%">操作</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="user" value="alluser" status="status">
                                <tr>
                                    <td>${status.count}</td>
                                    
                                   
                                    <td>${user.getUsername()}</td>
                                    <td>${user.getPassword()}</td>
                                    <td>${user.getStatue3() }</td>
                                    <td><a  href=admin_permissionEdit.action?username=${user.getUsername()}&statue=${user.getStatue()}>修改</a>  </td> 
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


