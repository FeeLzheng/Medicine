<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<br/>
<s:iterator var="item" value="allNews" status="st">
    <s:if test="#st.count<=4">
        &nbsp;&nbsp;&nbsp;
    <a href="showContent.action?queryTopicId=${item.id}">
        ${item.title} &nbsp;&nbsp;${item.date}
    </a><br/>
    </s:if>
</s:iterator>
