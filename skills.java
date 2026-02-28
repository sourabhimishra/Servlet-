package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/SkillsServlet")
public class skills extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String[] skills = request.getParameterValues("skills");

        out.println("<html><body>");
        out.println("<h2>Selected Skills:</h2>");

        if (skills != null) {
            for (String skill : skills) {
                out.println(skill + "<br>");
            }
        } else {
            out.println("No skills selected");
        }

        out.println("</body></html>");
    }
}