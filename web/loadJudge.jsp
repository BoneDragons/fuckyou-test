<%@ page import="entity.Emp" %>
<%@ page import="servlte.Jump" %>
<%@ page pageEncoding="UTF-8" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%
    String id = request.getParameter("username");
    String pwd = request.getParameter("password");
    Emp e = new Emp();
    Jump jump = new Jump();
    e.setEmp_id(id);
    e.setEmp_pwd(pwd);
    e = jump.getEle(e);
    if(e.getEmp_id()!=null){
        session.setAttribute("user",e);
        out.print("<script>alert('登录成功');location.href='index.jsp';</script>");
    }
//    RequestDispatcher rd = request.getRequestDispatcher("路径");
//    rd.forward(request, response);
%>