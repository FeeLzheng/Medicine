<%@page contentType="text/html" pageEncoding="gb2312"  import="java.sql.*"%>
<%@ page import="myActions.*"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="com.opensymphony.xwork2.ActionSupport" %>
<%@ page import="com.opensymphony.xwork2.ModelDriven" %>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>

<%!

    	String userid="";
	   //  String ss=(String) request.getSession().getAttribute("statue");
	   //  String s=ss;
	  //   int mark=Integer.valueOf(s).intValue();
	     
	    public void User(){
	        
	    }
	     public int User (String userid) throws Exception{
	     
	     //��ȡ��½��
	    HttpServletRequest request=ServletActionContext.getRequest();
	    String User=(String) request.getSession().getAttribute("username");
	    
	    
	    
	    String userid1=User;
	     
	   doSqlDb query = new doSqlDb();
    	ResultSet rs = query.doQuery("select statue from admins where userid ='"+userid1+"'");//ִ�в�ѯ
    	int mark_int; //mark_int=1����ͨ�û���Ϊ0�ǹ���Ա
    	if(rs.next()){
	    String mark_string=rs.getString("statue");
	    
	     mark_int=Integer.valueOf(mark_string).intValue();
	     return mark_int;
	    }else{
	    mark_int=1;
	    return mark_int;
	    }
	}
	     %>
<html>
    <head>
        <title>ҩƷ���۵�������ϵͳ</title>
        <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
        <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
        <sx:head/>
    </head>
<body><br/>
<div class="mframe">
    <div align="center">
<s:form action="passwordEditSave">
<fieldset>
<legend> �˻���Ϣ�� </legend>

<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>
<td width="8%" align="right"><nobr>�˻�����</nobr></td>
<%if(User(userid)==0||User(userid)==2)
//if(mark==0)
     {%>
<td width="32%"><input type="text" size="20" name="username"  > <!-- ������disabled="true" ���ֻ��ɻ�ɫ�����ɱ༭ -->
</td>
<%} else {%>
<td width="32%"><input type="text" size="20" name="username" value=${username } readonly disabled="disabled" > <!-- ������disabled="true" ���ֻ��ɻ�ɫ�����ɱ༭ -->
</td>
<%}%>
<td width="8%" align="left"><nobr>���룺 </nobr></td>
<td width="32%"><input type="text" size="20" name="password"></td>


</tr>

</table>
</fieldset>


<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr><td><input type="submit" value="ȷ���޸�" ></td>
<td><input type="reset" value="������д"></td>
</tr>

</table>
</s:form>
<s:if test="hasFieldErrors()">
<hr/>
<div align=center style="color:red"><s:fielderror/></div>
</s:if>
<s:if test="hasActionMessages()">
                    <hr/><div align=center style="color:red"><s:actionmessage/></div>
                </s:if>
           
        
 
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