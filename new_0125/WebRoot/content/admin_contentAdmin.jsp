<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<title>�����Ź���ϵͳ</title>
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
                <span class="tt">&nbsp;��Ŀ���ݷ������ -- �鿴��${queryTopicTitle}�������б�</span>
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
                    ��ǰ�ޡ�${queryTopicTitle}���������ݣ�����������ţ�������
                </s:if>
                <s:else>
                    ������Ŀ��Ϣ��
                    <table border="1" width="95%" align="center">
                        <thead>
                            <tr>
                                <th width="5%">���</th>
                                <th width="10%">����ID</th>
                                <th width="50%">���ű���</th>
                                <th width="10%">��Ŀ����</th>
                                <th width="20%">�༭</th>
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
                                        <a  href="admin_contentEdit.action?id=${news.id}&queryTopicId=${news.topicid}" >�޸�</a>
                                        &nbsp;
                                        <a  href="admin_contentDelete.action?id=${news.id}" >ɾ��</a>
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