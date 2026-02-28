package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String salary = request.getParameter("salary");
        String dept = request.getParameter("dept");

        out.println("<h2>Employee Details</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Salary</th><th>Department</th></tr>");
        out.println("<tr>");
        out.println("<td>" + name + "</td>");
        out.println("<td>" + salary + "</td>");
        out.println("<td>" + dept + "</td>");
        out.println("</tr>");
        out.println("</table>");
    }
}