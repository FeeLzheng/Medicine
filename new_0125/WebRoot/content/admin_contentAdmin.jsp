<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>新新闻管理系统</title>
<meta http-equiv="content-type" content="text/html;charset=gb2312"/>
<link rel="stylesheet" href="../styles/admin_style.css" type="text/css"/>
<sx:head/>
</head>
<body>
<br/>
<div class="mframe">
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="tl"></td>
            <td class="tm">
                <span class="tt">&nbsp;栏目内容分类管理 -- 查看《${queryTopicTitle}》新闻列表</span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
    <table width="90%" align="center" cellspacing="0" cellpadding="0">
        <tr>
            <td class="ml"></td>
            <td class="mm">
                <s:set var="newsCount" value="0"/>
                <s:iterator id="news" value="allNews" status="st">
                    <s:set var="newsCount" value="st.count"/>
                </s:iterator>
                <s:if test="#newsCount==0">
                    当前无《${queryTopicTitle}》新闻内容，请新添加新闻！！！！
                </s:if>
                <s:else>
                    新闻栏目信息：
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="5%">序号</th>
                                <th width="10%">新闻ID</th>
                                <th width="50%">新闻标题</th>
                                <th width="10%">栏目名称</th>
                                <th width="20%">编辑</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator id="news" value="allNews" status="st">
                                <tr>
                                    <td align="center">${st.count}</td>
                                    <td align="center">${news.id}</td>
                                    <td>${news.title}</td>
                                    <td align="center">${news.topicTitle}</td>
                                    <td align="center">
                                        <a  href="admin_contentEdit.action?id=${news.id}&queryTopicId=${news.topicid}" >修改</a>
                                        &nbsp;
                                        <a  href="admin_contentDelete.action?id=${news.id}" >删除</a>
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