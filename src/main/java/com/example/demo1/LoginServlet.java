package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        System.out.println("Hello fomr GET method in Loginservlet");
        String user=request.getParameter("userName");
        String pass= request.getParameter("passWord");
        PrintWriter writer= response.getWriter();
        writer.println("<h3>Hello from get "+user+" "+pass+"</h3>");
        //  response.sendRedirect("login.jsp");
        /* response.setContentType("text/html");
        System.out.println("hello from get method");
        PrintWriter writer=response.getWriter();
        writer.println("<h3>Hello in HTMl<h3>");
    */

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        System.out.println("Hello from Post method in LoginServlet");
        String user=request.getParameter("userName");
        String pass=request.getParameter("passWord");
        PrintWriter w=response.getWriter();
        w.println("<h3> Hello from Post: Your user name is: "+user+", Your password is: " +pass+
                "</h3>");
    }
}
