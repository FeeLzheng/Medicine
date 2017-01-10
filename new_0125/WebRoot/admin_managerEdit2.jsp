<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@ page isELIgnored="false"%>





<html>
<head>
    <title>管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>

<script type="text/javascript">




</script>
    <br/>
    <div class="mframe">
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;地区经理信息修改</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_managerEditSave2" method="post">
         <input type="hidden" name="D_form" value=${D_form} >
        
        
<fieldset>
<legend> 地区经理信息： </legend>       
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0" >

<tr>
<td width="8%" align="right"><nobr>地区经理信息：</nobr></td>
<td width="32%" name=D_email1 value="${D_email1 }"></td>
<tr>
<td><input type="submit" value="确认修改"></td>
<td><input type="reset" value="重置"></td>
</tr>

</table>
</s:form>
</fieldset>
                    <s:if test="hasFieldErrors()">
                        <hr/>
                        <div align=center style="color:red"><s:fielderror/></div>
                    </s:if>
                    <s:if test="hasActionMessages()">
                        <hr/><div align=center style="color:red">
                            <s:actionmessage/></div>
                        </s:if>
             
               
            
      
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