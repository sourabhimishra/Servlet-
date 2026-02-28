package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/MethodServlet")
public class MethodServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String method = request.getMethod();

        out.println("<html><body>");
        out.println("<h2>HTTP Method Used: " + method + "</h2>");
        out.println("</body></html>");
    }
}