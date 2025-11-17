package app.components;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Bankresponse extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request , HttpServletResponse response)  throws ServletException, IOException  {
        String name = request.getParameter("person");
        double amt = Double.parseDouble(request.getParameter("amount"));
        int years = Integer.parseInt(request.getParameter("years"));
        double r = years > 5 ? 10.5 : 8.5;
        double interest = amt * years * r /100;
        double back = interest + amt;
        response.setContentType("text/html");
        response.getWriter().printf("""
            <html>
                <head>
                    <title>Demo</title>
                </head>
                <body>
                    <h1>Welcome %s </h1>
                    
                    <b>Your Interest will be : %.2f</b><br>
                    <b>Total money back wil : %.2f</b>
                
                </body>

            </html>
        """, name , interest , back);


    }

}