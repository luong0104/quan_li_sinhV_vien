/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author havan
 */
@WebServlet(name = "LogInServlet", urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogInServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogInServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection conn;
        try{
            conn=MySQLConntUtils.getMySQLConnection();
            
            String Gmail=request.getParameter("Gmail");
            String MatKhau=request.getParameter("MatKhau");
            String Thuoc=request.getParameter("Thuoc");
            TaiKhoan usr = new TaiKhoan(Gmail,MatKhau,Thuoc);
            TaiKhoan u =DBUtils.findTaiKhoan(conn,usr.getGmail(),usr.getMatKhau(),usr.getThuoc());
            if(u!=null)
            {
                TaiKhoan user =new TaiKhoan(u);
                HttpSession session=request.getSession();
                session.setAttribute("acc",usr);                
                request.setAttribute("Gmail", "Gmail number:"+user.getGmail());
                request.getRequestDispatcher("/home.jsp").forward(request, response);
            }
            else
            {
                response.setContentType("text/html;charset=UTF-8");
                try(PrintWriter out=response.getWriter()){
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Annouce</title>");
                    out.println("<head>");
                    out.println("<body>");
                    out.println("<h1>Invalid information<a href=index.jsp>Retype</a></h1>");
                    out.println("<body>");
                    out.println("<html>");
                    
                }
            }
        }catch (SQLException ex) {
               Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogInServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
