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
    <!-- 显示新闻列表 -->
    <div class="mframe">
        <br/>
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;《${queryTopicTitle}》栏目新闻&nbsp;&nbsp;
                        <s:iterator var="item" value="subNewsBar">
                            <span>
                                <img src="../pics/nbar_separator.gif" align="absmiddle" alt=""/>
                            </span>
                            <span>
                                <a href="getNewsList.action?queryTopicId=${item.id}" >${item.title}</a>
                            </span>
                        </s:iterator>
                    </span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <s:set var="newsCount" value="0"/>
            <s:iterator var="item" value="allNews" status="st">
                <s:set var="newsCount" value="#st.count"/>
                <tr>
                    <td class="ml"></td>
                    <td class="mm">&nbsp;&nbsp;
                        <a href="showContent.action?queryTopicId=${item.id}">
                            ${item.title} &nbsp;&nbsp;${item.date}
                        </a>
                    </td>
                    <td class="mr"></td>
                </tr>
            </s:iterator>
            <s:if test="#newsCount==0">
                <tr>
                    <td class="ml"></td>
                    <td class="mm">&nbsp;&nbsp;
                        暂无此类新闻！！！！！
                    </td>
                    <td class="mr"></td>
                </tr>
            </s:if>
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
