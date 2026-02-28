package com.example;   // 🔴 Change according to your package name

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greater")
public class greater extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        int greater;

        if (num1 > num2) {
            greater = num1;
        } else {
            greater = num2;
        }

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Greater Number Result</h2>");
        out.println("<p>First Number: " + num1 + "</p>");
        out.println("<p>Second Number: " + num2 + "</p>");
        out.println("<h3>Greater Number is: " + greater + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}