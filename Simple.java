package com.example;   // 🔴 Change according to your package name

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/interest")
public class Simple extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double time = Double.parseDouble(request.getParameter("time"));

        double simpleInterest = (principal * rate * time) / 100;

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Simple Interest Result</h2>");
        out.println("<p>Principal: " + principal + "</p>");
        out.println("<p>Rate: " + rate + "%</p>");
        out.println("<p>Time: " + time + " years</p>");
        out.println("<h3>Simple Interest: " + simpleInterest + "</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}