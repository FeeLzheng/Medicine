<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>不良反应</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">

     <!--       <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>
    -->
    <div align="center">
<fieldset>
<legend> 请填写不良反应信息： </legend>
<s:form action="admin_reactionEditSave" target="_parent">
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>

<td width="8%" align="right"><nobr>药品名称： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="30" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail">详情</a></td>
 


<td width="8%" align="left"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="20" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail">详情</a></td>
</tr><tr>
<td width="8%" align="right"><nobr>客户姓名： </nobr></td>

<td width="32%"><input type="text" size="20" name="RC_name" ></td>


<td width="8%" align="left"><nobr>客户所在省份： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     全国省份详情</a></td>
</tr><tr>
<td width="8%" align="right"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_iphone" ></td>
</tr>
<tr>


<td width="8%" align="right"><nobr>患者姓名：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_name"></td>
<td width="8%" align="left"><nobr>性别： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_sex" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>年龄：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_age" ></td>
<td width="8%" align="left"><nobr>民族： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_nation" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>体重：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_weight" ></td>
<td width="8%" align="left"><nobr>原患疾病： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_disease" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>不良反应/事件名称：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionN" ></td>
<td width="8%" align="left"><nobr>不良反应/事件过程描述： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionD" ></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>用药起止时间：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_timeM"></td>
<td width="8%" align="left"><nobr>用法用量： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_use" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>不良反应/事件发生时间：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_time" ></td>
<td width="8%" align="left"><nobr>不良反应/时间结果： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_result" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>生产批号：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_number" ></td>
<td width="8%" align="left"><nobr>合并用药情况： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_merge" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>家族药品不良反应/事件：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_family" ></td>
<td width="8%" align="left"><nobr>既往药品不良反应/事件： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionP" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>其他：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_others" ></td>
<td width="8%" align="left"><nobr>医院名称： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_hospital" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>病历号/门诊号：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_case" ></td>
<td width="8%" align="left"><nobr>联系方式： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_phone" ></td>
</tr>

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