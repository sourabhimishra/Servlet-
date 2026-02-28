package com.example;   // 🔴 Change according to your package

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class Student extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String course = request.getParameter("course");

        out.println("<html>");
        out.println("<head><title>Student Details</title></head>");
        out.println("<body style='font-family: Arial;'>");
        out.println("<h2 style='color: blue;'>Student Information</h2>");
        out.println("<hr>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Roll No:</b> " + roll + "</p>");
        out.println("<p><b>Course:</b> " + course + "</p>");
        out.println("<hr>");
        out.println("<h3 style='color: green;'>Details Submitted Successfully!</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}