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

/**
 *
 * @author Harry
 */
@WebServlet(urlPatterns = {"/HomeServlet"})
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session == null || session.getAttribute("username") == null) {
        // Jika tidak ada session atau session tidak memiliki atribut 'username', redirect ke halaman login
            resp.sendRedirect("index.html");
        } else {
            req.getRequestDispatcher("/WEB-INF/Home.html").forward(req, resp); // Tampilkan Home.jsp
        }
    }
    

}
