c<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>ҩƷ���۵�������ϵͳ</title>
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
<legend> �������۵���Ʒ��Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>ҩƷ���ƣ�</nobr></td>
<td width="32%"><input type="text" size="20" name="M_name"  readonly disabled="disabled" value=${M_name } ></td>
<td width="8%" align="left"><nobr>���۹�˾�� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>����ʡ�ݣ�</nobr></td><!--�����۵�����Ϊ����ʡ��  -->
<td width="32%"><input type="text" size="20" name="D_district" ></td>
<td width="8%" align="left"><nobr>������ʽ �� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_form" ></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> �������Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>��������1��</nobr></td><!--�ɵ�������绰��Ϊ��������1  -->
<td width="42%"><input type="text" size="40" name="D_phone1" ></td>
<td width="8%" align="left"><nobr>��������2�� </nobr></td><!--�ɵ������������Ϊ��������2  -->
<td width="42%"><input type="text" size="40" name="D_email1" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>��������3��</nobr></td><!--��������绰��Ϊ��������3  -->
<td width="42%"><input type="text" size="40" name="D_phone2" ></td>
<td width="8%" align="left"><nobr>��������4�� </nobr></td><!--�������������Ϊ��������4  -->
<td width="42%"><input type="text" size="40" name="D_email2" ></td>
</tr>
</table>
</fieldset>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="ȷ�ϱ���" ></td>
<td><input type="reset" value="������д"></td>
</tr>
 <!--  <tr><td></td><td><input type="button" value="�������е�ַ" onclick="window.location='admin_importD2.action'"><td></tr> -->
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