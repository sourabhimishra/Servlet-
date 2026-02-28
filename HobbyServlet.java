package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/HobbyServlet")
public class HobbyServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String[] hobbies = request.getParameterValues("hobby");

        out.println("<h2>Selected Hobbies:</h2>");

        if (hobbies != null) {
            for (String h : hobbies) {
                out.println(h + "<br>");
            }
        } else {
            out.println("No hobbies selected");
        }
    }
}