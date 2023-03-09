<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LUDAirLine</title>
    <link rel="stylesheet" href="CSS/detail.css">
    <script language="javascript">
        document.getElementById("btn1").onclick = function () {
            document.getElementById("content").style.display = 'block';
        };
    </script>
</head>

<body>
    <div class=" jss8">
        <div class="MuiBox-root jss13 jss9" id="id-header-wrapper-content-listing" >
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
                                    <a class="login" href="">Đăng ký</a>
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
                </div>
            </header> --> 
            <div class="MuiBox-root jss90" style="width:100%">
                <div class="MuiBox-root jss91 jss71">
                    <form action="searchcontrol1" method="get">
                        <div class="MuiBox-root jss92 jss75" style="border:none;margin-top:0;box-shadow:0px 15px 15px rgba(0, 0, 0, 0.2)">
                            <div class="MuiBox-root jss93 jss80">
                                <div class="MuiBox-root jss94 jss83">
                                    <div class="MuiBox-root jss95 jss78">Từ</div>
                                    <div class="select">
                                        <select name="sbdi" style="height: 25px; width: 200px; font-size: larger; font-weight: 700;">
                                          <option value="${sessionScope.sanbaydi.masb}">${sessionScope.sanbaydi.tentp}</option>
                                             <option value="SGN">TP.Hồ Chí Minh</option>
                                                      <option value="HAN">Hà Nội</option>
                                                      <option value="BMV">Buôn Ma Thuột</option>
                                                      <option value="VCA">Cần Thơ</option>
                                                      <option value="DAD">Đà Nẵng</option>
                                                      <option value="DLI">Đà Lạt</option>
                                                      <option value="VII">TP.Vinh</option>
                                                      <option value="PQC">Kiên Giang</option>
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
                                
                                <div class="MuiBox-root jss98 jss81">
                                    <div class="MuiBox-root jss99 jss83 ">
                                        <div class="MuiBox-root jss100 jss78">Đến</div>
                                       <div class="select" >
                                            <select name="sbden" style="height: 25px;width: 200px;font-size: larger;font-weight: 700;">
                                              <option value="${sessionScope.sanbayden.masb}">${sessionScope.sanbayden.tentp}</option>                           
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
                                <div class="MuiBox-root jss102 jss81">
                                    <div class="MuiBox-root jss103" style="margin-left:24px;position:relative;min-width:275px">
                                        <div class="MuiBox-root jss104 jss78">Ngày đi 
                                            <div class="jss82" style="background:transparent"></div>
                                        </div>
                                        <input value="${sessionScope.chuyenbay.ngaydi}"name="ngaydi" type="date" style="font-weight: 700;height: 25px; width: 200px;">                                                   
                                    </div>
                                </div>
                                <div class="MuiBox-root jss114 jss81">
                                    <div class="MuiBox-root jss115" style="margin-left:24px;position:relative">
                                        <div class="MuiBox-root jss116 jss83">
                                            <div class="MuiBox-root jss117 jss78">Hãng bay</div>
                                            <div class="select" >
                                                <select name="hangbay" style="
                                                height: 25px;
                                                width: 200px;
                                                
                                                font-size: larger;
                                                font-weight: 700;
                                            ">
                                                  <option value="Vietnam Airlines" selected disabled>Hãng bay</option>
                                                  <option value="Vietnam Airlines">Vietnam Airlines</option>
                                                  <option value="Bamboo Airways">Bamboo Airway</option>
                                                  <option value="Pacific Airlines">Pacific Airlines</option>
                                                  <option value="Vietjet Air">Vietjet Air</option>
                                                 
                                                </select>
                                              </div> 
                                            <div class="jss82" style="background:transparent"></div>
                                        </div>                                       
                                    </div>
                                </div>
                                <button class=" jssbutton MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary  " tabindex="0" type="submit" style="width: 100px; height: 56px; cursor: pointer; border-radius: 8px; box-shadow: none;">
                                    <span class="MuiButton-label">
                                        <svg width="23" height="24" fill="none" class="svgFillAll" style="stroke:white">
                                            <path d="M21.312 22.5l-4.742-4.742m2.71-7.451a8.806 8.806 0 11-17.613 0 8.806 8.806 0 0117.613 0z" stroke="#fff" stroke-width="3" stroke-linecap="round" stroke-linejoin="round"></path>
                                        </svg>
                                    </span>
                                    <span class="MuiTouchRipple-root"></span>
                                </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        </div>
        <main>
            <div class="MuiBox-root jss119 jss2" id="idHomeWrapper">
                <div class="MuiBox-root jss120 jss3">
                    <div class="MuiBox-root jss121 jss4">
                        <div class="MuiBox-root jss122" style="width:100%;padding-top:24px;margin-left:auto;padding-left:0">
                            <div class="MuiBox-root jss123 jss6">
                                <div class="MuiBox-root jss124 jss7">
                                    <div class="MuiBox-root jss136">
                                        <nav class="MuiTypography-root MuiBreadcrumbs-root MuiTypography-body1 MuiTypography-colorTextSecondary" style="margin-bottom:16px;color:#4A5568">
                                            <ol class="MuiBreadcrumbs-ol">
                                                <li class="MuiBreadcrumbs-li">
                                                    <a class="MuiTypography-root MuiLink-root MuiLink-underlineHover MuiTypography-colorInherit" href="">
                                                        <p class="MuiTypography-root MuiTypography-body2">Vé máy bay</p>
                                                    </a>
                                                </li>
                                                <li aria-hidden="true" class="MuiBreadcrumbs-separator">›</li>
                                                <li class="MuiBreadcrumbs-li">
                                                    <a class="MuiTypography-root MuiLink-root MuiLink-underlineHover MuiTypography-colorInherit" href="">
                                                        <p class="MuiTypography-root MuiTypography-body2">Chuyến bay từ<!-- --> <!-- -->${sessionScope.sanbaydi.tentp}<!-- --> <!-- -->đến<!-- --> <!-- -->${sessionScope.sanbayden.tentp}</p>
                                                    </a>
                                                </li>
                                            </ol>
                                        </nav>
                                        <div class="MuiBox-root jss140 jss137">
                                            <div class="MuiBox-root jss141">
                                                <a class="MuiTypography-root MuiLink-root MuiLink-underlineHover jss138 MuiTypography-colorPrimary" href="">
                                                    <div class="MuiBox-root jss142">
                                                        <p class="MuiTypography-root MuiTypography-body1" style="font-size:24px;font-weight:600;display:flex">${sessionScope.sanbaydi.tensb}<!-- --> (<!-- -->${sessionScope.sanbaydi.masb}<!-- -->) &nbsp;
                                                            <svg width="16" height="17" fill="none">
                                                                <path d="M3.333 8.5h9.334M10 11.167L12.667 8.5M10 5.833L12.667 8.5" stroke="#1A202C" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"></path>
                                                            </svg>
                                                            &nbsp;<!-- -->${sessionScope.sanbayden.tensb}<!-- --> (<!-- -->${sessionScope.sanbayden.masb}<!-- -->)
                                                        </p>
                                                        <h4 class="MuiTypography-root MuiTypography-h4" style="font-weight:400"></h4>
                                                    </div>
                                                </a>
                                            </div>
                                            <div class="MuiBox-root jss143" style="color:#1A202C">
                                                <span class="MuiTypography-root MuiTypography-caption">${sessionScope.chuyenbay.ngaydi}</span>
                                                <svg width="3" height="3" fill="none" class="jss139">
                                                    <rect width="3" height="3" rx="1.5" fill="#A0AEC0"></rect>
                                                </svg>
                                                <span class="MuiTypography-root MuiTypography-caption">1<!-- -->&nbsp;<!-- -->khách</span>
                                                <span class="MuiTypography-root MuiTypography-caption"></span>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="MuiBox-root jss144 jss5">
                              <jsp:include page="boloc.jsp"></jsp:include>
                                <div class="MuiBox-root jss183">
                                    <div class="MuiBox-root jss208 jss196">
                                        <div class="MuiBox-root jss209 jss197" id="banner_listing"></div>
                                        <div class="MuiBox-root jss210 jss198">                                                
                                            <div>
                                                <div class="MuiBox-root jss374 jss370">
                                                    <c:forEach items="${listchuyenbay}" var="o">
                                                        <div class="MuiBox-root jss375 jss373">
                                                            <div class="MuiBox-root jss376">
                                                                <div class="MuiBox-root jss402 jss377" style="border-radius: 8px;">
                                                                    <div class="MuiBox-root jss403 jss380">
                                                                        <div class="MuiBox-root jss404 jss386">
                                                                            <div class="MuiBox-root jss405">
                                                                                <div class="MuiBox-root jss406">
                                                                                    <div class="jss291 jss387">
                                                                                        <div class="jss292 jss295" style="border-radius: 0px;"></div>
                                                                                        <div class="lazyload-wrapper">
                                                                                            <img src="${o.icon }" alt="">
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                                <div class="MuiBox-root jss407 jss392">
                                                                                    <span class="MuiTypography-root jss390 MuiTypography-subtitle2">${o.tenhang }</span>
                                                                                    <span class="MuiTypography-root jss391 MuiTypography-caption" style="color: rgb(255, 51, 102);"></span>
                                                                                    <span class="MuiTypography-root jss391 MuiTypography-caption">${o.sohieu}</span>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="MuiBox-root jss408">
                                                                            <div class="MuiBox-root jss409 jss381">
                                                                                <span class="MuiTypography-root jss384 MuiTypography-subtitle1">${o.giodi}</span>
                                                                                <span class="MuiTypography-root jss383 MuiTypography-caption">${o.sbdi}</span>
                                                                            </div>
                                                                            <svg width="40" height="20" fill="none" class="jss393">
                                                                                <g clip-path="url(#icon_arrow_flight_long_svg__clip0)" stroke="#718096" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round">
                                                                                    <path d="M33.5 8.5L36 11M4 11h32"></path>
                                                                                </g>
                                                                                <defs>
                                                                                    <clipPath id="icon_arrow_flight_long_svg__clip0">
                                                                                        <path fill="#fff" d="M0 0h40v20H0z"></path>
                                                                                    </clipPath>
                                                                                </defs>
                                                                            </svg>
                                                                            <div class="MuiBox-root jss410 jss382">
                                                                                <span class="MuiTypography-root jss384 MuiTypography-subtitle1">${o.gioden }</span>
                                                                                <span class="MuiTypography-root jss383 MuiTypography-caption" style="display: flex; justify-content: flex-end;">${o.sbden }</span>
                                                                            </div>
                                                                        </div>
                                                                        <div class="MuiBox-root jss411">
                                                                            <h6 class="MuiTypography-root MuiTypography-subtitle2">${o.ngaydi }</h6>
                                                                            <span class="MuiTypography-root MuiTypography-caption" style="color: rgb(74, 85, 104);">${o.lotrinhbay }</span>
                                                                        </div>
                                                                    </div>
                                                                    <hr class="MuiDivider-root jss379">
                                                                    <div class="MuiBox-root jss412 jss380">
                                                                        <div class="MuiBox-root jss413 jss386">
                                                                            <div class="MuiBox-root jss414">
                                                                                <span class="MuiTypography-root MuiTypography-caption">Phổ Thông</span>
                                                                            </div>
                                                                        </div>
                                                                        <div class="MuiBox-root jss415">
                                                                            <div class="MuiBox-root jss418" title="Hành lý xách tay 7kg. Hành lý ký gửi 0 kiện (0kg/kiện)">
                                                                                <div class="MuiChip-root" style="margin-right: 16px; background-color: rgb(242, 246, 249);">
                                                                                    <svg width="16" height="16" fill="none" class="MuiChip-icon svgFillAll" style="width: 20px; stroke: rgb(74, 85, 104); height: 20px;">
                                                                                        <path d="M3.907 13.736v.93M12.59 13.736v.93M6.388 10.015h3.72" stroke="#1A202C" stroke-miterlimit="10" stroke-linecap="round"></path>
                                                                                        <path d="M13.83 11.736a2 2 0 01-2 2H4.667a2 2 0 01-2-2V5.054c0-.682.558-1.24 1.24-1.24h8.682c.683 0 1.24.558 1.24 1.24v6.682zM10.109 3.814v-1.48a1 1 0 00-1-1H7.388a1 1 0 00-1 1v1.48M2.667 7.535H13.83" stroke="#1A202C" stroke-miterlimit="10" stroke-linecap="square"></path>
                                                                                    </svg>
                                                                                    <span class="MuiChip-label">
                                                                                        <span class="MuiTypography-root MuiTypography-caption" style="height: 16px;">7 kg</span>
                                                                                    </span>
                                                                                </div>
                                                                            </div>
                                                                            <div class="MuiButtonBase-root MuiChip-root MuiChip-clickable" tabindex="0" role="button" style="margin-right: 16px; height: 32px; background-color: rgb(242, 246, 249); color: rgb(26, 32, 44);">
                                                                                <svg width="16" height="16" fill="none" class="MuiChip-icon svgFillAll" style="width: auto; stroke: rgb(74, 85, 104);">
                                                                                    <path d="M8 14A6 6 0 108 2a6 6 0 000 12zM8 5.333h.007" stroke="#1A202C" stroke-linecap="round" stroke-linejoin="round"></path>
                                                                                    <path d="M7.333 8H8v2.667h.666" stroke="#1A202C" stroke-linecap="round" stroke-linejoin="round"></path>
                                                                                </svg>
                                                                                <span class="MuiChip-label">
                                                                                        <span class="MuiTypography-root MuiTypography-caption" style="height: 16px;">Chi tiết</span>
                                                                                </span>
                                                                                <span class="MuiTouchRipple-root"></span>
                                                                            </div>
                                                                        </div>
                                                                        <div class="MuiBox-root jss419">
                                                                            <div class="MuiBox-root jss420 jss398">
                                                                                <div class="jss291 jss388">
                                                                                    <div class="jss292 jss295" style="border-radius: 0px;"></div>
                                                                                    <div class="lazyload-wrapper">
                                                                                        <img src="${o.icon }" class="jss294 jss388" alt="">
                                                                                    </div>
                                                                                </div>
                                                                                <p class="MuiTypography-root MuiTypography-body2">Giá rẻ nhất</p>
                                                                            </div>
                                                                            <div class="MuiBox-root jss421">
                                                                                <div class="MuiBox-root jss422">
                                                                                   
                                                                                    <h6 class="MuiTypography-root jss395 MuiTypography-subtitle1">${o.giave }</h6>
                                                                                </div>
                                                                                <button class="MuiButtonBase-root MuiButton-containedSecondary MuiButton-root MuiButton-text jss423 jss424 jss378" tabindex="0" type="submit">
                                                                                    <span class="MuiButton-label">
                                                                                        <div class="MuiBox-root jss425">
                                                                                           <a class="MuiBox-root jss426" opacity="1"  href="datvecontrol?pid=${o.macb}">Chọn</a>
                                                                                        </div>
                                                                                    </span>
                                                                                    <span class="MuiTouchRipple-root"></span>
                                                                                </button>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div> 
                                                    </c:forEach>      
                                                 </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                             
                        </div>
                    </div>
                </div>
            </div>            
        </main>
             <jsp:include page="footer.jsp"></jsp:include>
        
    </div>    
</body>
