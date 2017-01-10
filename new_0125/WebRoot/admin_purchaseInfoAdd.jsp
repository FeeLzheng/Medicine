<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>药品地址管理系统</title>
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
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>
    -->
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;药品 <b>${M_name }<b> 管理和销售省份  ${D_district}信息 </span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_purchaseinfoEditSave"  method="post" target="_parent">
        <input type="hidden" name="D_company" value=${D_company }>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>

 
<td width="8%" align="left"><nobr>药品名称： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail">详情</a></td>
 </tr>
 <tr>
 

<td width="8%" align="left"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> 详情</a></td>


</tr>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="32%"><input type="text" size="50" name="P_name" ></td>
</tr>

<tr>
<td width="8%" align="left"><nobr>客户所在省份： </nobr></td>
<td width="32%"><input type="text" size="50" name="P_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     全国省份详情</a></td>
</tr>
 <tr>
 
<td width="8%" align="left"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="50" name="P_iphone" ></td>
</tr>
</table>
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td><b>个人购买咨询内容： </b></td>
<tr><td>
<input type="button" id="tishi1" value="客户咨询该产品个人购买，转告客户此产品云开亚美购买热线电话4006-535328，请其自行咨询" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="客户咨询该产品是否在生产，咨询购买-转告客户此产品公司暂未生产，感谢其来电" onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="客户咨询此产品当地购买，转告客户此产品区域负责人电话，请其自行咨询" onclick="onclick3()"> 
</td></tr>
<tr><td><textarea rows="10" cols="100" name="P_info" id="P_info"></textarea></td></tr>
<tr><td><input type="submit" value="确认保存" ></td>
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