<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>��������</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
<script type="text/javascript" language="javascript">
function onclick1(){ 
var Da_info=document.getElementById("Da_info"); 
var tishi1=document.getElementById("tishi1");
Da_info.value=Da_info.value+' '+tishi1.value;
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
                    <span class="tt">&nbsp;��������</span>
                </td>
            </tr>
        </table>
        <s:form action="admin_departmentEditSave" target="_parent"> 
        <input type="hidden" name="D_company" value=${D_company }>
 <table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>

<td width="8%" align="left"><nobr>ҩƷ������ </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail"> ����</a></td>

</tr>
 <tr>
<td width="8%" align="left"><nobr>����ʡ�ݣ� </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> ����</a></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>�ͻ������� </nobr></td>
<td width="32%"><input type="text" size="50" name="Da_name" target="districtDetail"></td>
</tr>
 <tr>
<td width="8%" align=""left""><nobr>�ͻ�����ʡ�ݣ� </nobr></td>
<td width="32%"><input type="text" size="50" name="Da_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     ȫ��ʡ������</a></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>�ͻ���ϵ�绰�� </nobr></td>
<td width="32%"><input type="text" size="50" name="Da_iphone" ></td>
</tr>
</table>       
              
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td><b>�������ݣ� </b></td>
<tr><td>
<input type="button" id="tishi1" value="ҩ�ಿ�ŶԴ˲�Ʒ���г�죬�蹫˾Э������ṩ������׼����������Է�����һ�ݺ�����������Ʒ���š���׼���������Ϣ����057688827887���˲�Ʒ�����Ϣ��ת��QA��QC�������ż����۹�˾������ز���ע�����չ��" onclick="onclick1()"> 
</td></tr>
<tr><td><textarea rows="10" cols="100" name="Da_info" id="Da_info"></textarea></td></tr>
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