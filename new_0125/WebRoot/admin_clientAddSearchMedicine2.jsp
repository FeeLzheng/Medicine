<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>ҩƷ���ƹ���ϵͳ</title>
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
                <span class="tt">&nbsp;ҩƷ��ѯ��� </span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="medicineCount" value="0"/>
                <s:iterator id="medicine" value="allMedicine3" status="status">
                    <s:set var="medicineCount" value="status.count"/>
                </s:iterator>
                <s:if test="#medicineCount==0">
                    �޴�ҩƷ���뷵�ؿͻ�������Ϣ���½���������
                </s:if>
                <s:else>
                    ҩƷ��Ϣ��
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="20%">���</th>
                               
                                <th width="50%">ҩƷ����</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="medicine" value="allMedicine3" status="status">
                                <tr>
                                    <td>${status.count}</td>
                                    
                                   
                                    <td>
                                       <a  href=search5.action?M_name=${medicine.getM_name()}>
                                    ${medicine.getM_name()}</a></td>
                                    
                                </tr>
                            </s:iterator>
                        </tbody>
                    </table>
                </s:else>
         
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