<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>ҩƷ�����ع���ϵͳ</title>
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
                <span class="tt">&nbsp;���������绰��Ϣ </span>
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
                    ��ǰʡ�޵��������绰��Ϣ��������<br/>
                 
                        
                </s:iterator>
                </s:if>
                <s:else>
              
                    �����绰��Ϣ��
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="10%">�ͻ�ʡ��</th>
                                <th width="10%">ҩƷ</th>
                                <th width="20%">��������1</th>
                                <th width="20%">��������2</th>
                                <th width="20%">��������3</th>
                                <th width="20%">��������4</th>
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