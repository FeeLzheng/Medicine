<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>������Ӧ</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">

     <!--       <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="������������绰"  style="background: #E8FF00"/>
            </s:form>
    -->
    <div align="center">
<fieldset>
<legend> ����д������Ӧ��Ϣ�� </legend>
<s:form action="admin_reactionEditSave" target="_parent">
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>

<td width="8%" align="right"><nobr>ҩƷ���ƣ� </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="30" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail">����</a></td>
 


<td width="8%" align="left"><nobr>����ʡ�ݣ� </nobr></td>
<td width="52%"><input type="text"  size="20" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail">����</a></td>
</tr><tr>
<td width="8%" align="right"><nobr>�ͻ������� </nobr></td>

<td width="32%"><input type="text" size="20" name="RC_name" ></td>


<td width="8%" align="left"><nobr>�ͻ�����ʡ�ݣ� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     ȫ��ʡ������</a></td>
</tr><tr>
<td width="8%" align="right"><nobr>�ͻ���ϵ�绰�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_iphone" ></td>
</tr>
<tr>


<td width="8%" align="right"><nobr>����������</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_name"></td>
<td width="8%" align="left"><nobr>�Ա� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_sex" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>���䣺</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_age" ></td>
<td width="8%" align="left"><nobr>���壺 </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_nation" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>���أ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_weight" ></td>
<td width="8%" align="left"><nobr>ԭ�������� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_disease" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>������Ӧ/�¼����ƣ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionN" ></td>
<td width="8%" align="left"><nobr>������Ӧ/�¼����������� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionD" ></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>��ҩ��ֹʱ�䣺</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_timeM"></td>
<td width="8%" align="left"><nobr>�÷������� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_use" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>������Ӧ/�¼�����ʱ�䣺</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_time" ></td>
<td width="8%" align="left"><nobr>������Ӧ/ʱ������ </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_result" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>�������ţ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_number" ></td>
<td width="8%" align="left"><nobr>�ϲ���ҩ����� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_merge" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>����ҩƷ������Ӧ/�¼���</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_family" ></td>
<td width="8%" align="left"><nobr>����ҩƷ������Ӧ/�¼��� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionP" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>������</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_others" ></td>
<td width="8%" align="left"><nobr>ҽԺ���ƣ� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_hospital" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>������/����ţ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_case" ></td>
<td width="8%" align="left"><nobr>��ϵ��ʽ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_phone" ></td>
</tr>

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