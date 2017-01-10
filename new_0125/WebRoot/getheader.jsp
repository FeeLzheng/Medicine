<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<table align="center" width="100%" >
    <tr><td  width="200">
            <img src="pics/logo1.png" alt=""/>
        </td>
          <td align="center" >
            <img src="pics/logo2.png" width="480" height="60"  alt=""/>
        </td>
        <td width="100" align="right" style="line-height:120%">
            <a href="adminlogin.jsp">管理登录</a><br/>
            <a href="#" onclick="javascript:window.external.addFavorite('http://www.海正.com/','海正药业')">加入收藏</a>
        </td>
    </tr>
</table>
<table id="navbar" cellpadding="0" cellspacing="0" >
    <tr>
        <td class="l">
        </td>
        <td class="m">
            <!-- 获取导航栏 -->
            <s:url id="getbar" action="getNewsBar" namespace="/"/>
           
        </td><td class="r"></td>
    </tr>
</table>
<table id="navsub" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td class="l"></td>
        <td class="m" style="padding:0 30px">
            <!--获取广告栏，每隔10秒刷新 -->
            <s:url id="getbull" value="getBulletin.jsp"/>
            <sx:div  href="%{getbull}" updateFreq="10000" autoStart="true"/>
</td>
<td class="r"></td>
</tr>
</table>