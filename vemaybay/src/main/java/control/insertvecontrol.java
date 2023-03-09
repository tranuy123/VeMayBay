package control;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;



import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.accountDAO;
import dao.maybay;
import entity.account;
import entity.ve;

/**
 *
 * @author hp
 */
@WebServlet(name = "insertvecontrol", urlPatterns = {"/insertvecontrol"})
public class insertvecontrol extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String macb = request.getParameter("macb");
        String gia = request.getParameter("giave");
        String sdt = request.getParameter("sdt");
        String email = request.getParameter("email");
        String tenkh = request.getParameter("tenkh");
        String gioitinh = request.getParameter("gioitinh");
        String cccd = request.getParameter("cccd");
        String ngaysinh = request.getParameter("ngaysinh");
        String tgdv = request.getParameter("tgve");
        
        maybay dao = new maybay();
        
        ve b= dao.checkcccd(macb, cccd);
        if(b!=null){
            request.setAttribute("mess","căn cước công dân đã tồn tại trên chuyến bay, vui lòng kiểm tra lại");
            request.getRequestDispatcher("muave.jsp").forward(request, response);
        } else {
    	   
    	 		
					try {
						dao.insertvemaybay(macb, gia, sdt, email, tenkh, gioitinh,cccd,ngaysinh,tgdv);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
    	 		response.sendRedirect("b.jsp");

 		
 	}
      

        }
        // sign up
    

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
}// </editor-fold>

}

	
	     
