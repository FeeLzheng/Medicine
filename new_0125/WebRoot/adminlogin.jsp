<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page isELIgnored="false"%>

<html xmlns="http://www.w3.org/1999/xhtml" lang="gb2312">
<head>
<title>管理员登录</title>
<meta http-equiv="content-type" content="text/html;charset=gb2312"/>
<link rel="stylesheet" href="styles/style.css" type="text/css"/>
<sx:head/>
</head>
<body>
<div class="twidth" >
    <!-- 获取页头栏 -->
    <s:url id="getheader" value="getheader.jsp"/>
    <sx:div  href="%{getheader}"/>
    <br/>
    <div class="lframe" >
        <table width="95%" cellspacing="0" cellpadding="0" align="center">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">管理登录</span>
                </td>
                <td class="tr"></td>
            </tr>
        </table>
        <table width="95%" cellspacing="0" cellpadding="0" align="center">
            <tr>
                <!--  <td class="ml"></td>
                <td class="mm">-->
                    <s:form action="adminLog">
                        <table align="center" >
                            <tr >
                            <tr>
                            <td>  <br/>
                           </td>
                            </tr>
                                <td style="align:right;background:url(icon-name.png);background-repeat:repeat-x; width:37px;height:33px"></td>
                                
                              <!--   <td align="right"><input type="text" name="username" style="width:200px;height:50px"  onclick=""></td>
                                --> 
                                <td align="left"><s:textfield name="username" placeholder="请输用户名..." color="#777" cssStyle=" font-size:12; width:185px;height:26px"/></td>
                            </tr>
                             <tr>
                            <td>  <br/>
                           </td>
                            <tr>
                                <td style="align:right;background:url(icon-city.png);background-repeat:repeat-x; width:37px;height:33px"></td>
                                <td align="left"><s:password name="password" placeholder="请输密码..." color="#777" cssStyle=" font-size:12; width:185px;height:26px" /></td>
                            </tr>
                             <tr>
                            <td>  <br/><br/>
                           </td>
                           </tr>
                            <tr>
                                <td align="center" colspan="2">
                                    <s:submit value=" " cssStyle="background:url('sub.png') no-repeat; width:66px;height:22px"/>
                                   
                                   
							&nbsp;&nbsp;&nbsp;
                                  <s:reset value=" " cssStyle="background:url('register.png') no-repeat; width:66px;height:21px"/></td>
                            
                           
                              <!--  <input type="button" value=" " style="background:url('register.png') no-repeat; width:66px;height:22px" onclick="window.location='admin_register.jsp'"></td>
                               --> 
                           </tr> 
                             <tr>
                            <td>  <br/><br/><br/><br/>
                           </td>
                           </tr>
                        </table>
                    </s:form>
                    <s:if test="hasFieldErrors()">
                        <hr/>
                        <div align=center style="color:red"><s:fielderror/></div>
                    </s:if>
                </td>
                <td class="mr"></td>
            </tr>
        </table>
    </div>
</div>
</body>
</html>
