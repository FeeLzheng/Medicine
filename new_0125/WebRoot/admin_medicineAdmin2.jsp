<%@page contentType="text/html" pageEncoding="gb2312" import="java.sql.*"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>


<html>
<head>
    <title>药品名称管理系统</title>
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
                <span class="tt">&nbsp;药品管理 </span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="medicineCount" value="0"/>
                <s:iterator id="medicine" value="allMedicine" status="status">
                    <s:set var="medicineCount" value="status.count"/>
                </s:iterator>
                <s:if test="#medicineCount==0">
                    当前无药品,请添加！！！！
                </s:if>
                <s:else>
                    药品信息：
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="20%">序号</th>
                               
                                <th width="50%">栏目名称</th>
                                <th width="30%">编辑</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="medicine" value="allMedicine" status="status">
                                <tr>
                                    <td>${status.count}</td>
                                    
                                   
                                    <td>${medicine.getM_name()}</td>
                                    <td>
                                    
                                    
                                        <a  href=admin_medicineEdit2.action?M_name=${medicine.getM_name()}&M_id=${medicine.getM_id()}&M_standard1=${medicine.getM_standard1()}&M_standard2=${medicine.getM_standard2()}&M_adaptation=${medicine.getM_adaptation()}&M_use=${medicine.getM_use()}&M_effect=${medicine.getM_effect()}&M_execute=${medicine.getM_execute()}&M_instruction=${medicine.getM_instruction()}>修改</a>
                                        &nbsp;&nbsp;
                                      
                                       
                                     
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