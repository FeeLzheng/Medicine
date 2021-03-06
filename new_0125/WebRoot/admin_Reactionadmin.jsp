<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>药品经销地管理系统</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body><br/>
<div class="mframe">
<input type="hidden" name="M_name" value=${M_name } >
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="tl"></td>
            <td class="tm">
                <span class="tt">&nbsp;药品经销地信息 </span>
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
                <s:if test="#districtCount==0">
                
              <s:iterator id="item" value="allMedicine2">
                    当前无药品经销地信息,请在销售公司信息管理处添加该信息！！！！<br/>
                    或者直接在客服服务记录中手动添加     
                    
                    <a  href=admin_ReactionAdd.action?M_name=${item.getM_name()}>请点击具体内容</a>       
                </s:iterator>
                </s:if>
                <s:else>
                    药品信息：
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="10%">序号</th>
                               
                                <th width="30%">药品名称</th>
                                <th width="20%">销售省份</th>
                                <th width="20%">销售公司</th>
                                <th width="20%">编辑</th>
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
                                        <a  href=admin_ReactionAdd.action?id=${district.getId()}&M_name=${district.getM_name()}&D_district=${district.getD_district()} >具体内容</a>
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