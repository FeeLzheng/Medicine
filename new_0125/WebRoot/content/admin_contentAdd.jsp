<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="fck" uri="http://java.fckeditor.net" %>
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
                <span class="tt">&nbsp;栏目内容分类管理 -- 添加《${queryTopicTitle}》新闻内容</span>
            </td>
            <td class="tr"></td>
        </tr>
    </table>
<table width="90%" align="center" cellspacing="0" cellpadding="0">
<tr>
    <td class="ml"></td>
    <td class="mm">
        <s:form action="admin_contentAdd" namespace="/content">
            <input type="hidden" name="queryTopicId" value=${queryTopicId} />
            <input type="hidden" name="id" value=${id} />
            <table align="center" width="100%">
                <tr>
                    <td><nobr>所属栏目：${topicList}
                    &nbsp;
                    新闻标题：*<s:textfield name="title" size="40" maxLength="50" value="%{title}"/>&nbsp;
                </nobr><nobr>
                    新闻作者：<s:textfield name="author" size="20" maxLength="20" value="%{author}" />  &nbsp;
                    发布日期：*<sx:datetimepicker name="date" id="date" type="date" displayFormat="yyyy-MM-dd" value="%{'today'}"/>
                </nobr>
        </td>
    </tr>
    <tr>
        <td>新闻内容：*<fck:editor instanceName="content" height="300" value="${content}" /></td>
    </tr>
    <tr>
        <td align="center" >
            <s:submit value="确定"/>
            <s:reset value="重写"/>
        </td>
    </tr>
    </table>
    </s:form>
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