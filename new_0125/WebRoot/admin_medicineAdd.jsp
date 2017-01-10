<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>药品管理系统</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/> 
<div class="mframe">
    <div align="center">
<fieldset>
<legend> 请填写药品信息： </legend>
<s:form action="admin_medicineAdd" method="post">
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>药品名称：</nobr></td>
<td width="32%"><input type="text" size="20" name="M_name" ></td>
<td width="8%" align="left"><nobr>销售公司： </nobr></td><!--由产品编号更改为销售公司  -->
<td width="32%"><input type="text" size="20" name="M_id" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>生产场地：</nobr></td> <!--由物价文号更改为生产场地  -->
<td width="32%"><input type="text" size="20" name="M_standard1" ></td>
<td width="8%" align="left"><nobr>批准文号： </nobr></td>
<td width="32%"><input type="text" size="20" name="M_standard2" ></td>
</tr>
<tr>

<!--  <td width="8%" align="right"><nobr>药品使用量：</nobr></td>
<td width="32%"><input type="text" size="20" name="M_adaptation" ></td>
-->
<td width="8%" align="right"><nobr>规格：</nobr></td>
<td width="32%"><input type="text" size="40" name="M_effect" ></td>
<td width="8%" align="left"><nobr>商品名： </nobr></td>
<td width="32%"><input type="text" size="20" name="M_use" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>执行标准： </nobr></td>
<td width="50%"><input type="text" size="40" name="M_execute" ></td>
</tr>
</table>
<table>
<tr>

<td>
<b >适应症： </b></td></tr>
<tr><td><textarea rows="10" cols="110" name="M_adaptation"></textarea></td></tr>

<tr><td><b>用法用量： </b></td></tr>
<tr><td><textarea rows="10" cols="110" name="M_instruction"></textarea></td></tr>

<tr><td><input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>

</tr>
<!--   <tr><td></td><td><input type="button" value="导入所有药品" onclick="window.location='admin_importD.action'"><td></tr>-->
<!-- <tr><td><input type="file" name="file" value="导入所有药品" onclick="window.location='admin_importD.action'"><td></tr>-->
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