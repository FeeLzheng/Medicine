<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>具体内容</title>
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
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>
    -->
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;具体内容</span>
                </td>
            </tr>
        </table>
        <s:form action="admin_departmentEditSave" target="_parent"> 
        <input type="hidden" name="D_company" value=${D_company }>
 <table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>

<td width="8%" align="left"><nobr>药品姓名： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail"> 详情</a></td>

</tr>
 <tr>
<td width="8%" align="left"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> 详情</a></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="32%"><input type="text" size="50" name="Da_name" target="districtDetail"></td>
</tr>
 <tr>
<td width="8%" align=""left""><nobr>客户所在省份： </nobr></td>
<td width="32%"><input type="text" size="50" name="Da_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     全国省份详情</a></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="50" name="Da_iphone" ></td>
</tr>
</table>       
              
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td><b>具体内容： </b></td>
<tr><td>
<input type="button" id="tishi1" value="药监部门对此产品进行抽检，需公司协助配合提供质量标准等批件。请对方传真一份函件（包括产品批号、标准、邮箱等信息）至057688827887。此产品抽检信息已转告QA、QC、商务部门及销售公司，请相关部门注意检测进展。" onclick="onclick1()"> 
</td></tr>
<tr><td><textarea rows="10" cols="100" name="Da_info" id="Da_info"></textarea></td></tr>
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