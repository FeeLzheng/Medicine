<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="gb2312">
    <head>
    <title>��������</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="../styles/style.css" type="text/css"/>
    <link rel="stylesheet" href="../styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
<div class="twidth" >
    <!-- ��ȡҳͷ�� -->
    <s:url id="getheader" value="/getheader.jsp" />
    <sx:div  href="%{getheader}"/>
    <div class="mframe">
        <br/>
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;��${topicTitle}������</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <table width="95%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="ml"></td>
                <td class="mm">
                    <h3 align="center">${title}</h3>
                    <div align="center">${author}Ѷ&nbsp;&nbsp;${date}</div>
                    ${Content}
                </td>
                <td class="mr"></td>
            </tr>
        </table>
        <table width="95%" align="center" cellspacing="0" cellpadding="0" >
            <tr>
                <td class="bl"></td>
                <td class="bm">&nbsp;</td>
                <td class="br"></td>
            </tr>
        </table>
    </div>
    <!-- ��ȡҳ���� -->
    <s:url id="getfooter" value="/getfooter.jsp" />
    <sx:div  href="%{getfooter}"/>
</div>
</body>
</html>
