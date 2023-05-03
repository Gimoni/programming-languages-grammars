/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-05-03 09:04:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class alpha2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"Coche-Control\" content=\"no-store\">\r\n");
      out.write("<link rel=\"icon\" href=\"faviconAlpha.png\"> \r\n");
      out.write("<script src=\"js/alpha.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("input[type='range'] {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("div {\r\n");
      out.write("	border: 20px solid black;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>alpha2.jsp</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>Form 실습</h1>\r\n");
      out.write("<hr>\r\n");
      out.write("<form name=\"alpha\">\r\n");
      out.write("<fieldset name=\"position\">\r\n");
      out.write("	<legend>Position</legend>\r\n");
      out.write("	<input name=\"line\" type=\"range\" min=\"1\" max=\"20\">\r\n");
      out.write("	<input name=\"column\" type=\"range\" min=\"1\" max=\"40\">\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset name=\"color\">\r\n");
      out.write("	<legend>Color</legend>\r\n");
      out.write("	<label>Foreground</label>\r\n");
      out.write("	<select name=\"fg\">\r\n");
      out.write("		<option value=\"red\">Red</option>\r\n");
      out.write("		<option value=\"green\">Green</option>\r\n");
      out.write("		<option value=\"blue\">Blue</option>\r\n");
      out.write("	</select>\r\n");
      out.write("	<label>Background</label>\r\n");
      out.write("	<select name=\"bg\">\r\n");
      out.write("		<option value=\"red\">Red</option>\r\n");
      out.write("		<option value=\"green\">Green</option>\r\n");
      out.write("		<option value=\"blue\">Blue</option>\r\n");
      out.write("	</select>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset name=\"character\">\r\n");
      out.write("	<legend>Character</legend>\r\n");
      out.write("	<table border=\"1\">\r\n");
      out.write("		<tbody>\r\n");
      out.write("			<tr><th>A</th><th>B</th><th>C</th><th>D</th><th>E</th><th>F</th><th>G</th><th>H</th><th>I</th><th>J</th></tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"A\" checked=\"checked\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"B\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"C\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"D\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"E\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"F\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"G\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"H\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"I\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"J\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr><th>K</th><th>L</th><th>M</th><th>N</th><th>O</th><th>P</th><th>Q</th><th>R</th><th>S</th><th>T</th></tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"K\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"L\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"M\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"N\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"O\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"P\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"Q\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"R\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"S\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"T\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<tr><th>U</th><th>V</th><th>W</th><th>X</th><th>Y</th><th>Z</th><th colspan=\"4\"></th></tr>\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"U\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"V\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"W\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"X\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"Y\"></td>\r\n");
      out.write("				<td><input name=\"ch\" type=\"radio\" value=\"Z\"></td>\r\n");
      out.write("				<td colspan=\"4\"></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		</tbody>\r\n");
      out.write("	</table>\r\n");
      out.write("</fieldset>\r\n");
      out.write("<fieldset name=\"exe\">\r\n");
      out.write("	<legend>Execution</legend>\r\n");
      out.write("	<input type=\"reset\"  value=\"Reset\">\r\n");
      out.write("	<input type=\"submit\" value=\"Create\">\r\n");
      out.write("</fieldset>\r\n");
      out.write("</form>\r\n");
      out.write("<div></div>\r\n");
      out.write("<ol id=\"ol\"></ol>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
