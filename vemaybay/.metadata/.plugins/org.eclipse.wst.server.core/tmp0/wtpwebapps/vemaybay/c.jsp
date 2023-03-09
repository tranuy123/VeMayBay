<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
    <link rel="stylesheet" href="assets/font/fontawesome-free-6.1.1-web/css/all.min.css">
    <link rel="stylesheet" href="CSS/tttt.css">
    <link rel="stylesheet" href="asset/base.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
<body>

<form action="thanhtoancontrol1" method="get">
    <div class="to">
    <div class="formtt">
        
            <!--  <h2>Thông tin thanh toán</h2>
            
            <div class="form-group">
            <input type="text" name="sdt" class="form-control" placeholder="username" required="required" value="${sessionScope.acc.sdt}">
        </div>
        <div class="form-group">
            <input type="text" name="tgdv" class="form-control" placeholder="username" required="required" value="${sessionScope.ve.tgdv}">
        </div>
        -->
                <center><h2 style="color:#f00"><i class="fa-solid fa-paper-plane">LUD TICKETS</i></h2></center>
        
            <h2>Thông tin thanh toán</h2>
            <div class="tttt">
            <input  type="text" name="sdt" style="border: 1px solid #000000;" value="${sessionScope.acc.sdt}">
            <input type="text" name="tgdv" style="border: 1px solid #000000;" value="${sessionScope.ve.tgdv}">
            </div>
            <div class="formtt">
            <label >Họ và tên</label>
            <input type="text" name="hoten">
            <label >Số điện thoại</label>
            <input type="text" name="sdt">    
            <label >Email</label>
            <input type="text" name="email"> 
            <label >Email</label>
            <input type="text" name="email">
            <label >Email</label>
            <input type="text" name="email">
            <div class="nut">
                <button class="nut1" type="submit" >Bước tiếp theo</button>
            </div>
        </div>    
    </div>
</form>
</body>
</html>
    
