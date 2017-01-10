<%@page contentType="text/html" pageEncoding="gb2312"  import="java.sql.*"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>药品地址管理系统</title>
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
                    <span class="tt">&nbsp;客户信息管理管理 -- 修改<b>${M_name }<b>信息</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <s:form action="admin_clientEditSave" method="post">
        <input type="hidden" name="C_id" value=${C_id }>
        <input type="hidden" name="M_name" value=${M_name }>
<fieldset>
<legend> 客户信息： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>药品名称：</nobr></td>
<td width="32%" name="M_name">${M_name}</td>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="32%"><input type="text" size="20" name="C_name" value="${C_name }"></td>
</tr>
<tr>

<td width="8%" align="right"><nobr>客户电话：</nobr></td>
<td width="32%"><input type="text" size="20" name="C_phone" value="${C_phone }"></td>
<td width="8%" align="left"><nobr>客户所在省： </nobr></td>
<td width="32%"><input type="text" size="20" name="C_province" value="${C_province }"></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> 产品代理： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>产品代理咨询信息： </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="Di_info"  >${Di_info }</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> 个人咨询： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>个人咨询信息： </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="Q_info" >${Q_info }</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> 个人购买咨询： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>个人购买信息： </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="P_info" >${P_info }</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> 用药咨询： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>用药咨询信息： </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="MQ_info" >${MQ_info }</textarea></td>
</tr>

</table>
</fieldset>


<fieldset>
<legend> 投诉信息： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>投诉内容：</nobr></td>
<td width="52%"><input type="text" size="60" name="Co_info" value=${Co_info } ></td>
<td width="8%" align="left"><nobr>用药单位： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_department" value=${Co_department }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>转交部门：</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_deliver" value=${Co_deliver } ></td>
<td width="8%" align="left"><nobr>经销商信息： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_dealer" value=${Co_dealer }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>投诉类别：</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_category" value=${Co_category } ></td>
<td width="8%" align="left"><nobr>投诉回复： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replay" value=${Co_replay }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>投诉处理结果：</nobr></td>
<td width="32%"><input type="text" size="20" name="Co_result" value=${Co_result } ></td>
<td width="8%" align="left"><nobr>补货信息： </nobr></td>
<td width="32%"><input type="text" size="20" name="Co_replenish" value=${Co_replenish }></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> 药监部门： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>具体内容信息： </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="Da_info"  >${Da_info}</textarea></td>
</tr>

</table>
</fieldset>

<fieldset>
<legend> 不良反应： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>患者姓名：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_name" value=${Re_name } ></td>
<td width="8%" align="left"><nobr>性别： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_sex" value=${Re_sex }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>年龄：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_age" value=${Re_age } ></td>
<td width="8%" align="left"><nobr>民族： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_nation" value=${Re_nation }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>体重：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_weight" value=${Re_weight } ></td>
<td width="8%" align="left"><nobr>原患病情： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_disease" value=${Re_disease }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>不良反应/事件名称：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionN" value=${Re_reactionN } ></td>
<td width="8%" align="left"><nobr>不良反应/事件过程描述： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionD" value=${Re_reactionD }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>用药起止时间：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_timeM" value=${Re_timeM } ></td>
<td width="8%" align="left"><nobr>用法用量： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_use" value=${Re_use }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>不良反应/事件发生时间：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_time" value=${Re_time } ></td>
<td width="8%" align="left"><nobr>不良反应/事件的结果： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_result" value=${Re_result }></td>
</tr>
<tr>

<tr>
<td width="8%" align="right"><nobr>生产批号：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_number" value=${Re_number } ></td>
<td width="8%" align="left"><nobr>合并用药品情况： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_merge" value=${Re_merge }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>家族药品不良反应/事件：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_family" value=${Re_family } ></td>
<td width="8%" align="left"><nobr>既往药品不良反应/事件： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_reactionP" value=${Re_reactionP }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>其他：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_others" value=${Re_others } ></td>
<td width="8%" align="left"><nobr>医院名称： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_hospital" value=${Re_hospital }></td>
</tr>

<tr>
<td width="8%" align="right"><nobr>病历号/门诊号：</nobr></td>
<td width="32%"><input type="text" size="20" name="Re_case" value=${Re_case } ></td>
<td width="8%" align="left"><nobr>联系方式： </nobr></td>
<td width="32%"><input type="text" size="20" name="Re_phone" value=${Re_phone }></td>
</tr>
</table>
</fieldset>

<fieldset>
<legend> 其他： </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>具体内容信息： </nobr></td>
<td width="50%"><textarea rows="3" cols="100" name="O_info" >${O_info }</textarea></td>
</tr>

</table>
</fieldset>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
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