<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang đăng ký</title>
<link rel="stylesheet" href="CSS/dangky.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
</head>
<body>
<form action="dangkycontrol" method="post" >
   <div class="container">
     <h1> Đăng Ký tài khoản</h1> 
    <center><h2 style="color:#f00"><i class="fa-solid fa-paper-plane">LUD TICKETS</i></h2></center>
                    
      
     <p>Xin hãy nhập biểu mẫu bên dưới để đăng ký.</p>
     <hr>
    <label for="email"><b>Số điện thoại</b></label>
     <input type="text" placeholder="Nhập số điện thoại" name="username" required>
     <label for="email"><b>Email</b></label>
     <input type="text" placeholder="Nhập email" name="email" required>
    <label for="psw"><b>Mật Khẩu</b></label>
     <input type="password" placeholder="Nhập Mật Khẩu" name="password" required>
    <label for="psw-repeat"><b>Nhập Lại Mật Khẩu</b></label>
     <input type="password" placeholder="Nhập Lại Mật Khẩu" name="password1" required>
    <label>
    <div class="danger">
    <center><p class="text-danger">${mess1 }</p></center>
    <center><p class="text-danger">${mess2 }</p></center>
    </div>
     </label>
    <div class="clearfix">
       <button type="submit" class="signupbtn">Đăng ký</button>
     </div>
   </div>
 </form>
 

</body>
</html>