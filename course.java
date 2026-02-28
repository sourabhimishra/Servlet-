package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/CourseServlet")
public class course extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String selectedCourse = request.getParameter("course");

        out.println("<html><body>");
        out.println("<h2>Selected Course is: " + selectedCourse + "</h2>");
        out.println("</body></html>");
    }
}