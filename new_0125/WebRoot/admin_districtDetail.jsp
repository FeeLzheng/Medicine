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
        <table width="100%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;��������绰����</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
     
        <input type="hidden" name="M_name" value=${M_name } >
         <input type="hidden" name="id" value=${id } >
<!--  <fieldset>
<legend> �������۵���Ʒ��Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<s:iterator id="district" value="allDistrict4" status="status">
                    <s:set var="medicineCount" value="status.count"/>
                </s:iterator>

<tr>
<td width="8%" align="right"><nobr>ҩƷ���ƣ�</nobr></td>
<td width="32%">${M_name}</td>
<td width="8%" align="left"><nobr>���۹�˾�� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" value=${district.getD_company() }></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>����ʡ�ݣ�</nobr></td>
<td width="32%"><input type="text" size="20" name="D_district" value=${D_district }></td>
<td width="8%" align="left"><nobr>������ʽ �� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_form" value=${district.getD_form() }></td>
</tr>
</table>
</fieldset>
-->

<fieldset>
<legend> �������Ϣ�� </legend>

<table width="100%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>��������1��</nobr></td><!--�ɵ�������绰��Ϊ��������1  -->
<td width="82%"><input type="text" size="45" name="D_phone1" value=${district.getD_phone1() } ></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>��������2�� </nobr></td><!--�ɵ������������Ϊ��������2  -->
<td width="82%"><input type="text" size="45" name="D_email1" value=${district.getD_email1() }></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>��������3��</nobr></td><!--��������绰��Ϊ��������3  -->
<td width="82%"><input type="text" size="45" name="D_phone2" value=${district.getD_phone2() }></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>��������4�� </nobr></td><!--�������������Ϊ��������4  -->
<td width="82%"><input type="text" size="45" name="D_email2" value=${district.getD_email2() }></td>
</tr>
</table>
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