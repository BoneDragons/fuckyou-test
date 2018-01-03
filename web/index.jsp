<%@ page import="entity.Emp" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="checkLoad.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>主页面</title>
</head>
<body>
<%
    Emp e = (Emp) o;
    if(o!=null){
        out.print("欢迎您" + e.getEmp_name());
    }
%>
</body>

</html>