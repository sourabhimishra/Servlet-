package com.example;   // 🔴 Change according to your package name

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/convert")
public class TempServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double celsius = Double.parseDouble(request.getParameter("celsius"));

        double fahrenheit = (celsius * 9/5) + 32;

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Temperature Conversion Result</h2>");
        out.println("<p>Celsius: " + celsius + " °C</p>");
        out.println("<h3>Fahrenheit: " + fahrenheit + " °F</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}