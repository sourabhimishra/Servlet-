package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String course = request.getParameter("course");
        String gender = request.getParameter("gender");

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Age: " + age + "<br>");
        out.println("Course: " + course + "<br>");
        out.println("Gender: " + gender);
    }
}