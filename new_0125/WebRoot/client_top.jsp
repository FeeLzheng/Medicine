<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>����ϵͳ</title>
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
                    obj.title="����߹���˵�";
                }else{
                    parent.document.getElementById("frame").cols="180,*";
                    displayBar=true;
                    obj.src="pics/admin_top_close.gif";
                    obj.title="�ر���߹���˵�";
                }
            }
            -->
        </script>
    </head>
    <body background="pics/admin_top_bg.gif" style="margin:0px">
        <table height="100%" width="95%" border="0" cellpadding="0" cellspacing="0">
            <tr valign="middle">
                <td width="50">
                    <img onclick="switchBar(this)" src="pics/admin_top_close.gif" alt="�ر���߹���˵�" style="cursor:hand" />
                </td>
                <td width="40">
                    <img src="pics/admin_top_icon_1.gif" alt=""/>
                </td>
                <td >
                                 ��ӭ����ҩƷ����ϵͳ��
                </td>
                <td><a href="adminlogin.jsp" target="_top" >
                    <strong >����Ա��½</strong></a>&nbsp;</td>
                <td align="right">
                    <s:url id="getdate" value="getdate.jsp"/>
                    <sx:div  href="%{getdate}" updateFreq="1000"/>
                </td>
            </tr>
        </table>
    </body>
</html>
