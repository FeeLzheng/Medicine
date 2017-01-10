c<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>药品销售地区管理系统</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">
    <div align="center">
<s:form action="admin_districtAdd">

  <input type="hidden" name="M_name" value=${M_name } >
<fieldset>
<legend> 请填销售地区品信息： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>药品名称：</nobr></td>
<td width="32%"><input type="text" size="20" name="M_name"  readonly disabled="disabled" value=${M_name } ></td>
<td width="8%" align="left"><nobr>销售公司： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>销售省份：</nobr></td><!--由销售地区改为销售省份  -->
<td width="32%"><input type="text" size="20" name="D_district" ></td>
<td width="8%" align="left"><nobr>销售形式 ： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_form" ></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> 请填经理信息： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>地区经理1：</nobr></td><!--由地区经理电话改为地区经理1  -->
<td width="42%"><input type="text" size="40" name="D_phone1" ></td>
<td width="8%" align="left"><nobr>地区经理2： </nobr></td><!--由地区经理邮箱改为地区经理2  -->
<td width="42%"><input type="text" size="40" name="D_email1" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>地区经理3：</nobr></td><!--由商务经理电话改为地区经理3  -->
<td width="42%"><input type="text" size="40" name="D_phone2" ></td>
<td width="8%" align="left"><nobr>地区经理4： </nobr></td><!--由商务经理邮箱改为地区经理4  -->
<td width="42%"><input type="text" size="40" name="D_email2" ></td>
</tr>
</table>
</fieldset>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>
</tr>
 <!--  <tr><td></td><td><input type="button" value="导入所有地址" onclick="window.location='admin_importD2.action'"><td></tr> -->
</table>
</s:form>

   
 
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