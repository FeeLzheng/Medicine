<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<span id="dlSortNav">
    <span>
        <a href="index.jsp" >��ҳ</a>
    </span>
    <s:iterator var="item" value="topicList">
        <span>
            <img src="pics/nbar_separator.gif" align="absmiddle" alt=""/>
        </span>
        <span>
            <a href="content/getNewsList.action?queryTopicId=${item.id}" >${item.title}</a>
        </span>
    </s:iterator>

</span>