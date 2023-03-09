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
    <link rel="stylesheet" href="CSS/main.css">
    <link rel="stylesheet" href="CSS/base.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    <title>Document</title>
</head>
<body>
   <div class="app">
        <div class="grid wide">
            <form action="insertvecontrol" method="get">
            <div class="grid__row">
                <div class=" col  l-6">               
                        <div class="app__option">
                            <div class="app__option-name">
                                <h3>Thông tin hành khách</h3>
                                <div class="note">
                                    <span>Nhập không có kí tự đặc biệt. </span>
                                        <br>
                                    <span>Nhập họ tên trùng khớp trên giấy tờ tùy thân</span>
                                
                                </div>
                                <div class="app__option-people">
                                <div class="icon-person"> <i class="fa-solid fa-person"></i></div>
                                    <span>Người lớn 1</span>
                                </div>
                                <div class="app__option--note">
                                    <span>Họ và tên</span>
                                    <span>Giới tính</span>
                                </div>
                                <div class="app__option--choose">
                                    <input name="tenkh" type="text" placeholder="Ví dụ: Trần Văn Hữu" required="required">
                                    <select name="gioitinh"style="font-size: 14px;" id="">
                                        <option value="Nam">Nam</option>
                                        <option value="Nữ">Nữ</option>
                                    </select>
                                </div>
                                <div class="app__option--check">
                                   <span>Căn cước công dân</span> 
                                   <span>Ngày sinh</span> 
                                </div>
                                <div class="app__option--NGS">
                                
                                <input class="ngaysinh" name ="cccd" type="number" placeholder="Ví dụ: 09090909090" required="required">
                                <input style="font-size: 14px;" name="ngaysinh" type="date" required="required">  
                                </div>             
                            </div> 
                        </div>                
                        <div class="app__option">
                            <div class="app__option-name">
                                <h3>Thông tin liên hệ</h3>
                                <div class="note">
                                    <span>Mã đặt chỗ sẽ được gửi theo thông tin liên hệ dưới đây
                                        </span>
                                    
                                    
                                
                                </div>
                                <div class="app__option-user">
                                   
                                </div>
                                
                                <div class="app__option--note-email">
                                    
                                    <span >Số điện thoại</span>
                                    <input style="margin-top: 5px" readonly  name="sdt"  value="${sessionScope.acc.sdt}" type="text" placeholder="Ví dụ: Nhập số điện thoại">
                                </div>
                                <div class="app__option--input">
                                    <span >Email</span>
                                    <input style="margin-top: 5px;" readonly name="email" value="${sessionScope.acc.email}" class="fullname" type="text" placeholder="Ví dụ: you@gmail.com">
                                    
        
                                </div>
                            </div>
                        </div>
                </div>
                <div class=" col  l-6">
                    <div class="app__option">
                        <div class="app__option--flight">
                            <span>${sessionScope.sanbaydi.tensb}</span>
                            <i class="fa-solid fa-arrow-right"></i>
                            <span>${sessionScope.sanbayden.tensb} </span>
                        </div>
                        <div class="app__option--day">
                            <span>${datve.ngaydi }</span>
                        </div>
                        <hr>

                        <div class="app__option--day--flight">
                            <span>${datve.giodi} , 5/8/2022</span>
                            <i class="fa-solid fa-plane"></i>
                            <span>${datve.sbdi}</span>
                        </div>
                        <div class="app__option--icon--down">
                            <span></span>
                            <i style="    margin-left: 11px" class="fa-solid fa-down-long"></i>
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
                                <input style="height: 25px;width: 80px" type="text" name="macb" value="${datve.macb}" readonly>
                            </div>
                            <hr>
                            <div class="app__option--Adults">
                                <span>Thời gian đặt vé</span>
                                <input  style="height: 25px;width: 200px" type="text" id="hvn" value="" name="tgve" readonly>
                            </div>
                            <hr>
                            
                            <div class="app__option--Adults">
                                <div class="app__option--note-price">
                                    <span>Tổng giá vé</span>
                                    
                                    <p>Đã bao gồm thuế,phí,VAT</p>
                                </div>
                                <input style="height: 25px;width: 200px" type="text" name="giave" value="${datve.giave}" readonly>
                        </div> 
                    </div>
            
                </div>
            </div>
            <center><p class="text-danger">${mess }</p></center>
            <button class="buoctieptheo" type="submit">Bước tiếp theo</button>

        </form>
        </div>
   </div> 
    <script>
    var today = new Date();
    var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();
    var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
    var dateTime = date+' '+time;
 
    document.getElementById("hvn").value = dateTime;
 </script>  
   <script src="JS/grid.js"></script>
</body>
</html>