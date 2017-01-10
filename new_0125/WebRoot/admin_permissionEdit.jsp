<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
    <br/>
    <div class="mframe">
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;权限管理 -- 修改<b>${username }<b>信息</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_permissionEditSave">
        <input type="hidden" name="username" value=${username }>
       
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
   
<tr>
<td width="8%" align="right"><nobr>账号名称：</nobr></td>
<td width="32%"><input type="text" size="20" name="username" value=${username }  disabled="disabled" ></td>
<td width="8%" align="left"><nobr>权限修改： </nobr></td>

<td width="32%"><input type="text" size="20" name="statue" value=${statue }></td>


</tr>
<tr>
<td><input type="submit" value="确认修改"></td>
<td><input type="reset" value="重置"></td>
</tr>

</tr>
<tr>
权限说明：0为管理员用户，1为普通用户，2为超级管理员
</tr>
</table>

</s:form>
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