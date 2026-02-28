package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/FeedbackServlet")
public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String comments = request.getParameter("comments");

        out.println("<h2>Thank You " + name + "</h2>");
        out.println("<p>Your Feedback: " + comments + "</p>");
    }
}