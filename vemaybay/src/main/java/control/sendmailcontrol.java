package control;


import java.io.IOException;
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
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/sendmailcontrol")
public class sendmailcontrol extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String tgdv = request.getParameter("tgdv");
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
			accountDAO dao=new accountDAO();
	        dao.insertmave(s,email,tgdv);

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
				message.setText("mã vé máy bay của bạn là: " + s);
				// send message
				Transport.send(message);
				System.out.println("message sent successfully");
			}

			catch (MessagingException e) {
				throw new RuntimeException(e);
			}
			 response.sendRedirect ("index.jsp");
			request.setAttribute("message","OTP is sent to your email id");
			//request.setAttribute("connection", con);
			mySession.setAttribute("otp",s); 
			mySession.setAttribute("email",email); 
			
			//request.setAttribute("status", "success");
		}
	     HttpSession session=request.getSession();
	        session.removeAttribute("ve1");
	        session.removeAttribute("ve");
		
	}

}

