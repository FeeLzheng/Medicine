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
                    <span class="tt">&nbsp;ҩƷ��ַ������� -- �޸�<b>${M_name }<b>��Ϣ</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
       
        <input type="hidden" name="M_name" value=${M_name } >
        
<fieldset>
<legend> ҩƷ��Ϣ�� </legend>
<s:form action="admin_districtEditSave2" method="post">
<input type="hidden" name="id" value=${id } >
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>
<td width="8%" align="left"><nobr>ҩƷ���ƣ�</nobr></td>
<td width="32%">${M_name}</td>
<td width="8%" align="right"><nobr>���۹�˾�� </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" value="${D_company }"></td>
</tr>
<tr>

<!--  <td width="8%" align="right"><nobr>����ʡ�ݣ�</nobr></td><!--�����۵�����Ϊ����ʡ��  -->
<!--  <td width="32%"><input type="text" size="20" name="D_district" value=${D_district }></td>-->
<td></td><td></td>
<td width="8%" align="right">������ʽ��</td>
<td width="32%"><input type="text" size="20" name="D_form" value="${D_form }"></td>
</tr>
<tr>
<td></td><td><td><td><td><td><td><td><input type="submit" value="ȷ�ϱ���" ></td></tr>
</table>
</s:form>
</fieldset>
 
<s:set var="districtCount" value="0"/>
                <s:iterator id="district" value="allDistrict9" status="status">
                    <s:set var="districtCount" value="status.count"/>
                </s:iterator>
                 <s:iterator id="district" value="allDistrict9" status="status">
<fieldset>
<s:form action="admin_districtEditSave" method="post">
<legend> ������Ϣ�� </legend>
 <input type="hidden" name="id" value=${district.getId() } >
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<!--  <tr><td><input type="text" size="20" name="id" value=${district.getId() } ></td></tr>-->
<tr>
<td width="8%" align="right"><nobr>����ʡ�ݣ�</nobr></td><!--�����۵�����Ϊ����ʡ��  -->
<td width="32%"><input type="text" size="20" name="D_district" value="${district.getD_district() }"></td>
</tr>
<tr>
<td></td><td></td>
<td width="8%" align="left"><nobr>��������1��</nobr></td><!--�ɵ�������绰��Ϊ��������1  -->
<td width="42%"><input type="text" size="40" name="D_phone1" value="${district.getD_phone1() }" > </td>
</tr>
<tr>

<td></td><td></td>
<td width="8%" align="left"><nobr>��������2�� </nobr></td><!--�ɵ������������Ϊ��������2  -->
<td width="42%"><input type="text" size="40" name="D_email1" value="${district.getD_email1() }"></td>
</tr>
<tr>
<td></td><td></td>
<td width="8%" align="left"><nobr>��������3��</nobr></td><!--��������绰��Ϊ��������3  -->
<td width="42%"><input type="text" size="40" name="D_phone2" value="${district.getD_phone2() }"></td>
</tr>
<tr>
<td></td><td></td>
<td width="8%" align="left"><nobr>��������4�� </nobr></td><!--�������������Ϊ��������4  -->
<td width="42%"><input type="text" size="40" name="D_email2" value="${district.getD_email2() }"></td>
</tr>
<tr>
<td></td>
<td><a  href=admin_districtDelete.action?id=${district.getId()} >ɾ  ��</a></td>
<!-- <td><a  href=admin_districtEditSave.action?id=${district.getId()}&D_district=${district.getD_district()}&D_phone1=${district.getD_phone1()}&D_email1=${district.getD_email1()}&D_phone2=${district.getD_phone2()}&D_email2=${district.getD_email2()}>ȷ�ϱ���</a></td> -->
<td></td><td></td><td><input type="submit" value="ȷ�ϱ���" ></td>
</tr>
</table>
</fieldset>
</s:form>
</s:iterator>
<!--  <table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="ȷ�ϱ���" ></td>
<td><input type="reset" value="������д"></td>
</tr>

</table>-->

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