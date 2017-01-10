<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>药品经销地管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body><br/>
<div class="mframe">

    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="tl"></td>
            <td class="tm">
                <span class="tt">&nbsp;地区经理电话信息 </span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
   
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
    
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="iphoneCount" value="0"/>
                <s:iterator id="District2" value="allDistrict2" status="status">
                    <s:set var="allDistrict2Count" value="status.count"/>
                </s:iterator>
                <s:if test="#allDistrict2Count==0">
                   <s:iterator id="item" value="allDistrict2">
                    当前省无地区经理电话信息！！！！<br/>
                 
                        
                </s:iterator>
                </s:if>
                <s:else>
              
                    经理电话信息：
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="10%">客户省份</th>
                                <th width="10%">药品</th>
                                <th width="20%">地区经理1</th>
                                <th width="20%">地区经理2</th>
                                <th width="20%">地区经理3</th>
                                <th width="20%">地区经理4</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="District2" value="allDistrict2" status="status">
                                <tr>
                                    <td>${District2.getD_district()}</td>
                                    <td>${District2.getM_name()}</td>
                                    <td>${District2.getD_phone1()}</td>
                                    <td>${District2.getD_email1()}</td>
                                    <td>${District2.getD_phone2()}</td>
                                    <td>${District2.getD_email2()}</td>
                                   
                                </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                </s:else>
                <s:if test="hasFieldErrors()">
                    <hr/>
                    <div align=center style="color:red"><s:fielderror/></div>
                </s:if>
                <s:if test="hasActionMessages()">
                    <hr/><div align=center style="color:red">
                        <s:actionmessage/></div>
                    </s:if>
            </td>
            <td class="mr"></td>
        </tr>
    </table>
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