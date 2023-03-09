<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
    <link rel="stylesheet" href="assets/font/fontawesome-free-6.1.1-web/css/all.min.css">
    <link rel="stylesheet" href="CSS/main2.css">
    <link rel="stylesheet" href="CSS/base1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
<body>
   <div class="app">
        <div class="grid wide">
         
            <div class="grid__row">
                <div class=" col  l-6">
                    <div class="app__option">
                        <div class="app__option--flight">
                            <span>${datve.sbdi}</span>
                            <i class="fa-solid fa-arrow-right"></i>
                            <span>${datve.sbden} </span>
                        </div>
                        <div class="app__option--day">
                            <span>${datve.ngaydi}</span>
                        </div>
                        <hr>

                        <div class="app__option--day--flight">
                            <span>${datve.giodi} , 5/8/2022</span>
                            <i class="fa-solid fa-plane"></i>
                            <span>${datve.sbdi}</span>
                        </div>
                        <div class="app__option--icon--down">
                            <span>1h 5m</span>
                            <i class="fa-solid fa-down-long"></i>
                            <span class="name">${datve.tenhang}</span>
                        </div>
                        <div class="app__option--day--flight">
                            <span>${datve.gioden} ,${datve.ngaydi}</span>
                            <i class="fa-solid fa-location-dot"></i>
                            <span>${datve.sbden}</span>
                        </div>
                    </div>   
                        <div class="app__option">
                            <div class="app__option--flight">
                                <span>Chi tiết giá </span>
                            </div>
                            <div class="app__option--Adults">
                                <span>Mã chuyến bay</span>
                                <input style="height: 25px;width: 80px" type="text" name="macb" value="${datve.macb}">
                            </div>
                            <hr>
                           
                            <hr>
                            
                            <div class="app__option--Adults">
                                <div class="app__option--note-price">
                                    <span>Tổng giá vé</span>
                                    
                                    <p>Đã bao gồm thuế,phí,VAT</p>
                                </div>
                                <input style="height: 25px;width: 200px" type="text" name="giave" value="${datve.giave}">
                        </div> 
                    </div>
            
                </div>
            </div>
            <button class="buoctieptheo" type="submit" >
           <a href="vemaybaycontrol1?sdt=${sessionScope.acc.sdt}" style="color:#fff"> quay lại</a>
            </button>

   
        </div>
   </div> 
   <script src="JS/grid.js"></script>
</body>
</html>