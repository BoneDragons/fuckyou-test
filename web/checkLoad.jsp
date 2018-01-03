<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    Object o = session.getAttribute("user");
    if (o == null) {
        out.print("<script>alert('滚');location.href='load.jsp';</script>");
    }
%>