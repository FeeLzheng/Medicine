<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false"%>
<html>
    <head>
        <title>�û�ע��ϵͳ</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">
    <div align="center">
<s:form action="admin_register"  method="post">
<fieldset>
<legend> �û���Ϣ�� </legend>

<table width="90%"  align= "center" cellspacing="0" cellpadding="0">



<tr>
<td width="8%" align="right"><nobr>�û�������</nobr></td>
<td width="32%"><input type="text" size="20" name="username" ></td>
<td width="8%" align="left"><nobr>�û����룺 </nobr></td>
<td width="32%"><input type="text" size="20" name="password" ></td>
</tr>



<tr><td>
<input type="submit" value="ȷ�ϱ���" ></td>
<td><input type="reset" value="������д"></td>
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