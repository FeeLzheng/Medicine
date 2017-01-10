<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <title>投诉</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">

            <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>

    <div align="center">
<fieldset>
<legend> 请填写投诉信息： </legend>
<s:form action="admin_complainEditSave">
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>
 
<td width="8%" align="left"><nobr>药品姓名： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="30" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name}>详情</a></td>
 


<td width="8%" align="right"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="20" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district}>详情</a></td>
</tr><tr>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_name" ></td>


<td width="8%" align="right"><nobr>省份： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_province" value=${D_district }></td>

<tr>

<td width="8%" align="left"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_iphone" ></td>


<td width="8%" align="left"><nobr>用药单位： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_department" ></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>经销商信息：</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_dealer" ></td>
<td width="8%" align="left"><nobr>投诉类别： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_category" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>转交部门：</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_deliver" ></td>
<td width="8%" align="left"><nobr>投诉回复： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replay" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>投诉处理结果：</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_result" ></td>
<td width="8%" align="left"><nobr>补货信息： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replenish" ></td>
</tr>
<tr>
<td width="8%" align="right"><nobr>投诉内容：</nobr></td>
<td width="52%"><input type="text" size="60" name="Co_info" ></td>
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