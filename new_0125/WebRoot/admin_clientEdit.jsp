<%@page contentType="text/html" pageEncoding="gb2312"  import="java.sql.*"%>
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
                    <span class="tt">&nbsp;�ͻ���Ϣ������� -- �޸�<b>${M_name }<b>��Ϣ</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_clientEditSave" method="post">
        <input type="hidden" name="C_id" value=${C_id }>
        <input type="hidden" name="M_name" value=${M_name }>
<fieldset>
<legend> �ͻ���Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>ҩƷ���ƣ�</nobr></td>
<td width="32%" name="M_name">${M_name}</td>
<td width="8%" align="left"><nobr>�ͻ������� </nobr></td>
<td width="32%"><input type="text" size="20" name="C_name" value="${C_name }"></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>�ͻ��绰��</nobr></td>
<td width="32%"><input type="text" size="20" name="C_phone" value="${C_phone }"></td>
<td width="8%" align="left"><nobr>�ͻ�����ʡ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="C_province" value="${C_province }"></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> ��Ʒ���� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>��Ʒ������ѯ��Ϣ�� </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="Di_info"  >${Di_info }</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> ������ѯ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>������ѯ��Ϣ�� </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="Q_info" >${Q_info }</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> ���˹�����ѯ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>���˹�����Ϣ�� </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="P_info" >${P_info }</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> ��ҩ��ѯ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>��ҩ��ѯ��Ϣ�� </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="MQ_info" >${MQ_info }</textarea></td>
</tr>

</table>
</fieldset>


<fieldset>
<legend> Ͷ����Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>Ͷ�����ݣ�</nobr></td>
<td width="52%"><input type="text" size="60" name="Co_info" value=${Co_info } ></td>
<td width="8%" align="left"><nobr>��ҩ��λ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_department" value=${Co_department }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>ת�����ţ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_deliver" value=${Co_deliver } ></td>
<td width="8%" align="left"><nobr>��������Ϣ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_dealer" value=${Co_dealer }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>Ͷ�����</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_category" value=${Co_category } ></td>
<td width="8%" align="left"><nobr>Ͷ�߻ظ��� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replay" value=${Co_replay }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>Ͷ�ߴ�������</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_result" value=${Co_result } ></td>
<td width="8%" align="left"><nobr>������Ϣ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replenish" value=${Co_replenish }></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> ҩ�ಿ�ţ� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>����������Ϣ�� </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="Da_info"  >${Da_info}</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> ������Ӧ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>����������</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_name" value=${Re_name } ></td>
<td width="8%" align="left"><nobr>�Ա� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_sex" value=${Re_sex }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>���䣺</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_age" value=${Re_age } ></td>
<td width="8%" align="left"><nobr>���壺 </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_nation" value=${Re_nation }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>���أ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_weight" value=${Re_weight } ></td>
<td width="8%" align="left"><nobr>ԭ�����飺 </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_disease" value=${Re_disease }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>������Ӧ/�¼����ƣ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionN" value=${Re_reactionN } ></td>
<td width="8%" align="left"><nobr>������Ӧ/�¼����������� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionD" value=${Re_reactionD }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>��ҩ��ֹʱ�䣺</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_timeM" value=${Re_timeM } ></td>
<td width="8%" align="left"><nobr>�÷������� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_use" value=${Re_use }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>������Ӧ/�¼�����ʱ�䣺</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_time" value=${Re_time } ></td>
<td width="8%" align="left"><nobr>������Ӧ/�¼��Ľ���� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_result" value=${Re_result }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>�������ţ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_number" value=${Re_number } ></td>
<td width="8%" align="left"><nobr>�ϲ���ҩƷ����� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_merge" value=${Re_merge }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>����ҩƷ������Ӧ/�¼���</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_family" value=${Re_family } ></td>
<td width="8%" align="left"><nobr>����ҩƷ������Ӧ/�¼��� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionP" value=${Re_reactionP }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>������</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_others" value=${Re_others } ></td>
<td width="8%" align="left"><nobr>ҽԺ���ƣ� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_hospital" value=${Re_hospital }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>������/����ţ�</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_case" value=${Re_case } ></td>
<td width="8%" align="left"><nobr>��ϵ��ʽ�� </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_phone" value=${Re_phone }></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> ������ </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>����������Ϣ�� </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="O_info" >${O_info }</textarea></td>
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