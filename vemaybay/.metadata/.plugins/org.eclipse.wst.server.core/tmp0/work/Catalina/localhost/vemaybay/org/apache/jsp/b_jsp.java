/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-29 16:13:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class b_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/font/fontawesome-free-6.1.1-web/css/all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/tinhtien.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"asset/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        <center><h2 style=\"color:#f00;font-size:30px\"><i class=\"fa-solid fa-paper-plane\">LUD TICKETS</i></h2></center>\r\n");
      out.write("\r\n");
      out.write("<div style=\"display: flex;justify-content: center;background-color: #badbdc; height: 100%;\">\r\n");
      out.write("    <form action=\"thanhtoancontrol\" method=\"get\">\r\n");
      out.write("    <div class=\"MuiBox-root jss2454 jss2360\">\r\n");
      out.write("    <div class=\"MuiBox-root jss2472 jss2455\">\r\n");
      out.write("        <div class=\"MuiBox-root jss2473\">\r\n");
      out.write("            <h6 class=\"MuiTypography-root MuiTypography-subtitle1\">Phương thức thanh toán</h6>\r\n");
      out.write("            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.sdt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"sdt\" type=\"text\" style=\"width: 150px; height:25px; font-size: 16px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"MuiBox-root jss2474\">\r\n");
      out.write("            <span class=\"MuiTypography-root MuiTypography-caption\">Sau khi hoàn tất thanh toán, vé điện tử sẽ được gửi ngay qua SMS và Email của bạn.</span>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"MuiBox-root jss2475\">\r\n");
      out.write("            <div class=\"MuiBox-root jss2583\">\r\n");
      out.write("                <div class=\"MuiPaper-root MuiAccordion-root jss2456  MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded\">\r\n");
      out.write("                    <div class=\"MuiButtonBase-root MuiAccordionSummary-root jss2458 \" tabindex=\"0\" role=\"button\" aria-disabled=\"false\" aria-expanded=\"false\">\r\n");
      out.write("                        <div class=\"MuiAccordionSummary-content \">\r\n");
      out.write("                            <div class=\"MuiBox-root jss2584 jss2457\">\r\n");
      out.write("                                <svg width=\"32\" height=\"32\" fill=\"none\">\r\n");
      out.write("                                    <path d=\"M12 5.333H6.667c-.737 0-1.333.597-1.333 1.334V12c0 .736.596 1.333 1.333 1.333H12c.736 0 1.334-.597 1.334-1.333V6.667c0-.737-.598-1.334-1.334-1.334z\" fill=\"url(#icon_qr_code_svg__paint0_linear)\" stroke=\"#2D3748\" stroke-width=\"1.5\"></path>\r\n");
      out.write("                                    <path d=\"M9.334 22.667v.013\" stroke=\"#2D3748\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"></path>\r\n");
      out.write("                                    <path d=\"M25.333 5.333H20c-.736 0-1.334.597-1.334 1.334V12c0 .736.598 1.333 1.334 1.333h5.333c.737 0 1.334-.597 1.334-1.333V6.667c0-.737-.597-1.334-1.334-1.334z\" fill=\"url(#icon_qr_code_svg__paint1_linear)\" stroke=\"#2D3748\" stroke-width=\"1.5\"></path>\r\n");
      out.write("                                    <path d=\"M9.334 9.333v.014\" stroke=\"#2D3748\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"></path>\r\n");
      out.write("                                    <path d=\"M12 18.667H6.667c-.737 0-1.333.597-1.333 1.333v5.333c0 .737.596 1.334 1.333 1.334H12c.736 0 1.334-.597 1.334-1.334V20c0-.736-.598-1.333-1.334-1.333z\" fill=\"#fff\" stroke=\"#2D3748\" stroke-width=\"1.5\"></path>\r\n");
      out.write("                                    <path d=\"M22.666 9.333v.014M18.666 18.667h4M26.666 18.667v.013M18.666 18.667v4M18.666 26.667h4M22.666 22.667h4M26.666 22.667v4\" stroke=\"#2D3748\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"></path>\r\n");
      out.write("                                    <defs>\r\n");
      out.write("                                        <linearGradient id=\"icon_qr_code_svg__paint0_linear\" x1=\"9.334\" y1=\"5.333\" x2=\"9.334\" y2=\"13.333\" gradientUnits=\"userSpaceOnUse\">\r\n");
      out.write("                                            <stop stop-color=\"#E2E8F0\"></stop>\r\n");
      out.write("                                            <stop offset=\"1\" stop-color=\"#CBD5E0\"></stop>\r\n");
      out.write("                                        </linearGradient>\r\n");
      out.write("                                        <linearGradient id=\"icon_qr_code_svg__paint1_linear\" x1=\"22.666\" y1=\"5.333\" x2=\"22.666\" y2=\"13.333\" gradientUnits=\"userSpaceOnUse\">\r\n");
      out.write("                                            <stop stop-color=\"#E2E8F0\"></stop>\r\n");
      out.write("                                            <stop offset=\"1\" stop-color=\"#CBD5E0\"></stop>\r\n");
      out.write("                                        </linearGradient>\r\n");
      out.write("                                    </defs>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"MuiBox-root jss2585 jss2459\">\r\n");
      out.write("                                <div class=\"MuiBox-root jss2586\">\r\n");
      out.write("                                    <p class=\"MuiTypography-root MuiTypography-body1\">Thanh toán QR-PAY</p>\r\n");
      out.write("                                 </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"MuiBox-root jss2587 jss2460\">\r\n");
      out.write("                                    <span class=\"MuiButtonBase-root MuiIconButton-root jss2590 MuiCheckbox-root jss2588\" aria-disabled=\"false\">\r\n");
      out.write("                                        <span class=\"MuiIconButton-label\">\r\n");
      out.write("                                            <input class=\"jss2593\" name=\"paymentCheck\" type=\"checkbox\" data-indeterminate=\"false\" value=\"\">\r\n");
      out.write("                                            <svg width=\"22\" height=\"22\" fill=\"none\">\r\n");
      out.write("                                                <rect x=\"0.5\" y=\"0.5\" width=\"21\" height=\"21\" rx=\"10.5\" fill=\"#fff\" stroke=\"#CBD5E0\"></rect>\r\n");
      out.write("                                            </svg>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                        <span class=\"MuiTouchRipple-root\"></span>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"MuiCollapse-container MuiCollapse-hidden\" style=\"min-height: 0px;\">\r\n");
      out.write("                            <div class=\"MuiCollapse-wrapper\">\r\n");
      out.write("                                <div class=\"MuiCollapse-wrapperInner\">\r\n");
      out.write("                                    <div role=\"region\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"MuiBox-root jss2594\">\r\n");
      out.write("                    <div class=\"MuiPaper-root MuiAccordion-root jss2456 MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded\">\r\n");
      out.write("                        <div class=\"MuiButtonBase-root MuiAccordionSummary-root jss2458\" tabindex=\"0\" role=\"button\" aria-disabled=\"false\" aria-expanded=\"false\">\r\n");
      out.write("                            <div class=\"MuiAccordionSummary-content\">\r\n");
      out.write("                                <div class=\"MuiBox-root jss2595 jss2457\">\r\n");
      out.write("                                    <svg width=\"32\" height=\"32\" fill=\"none\">\r\n");
      out.write("                                        <path d=\"M24 6.667H8a4 4 0 00-4 4v10.666a4 4 0 004 4h16a4 4 0 004-4V10.667a4 4 0 00-4-4z\" fill=\"#fff\" stroke=\"#2D3748\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"></path><path d=\"M5.5 7h21l1.5 6H4l1.5-6z\" fill=\"url(#icon_method_atm_card_svg__paint0_linear)\"></path><path d=\"M24 6.667H8a4 4 0 00-4 4v10.666a4 4 0 004 4h16a4 4 0 004-4V10.667a4 4 0 00-4-4zM4 13.333h24M9.333 20h.013M14.667 20h2.667\" stroke=\"#2D3748\" stroke-width=\"1.5\" stroke-linecap=\"round\" stroke-linejoin=\"round\"></path>\r\n");
      out.write("                                        <defs>\r\n");
      out.write("                                            <linearGradient id=\"icon_method_atm_card_svg__paint0_linear\" x1=\"16\" y1=\"7\" x2=\"16\" y2=\"13\" gradientUnits=\"userSpaceOnUse\">\r\n");
      out.write("                                                <stop stop-color=\"#E2E8F0\"></stop>\r\n");
      out.write("                                                <stop offset=\"1\" stop-color=\"#CBD5E0\"></stop>\r\n");
      out.write("                                            </linearGradient>\r\n");
      out.write("                                        </defs>\r\n");
      out.write("                                    </svg>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"MuiBox-root jss2596 jss2459\">\r\n");
      out.write("                                    <div class=\"MuiBox-root jss2597\">\r\n");
      out.write("                                        <p class=\"MuiTypography-root MuiTypography-body1\">Thẻ ATM/Tài khoản ngân hàng</p>\r\n");
      out.write("                                     </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"MuiBox-root jss2598 jss2460\">\r\n");
      out.write("                                        <span class=\"MuiButtonBase-root MuiIconButton-root jss2590 MuiCheckbox-root jss2588\" aria-disabled=\"false\">\r\n");
      out.write("                                            <span class=\"MuiIconButton-label\">\r\n");
      out.write("                                                <input class=\"jss2593\" name=\"paymentCheck\" type=\"checkbox\" data-indeterminate=\"false\" value=\"\">\r\n");
      out.write("                                                <svg width=\"22\" height=\"22\" fill=\"none\">\r\n");
      out.write("                                                    <rect x=\"0.5\" y=\"0.5\" width=\"21\" height=\"21\" rx=\"10.5\" fill=\"#fff\" stroke=\"#CBD5E0\"></rect>\r\n");
      out.write("                                                </svg>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"MuiTouchRipple-root\"></span>\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"MuiBox-root jss2629\">\r\n");
      out.write("                    <div class=\"MuiPaper-root MuiAccordion-root jss2456 MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded\">\r\n");
      out.write("                        <div class=\"MuiButtonBase-root MuiAccordionSummary-root jss2458\" tabindex=\"0\" role=\"button\" aria-disabled=\"false\" aria-expanded=\"false\">\r\n");
      out.write("                            <div class=\"MuiAccordionSummary-content\">\r\n");
      out.write("                                <div class=\"MuiBox-root jss2630 jss2457\">\r\n");
      out.write("                                    <img src=\"https://storage.googleapis.com/tripi-assets/mytour/icons/icon_method_visa.svg\" alt=\"logo_payment_visa\" style=\"width: 32px; height: 32px;\"></div>\r\n");
      out.write("                                    <div class=\"MuiBox-root jss2631 jss2459\">\r\n");
      out.write("                                        <div class=\"MuiBox-root jss2632\">\r\n");
      out.write("                                            <p class=\"MuiTypography-root MuiTypography-body1\">Thẻ Visa, Master Card</p>\r\n");
      out.write("                                         </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"MuiBox-root jss2633 jss2460\">\r\n");
      out.write("                                            <span class=\"MuiButtonBase-root MuiIconButton-root jss2590 MuiCheckbox-root jss2588\" aria-disabled=\"false\">\r\n");
      out.write("                                                <span class=\"MuiIconButton-label\">\r\n");
      out.write("                                                    <input class=\"jss2593\" name=\"paymentCheck\" type=\"checkbox\" data-indeterminate=\"false\" value=\"\">\r\n");
      out.write("                                                    <svg width=\"22\" height=\"22\" fill=\"none\">\r\n");
      out.write("                                                        <rect x=\"0.5\" y=\"0.5\" width=\"21\" height=\"21\" rx=\"10.5\" fill=\"#fff\" stroke=\"#CBD5E0\"></rect>\r\n");
      out.write("                                                    </svg>\r\n");
      out.write("                                                </span>\r\n");
      out.write("                                                <span class=\"MuiTouchRipple-root\"></span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>      \r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                <div class=\"MuiBox-root jss2476\">\r\n");
      out.write("                    <button class=\" jss2485    \" tabindex=\"-1\" type=\"submit\">\r\n");
      out.write("                        <span class=\"MuiButton-label\">\r\n");
      out.write("                            <div class=\"MuiBox-root jss2486\">\r\n");
      out.write("                                <div class=\"MuiBox-root jss2487\" opacity=\"1\">\r\n");
      out.write("                                    <h6 class=\"MuiTypography-root MuiTypography-subtitle1\">Thanh toán</h6>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"MuiBox-root jss2491\">\r\n");
      out.write("                    <div class=\"MuiBox-root jss2492\">\r\n");
      out.write("                        <span class=\"MuiTypography-root jss2361 MuiTypography-body2\">Bằng cách nhấn vào nút này, bạn công nhận mình đã đọc và đồng ý với</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"MuiBox-root jss2493\">\r\n");
      out.write("                        <a class=\"MuiTypography-root MuiLink-root MuiLink-underlineHover jss2362 MuiTypography-colorPrimary\" href=\"\">\r\n");
      out.write("                            <span class=\"MuiTypography-root MuiTypography-body2\">Điều kiện và Điều khoản</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <span class=\"MuiTypography-root jss2361 MuiTypography-body2\">của chúng tôi</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("    \r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}