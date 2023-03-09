<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LUDAirLine</title>
    <link rel="stylesheet" href="CSS/main1.css">
    <script type="text/javascript">
var num;
var temp=0;
var speed=5000; /* this is set for 5 seconds, edit value to suit requirements */
var preloads=[];
/* add any number of images here */
preload(
'https://vj-prod-website-cms.s3.ap-southeast-1.amazonaws.com/banner1920x960vn1657607872-1657775978974.png',
'https://vj-prod-website-cms.s3.ap-southeast-1.amazonaws.com/top-banner1920x960-copy-1659847056288.jpeg',
'https://vj-prod-website-cms.s3.ap-southeast-1.amazonaws.com/website-moi1920x960-1659846765102.jpg',
'https://vj-prod-website-cms.s3.ap-southeast-1.amazonaws.com/baolapc-1653912065356.jpeg'
);
function preload(){
for(var c=0;c<arguments.length;c++) {
preloads[preloads.length]=new Image();
preloads[preloads.length-1].src=arguments[c];
}
}
function rotateImages() {
num=Math.floor(Math.random()*preloads.length);
if(num==temp){
rotateImages();
}
else{
document.body.style.backgroundImage='url('+preloads[num].src+')';
temp=num;
setTimeout(function(){rotateImages()},speed);
}
}

if(window.addEventListener){
window.addEventListener('load',function(){setTimeout(function(){rotateImages()},speed)},false);
}
else {
if(window.attachEvent){
window.attachEvent('onload',function(){setTimeout(function(){rotateImages()},speed)});
}
}
</script>
</head>
<body> 
    <div class="jss3820">
        <header class="header">
            <div class="header-body">
                <div class="body-items">
                    <a class="header-body-logo" href="index.jsp">
                        <i class="fa-solid fa-paper-plane">LUD TICKETS</i>
                    </a>
                    <div class="header-body-items" >
                        <div class="header-body-items1">
                            <svg width="15" heigth="15" viewbox="0 0 15 15" fill="none" class="item"></svg>
                             <c:if test="${sessionScope.acc == null}">
                                
                                <span class="span1">
                                    <a class="login" href="dangky.jsp">Đăng ký</a>
                                </span>
                                </c:if>
                                <span class="span1">|</span>
                                <c:if test="${sessionScope.acc == null}">
                                <span class="span1">
                                
                                    <a class="login" href="login.jsp">Đăng nhập</a>
                                    </span>
                                    </c:if>
                                    <c:if test="${sessionScope.acc != null}">
                                    <span class="span1">
                                
                                    <a class="login" href="dangxuatcontrol">Đăng xuất</a>
                                    </span>
                                    </c:if>
                        </div>
                        <div class="header-body-items2">
                            <ul class="items">
                             <c:if test="${sessionScope.acc != null}">
                                <li class="item1">
                                <a href="vemaybaycontrol1?sdt=${sessionScope.acc.sdt}" target="_blank" rel="noopener noreferrer" class="jss2636">Chuyến bay của tôi</a>
                                </li>
                            </c:if>
                                <li class="item1">
                                <a href="" target="_blank" rel="noopener noreferrer" class="jss2636">Check in online</a>
                                </li>
                            </ul>
                        </div>            
                    </div>
                </div>
            </div>
        </header>
        <c:if test="${sessionScope.acc != null}">
        
        <div class="container-430">
            <div class="jss763">
                <div class="jss122 jss764">
                    <div class="jss765">
                        <div class="jss772">
                            <button class="MuiButtonBase-root MuiButton-root MuiButton-text" tabindex="0" type="button">
                                <span class="MuiButton-label">
                                    <a href="" style="color: inherit;">Mua hành lý, suất ăn, chọn chỗ ngồi và hơn thế nữa...</a></span>
                                <span class="MuiTouchRipple-root"></span>
                            </button>
                            <button class="MuiButtonBase-root MuiButton-root MuiButton-text" tabindex="0" type="button">
                                <span class="MuiButton-label">
                                    <a href="" target="_blank" rel="noopener noreferrer" style="display: block; width: 100%; height: 100%; text-decoration: none; color: white;">Gửi hàng nhanh</a></span>
                                <span class="MuiTouchRipple-root"></span>
                            </button>
                        </div>
                        <form action="Searchcontrol" method="get">
                        <div class="jss771">
                            
                            <div class="jss778">
                                <div class="jss781">
                                    <div class="jss555">
                                        <svg width="20" height="20" viewBox="0 0 20 20" fill="none">
                                            <path d="M6 19.5456L8 19.5456L13 11.4172L18.5 11.4172C18.8978 11.4172 19.2794 11.2566 19.5607 10.9708C19.842 10.685 20 10.2974 20 9.89314C20 9.48894 19.842 9.10128 19.5607 8.81546C19.2794 8.52965 18.8978 8.36908 18.5 8.36908L13 8.36908L8 0.240722L6 0.240722L8.5 8.36908L3 8.36908L1.5 6.33699L-2.62268e-07 6.33699L1 9.89314L-5.68248e-07 13.4493L1.5 13.4493L3 11.4172L8.5 11.4172L6 19.5456Z" fill="#333333"></path>
                                        </svg>
                                        
                                        <div class="MuiFormControl-root MuiTextField-root jss557 MuiFormControl-fullWidth">
                                            
                                            <div class="MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl">
                                                <div class="select">
                                                    <select name="sbdi" style="
                                                    height: 40px;
                                                    width: 165px;
                                                    margin: 4px 4px 4px 40px;
                                                    font-size: larger;
                                                    font-weight: 700;
                                                ">
                                                
                                                      <option selected disabled>Điểm khởi hành</option>
                                                      
                                                       <option value="SGN">TP.Hồ Chí Minh</option>
                                                      <option value="HAN">Hà Nội</option>
                                                      <option value="BMV">Buôn Ma Thuột</option>
                                                      <option value="VCA">Cần Thơ</option>
                                                      <option value="DAD">Đà Nẵng</option>
                                                      <option value="DLI">Đà Lạt</option>
                                                      <option value="VII">TP.Vinh</option>
                                                      <option value="PQC">Kiên Giang</option>
                                                      <option value="CXR">Nha Trang</option>
                                                      <option value="UIH">Quy Nhơn</option>
                                                      <option value="VCS">Bà Rịa-Vũng Tàu</option>
                                                      <option value="HUI">Huế</option>
                                                      <option value="VDH">Quảng Bình</option>
                                                      <option value="TBB">Phú Yên</option>
                                                      <option value="HPH">Hải Phòng</option>
                                                    </select>
                                                  </div> 
                                                
                                            </div>
                                        </div>
                                    </div>
                                    <div class="jss625" role="button" tabindex="0" style="flex-wrap: wrap;">
                                        <div class="jss626">
                                            <p class="MuiTypography-root jss137 MuiTypography-h3 MuiTypography-colorTextPrimary" weight="Medium">Ngày đi</p>
                                        </div>
                                        <div>
                                        <input type="date" name = "ngaydi" />
                                        </div>
                                    
                                    </div></div>    
                                <div class="jss781">
                                    <div class="jss555">
                                        <svg width="20" height="20" viewBox="0 0 20 20" fill="none">
                                        <path d="M14 0.267883L12 0.267883L7 8.39625L1.5 8.39625C1.10218 8.39625 0.720645 8.55682 0.43934 8.84264C0.158035 9.12846 1.1803e-07 9.51611 1.13286e-07 9.92032C1.08542e-07 10.3245 0.158035 10.7122 0.43934 10.998C0.720645 11.2838 1.10218 11.4444 1.5 11.4444L7 11.4444L12 19.5728L14 19.5728L11.5 11.4444L17 11.4444L18.5 13.4765L20 13.4765L19 9.92032L20 6.36416L18.5 6.36416L17 8.39625L11.5 8.39625L14 0.267883Z" fill="#333333"></path>
                                        </svg>
                                        <div class="MuiFormControl-root MuiTextField-root jss557 MuiFormControl-fullWidth">
                                            
                                            <div class="MuiInputBase-root MuiOutlinedInput-root MuiInputBase-fullWidth MuiInputBase-formControl">
                                                <div class="select">
                                                    <select  name="sbden" style="
                                                    height: 40px;
                                                    width: 290px;
                                                    margin: 4px 4px 4px 40px;
                                                    font-size: larger;
                                                    font-weight: 700;
                                                     ">
                                                      <option selected disabled>Điểm đến</option>
                                                      <option value="SGN">TP.Hồ Chí Minh</option>
                                                      <option value="HAN">Hà Nội</option>
                                                      <option value="BMV">Buôn Ma Thuột</option>
                                                      <option value="VCA">Cần Thơ</option>
                                                      <option value="DAD">Đà Nẵng</option>
                                                      <option value="DLI">Đà Lạt</option>
                                                      <option value="VII">TP.Vinh</option>
                                                      <option value="PQC">Kiêng Giang</option>
                                                      <option value="CXR">Nha Trang</option>
                                                      <option value="UIH">Bình Định</option>
                                                      <option value="VCS">Bà Rịa-Vũng Tàu</option>
                                                      <option value="HUI">Huế</option>
                                                      <option value="VDH">Quảng Bình</option>
                                                      <option value="TBB">Phú Yên</option>
                                                      <option value="HPH">Hải Phòng</option>
                                                    </select>
                                                  </div>
                                                  </div>
                                        </div>
                                    </div>                       
                                </div>
                                <div class="MuiFormControl-root jss797">
                                    <label class="MuiFormLabel-root MuiInputLabel-root jss801 MuiInputLabel-formControl MuiInputLabel-animated MuiInputLabel-shrink MuiFormLabel-filled" data-shrink="true" for="input-base-custom-6">Hành khách</label>
                                    <div class="MuiInputBase-root jss802 MuiInputBase-formControl MuiInputBase-adornedStart MuiInputBase-adornedEnd">
                                        <div class="MuiInputAdornment-root MuiInputAdornment-positionEnd">
                                            <svg width="17" height="17" viewBox="0 0 17 17" fill="none">
                                                <path d="M8.5 0C9.62717 0 10.7082 0.447766 11.5052 1.2448C12.3022 2.04183 12.75 3.12283 12.75 4.25C12.75 5.37717 12.3022 6.45817 11.5052 7.2552C10.7082 8.05223 9.62717 8.5 8.5 8.5C7.37283 8.5 6.29183 8.05223 5.4948 7.2552C4.69777 6.45817 4.25 5.37717 4.25 4.25C4.25 3.12283 4.69777 2.04183 5.4948 1.2448C6.29183 0.447766 7.37283 0 8.5 0ZM8.5 10.625C13.1962 10.625 17 12.5269 17 14.875V17H0V14.875C0 12.5269 3.80375 10.625 8.5 10.625Z" fill="#333333"></path>
                                            </svg>
                                        </div>
                                        <input aria-invalid="false" id="input-base-custom-6" readonly="" type="text" class="MuiInputBase-input jss803 MuiInputBase-inputAdornedStart MuiInputBase-inputAdornedEnd" value="1 người lớn">
                                        <div class="MuiInputAdornment-root MuiInputAdornment-positionEnd">
                                            <svg width="24" xmlns="http://www.w3.org/2000/svg" height="24" viewBox="0 0 24 24">                                                    <path d="M7.41 8.59L12 13.17l4.59-4.58L18 10l-6 6-6-6 1.41-1.41z"></path>
                                               <path fill="none" d="M0 0h24v24H0V0z"></path>
                                            </svg>
                                        </div>
                                    </div>
                                </div>                               
                            </div> 
                            <div class="jss782">
                                    <button class="MuiButtonBase-root MuiButton-root MuiButton-contained" tabindex="0" type="submit">
                                        <a  class="MuiButton-label" >Tìm chuyến bay</a>
                                        <span class="MuiTouchRipple-root"></span>
                                    </button>
                            </div>   
                        </div> 
                        </form>
                        </c:if>
                          <c:if test="${sessionScope.acc == null}">
                        
                         <div class="jss2001">
                                    <button>
                                        <a  class="MuiButton-label" >Hãy đăng nhập để sử dụng dịch vụ của LUD tickets bạn nhé!</a>
                                        <span class="MuiTouchRipple-root"></span>
                                    </button>
                            </div>
                            </c:if>   
                    </div> 
                </div> 
            </div>                     
        </div>
    </div>
</body>
</html>