/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-29 16:12:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class muave_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1652317442487L));
    _jspx_dependants.put("jar:file:/D:/eclipse/vemaybay/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/vemaybay/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425953470000L));
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/font/fontawesome-free-6.1.1-web/css/all.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/base.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"app\">\r\n");
      out.write("        <div class=\"grid wide\">\r\n");
      out.write("            <form action=\"insertvecontrol\" method=\"get\">\r\n");
      out.write("            <div class=\"grid__row\">\r\n");
      out.write("                <div class=\" col  l-6\">               \r\n");
      out.write("                        <div class=\"app__option\">\r\n");
      out.write("                            <div class=\"app__option-name\">\r\n");
      out.write("                                <h3>Thông tin hành khách</h3>\r\n");
      out.write("                                <div class=\"note\">\r\n");
      out.write("                                    <span>Nhập không có kí tự đặc biệt. </span>\r\n");
      out.write("                                        <br>\r\n");
      out.write("                                    <span>Nhập họ tên trùng khớp trên giấy tờ tùy thân</span>\r\n");
      out.write("                                \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option-people\">\r\n");
      out.write("                                <div class=\"icon-person\"> <i class=\"fa-solid fa-person\"></i></div>\r\n");
      out.write("                                    <span>Người lớn 1</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option--note\">\r\n");
      out.write("                                    <span>Họ và tên</span>\r\n");
      out.write("                                    <span>Giới tính</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option--choose\">\r\n");
      out.write("                                    <input name=\"tenkh\" type=\"text\" placeholder=\"Ví dụ: Trần Văn Hữu\" required=\"required\">\r\n");
      out.write("                                    <select name=\"gioitinh\"style=\"font-size: 14px;\" id=\"\">\r\n");
      out.write("                                        <option value=\"Nam\">Nam</option>\r\n");
      out.write("                                        <option value=\"Nữ\">Nữ</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option--check\">\r\n");
      out.write("                                   <span>Căn cước công dân</span> \r\n");
      out.write("                                   <span>Ngày sinh</span> \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option--NGS\">\r\n");
      out.write("                                \r\n");
      out.write("                                <input class=\"ngaysinh\" name =\"cccd\" type=\"number\" placeholder=\"Ví dụ: 09090909090\" required=\"required\">\r\n");
      out.write("                                <input style=\"font-size: 14px;\" name=\"ngaysinh\" type=\"date\" required=\"required\">  \r\n");
      out.write("                                </div>             \r\n");
      out.write("                            </div> \r\n");
      out.write("                        </div>                \r\n");
      out.write("                        <div class=\"app__option\">\r\n");
      out.write("                            <div class=\"app__option-name\">\r\n");
      out.write("                                <h3>Thông tin liên hệ</h3>\r\n");
      out.write("                                <div class=\"note\">\r\n");
      out.write("                                    <span>Mã đặt chỗ sẽ được gửi theo thông tin liên hệ dưới đây\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option-user\">\r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"app__option--note-email\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <span >Số điện thoại</span>\r\n");
      out.write("                                    <input style=\"margin-top: 5px\" readonly  name=\"sdt\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.sdt}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" placeholder=\"Ví dụ: Nhập số điện thoại\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"app__option--input\">\r\n");
      out.write("                                    <span >Email</span>\r\n");
      out.write("                                    <input style=\"margin-top: 5px;\" readonly name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.acc.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"fullname\" type=\"text\" placeholder=\"Ví dụ: you@gmail.com\">\r\n");
      out.write("                                    \r\n");
      out.write("        \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\" col  l-6\">\r\n");
      out.write("                    <div class=\"app__option\">\r\n");
      out.write("                        <div class=\"app__option--flight\">\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sanbaydi.tensb}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                            <i class=\"fa-solid fa-arrow-right\"></i>\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.sanbayden.tensb}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"app__option--day\">\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.ngaydi }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"app__option--day--flight\">\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.giodi}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" , 5/8/2022</span>\r\n");
      out.write("                            <i class=\"fa-solid fa-plane\"></i>\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.sbdi}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"app__option--icon--down\">\r\n");
      out.write("                            <span></span>\r\n");
      out.write("                            <i style=\"    margin-left: 11px\" class=\"fa-solid fa-down-long\"></i>\r\n");
      out.write("                            <span class=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.tenhang}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"app__option--day--flight\">\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.gioden}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write(',');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.ngaydi}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                            <i class=\"fa-solid fa-location-dot\"></i>\r\n");
      out.write("                            <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.sbden}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>   \r\n");
      out.write("                        <div class=\"app__option\">\r\n");
      out.write("                            <div class=\"app__option--flight\">\r\n");
      out.write("                                <span>Chi tiết giá </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"app__option--Adults\">\r\n");
      out.write("                                <span>Mã chuyến bay</span>\r\n");
      out.write("                                <input style=\"height: 25px;width: 80px\" type=\"text\" name=\"macb\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.macb}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <div class=\"app__option--Adults\">\r\n");
      out.write("                                <span>Thời gian đặt vé</span>\r\n");
      out.write("                                <input  style=\"height: 25px;width: 200px\" type=\"text\" id=\"hvn\" value=\"\" name=\"tgve\" readonly>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            \r\n");
      out.write("                            <div class=\"app__option--Adults\">\r\n");
      out.write("                                <div class=\"app__option--note-price\">\r\n");
      out.write("                                    <span>Tổng giá vé</span>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <p>Đã bao gồm thuế,phí,VAT</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <input style=\"height: 25px;width: 200px\" type=\"text\" name=\"giave\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${datve.giave}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("            \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <center><p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mess }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p></center>\r\n");
      out.write("            <button class=\"buoctieptheo\" type=\"submit\">Bước tiếp theo</button>\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        </div>\r\n");
      out.write("   </div> \r\n");
      out.write("    <script>\r\n");
      out.write("    var today = new Date();\r\n");
      out.write("    var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();\r\n");
      out.write("    var time = today.getHours() + \":\" + today.getMinutes() + \":\" + today.getSeconds();\r\n");
      out.write("    var dateTime = date+' '+time;\r\n");
      out.write(" \r\n");
      out.write("    document.getElementById(\"hvn\").value = dateTime;\r\n");
      out.write(" </script>  \r\n");
      out.write("   <script src=\"JS/grid.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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