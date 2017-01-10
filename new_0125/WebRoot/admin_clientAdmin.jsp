<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>客户服务记录管理系统</title>
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
                <span class="tt">&nbsp;客户服务记录管理系统 </span>
                <input type="button" value="导出当天数据" onclick="window.location='admin_DayoutPut.action'">
                <input type="button" value="导出当月数据" onclick="window.location='admin_MonthoutPut.action'">
                
                <input type="button" value="导出今年年数据" onclick="window.location='admin_YearoutPut.action'">
                <input type="button" value="导出所有数据" onclick="window.location='admin_outPut.action'">
            </td>
            <td class="tr"></td>
            
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="clientCount" value="0"/>
                <s:iterator id="client" value="allClient" status="status">
                    <s:set var="clientCount" value="status.count"/>
                </s:iterator>
                <s:if test="#clientCount==0">
                    当前无客服服务信息,请添加！！！！
                </s:if>
                <s:else>
                    客服服务信息：
                    <table border="1" width="95%" align="center">
                        <tdead>
                            <tr>
                                <td widtd="5%">序号</td> 
                                <td width="22%">药品名称</td>                           
                                <td width="12%">客户姓名</td>
                                
                                <td width="17%">客户电话</td>
                                <td width="10%">性质</td>
                                
                                <td width="17%">记录保存时间</td>
                                <td width="10%">操作</td>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="client" value="allClient" status="status">
                                <tr>
                                    <td>${client.getC_id()}</td>
                                    

                                    <td>${client.getM_name()}</td>
                                    <td>${client.getC_name()}</td>
                                    <td>${client.getC_phone()}</td>                                    
                                    <td>${client.getProperty()}</td>
                                     <td>${client.getC_Date()}</td>
<td>
<a  href=admin_clientEdit.action?C_id=${client.getC_id()}&M_name=${client.getM_name()}&C_province=${client.getC_province()}&C_name=${client.getC_name()}&Di_info=${client.getDi_info()}&Q_id=${client.getQ_id()}&Q_info=${client.getQ_info()}&P_id=${client.getP_id()}&P_info=${client.getP_info()}&MQ_id=${client.getMQ_id()}&MQ_info=${client.getMQ_info()}&Co_id=${client.getCo_id()}&Co_info=${client.getCo_info()}&Co_department=${client.getCo_department()}&Co_deliver=${client.getCo_deliver()}&Co_dealer=${client.getCo_dealer()}&Co_category=${client.getCo_category()}&Co_replay=${client.getCo_replay()}&Co_result=${client.getCo_result()}&Co_replenish=${client.getCo_replenish()}&Da_id=${client.getDa_id()}&Da_info=${client.getDa_info()}&Re_id=${client.getRe_id()}&Re_name=${client.getRe_name()}&Re_sex=${client.getRe_sex()}&Re_age=${client.getRe_age()}&Re_nation=${client.getRe_nation()}&Re_weight=${client.getRe_weight()}&Re_disease=${client.getRe_disease()}&Re_reactionN=${client.getRe_reactionN()}&Re_reactionD=${client.getRe_reactionD()}&Re_timeM=${client.getRe_timeM()}&Re_use=${client.getRe_use()}&Re_time=${client.getRe_time()}&Re_result=${client.getRe_result()}&Re_number=${client.getRe_number()}&Re_merge=${client.getRe_merge()}&Re_family=${client.getRe_family()}&Re_reactionP=${client.getRe_reactionP()}&Re_others=${client.getRe_others()}&Re_hospital=${client.getRe_hospital()}&Re_case=${client.getRe_case()}&Re_phone=${client.getRe_phone()}&O_id=${client.getO_id()}&O_info=${client.getO_info()}&C_phone=${client.getC_phone()} >修改</a>
                                        &nbsp;
                                        
                                        
                                        
                                        
                                       
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