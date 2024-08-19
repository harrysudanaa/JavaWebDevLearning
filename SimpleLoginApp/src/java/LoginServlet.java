/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Harry
 */
@WebServlet(urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    /**
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String pw = req.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_learn", "root", "admin");
            String sql = "SELECT password FROM login WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            
            ResultSet res = pstmt.executeQuery();
            if (res.next()) {
                // if login success, go to home
                // Login successful
                String storedHashPassword = res.getString("password");

                // Verifikasi password yang dimasukkan dengan hash di database
                if (BCrypt.checkpw(pw, storedHashPassword)) {
                    HttpSession session = req.getSession();  // Mendapatkan session (atau membuat baru jika tidak ada)
                    session.setAttribute("username", username);
                    resp.sendRedirect("/SimpleLoginApp/HomeServlet");
                } else {
                    // Password tidak cocok
                    out.println("Wrong username and password!");
                }
            } else {
                out.println("Wrong username and password!");
            }
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    

}
