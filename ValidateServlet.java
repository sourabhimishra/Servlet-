package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        if (name == null || name.isEmpty() ||
                email == null || email.isEmpty()) {

            out.println("<h3 style='color:red;'>All fields are required!</h3>");
        } else {
            out.println("<h2>Form Submitted Successfully</h2>");
        }
    }
}