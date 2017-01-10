<%@page contentType="text/html" pageEncoding="gb2312"%>
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
                    <span class="tt">&nbsp;药品地址管理管理 -- 修改<b>${M_name }<b>信息</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
       
        <input type="hidden" name="M_name" value=${M_name } >
        
<fieldset>
<legend> 药品信息： </legend>
<s:form action="admin_districtEditSave2" method="post">
<input type="hidden" name="id" value=${id } >
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr>
<td width="8%" align="left"><nobr>药品名称：</nobr></td>
<td width="32%">${M_name}</td>
<td width="8%" align="right"><nobr>销售公司： </nobr></td>
<td width="32%"><input type="text" size="20" name="D_company" value="${D_company }"></td>
</tr>
<tr>

<!--  <td width="8%" align="right"><nobr>销售省份：</nobr></td><!--由销售地区改为销售省份  -->
<!--  <td width="32%"><input type="text" size="20" name="D_district" value=${D_district }></td>-->
<td></td><td></td>
<td width="8%" align="right">销售形式：</td>
<td width="32%"><input type="text" size="20" name="D_form" value="${D_form }"></td>
</tr>
<tr>
<td></td><td><td><td><td><td><td><td><input type="submit" value="确认保存" ></td></tr>
</table>
</s:form>
</fieldset>
 
<s:set var="districtCount" value="0"/>
                <s:iterator id="district" value="allDistrict9" status="status">
                    <s:set var="districtCount" value="status.count"/>
                </s:iterator>
                 <s:iterator id="district" value="allDistrict9" status="status">
<fieldset>
<s:form action="admin_districtEditSave" method="post">
<legend> 经理信息： </legend>
 <input type="hidden" name="id" value=${district.getId() } >
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<!--  <tr><td><input type="text" size="20" name="id" value=${district.getId() } ></td></tr>-->
<tr>
<td width="8%" align="right"><nobr>销售省份：</nobr></td><!--由销售地区改为销售省份  -->
<td width="32%"><input type="text" size="20" name="D_district" value="${district.getD_district() }"></td>
</tr>
<tr>
<td></td><td></td>
<td width="8%" align="left"><nobr>地区经理1：</nobr></td><!--由地区经理电话改为地区经理1  -->
<td width="42%"><input type="text" size="40" name="D_phone1" value="${district.getD_phone1() }" > </td>
</tr>
<tr>

<td></td><td></td>
<td width="8%" align="left"><nobr>地区经理2： </nobr></td><!--由地区经理邮箱改为地区经理2  -->
<td width="42%"><input type="text" size="40" name="D_email1" value="${district.getD_email1() }"></td>
</tr>
<tr>
<td></td><td></td>
<td width="8%" align="left"><nobr>地区经理3：</nobr></td><!--由商务经理电话改为地区经理3  -->
<td width="42%"><input type="text" size="40" name="D_phone2" value="${district.getD_phone2() }"></td>
</tr>
<tr>
<td></td><td></td>
<td width="8%" align="left"><nobr>地区经理4： </nobr></td><!--由商务经理邮箱改为地区经理4  -->
<td width="42%"><input type="text" size="40" name="D_email2" value="${district.getD_email2() }"></td>
</tr>
<tr>
<td></td>
<td><a  href=admin_districtDelete.action?id=${district.getId()} >删  除</a></td>
<!-- <td><a  href=admin_districtEditSave.action?id=${district.getId()}&D_district=${district.getD_district()}&D_phone1=${district.getD_phone1()}&D_email1=${district.getD_email1()}&D_phone2=${district.getD_phone2()}&D_email2=${district.getD_email2()}>确认保存</a></td> -->
<td></td><td></td><td><input type="submit" value="确认保存" ></td>
</tr>
</table>
</fieldset>
</s:form>
</s:iterator>
<!--  <table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>
</tr>

</table>-->

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