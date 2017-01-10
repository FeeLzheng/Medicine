<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>���۾������ϵͳ</title>
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
                <span class="tt">&nbsp;���۵���������� </span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="districtCount" value="0"/>
                <s:iterator id="district" value="allDistrict22" status="status">
                    <s:set var="districtCount" value="status.count"/>
                </s:iterator>
                <s:if test="#districtCount==0">
                    ��ǰ�����۵������������Ϣ,����ӣ�������
                </s:if>
                <s:else>
                    ���۵������������Ϣ��
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="20%">���</th>
                               
                                <th width="50%">���۾�����Ϣ</th>
                               
                                <th width="30%">�༭</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="district" value="allDistrict22" status="status">
                                <tr>
                                    <td>${status.count}</td>
                                    

                                    <td>${district.getD_phone1()}</td>
                                   
                                    <td>
                                      <!--   <a  href=admin_districtEdit.action?id=${district.getId()}&M_name=${district.getM_name()}&D_company=${district.getD_company()}&D_district=${district.getD_district()}&D_form=${district.getD_form()}&D_phone1=${district.getD_phone1()}&D_email1=${district.getD_email1()}&D_phone2=${district.getD_phone2()}&D_email2=${district.getD_email2()}>�޸�</a>-->
                                      <a  href=admin_managerEdit3.action?id=${district.getId()}&M_name=${district.getM_name()}&D_company=${district.getD_company()}&D_form=${district.getD_phone1()}&D_phone1=${district.getD_phone1()}&D_email1=${district.getD_email1()}&D_phone2=${district.getD_phone2()}&D_email2=${district.getD_email2()}>�޸�</a> 
                                        &nbsp;&nbsp;
                                      <!--    <a  href=admin_districtDelete.action?id=${district.getId()}&M_name=${district.getM_name()}&D_company=${district.getD_company()}&D_district=${district.getD_district()}&D_form=${district.getD_form()}&D_phone1=${district.getD_phone1()}&D_email1=${district.getD_email1()}&D_phone2=${district.getD_phone2()}&D_email2=${district.getD_email2()} >ɾ��</a>-->
                                    </td>
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