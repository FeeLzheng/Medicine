<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false"%>
<html>
    <head>
        <title>用户注册系统</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">
    <div align="center">
<s:form action="admin_register"  method="post">
<fieldset>
<legend> 用户信息： </legend>

<table width="90%"  align= "center" cellspacing="0" cellpadding="0">



<tr>
<td width="8%" align="right"><nobr>用户姓名：</nobr></td>
<td width="32%"><input type="text" size="20" name="username" ></td>
<td width="8%" align="left"><nobr>用户密码： </nobr></td>
<td width="32%"><input type="text" size="20" name="password" ></td>
</tr>



<tr><td>
<input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>
</tr>

</table>
</s:form>
<s:if test="hasFieldErrors()">
<hr/>
<div align=center style="color:red"><s:fielderror/></div>
</s:if>
<s:if test="hasActionMessages()">
                    <hr/><div align=center style="color:red"><s:actionmessage/></div>
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