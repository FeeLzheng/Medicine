<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@ page isELIgnored="false"%>





<html>
<head>
    <title>����ϵͳ</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>

<script type="text/javascript">




</script>
    <br/>
    <div class="mframe">
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;ҩƷ���� -- ����<b>${M_name }<b>��Ϣ</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        
        <input type="hidden" name="M_name" value=${M_name} >
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<s:iterator id="medicine" value="allMedicine4" status="status">
                    <s:set var="medicineCount" value="status.count"/>
                </s:iterator>
<tr>
<td width="8%" align="right"><nobr>ҩƷ���ƣ�</nobr></td>
<td width="32%">${medicine.getM_name() }</td>
<td width="8%" align="left"><nobr>���۹�˾�� </nobr></td><!--�ɲ�Ʒ��Ÿ���Ϊ���۹�˾  -->
<td width="32%"><input type="text" size="20" name="M_id" value=${medicine.getM_id() }></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>�������أ�</nobr></td><!--������ĺŸ���Ϊ��������  -->
<td width="32%"><input type="text" size="20" name="M_standard1" value=${medicine.getM_standard1() }></td>
<td width="8%" align="left"><nobr>��׼�ĺţ� </nobr></td>
<td width="32%"><input type="text" size="20" name="M_standard2" value=${medicine.getM_standard2() }></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>���</nobr></td>
<td width="32%"><input type="text" size="20" name="M_effect" value=${medicine.getM_effect() }></td>

<td width="8%" align="left"><nobr>��Ʒ���� </nobr></td>
<td width="32%"><input type="text" size="20" name="M_use" value=${medicine.getM_use() }></td>
</tr>
<tr>
<!--  
<td width="8%" align="right"><nobr>ҩƷʹ������</nobr></td>
<td width="32%"><input type="text" size="20" name="M_adaptation" value=${M_adaptation }></td>
-->
<td width="8%" align="right"><nobr>ִ�б�׼�� </nobr></td>
<td width="50%"><input type="text" size="40" name="M_execute" value="${medicine.getM_execute() }"></td>
</tr>

</table>
<table align="center">

<tr>

<td>
<b >��Ӧ֢�� </b></td>
<tr><td><textarea rows="10" cols="110" name="M_adaptation" >${medicine.getM_adaptation() }</textarea></td></tr>
<tr>
<td>
<b >�÷������� </b></td>
<tr><td><textarea rows="10" cols="110" name="M_instruction" >${medicine.getM_instruction() }</textarea></td></tr>


</table>


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