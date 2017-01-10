<!--%@page contentType="text/html" pageEncoding="gb2312"%>-->
<%@page contentType="text/html" pageEncoding="utf-8"  import="java.sql.*"%>

<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@ page isELIgnored="false"%>

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

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="gb2312">
<head>
    <title>管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <sx:head/>
    <style type="text/css">	
        body  { background:#799AE1; margin:0px; font:normal 12px 宋体;}
        table  { border:0px; }
        td  { font-size:12px ; }
        img  { vertical-align:bottom; border:0px; }
        a  { font-size: 12px ; color:#215DC6; text-decoration:none; }
        a:hover  { color:#428EFF }
        .sec_menu  { border-left:1px solid white; border-right:1px solid white;
                     border-bottom:1px solid white; background:#D6DFF7; padding:5px 2px;}
        .menu_title  { }
        .menu_title span  { position:relative; top:2px; left:8px; color:#215DC6; font-weight:bold; }
        .menu_title2  { }
        .menu_title2 span  { position:relative; top:2px; left:8px; color:orange; font-weight:bold; }
    </style>
</head>
<body>
    <script type="text/javascript" language="javascript">
        <!--
        function menuChange(obj,menu)
        {
            if(menu.style.display=="")
            {
                obj.style.background="url(pics/admin_title_bg_show.gif)";
                menu.style.display="none";
            }else{
                obj.style.background="url(pics/admin_title_bg_hide.gif)";
                menu.style.display="";
            }
        }
        -->
    </script>
    <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr>
            <td height="42" valign="bottom">
                <a href="admin_main.jsp" target="right">
                  <!--  <img src="pics/admin_title2.gif" width="158" border="0" height="38" alt=""/>-->
                    <br/>
                </a>
            </td>
        </tr>
        <tr><td style="background:url('pics/admin_title_bg_quit.gif')" height="25">
                &nbsp; &nbsp;<a href="adminlogin.jsp" target="_top">
                    <strong>重登陆</strong></a>&nbsp;
                <a href="adminlogout.jsp" target="_top">
                    <strong>退出登陆</strong></a>
            </td></tr>
    </table>
    &nbsp;
    <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>药品信息管理</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="20">
                        
                        <%if(User(userid)==2)
                               {%>
                                <a href="admin_medicineAdd.jsp" target="right">添加药品</a> 
                                <a href="admin_medicineAdmin.action" target="right">管理药品</a>
                          <%}else if(User(userid)==0){%>
                                <a href="admin_medicineAdd.jsp" target="right">添加药品</a> 
                                <a href="admin_medicineAdmin2.action" target="right">管理药品</a>
                         <% }else{%>
                                <!-- 非管理员操作查看，只显示查询信息不能修改 -->
                                <a href="client_medicineAdmin.action" target="right">药品信息查询</a>
                               <%} %>
                                
                            </td></tr>
                    </table>
                </div>
            </td>
        </tr>
    </table>
    
    <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>销售信息管理</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="20">
                         <%if(User(userid)==0||User(userid)==2)
                               {%>
                                <a href="admin_medicineResearch.jsp" target="right">添加地区</a> |
                                <a href="admin_districtAdmin.action" target="right">管理地区</a>
                                <% }else{%>
                                <!-- 非管理员操作查看，只显示查询信息不能修改 -->
                                <a href="client_districtAdmin.action" target="right">销售地区查询</a>
                                <%} %>
                                
                            </td></tr>
                    </table>
                </div>
            </td>
        </tr>
    </table>
    
        <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>地区经理管理</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                     <%if(User(userid)==0||User(userid)==2)
                               {%>
                        <tr><td height="20">                     
                                 <a href="admin_managerAdmin.action" target="right">地区经理信息1</a> 
                                </td></tr>
                                <tr><td height="20">
                                <a href="admin_managerAdmin2.action" target="right">地区经理信息2</a>                                                             
                            </td></tr>
                        <tr><td height="20">                     
                                <a href="admin_managerAdmin3.action" target="right">地区经理信息3</a> 
                                 </td></tr>
                                 <tr><td height="20">
                                <a href="admin_managerAdmin4.action" target="right">地区经理信息4</a>                                                             
                            </td></tr>
                             
                            <% } %>
                    </table>
                </div>
            </td>
        </tr>
    </table>
    
    <%if(User(userid)==0||User(userid)==2){%>
    <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>客户服务信息</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="20">
                                <a href="admin_mains_districtInfo.action" target="right">客户服务记录</a>
                                
                            </td></tr>
                            <tr><td height="20">
                               <a href="admin_clientAdmin.action" target="right">管理服务记录</a>
                            </td></tr>
                           <!--  <tr><td height="20">
                                <a href="admin_topicAdd.action" target="right">服务5</a> |
                                <a href="admin_topicAdmin.action" target="right">服务6</a>
                            -->
                            </td></tr>
                    </table>
    <% }%>
    
    <%if(User(userid)==0||User(userid)==2){%>
        <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>操作信息</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="20">
                                <a href="admin_workLog.action" target="right">操作日志</a> |
                            
                            </td></tr>
                    </table>
                </div>
            </td>
        </tr>
    </table>
    
    <% }%>
    
    <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>账户管理</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="30">
                                <a href="admin_passwordEdit.jsp" target="right">密码修改</a>
                                
                            </td></tr>
                    </table>
                </div>
            </td>
        </tr>
    </table>
      <%if(User(userid)==2){%>
        <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            
                
                <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
                onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
                onclick="menuChange(this,menuSort);" id="tdxlma">
                <span>账户权限管理</span>
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="20">
                                <a href="admin_permission.action" target="right">修改账户权限</a>
                            </td>
                            </tr>
                            <tr>
                            <td height="20">
                            <a href="admin_register.jsp" target="right" ">注册</a>
                            </td>
                            </tr>
                    </table>
                </div>
            </td>
        </tr>
    </table>
    
    <% }%>
  
                    
                    
                </div>
            </td>
        </tr>
    </table>
    &nbsp;
    
</body>
</html>