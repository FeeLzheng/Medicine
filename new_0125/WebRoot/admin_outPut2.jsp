<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>ҩƷ��ַ����ϵͳ</title>
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
                    <span class="tt">&nbsp;ҩƷ��ַ������� -- �޸�<b>${district.getM_name()}<b>��Ϣ</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_districtEditSave">
        <input type="hidden" name="M_name" value=${M_name} >
<fieldset>
<legend> �������۵���Ʒ��Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>ҩƷ���ƣ�</nobr></td>
<td width="32%">${M_name}</td>
<td width="8%" align="left"><nobr>���۹�˾�� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" value=${D_company }></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>���۵�����</nobr></td>
<td width="32%"><input type="text" size="20" name="D_district" value=${D_district }></td>
<td width="8%" align="left"><nobr>������ʽ �� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_form" value=${D_form }></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> �������Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>��������绰��</nobr></td>
<td width="32%"><input type="text" size="20" name="D_phone1" value=${D_phone1 } ></td>
<td width="8%" align="left"><nobr>�����������䣺 </nobr></td>
<td width="32%"><input type="text" size="20" name="D_email1" value=${D_email1 }></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>������绰��</nobr></td>
<td width="32%"><input type="text" size="20" name="D_phone2" value=${D_phone1 }></td>
<td width="8%" align="left"><nobr>���������� �� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_email2" value=${D_email2 }></td>
</tr>
</table>
</fieldset>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="ȷ�ϱ���" ></td>
<td><input type="reset" value="������д"></td>
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