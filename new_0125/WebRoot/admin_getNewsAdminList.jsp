<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:iterator id="topic" value="topicList" status="status">
<table cellpadding="0" cellspacing="0" width="150" align="center">
    <tr style="cursor:hand;">
        <td height="25" class="menu_title" style="background:url('pics/admin_title_bg_hide.gif')"
            onmouseover="this.className='menu_title2';" onmouseout="this.className='menu_title';"
            onclick="menuChange(this,menuNews${topic.id});">
            <span>《${topic.title}》内容管理</span>
        </td>
    </tr>
    <tr><td>
    <div class="sec_menu" id="menuNews${topic.id}">
    <table cellpadding="0" cellspacing="0" border="0" align="center" width="140">
        <tr><td height="20">
            <a  target="right" href="content/admin_contentAdd.action?queryTopicId=${topic.id}">
                添加新闻
            </a> |
            <a  target="right" href="content/admin_contentAdmin.action?queryTopicId=${topic.id}">
                管理新闻
            </a><br/>
            <!-- 显示二级栏目列表 -->
            <table cellpadding="0" cellspacing="1" border="0" align="center" width="120">
                <s:iterator id="topic2" value="topicSubList">
                    <s:if test="#topic2.parentId==#topic.id"><tr><td>
                        《${topic2.title}》新闻
                        </td></tr><tr><td align="right">
                        <a  target="right" href="content/admin_contentAdd.action?queryTopicId=${topic2.id}">添加</a>
                        |
                        <a  target="right" href="content/admin_contentAdmin.action?queryTopicId=${topic2.id}">管理</a>
                    </td></tr></s:if>
                </s:iterator>
            </table>
        </td></tr>
    </table>
    </div>
    </td></tr>
    <tr><td>&nbsp;</td></tr>
</table>
</s:iterator>