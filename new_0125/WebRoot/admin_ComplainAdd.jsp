<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>Ͷ��</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">

            <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="������������绰"  style="background: #E8FF00"/>
            </s:form>

    <div align="center">
<fieldset>
<legend> ����дͶ����Ϣ�� </legend>
<s:form action="admin_complainEditSave">
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>
 
<td width="8%" align="left"><nobr>ҩƷ������ </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="30" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name}>����</a></td>
 


<td width="8%" align="right"><nobr>����ʡ�ݣ� </nobr></td>
<td width="52%"><input type="text"  size="20" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district}>����</a></td>
</tr><tr>
<td width="8%" align="left"><nobr>�ͻ������� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_name" ></td>


<td width="8%" align="right"><nobr>ʡ�ݣ� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_province" value=${D_district }></td>

<tr>

<td width="8%" align="left"><nobr>�ͻ���ϵ�绰�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_iphone" ></td>


<td width="8%" align="left"><nobr>��ҩ��λ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_department" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>��������Ϣ��</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_dealer" ></td>
<td width="8%" align="left"><nobr>Ͷ����� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_category" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>ת�����ţ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_deliver" ></td>
<td width="8%" align="left"><nobr>Ͷ�߻ظ��� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replay" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>Ͷ�ߴ�������</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_result" ></td>
<td width="8%" align="left"><nobr>������Ϣ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replenish" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>Ͷ�����ݣ�</nobr></td>
<td width="52%"><input type="text" size="60" name="Co_info" ></td>
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