package dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import entity.account;
import context.DBcontext;

public class accountDAO {
	static Connection conn=null;
	static PreparedStatement ps=null;
	ResultSet rs = null;
	public account checkLogin (String username, String password){
	    try{
	        String query="select * from khachhang where sdt=? and pass=?";
	        conn=new DBcontext().GetConnection ();
	        ps=conn.prepareStatement (query);
	        ps.setString (1, username);
	        ps.setString (2, password);
	        rs=ps.executeQuery ();
	       while (rs.next ()){
	            account a=new account(rs.getString (1),
	            		              rs.getString (2),
	            		              rs.getString (3));
	            return a ;
	       }
	       }
	       catch (Exception e) {
	       }
	    return null;
	    }
	public static void insertUserAccount(String username, String password,String email) throws SQLException 
	{
		String sql = "Insert into khachhang(sdt,pass,email) values (?,?,?)";
		try {
			 conn=new DBcontext().GetConnection ();
			    ps=conn.prepareStatement (sql);
		        ps.setString (1, username);
		        ps.setString (2, password);
		        ps.setString (3, email);
		     	ps.executeUpdate();
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	 public void insertmave(String mave,String email,String tgdv){
		    	
		        String query="update vemaybay set mave=? where email=? and tgdv=?";
		        try{
		            conn=new DBcontext().GetConnection();// mo ket noi voi sql
		            PreparedStatement ps = conn.prepareStatement(query);
		            ps.setString (1, mave);
			        ps.setString (2, email);
			        ps.setString (3, tgdv);

			       
		            ps.executeUpdate();
		         

		            conn.close();
		            }catch(Exception e){
		        }
		    }
	   
	public account checkuser (String username){
	    try{
	        String query="select * from  khachhang where sdt=?";
	        conn=new DBcontext().GetConnection ();
	        ps=conn.prepareStatement (query);
	        ps.setString (1, username);
	        rs=ps.executeQuery ();
	       while (rs.next ()){
	            account a=new account(rs.getString (1),query,query );
	            return a ;
	       }
	     }
	       catch (Exception e) {
	       }
	    return null;
	    }
	
	}


