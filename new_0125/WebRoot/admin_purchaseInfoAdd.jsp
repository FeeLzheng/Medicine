<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>ҩƷ��ַ����ϵͳ</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
<script type="text/javascript" language="javascript">
function onclick1(){ 
var O_info=document.getElementById("P_info"); 
var tishi1=document.getElementById("tishi1");
O_info.value=O_info.value+' '+tishi1.value;
}
function onclick2(){ 
var O_info=document.getElementById("P_info"); 
var tishi1=document.getElementById("tishi2");
O_info.value=O_info.value+' '+tishi1.value;
}
function onclick3(){ 
var O_info=document.getElementById("P_info"); 
var tishi1=document.getElementById("tishi3");
O_info.value=O_info.value+' '+tishi1.value;
}
</script>
    <br/>
    <div class="mframe">
    
    <!--   <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="������������绰"  style="background: #E8FF00"/>
            </s:form>
    -->
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;ҩƷ <b>${M_name }<b> ���������ʡ��  ${D_district}��Ϣ </span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_purchaseinfoEditSave"  method="post" target="_parent">
        <input type="hidden" name="D_company" value=${D_company }>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>

 
<td width="8%" align="left"><nobr>ҩƷ���ƣ� </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail">����</a></td>
 </tr>
 <tr>
 

<td width="8%" align="left"><nobr>����ʡ�ݣ� </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> ����</a></td>


</tr>
<td width="8%" align="left"><nobr>�ͻ������� </nobr></td>
<td width="32%"><input type="text" size="50" name="P_name" ></td>
</tr>

<tr>
<td width="8%" align="left"><nobr>�ͻ�����ʡ�ݣ� </nobr></td>
<td width="32%"><input type="text" size="50" name="P_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     ȫ��ʡ������</a></td>
</tr>
 <tr>
 
<td width="8%" align="left"><nobr>�ͻ���ϵ�绰�� </nobr></td>
<td width="32%"><input type="text" size="50" name="P_iphone" ></td>
</tr>
</table>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td><b>���˹�����ѯ���ݣ� </b></td>
<tr><td>
<input type="button" id="tishi1" value="�ͻ���ѯ�ò�Ʒ���˹���ת��ͻ��˲�Ʒ�ƿ������������ߵ绰4006-535328������������ѯ" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="�ͻ���ѯ�ò�Ʒ�Ƿ�����������ѯ����-ת��ͻ��˲�Ʒ��˾��δ��������л������" onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="�ͻ���ѯ�˲�Ʒ���ع���ת��ͻ��˲�Ʒ�������˵绰������������ѯ" onclick="onclick3()"> 
</td></tr>
<tr><td><textarea rows="10" cols="100" name="P_info" id="P_info"></textarea></td></tr>
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