/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2024-03-19 06:29:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("*{\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tpadding:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span,input,select{\r\n");
      out.write("\tmargin:5px;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".InfoDiv{\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("\twidth:1000px;\r\n");
      out.write("\theight: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".head{\r\n");
      out.write("\twidth:1000px;\r\n");
      out.write("\theight:300px;\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("  \tborder-collapse: collapse;\r\n");
      out.write("  \tfont-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr{\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("  \tborder-collapse: collapse;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".content_div{\r\n");
      out.write("    width: 1000px;\r\n");
      out.write("    height: 500px;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("}\r\n");
      out.write("textarea{\r\n");
      out.write("\tmargin-top:50px;\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:80%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2{\r\n");
      out.write("\tmargin:30px;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".BtnDiv{\r\n");
      out.write("\t\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".footerBtn{\r\n");
      out.write("\twidth:100px;\r\n");
      out.write("\theight:60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img{\r\n");
      out.write("\twidth:100%; height:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".imgDeleteBtn{\r\n");
      out.write("\t    position: absolute;\r\n");
      out.write("\t    top: 8%;\r\n");
      out.write("\t    right: 52%;\r\n");
      out.write("\t    background-color: #ef7d7d;\r\n");
      out.write("\t    color: wheat;\r\n");
      out.write("\t    width: 30px;\r\n");
      out.write("\t    height: 30px;\r\n");
      out.write("\t    border-radius: 50%;\r\n");
      out.write("\t    text-align: center;\r\n");
      out.write("\t    border: none;\r\n");
      out.write("\t    display: block;\r\n");
      out.write("\t    cursor: pointer;\t\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"InfoDiv\">\r\n");
      out.write("\t<h2>책 상세 페이지</h2>\r\n");
      out.write("\t<table class=\"head\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td rowspan=\"6\" style=\"width:500px;border: 1px solid black; border-collapse: collapse;\">\r\n");
      out.write("\t\t\t<div id=\"#imgArea\" class=\"imgArea\" style=\"margin:0 auto;width:60%; height:90%;\">\r\n");
      out.write("\t\t\t\t<img id=\"detailBookImg\" src=\"/book/display?fileName=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${img}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><span>제목</span><input type=\"text\" id=\"book_title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></td>\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><span>저자</span><input type=\"text\" id=\"book_author\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<span>장르</span>\r\n");
      out.write("\t\t\t\t<select id=\"book_category\" disabled>\r\n");
      out.write("\t\t\t\t\t<option value=\"소설\">소설</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"시\">시</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"수필\">수필</option>\r\n");
      out.write("\t\t\t\t</select></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><span>재고</span><input type=\"text\" id=\"book_quantity\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_quantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><span>가격</span><input type=\"text\" id=\"book_price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"content_div\">\r\n");
      out.write("\t\t<textarea id=\"book_content\" rows=\"20\" cols=\"30\" readonly>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t<div class=\"BtnDiv\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"footerBtn\" id=\"cancelBtn\" value=\"취소\" onclick=\"javascript:history.back()\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"footerBtn\" id=\"updateBtn\" value=\"수정\" onclick=\"EditMode()\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"footerBtn\" id=\"deleteBtn\" value=\"삭제\" onclick=\"DeleteBook()\">\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"hidden\" id=\"selectedCategory\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_category}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("<input type=\"hidden\" id=\"book_code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bookDTO.book_code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("</body>\r\n");
      out.write(" <script type=\"text/javascript\" src=\"../resources/js/book/bookDetail.js\"></script>\r\n");
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
