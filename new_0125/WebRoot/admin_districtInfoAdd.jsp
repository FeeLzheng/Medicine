<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"  %>
<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page isELIgnored="false"%>

<html>
<head>
<script>

	function submit_form(){
			var form=document.getElementById("form1");
			form.submit();
		}
function onclick1(){ 
var D_info=document.getElementById("Di_info"); 
var tishi1=document.getElementById("tishi1");
D_info.value=D_info.value+'  '+tishi1.value;
}
function onclick2(){ 
var O_info=document.getElementById("Di_info"); 
var tishi1=document.getElementById("tishi2");
O_info.value=O_info.value+'  '+tishi1.value;
}
function onclick3(){ 
var O_info=document.getElementById("Di_info"); 
var tishi1=document.getElementById("tishi3");
O_info.value=O_info.value+'  '+tishi1.value;
}
	

</script>

    <title>药品地址管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
    <br/>
    <div class="mframe">
    
   <!--  <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>
     -->
    
    
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
        
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;药品地址管理<b> ${M_name } <b>信息和销售省份 <b> ${D_district}</b></span>
                </td>
                <td class="tr"></td>
            </tr>
            
        </table>
        <s:form action="admin_districtinfoEditSave" method="post" target="_parent" >
<!--<input type="hidden" name="M_name" value=${M_name }> -->
  <input type="hidden" name="id" value=${id }>
  <input type="hidden" name="D_company" value=${D_company }>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td></td></tr>
<tr>

<td width="8%" align="left"><nobr>药品名称： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail">详情</a></td>

 </tr>
 
 <tr>

<td width="8%" align="left"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value="${D_district }"><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> 详情</a></td>

</tr>

<tr>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="32%"><input type="text" size="50" name="Di_name" >  </td>
</tr>
<tr>

<td width="8%" align="left"><nobr>客户所在省份： </nobr></td>
<td width="32%"><input type="text" size="50" name="Di_province" id="Di_province" value="${D_district }"><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     全国省份详情</a>
</td>
</tr>
<tr>

<td width="8%" align="left"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="50" name="Di_iphone" ></td>
</tr>

</table>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td><b>销售产地咨询内容： </b></td></tr>
<tr><td>
<input type="button" id="tishi1" value="客户咨询此产品是否在生产，咨询代理合作-转告客户此产品公司暂未生产，感谢来电" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="客户咨询该产品商业配送业务合作，告知此产品区域负责业务经理，请其自行咨询 " onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="客户咨询此产品业务合作，告知此产品区域负责业务经理，请其自行咨询 " onclick="onclick3()"> 
</td></tr>


<tr><td><textarea rows="10" cols="100" name="Di_info" id="Di_info" value=""></textarea></td></tr>
<tr><td><input type="submit" value="确认保存" onclick='window.location.reload(true)'></td>
<td><input type="reset" value="重新填写"></td>
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
             
               
            
      
        <table width="95%" align="center" cellspacing="0" cellpadding="0" >
            <tr>
                <td class="bl"></td>
                <td class="bm">&nbsp;</td>
                <td class="br"></td>
            </tr>
        </table>
    </div>
</body>
