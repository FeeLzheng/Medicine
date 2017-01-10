<%@page contentType="text/html" pageEncoding="gb2312"%>
<html>
<head>
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<title>用户管理首页</title>
</head>
<frameset id="frame" framespacing="0" border="false" cols="180,*" frameborder="0" scrolling="yes">
	<frame name="left"  scrolling="auto" marginwidth="0" marginheight="0" src="client_left.jsp" noresize>
	<frameset framespacing="0" border="false" rows="35,*" frameborder="0" scrolling="yes">
		<frame name="top" scrolling="no" src="client_top.jsp" noresize>
		<frame name="right" scrolling="auto" src="client_main.jsp">
	</frameset>
</frameset>
<noframes>
    <body>
    <p>当前页面使用了框架，你的浏览器不支持框架</p>
    </body>
</noframes>

</html>
