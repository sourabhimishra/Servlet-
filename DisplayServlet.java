package com.example;   // ✅ Change if your package name is different

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        out.println("<html>");
        out.println("<head><title>Result</title></head>");
        out.println("<body>");
        out.println("<h2>Submitted Details</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}