<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%    
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
    out.print(sdf.format(new Date()));
%>
