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
import entity.account;

/**
 *
 * @author hp
 */
@WebServlet(name = "dangkycontrol", urlPatterns = {"/dangkycontrol"})
public class dangkycontrol extends HttpServlet {

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
        String user=request.getParameter("username");
        String email=request.getParameter("email");
        String pass=request.getParameter("password");
        String re_pass=request.getParameter("password1");
        
        if(!pass.equals(re_pass)){
            request.setAttribute("mess1","Mật khẩu không trùng khớp xin mời nhập lại");
            request.getRequestDispatcher("dangky.jsp").forward(request, response);
        }else{
           accountDAO dao=new accountDAO();
           account a =dao.checkuser(user);
            if(a==null){
            	try {
            		  RequestDispatcher dispatcher = null;
            			int otpvalue = 0;
            			HttpSession mySession = request.getSession();
            			
            			if(email!=null || !email.equals("")) {
            				// sending otp
            				Random rand = new Random();
            				otpvalue = rand.nextInt(1255650);
            				//maybay dao = new maybay();
            				//ve a  = dao.sendmave(email);
            				String s=String.valueOf(otpvalue);
            				

            				String to = email;// change accordingly
            				// Get the session object
            				Properties props = new Properties();
            				props.put("mail.smtp.host", "smtp.gmail.com");
            				props.put("mail.smtp.socketFactory.port", "465");
            				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            				props.put("mail.smtp.auth", "true");
            				props.put("mail.smtp.port", "465");
            				Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            					protected PasswordAuthentication getPasswordAuthentication() {
            						return new PasswordAuthentication("ludtickets@gmail.com", "ejfrgiunzfflqaxs");// Put your email
            																										// id and
            																										// password here
            					}
            				});
            				// compose message
            				try {
            					MimeMessage message = new MimeMessage(session);
            					message.setFrom(new InternetAddress(email));// change accordingly
            					message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            					message.setSubject("LUD TICKETS xin chào");
            					message.setText("Chào mừng bạn đến với LUD tickets");
            					// send message
            					Transport.send(message);
            					System.out.println("message sent successfully");
            				}

            				catch (MessagingException e) {
            					throw new RuntimeException(e);
            				}
            				request.setAttribute("message","OTP is sent to your email id");
            				//request.setAttribute("connection", con);
            				mySession.setAttribute("otp",s); 
            				mySession.setAttribute("email",email); 
            				//request.setAttribute("status", "success");
            			}
            			
            		
					dao.insertUserAccount(user, pass,email);
					response.sendRedirect("login.jsp");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               
            }else{
            	request.setAttribute("mess2","Tên đăng nhập đã tồn tại vui lòng nhập lại");
                request.getRequestDispatcher("dangky.jsp").forward(request, response);
            }
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

	
	     
