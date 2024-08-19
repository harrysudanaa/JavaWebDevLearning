/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Harry
 */
@WebServlet(urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            resp.sendRedirect("/WebApplication1/RegisterServlet");
        }
        
        String hashPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Debug: class success intialized");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_learn", "root", "admin");
            out.println("Debug: class success intialized");
            String sql = "INSERT INTO login (username, password) VALUES (?, ?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, hashPassword);
            out.println(username + hashPassword);

            int res = pstmt.executeUpdate();
            

            if (res > 0) {
                resp.sendRedirect("/SimpleLoginApp/index.html");
            } else {
                resp.sendRedirect("/SimpleLoginApp/Register.html");
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }    
    }
}
