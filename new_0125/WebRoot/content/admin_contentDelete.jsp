<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:action name="admin_contentAdmin" executeResult="true">
    <s:param name="queryTopicId" value="%{news.topicid}"/>
</s:action>