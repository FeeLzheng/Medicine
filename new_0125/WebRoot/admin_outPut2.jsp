<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>药品地址管理系统</title>
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
                    <span class="tt">&nbsp;药品地址管理管理 -- 修改<b>${district.getM_name()}<b>信息</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_districtEditSave">
        <input type="hidden" name="M_name" value=${M_name} >
<fieldset>
<legend> 请填销售地区品信息： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>药品名称：</nobr></td>
<td width="32%">${M_name}</td>
<td width="8%" align="left"><nobr>销售公司： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" value=${D_company }></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>销售地区：</nobr></td>
<td width="32%"><input type="text" size="20" name="D_district" value=${D_district }></td>
<td width="8%" align="left"><nobr>销售形式 ： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_form" value=${D_form }></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> 请填经理信息： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>地区经理电话：</nobr></td>
<td width="32%"><input type="text" size="20" name="D_phone1" value=${D_phone1 } ></td>
<td width="8%" align="left"><nobr>地区经理邮箱： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_email1" value=${D_email1 }></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>商务经理电话：</nobr></td>
<td width="32%"><input type="text" size="20" name="D_phone2" value=${D_phone1 }></td>
<td width="8%" align="left"><nobr>商务经理邮箱 ： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_email2" value=${D_email2 }></td>
</tr>
</table>
</fieldset>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>
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