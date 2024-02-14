package com.java.cis;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String validUsername = "shanker";
        String validPassword = "1234";
        String enteredUsername = request.getParameter("username");
        String enteredPassword = request.getParameter("password");
        boolean isValidUser = validUsername.equals(enteredUsername) && validPassword.equals(enteredPassword);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (isValidUser) {
            out.println("<h2>Login Successful</h2>");
        } else {
            out.println("<h2>Login Failed. Invalid username or password.</h2>");
        }
        out.println("</body></html>");
    }
}