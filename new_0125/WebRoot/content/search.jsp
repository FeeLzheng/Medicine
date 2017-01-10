<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="gb2312">
<head>
    <title>新新闻网</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="../styles/style.css" type="text/css"/>
    <link rel="stylesheet" href="../styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
<div class="twidth" >
    <!-- 获取页头栏 -->
    <s:url id="getheader" value="/getheader.jsp" />
    <sx:div  href="%{getheader}"/>
    <div class="mframe">
        <br/>
        <!-- 快速搜索栏 --><div style="background-color: #dddddd">站内新闻搜索：
            <s:form action="search.action" namespace="/content" style="display:inline">
                <input type="text" name="keyword" class="inputbg" size="40"
                       value="在此输入搜索关键字" style="background-color:white"/>&nbsp;
                <input type="radio" name="where" value="标题" checked="checked"/>标题
                <input type="radio" name="where" value="内容"/>内容&nbsp;
                <input type="radio" name="where" value="作者"/>作者&nbsp;
                <input type="submit" value="搜索" style="background: #E8FF00"/>
            </s:form></div><br/>
        <!-- 搜索栏结束 -->
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;站内新闻搜索：
                        <span style="color: red">${where} </span>包含
                        <span style="color: red">${keyword}</span>
                    </span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <s:iterator var="item" value="searchList">
                <tr>
                    <td class="ml"></td>
                    <td class="mm">&nbsp;&nbsp;
                        <a href="showContent.action?queryTopicId=${item.id}">
                            ${item.title}
                            <span style="text-align: right">${date}</span>
                        </a>
                    </td>
                    <td class="mr"></td>
                </tr></s:iterator>

            </table>
            <table width="95%" align="center" cellspacing="0" cellpadding="0" >
                <tr>
                    <td class="bl"></td>
                    <td class="bm">&nbsp;</td>
                    <td class="br"></td>
                </tr>
            </table>
        </div>
        <!-- 获取页脚栏 -->
    <s:url id="getfooter" value="/getfooter.jsp" />
    <sx:div  href="%{getfooter}"/>
</div>
</body>
</html>
