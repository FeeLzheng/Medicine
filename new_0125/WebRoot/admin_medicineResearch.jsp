<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page import = "java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@ page isELIgnored="false"%>
<html>
    <head>
        <title>ҩƷ����</title>
       <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
       <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
    <script language="javascript"> 

</script>

   <div class="mframe">
   
        <br/>
        <!-- ���������� --><div style="background-color: #dddddd">������

            <s:form action="search4.action" style="display:inline">
                <input type="text" name="Keyword" id="Keyword" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="����"  style="background: #E8FF00"/>
            </s:form></div><br/>
        <!-- ���������� -->
       
      
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;������ֻ����Ѵ��ڵ�ҩƷ����������
                        <span style="color: red"> ${Keyword2} </span>
                  
                    </span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
 <form action="admin_clientAdd2">
 <!--  
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="hidden" name="M_name" value=${Keyword} ></td></tr>
<tr>
<td width="18%" align="right"><nobr>ҩƷ������ </nobr></td>
<td width="52%"><input type="text" size="20" name="M_name" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>�ͻ������� </nobr></td>
<td width="32%"><input type="text" size="20" name="C_name" ></td>
<td width="8%" align="right"><nobr>�ͻ���ϵ�绰�� </nobr></td>
<td width="32%"><input type="text" size="20" name="C_phone" ></td>
</tr>


</table>
-->
<!-- 
<legend>��д�ͷ���������</legend>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="medicineCount" value="0"/>
                <s:iterator id="medicine" value="allMedicine2" status="status">
                    <s:set var="medicineCount" value="status.count"/>
                </s:iterator>
                <s:if test="#medicineCount==0">
                   <strong>�޸�ҩƷ,�����޷����ӿͷ������¼</strong>
                </s:if>
 <s:else>
<s:iterator id="item" value="allMedicine2">
<tr><td class="mm"width="80%"></td></tr>
<tr><td class="mc"width="80%"><a href=admin_districtinfoadmin.action?M_name=${item.getM_name()}>��Ʒ����</a></td></tr>
<tr><td class="mc" ><a href=admin_queryadmin.action?M_name=${item.getM_name()}>������ѯ</a>
<tr><td class="mc"><a href=admin_purchaseinfoadmin.action?M_name=${item.getM_name()}>���˹���</a></td></tr>
<!--  <tr><td class="mc"><a href=admin_Complainadmin.action?M_name=${item.getM_name()}>Ͷ��</a></td></tr>
<tr><td class="mc"><a href=admin_departmentadmin.action?M_name=${item.getM_name()}>ҩ�ಿ��</a></td></tr>
<tr><td class="mc"><a href=admin_Reactionadmin.action?M_name=${item.getM_name()}>������Ӧ</a></td></tr>
<tr><td class="mc"><a href=admin_othersadmin.action?M_name=${item.getM_name()}>����ע��</a></td></tr>

 
</s:iterator>
</s:else>   
<td><s:if test="hasFieldErrors()">
<hr/>
<div align=center style="color:red"><s:fielderror/></div>
</s:if>
<s:if test="hasActionMessages()">
                    <hr/><div align=center style="color:red"><s:actionmessage/></div>
                </s:if> </td></tr>

    -->      
                
                
                
          



</table>



</form>
 <s:if test="hasFieldErrors()">
                    <hr/>
                    <div align=center style="color:red"><s:fielderror/></div>
                </s:if>
                <s:if test="hasActionMessages()">
                    <hr/><div align=center style="color:red">
                        <s:actionmessage/></div>
                    </s:if>



</div>

</body>
</html>