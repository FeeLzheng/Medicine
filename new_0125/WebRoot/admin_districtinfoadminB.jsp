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
                <span class="tt">&nbsp;ҩƷ��������Ϣ </span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
    
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="districtCount" value="0"/>
                <s:iterator id="district" value="allDistrict2" status="status">
                    <s:set var="districtCount" value="status.count"/>
                </s:iterator>
           
                    ҩƷ��Ϣ��
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="10%">���</th>
                               
                               
                                <th width="40%">����ʡ��</th>
                               
                                <th width="40%">�༭</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="district" value="allDistrict2" status="status">
                                <tr>
                                    <td>${status.count}</td>

                                    <td>${district.getM_name()}</td>
                                    <td>${district.getD_district()}</td>
                                    <td>${district.getD_company()}</td>
                                    <td>
                                        <a  href=admin_districtInfoAdd.action?id=${district.getId()}&M_name=${district.getM_name()}&D_district=${district.getD_district()}&D_company=${district.getD_company()} >��������</a>
                                        &nbsp;&nbsp;
                                        
                                        
                                       
                                    </td>
                                </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                
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