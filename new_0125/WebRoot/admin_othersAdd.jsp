<%@page contentType="text/html" pageEncoding="gb2312"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>其他事项</title>
    <meta http-equiv="content-type" content="text/html;charset=gb2312"/>
    <link rel="stylesheet" href="styles/admin_style.css" type="text/css"/>
    <sx:head/>
</head>
<body>
<script type="text/javascript" language="javascript">
function onclick1(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi1");
O_info.value=tishi1.value;
}
function onclick2(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi2");
O_info.value=tishi2.value;
}
function onclick3(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi3");
O_info.value=tishi3.value;
}
function onclick4(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi4");
O_info.value=tishi4.value;
}
function onclick5(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi5");
O_info.value=tishi5.value;
}
function onclick6(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi6");
O_info.value=tishi6.value;
}
function onclick7(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi7");
O_info.value=tishi7.value;
}
function onclick8(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi8");
O_info.value=tishi8.value;
}
function onclick9(){ 
var O_info=document.getElementById("O_info"); 
var tishi1=document.getElementById("tishi9");
O_info.value=tishi9.value;
}
 

</script>
    <br/>
    <div class="mframe">
    
  <!--     <s:form action="search3.action" style="display:inline">
                <input type="text" name="Keyword2" id="Keyword2" class="inputbg" size="40"
                        style="background-color:white"/>&nbsp;
            <input type="submit" value="搜索地区经理电话"  style="background: #E8FF00"/>
            </s:form>
      -->
        <table width="90%" align="center" cellspacing="0" cellpadding="0">
            <tr>
                <td class="tl"></td>
                <td class="tm">
                    <span class="tt">&nbsp;其他事项</span>
                </td>
            </tr>
        </table>
        <s:form action="admin_othersEditSave" target="_parent">   
        <input type="hidden" name="D_company" value=${D_company }>
        <table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">
<tr>

<td width="8%" align="left"><nobr>药品姓名： </nobr></td>
<td width="52%"><input type="text" value=${M_name } size="50" name="M_name" readonly="readonly"> <a  href=medicineDetail.action?M_name=${M_name} target="districtDetail"> 详情</a></td>
 
</tr>
<tr>
<td width="8%" align="left"><nobr>销售省份： </nobr></td>
<td width="52%"><input type="text"  size="50" name=D_district value=${D_district }><a  href=districtDetail.action?id=${id}&M_name=${M_name}&D_district=${D_district} target="districtDetail"> 详情</a></td>
</tr>
<tr>
<td width="8%" align="left"><nobr>客户姓名： </nobr></td>
<td width="32%"><input type="text" size="50" name="O_name" ></td>

</tr>
<tr>
<td width="8%" align="left"><nobr>客户所在省份： </nobr></td>
<td width="32%"><input type="text" size="50" name="O_province" value=${D_district }><a  href=admin_districtEdit2.action?M_name=${M_name} target="districtDetail">     全国省份详情</a></td>
<tr>

<td width="8%" align="left"><nobr>客户联系电话： </nobr></td>
<td width="32%"><input type="text" size="50" name="O_iphone" ></td>
</tr>
</table>
        
            
<table width="90%" name ="name" align= "center" cellspacing="0" cellpadding="0">

<tr><td><b>其他事项： </b></td>
<tr><td>
<input type="button" id="tishi1" value="1.请点击" onclick="onclick1()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi2" value="2.请点击" onclick="onclick2()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi3" value="3.请点击" onclick="onclick3()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi4" value="4.请点击" onclick="onclick4()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi5" value="5.请点击" onclick="onclick5()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi6" value="6.请点击" onclick="onclick6()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi7" value="7.请点击" onclick="onclick7()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi8" value="8.请点击" onclick="onclick8()"> 
</td></tr>
<tr><td>
<input type="button" id="tishi9" value="9.请点击" onclick="onclick9()"> 
</td></tr>

<tr><td><textarea rows="10" cols="100" name="O_info" id="O_info" ></textarea></td></tr>
<tr><td><input type="submit" value="确认保存" ></td>
<td><input type="reset" value="重新填写"></td>
</tr>

</table>
</s:form>
                    <s:if test="hasFieldErrors()">
                        <hr/>
                        <div align=center style="color:red"><s:fielderror/></div>
                    </s:if>
                    <s:if test="hasActionMessages()">
                        <hr/><div align=center style="color:red">
                            <s:actionmessage/></div>
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