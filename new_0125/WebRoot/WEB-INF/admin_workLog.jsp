<%@page contentType="text/html" pageEncoding="gb2312"%>
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
                <span class="tt">&nbsp;操作日志 </span>
            </td>
            <td class="tr"></td>
        </tr>
      </table>
     <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
             <td class="mm">
                <s:set var="workLogCount" value="0"/>
                <s:iterator id="workLog" value="allworkLogList" status="status">
                    <s:set var="workLogCount" value="status.count"/>
                </s:iterator>
                  <s:if test="#workLogCount==0">
                   日志无记录！
                </s:if>
                
  
                
                <s:else>
                    操作信息：-->
                      <table border="1" width="100%" align="center">
                        <thead>
                            <tr>
                                <th width="4%" style="font-weight: bold;"><font size="2">序号</font></th>
                                <th width="5%" style="font-weight: normal;"><strong><font size="2">人员</font></strong></th>
                                <th width="15%" style="font-weight: normal;"><strong><font size="2">时间</font></strong></th>
                                <th width="35%" style="font-weight: normal;"><strong><font size="2">更改前</font></strong></th>
                                <th width="35%" style="font-weight: normal;"><strong><font size="2">更改后</font></strong></th>                                
                                <th width="9%" style="font-weight: normal;"><strong><font size="2">位置</font></strong></th>
                                <th width="5px" style="font-weight: normal;"><strong><font size="2">操作</font></strong></th>
                                
                            </tr>
                       </thead>
                        <tbody>
                            <s:iterator id="WorkLog" value="allworkLogList" status="status">
                                <tr>
                                
                                <!--添加对应的日志后台取数  -->
                                    <td>${WorkLog.id}</td>
                                    <td>${WorkLog.operator}</td>
                                    <td>${WorkLog.time}</td>
                                    <td>${WorkLog.precontent}</td>
                                    <td>${WorkLog.aftcontent}</td>
                                    <td>${WorkLog.location}</td>                                   
                                    <td>${WorkLog.action}</td>
                                    
                                    
                                   <!-- <td>
                                        <a  href=admin_medicineEdit.action?M_name=${medicine.getM_name()}&M_id=${medicine.getM_id()}&M_standard1=${medicine.getM_standard1()}&M_standard2=${medicine.getM_standard2()}&M_adaptation=${medicine.getM_adaptation()}&M_use=${medicine.getM_use()}&M_effect=${medicine.getM_effect()}&M_execute=${medicine.getM_execute()}&M_instruction=${medicine.getM_instruction()}>修改</a>
                                        &nbsp;&nbsp;
                                        <a  href=admin_medicineDelete.action?M_name=${medicine.getM_name()}&M_id=${medicine.getM_id()}&M_standard1=${medicine.getM_standard1()}&M_standard2=${medicine.getM_standard2()}&M_adaptation=${medicine.getM_adaptation()}&M_use=${medicine.getM_use()}&M_effect=${medicine.getM_effect()}&M_execute=${medicine.getM_execute()}&M_instruction=${medicine.getM_instruction()} >删除</a>
                                    </td> -->
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