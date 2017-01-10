<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>管理系统</title>
        <meta http-equiv="content-Type" content="text/html; charset=gb2312"/>
        <sx:head />
        <style type="text/css">
            td {font-size:9pt; color:#000000; }
        </style>
        <script type="text/javascript" language="javascript">
            <!--           
            var displayBar=true;
            function switchBar(obj)
            {
                if (displayBar)
                {
                    parent.document.getElementById("frame").cols="0,*";
                    displayBar=false;
                    obj.src="pics/admin_top_open.gif";
                    obj.title="打开左边管理菜单";
                }else{
                    parent.document.getElementById("frame").cols="180,*";
                    displayBar=true;
                    obj.src="pics/admin_top_close.gif";
                    obj.title="关闭左边管理菜单";
                }
            }
            -->
        </script>
    </head>
    <body background="pics/admin_top_bg.gif" style="margin:0px">
        <table height="100%" width="95%" border="0" cellpadding="0" cellspacing="0">
            <tr valign="middle">
                <td width="50">
                    <img onclick="switchBar(this)" src="pics/admin_top_close.gif" alt="关闭左边管理菜单" style="cursor:hand" />
                </td>
                <td width="40">
                    <img src="pics/admin_top_icon_1.gif" alt=""/>
                </td>
                <td >
                                 欢迎访问药品管理系统！
                </td>
                <td><a href="adminlogin.jsp" target="_top" >
                    <strong >管理员登陆</strong></a>&nbsp;</td>
                <td align="right">
                    <s:url id="getdate" value="getdate.jsp"/>
                    <sx:div  href="%{getdate}" updateFreq="1000"/>
                </td>
            </tr>
        </table>
    </body>
</html>
