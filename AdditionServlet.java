package com.example;   

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AdditionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int result = num1 + num2;

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Addition Result</h2>");
        out.println("<p>Number 1: " + num1 + "</p>");
        out.println("<p>Number 2: " + num2 + "</p>");
        out.println("<h3>Result: " + result + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}