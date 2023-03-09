package dao;

import java.sql.Connection;







import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import context.DBcontext;
import entity.sohieu;
import entity.hangbay;
import entity.sanbay;
import entity.account;
import entity.chuyenbay;
import entity.ve;

public class maybay {
	
	 Connection conn=null;
	 PreparedStatement ps=null;
	 ResultSet rs = null;
	
	
		public List<chuyenbay>  getallchuyenbay(){
	    List<chuyenbay>list=new ArrayList<>();
	    String query=  "select*from chuyenbay";
	    try{
	    	conn=new DBcontext().GetConnection();
	        ps=conn.prepareStatement(query);
	        rs=ps.executeQuery();
	        while(rs.next()) {
				list.add(new chuyenbay( rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12)));
			}
	    }catch(Exception e){
	    }
	    return list;
		}
		 public chuyenbay getallchuyenbaybysohieu(String id) {
		        String query = "select * from chuyenbay\n"
		                + "where macb = ?";
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            ps.setString(1, id);
		            rs = ps.executeQuery();
		            while (rs.next()) {
		                return (new chuyenbay( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12)));
		            }
		        } catch (Exception e) {
		        }
		        return null;
		    }
		
		 public List<chuyenbay> getallchuyenbaybymahb(String mahb) {
		        List<chuyenbay> list = new ArrayList<>();
		        String query = "select * from chuyenbay\n"
		                + "where mahb = ?";
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            ps.setString(1, mahb);
		            rs = ps.executeQuery();
		            while (rs.next()) {
		            	  list.add (new chuyenbay( rs.getString(1),
			                        rs.getString(2),
			                        rs.getString(3),
			                        rs.getString(4),
			                        rs.getString(5),
			                        rs.getString(6),
			                        rs.getString(7),
			                        rs.getString(8),
			                        rs.getString(9),
			                        rs.getString(10),
			                        rs.getString(11),
			                        rs.getString(12)));
		            }
		        } catch (Exception e) {
		        }
		        return list;
		    }
		 public List<hangbay> getallhangbay() {
		        List<hangbay> list = new ArrayList<>();
		        String query = "select * from hangbay";
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            rs = ps.executeQuery();
		            while(rs.next()) {
						list.add(new hangbay(rs.getString(1),
								             rs.getString(2),
								             rs.getString(3)));
					}
		        } catch (Exception e) {
		        }
		        return list;
		    }
		  public List<chuyenbay> searchByName(String sbdi, String sbden,String ngaydi) {
		        List<chuyenbay> list = new ArrayList<>();
		        String query = "select * from chuyenbay where sbdi like ? and ngaydi=? and sbden like ?";
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            ps.setString(1,"%"+sbdi+"%");
		            ps.setString(2,ngaydi);
		            ps.setString(3,"%"+sbden+"%");
		            rs = ps.executeQuery();
		            while (rs.next()) {
		                list.add(new chuyenbay( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12)));
		            }
		        } catch (Exception e) {
		        }
		        return list;
		    }
		  public List<chuyenbay> searchByName1(String ngaydi,String sbdi,String sbden) {
		        List<chuyenbay> list = new ArrayList<>();
		        String query = "select * from chuyenbay where ngaydi=? and sbdi=? and sbden=? " ;
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            
		            ps.setString(1,ngaydi);
		            ps.setString(2, sbdi);
		            ps.setString(3, sbden);
		           
		            rs = ps.executeQuery();
		            while (rs.next()) {
		                list.add(new chuyenbay( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12)));
		            }
		        } catch (Exception e) {
		        }
		        return list;
		    }
		  public ve checkve (String sdt,String tgdv){
			    try{
			        String query="select * from vemaybay where sdt=? and tgdv=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, sdt);
			        ps.setString (2, tgdv);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            ve a=new ve  (rs.getString (1),
          		              rs.getString (2),
          		              rs.getString (3),
          		              rs.getString (4),
          		              rs.getString (5),
          		              rs.getString (6),
          		              rs.getString (7),
          		              rs.getString (8),
          		              rs.getString (9),
          		              rs.getString (10));
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public ve checkve2 (){
			    try{
			        String query="select * from vemaybay order by tgdv desc ";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);    
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            ve a=new ve  (rs.getString (1),
        		              rs.getString (2),
        		              rs.getString (3),
        		              rs.getString (4),
        		              rs.getString (5),
        		              rs.getString (6),
        		              rs.getString (7),
        		              rs.getString (8),
        		              rs.getString (9),
        		              rs.getString (10));
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public ve checkve1 (String sdt){
			    try{
			        String query="select * from vemaybay where sdt=? order by tgdv desc";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, sdt);
			      
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            ve a=new ve  (rs.getString (1),
        		              rs.getString (2),
        		              rs.getString (3),
        		              rs.getString (4),
        		              rs.getString (5),
        		              rs.getString (6),
        		              rs.getString (7),
        		              rs.getString (8),
        		              rs.getString (9),
        		              rs.getString (10));
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public ve sendmave (String sdt){
			    try{
			        String query="select mave from vemaybay where email=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, sdt);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            ve a=new ve  (rs.getString (1),
			            		              rs.getString (2),
			            		              rs.getString (3),
			            		              rs.getString (4),
			            		              rs.getString (5),
			            		              rs.getString (6),
			            		              rs.getString (7),
			            		              rs.getString (8),
			            		              rs.getString (9),
			            		              rs.getString (10));
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  
		  public chuyenbay searchchuyenbay (String ngaydi,String sbdi,String sbden){
			    try{
			        String query="select * from chuyenbay where ngaydi=? and sbdi=? and sbden=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, ngaydi);
			        ps.setString (2, sbdi);
			        ps.setString (3, sbden);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            chuyenbay a = new chuyenbay  ( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public List<chuyenbay> searchByName2(String sbdi,String sbden,String tenhang,String ngaydi) {
		        List<chuyenbay> list = new ArrayList<>();
		        String query = "select * from chuyenbay where sbdi=? and sbden=? and tenhang=? and ngaydi=?" ;
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            
		            ps.setString (4, ngaydi);
			        ps.setString (1, sbdi);
			        ps.setString (2, sbden);
		            ps.setString(3,tenhang);
		           
		            rs = ps.executeQuery();
		            while (rs.next()) {
		                list.add(new chuyenbay( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12)));
		            }
		        } catch (Exception e) {
		        }
		        return list;
		    }
		  public chuyenbay searchchuyenbay1 (String ngaydi,String sbdi,String sbden,String tenhang){
			    try{
			        String query="select * from chuyenbay where sbdi=? and sbden=? and tenhang=? and ngaydi=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (4, ngaydi);
			        ps.setString (1, sbdi);
			        ps.setString (2, sbden);
		            ps.setString(3,tenhang);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            chuyenbay a = new chuyenbay  ( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public void insertvemaybay(String macb, String giave,String sdt,String email,String tenkh,String gioitinh,String cccd,String ngaysinh,String tgdv) throws SQLException 
			{
			    String sql = "Insert into vemaybay(macb,gia,sdt,email,tenkh,gioitinh,cccd,ngaysinh,tgdv) values (?,?,?,?,?,?,?,?,?)";

				try {
				 	    conn=new DBcontext().GetConnection ();
					    ps=conn.prepareStatement (sql);
				        ps.setString (1, macb);
				        ps.setString (2, giave);
				        ps.setString (3, sdt);
				        ps.setString (4, email);
				        ps.setString (5, tenkh);
				        ps.setString (6, gioitinh);
				        ps.setString (7, cccd);
				        ps.setString (8, ngaysinh);
				        ps.setString (9, tgdv);
				        
				     	ps.executeUpdate();
					 
				} catch (Exception e) {
					// TODO: handle exception
				}
			
			}
		  public List<ve> getallvemaybay(String sdt) {
		        List<ve> list = new ArrayList<>();
		        String query = "select * from vemaybay\n"
		                + "where sdt = ? order by tgdv desc";
		        try {
		            conn = new DBcontext().GetConnection();//mo ket noi voi sql
		            ps = conn.prepareStatement(query);
		            ps.setString(1, sdt);
		            rs = ps.executeQuery();
		            while (rs.next()) {
		            	  list.add (new ve( rs.getString(1),
			                        rs.getString(2),
			                        rs.getString(3),
			                        rs.getString(4),
			                        rs.getString(5),
			                        rs.getString(6),
			                        rs.getString(7),
			                        rs.getString(8),
			                        rs.getString(9),			                        
			                        rs.getString(10)));
		            }
		        } catch (Exception e) {
		        }
		        return list;
		    }
		  public sanbay sanbaydi (String sbdi){
			    try{
			        String query="select * from sanbay where masb=? ";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, sbdi);
			        
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            sanbay a = new sanbay  ( rs.getString(1),		                        
		                        rs.getString(2),
		                        rs.getString(3));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public sanbay sanbayden (String sbden){
			    try{
			        String query="select * from sanbay where masb=? ";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, sbden);
			        
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            sanbay a = new sanbay  ( rs.getString(1),		                        
		                        rs.getString(2),
		                        rs.getString(3));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  
		  public chuyenbay searchsoluong (String ngaydi,String sbdi,String sbden){
			    try{
			        String query="select * from chuyenbay where ngaydi=? and sbdi=? and sbden=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, ngaydi);
			        ps.setString (2, sbdi);
			        ps.setString (3, sbden);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            chuyenbay a = new chuyenbay  ( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }     
		  public chuyenbay searchngay1 (String ngaydi,String sbdi,String sbden,String tenhang){
			    try{
			        String query="select * from chuyenbay where sbdi=? and sbden=? and tenhang=? and ngaydi=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (4, ngaydi);
			        ps.setString (1, sbdi);
			        ps.setString (2, sbden);
		            ps.setString(3,tenhang);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            chuyenbay a = new chuyenbay  ( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public chuyenbay searchngay (String ngaydi,String sbdi,String sbden){
			    try{
			        String query="select * from chuyenbay where ngaydi=? and sbdi=? and sbden=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, ngaydi);
			        ps.setString (2, sbdi);
			        ps.setString (3, sbden);
			        
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            chuyenbay a = new chuyenbay  ( rs.getString(1),
		                        rs.getString(2),
		                        rs.getString(3),
		                        rs.getString(4),
		                        rs.getString(5),
		                        rs.getString(6),
		                        rs.getString(7),
		                        rs.getString(8),
		                        rs.getString(9),
		                        rs.getString(10),
		                        rs.getString(11),
		                        rs.getString(12));
			       
			       
			            return a ;}
			    }
			       catch (Exception e) {
			       }
			    return null;
			    }
		  public void deleteve(String email,String tgdv) {
		    	String query = "delete from vemaybay where email=? and tgdv=?";
		    	try {
		    		 conn=new DBcontext().GetConnection ();		            
		    		 ps = conn.prepareStatement(query);
		            ps.setString(1, email);
		            ps.setString(2, tgdv);

		            ps.executeUpdate();
				} catch (Exception e) {
					// TODO: handle exception
				}
		    }
		  public ve checkcccd (String macb,String cccd){
			    try{
			        String query="select * from  vemaybay where macb=? and cccd=?";
			        conn=new DBcontext().GetConnection ();
			        ps=conn.prepareStatement (query);
			        ps.setString (1, macb);
			        ps.setString (1, cccd);
			        rs=ps.executeQuery ();
			       while (rs.next ()){
			            ve a=new ve( rs.getString(1),
		                       query,
		                       query,
		                       query,
		                       query,
		                       query,
		                       query,
		                       query,
		                       query,			                        
		                       query);
			            return a ;
			       }
			     }
			       catch (Exception e) {
			       }
			    return null;
			    }
		    
		  }
