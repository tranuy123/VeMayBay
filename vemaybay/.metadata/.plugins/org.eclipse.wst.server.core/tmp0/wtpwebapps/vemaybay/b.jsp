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
    <link rel="stylesheet" href="CSS/tinhtien.css">
    <link rel="stylesheet" href="asset/base.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" rel="stylesheet">
    <title>Document</title>
    
</head>
<body>
        <center><h2 style="color:#f00;font-size:30px"><i class="fa-solid fa-paper-plane">LUD TICKETS</i></h2></center>

<div style="display: flex;justify-content: center;background-color: #badbdc; height: 100%;">
    <form action="thanhtoancontrol" method="get">
    <div class="MuiBox-root jss2454 jss2360">
    <div class="MuiBox-root jss2472 jss2455">
        <div class="MuiBox-root jss2473">
            <h6 class="MuiTypography-root MuiTypography-subtitle1">Phương thức thanh toán</h6>
            <input value="${sessionScope.acc.sdt}" name="sdt" type="text" style="width: 150px; height:25px; font-size: 16px;">
        </div>
        <div class="MuiBox-root jss2474">
            <span class="MuiTypography-root MuiTypography-caption">Sau khi hoàn tất thanh toán, vé điện tử sẽ được gửi ngay qua SMS và Email của bạn.</span>
        </div>
        <div class="MuiBox-root jss2475">
            <div class="MuiBox-root jss2583">
                <div class="MuiPaper-root MuiAccordion-root jss2456  MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded">
                    <div class="MuiButtonBase-root MuiAccordionSummary-root jss2458 " tabindex="0" role="button" aria-disabled="false" aria-expanded="false">
                        <div class="MuiAccordionSummary-content ">
                            <div class="MuiBox-root jss2584 jss2457">
                                <svg width="32" height="32" fill="none">
                                    <path d="M12 5.333H6.667c-.737 0-1.333.597-1.333 1.334V12c0 .736.596 1.333 1.333 1.333H12c.736 0 1.334-.597 1.334-1.333V6.667c0-.737-.598-1.334-1.334-1.334z" fill="url(#icon_qr_code_svg__paint0_linear)" stroke="#2D3748" stroke-width="1.5"></path>
                                    <path d="M9.334 22.667v.013" stroke="#2D3748" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"></path>
                                    <path d="M25.333 5.333H20c-.736 0-1.334.597-1.334 1.334V12c0 .736.598 1.333 1.334 1.333h5.333c.737 0 1.334-.597 1.334-1.333V6.667c0-.737-.597-1.334-1.334-1.334z" fill="url(#icon_qr_code_svg__paint1_linear)" stroke="#2D3748" stroke-width="1.5"></path>
                                    <path d="M9.334 9.333v.014" stroke="#2D3748" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"></path>
                                    <path d="M12 18.667H6.667c-.737 0-1.333.597-1.333 1.333v5.333c0 .737.596 1.334 1.333 1.334H12c.736 0 1.334-.597 1.334-1.334V20c0-.736-.598-1.333-1.334-1.333z" fill="#fff" stroke="#2D3748" stroke-width="1.5"></path>
                                    <path d="M22.666 9.333v.014M18.666 18.667h4M26.666 18.667v.013M18.666 18.667v4M18.666 26.667h4M22.666 22.667h4M26.666 22.667v4" stroke="#2D3748" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"></path>
                                    <defs>
                                        <linearGradient id="icon_qr_code_svg__paint0_linear" x1="9.334" y1="5.333" x2="9.334" y2="13.333" gradientUnits="userSpaceOnUse">
                                            <stop stop-color="#E2E8F0"></stop>
                                            <stop offset="1" stop-color="#CBD5E0"></stop>
                                        </linearGradient>
                                        <linearGradient id="icon_qr_code_svg__paint1_linear" x1="22.666" y1="5.333" x2="22.666" y2="13.333" gradientUnits="userSpaceOnUse">
                                            <stop stop-color="#E2E8F0"></stop>
                                            <stop offset="1" stop-color="#CBD5E0"></stop>
                                        </linearGradient>
                                    </defs>
                                </svg>
                            </div>
                            <div class="MuiBox-root jss2585 jss2459">
                                <div class="MuiBox-root jss2586">
                                    <p class="MuiTypography-root MuiTypography-body1">Thanh toán QR-PAY</p>
                                 </div>
                                </div>
                                <div class="MuiBox-root jss2587 jss2460">
                                    <span class="MuiButtonBase-root MuiIconButton-root jss2590 MuiCheckbox-root jss2588" aria-disabled="false">
                                        <span class="MuiIconButton-label">
                                            <input class="jss2593" name="paymentCheck" type="checkbox" data-indeterminate="false" value="">
                                            <svg width="22" height="22" fill="none">
                                                <rect x="0.5" y="0.5" width="21" height="21" rx="10.5" fill="#fff" stroke="#CBD5E0"></rect>
                                            </svg>
                                        </span>
                                        <span class="MuiTouchRipple-root"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                        <div class="MuiCollapse-container MuiCollapse-hidden" style="min-height: 0px;">
                            <div class="MuiCollapse-wrapper">
                                <div class="MuiCollapse-wrapperInner">
                                    <div role="region"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="MuiBox-root jss2594">
                    <div class="MuiPaper-root MuiAccordion-root jss2456 MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded">
                        <div class="MuiButtonBase-root MuiAccordionSummary-root jss2458" tabindex="0" role="button" aria-disabled="false" aria-expanded="false">
                            <div class="MuiAccordionSummary-content">
                                <div class="MuiBox-root jss2595 jss2457">
                                    <svg width="32" height="32" fill="none">
                                        <path d="M24 6.667H8a4 4 0 00-4 4v10.666a4 4 0 004 4h16a4 4 0 004-4V10.667a4 4 0 00-4-4z" fill="#fff" stroke="#2D3748" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"></path><path d="M5.5 7h21l1.5 6H4l1.5-6z" fill="url(#icon_method_atm_card_svg__paint0_linear)"></path><path d="M24 6.667H8a4 4 0 00-4 4v10.666a4 4 0 004 4h16a4 4 0 004-4V10.667a4 4 0 00-4-4zM4 13.333h24M9.333 20h.013M14.667 20h2.667" stroke="#2D3748" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"></path>
                                        <defs>
                                            <linearGradient id="icon_method_atm_card_svg__paint0_linear" x1="16" y1="7" x2="16" y2="13" gradientUnits="userSpaceOnUse">
                                                <stop stop-color="#E2E8F0"></stop>
                                                <stop offset="1" stop-color="#CBD5E0"></stop>
                                            </linearGradient>
                                        </defs>
                                    </svg>
                                </div>
                                <div class="MuiBox-root jss2596 jss2459">
                                    <div class="MuiBox-root jss2597">
                                        <p class="MuiTypography-root MuiTypography-body1">Thẻ ATM/Tài khoản ngân hàng</p>
                                     </div>
                                    </div>
                                    <div class="MuiBox-root jss2598 jss2460">
                                        <span class="MuiButtonBase-root MuiIconButton-root jss2590 MuiCheckbox-root jss2588" aria-disabled="false">
                                            <span class="MuiIconButton-label">
                                                <input class="jss2593" name="paymentCheck" type="checkbox" data-indeterminate="false" value="">
                                                <svg width="22" height="22" fill="none">
                                                    <rect x="0.5" y="0.5" width="21" height="21" rx="10.5" fill="#fff" stroke="#CBD5E0"></rect>
                                                </svg>
                                            </span>
                                            <span class="MuiTouchRipple-root"></span>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                
                <div class="MuiBox-root jss2629">
                    <div class="MuiPaper-root MuiAccordion-root jss2456 MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded">
                        <div class="MuiButtonBase-root MuiAccordionSummary-root jss2458" tabindex="0" role="button" aria-disabled="false" aria-expanded="false">
                            <div class="MuiAccordionSummary-content">
                                <div class="MuiBox-root jss2630 jss2457">
                                    <img src="https://storage.googleapis.com/tripi-assets/mytour/icons/icon_method_visa.svg" alt="logo_payment_visa" style="width: 32px; height: 32px;"></div>
                                    <div class="MuiBox-root jss2631 jss2459">
                                        <div class="MuiBox-root jss2632">
                                            <p class="MuiTypography-root MuiTypography-body1">Thẻ Visa, Master Card</p>
                                         </div>
                                        </div>
                                        <div class="MuiBox-root jss2633 jss2460">
                                            <span class="MuiButtonBase-root MuiIconButton-root jss2590 MuiCheckbox-root jss2588" aria-disabled="false">
                                                <span class="MuiIconButton-label">
                                                    <input class="jss2593" name="paymentCheck" type="checkbox" data-indeterminate="false" value="">
                                                    <svg width="22" height="22" fill="none">
                                                        <rect x="0.5" y="0.5" width="21" height="21" rx="10.5" fill="#fff" stroke="#CBD5E0"></rect>
                                                    </svg>
                                                </span>
                                                <span class="MuiTouchRipple-root"></span>
                                            </span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>      
                    </div>
                    
                <div class="MuiBox-root jss2476">
                    <button class=" jss2485    " tabindex="-1" type="submit">
                        <span class="MuiButton-label">
                            <div class="MuiBox-root jss2486">
                                <div class="MuiBox-root jss2487" opacity="1">
                                    <h6 class="MuiTypography-root MuiTypography-subtitle1">Thanh toán</h6>
                                </div>
                            </div>
                        </span>
                    </button>
                </div>
            </div>
                <div class="MuiBox-root jss2491">
                    <div class="MuiBox-root jss2492">
                        <span class="MuiTypography-root jss2361 MuiTypography-body2">Bằng cách nhấn vào nút này, bạn công nhận mình đã đọc và đồng ý với</span>
                    </div>
                    <div class="MuiBox-root jss2493">
                        <a class="MuiTypography-root MuiLink-root MuiLink-underlineHover jss2362 MuiTypography-colorPrimary" href="">
                            <span class="MuiTypography-root MuiTypography-body2">Điều kiện và Điều khoản</span>
                        </a>
                        <span class="MuiTypography-root jss2361 MuiTypography-body2">của chúng tôi</span>
                    </div>
                </div>
            </div>
        </form>
    </div>
</body>
</html>
    
