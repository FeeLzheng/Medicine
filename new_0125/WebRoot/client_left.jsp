<%@page contentType="text/html" pageEncoding="utf-8"  import="java.sql.*"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>


<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>

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
            <td height="22" valign="bottom">
                <a href="client_main.jsp" target="right">
                 <!--   <img src="pics/admin_title2.gif" width="158" border="0" height="38" alt=""/>-->
                    <br/>
                </a>
            </td>
        </tr>
        <tr><td style="background:url('pics/admin_title_bg_quit.gif')" height="25">
                &nbsp; &nbsp;<a href="adminlogin.jsp" target="_top">
                    <strong>点击-->登陆</strong></a>&nbsp;
                
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
                        <tr><td height="30">
                                <a href="client_medicineAdmin.action" target="right">药品信息查询</a>
                                
                                
                                
                                
                                
                                
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
                        <tr><td height="30">
                                <a href="client_districtAdmin.action" target="right">销售地区查询</a>
                                
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
            <span>维护</span>
        
              
            </td>
        </tr>
        <tr>
            <td>
                <div class="sec_menu" id="menuSort">
                    <table cellpadding="0" cellspacing="0" align="center" width="140">
                        <tr><td height="30">
                                <a  target="right">系统联系人</a>
                               
                            </td></tr>
                            
                           <tr><td height="30">
                          
                                <a target="right">微信号：FeeLZheng321</a>
                            </td></tr>
                           
                    </table>
                </div>
            </td>
        </tr>
    </table>
    <!--  
    <table cellpadding="0" cellspacing="0" width="158" align="center">
        <tr style="cursor:hand;">
            <td height="55" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
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
    --> 
    &nbsp;
    
</body>
</html>