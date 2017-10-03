/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 687159
 */
public class LoginServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        String logout = request.getParameter("logout");
        
        if(logout != null) 
        {
           request.setAttribute("logM", "Logged Out!");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {            
        String user1 = "Adam";
        String user2 = "Betty";
        String pass = "password";
        String Username = (request.getParameter("user"));
        String Password = (request.getParameter("pass"));
        
        User user = new User(Username, Password);
        
        if(Username == null || Password == null )
        {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        else if(Username.isEmpty() || Password.isEmpty())
        {
            request.setAttribute("errorMessage", "Both values are required!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        else if(Username.equals(user1) && Password.equals(pass))
        {
            request.setAttribute("userMessage", "Hello, Adam.");
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
            return;
        }
        else if(Username.equals(user2) && Password.equals(pass))
        {
            request.setAttribute("userMessage", "Hello, Betty.");
            getServletContext().getRequestDispatcher("/WEB-INF/mainPage.jsp").forward(request, response);
            return;
        }
        else
        {
            request.setAttribute("logMessage", "Logged out");
            request.setAttribute("wrongValues", "Invalid username or password!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return; 
        }
    }
}
