/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-05-03 05:30:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class rgb4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>rgb4.jsp</title>\r\n");
      out.write("<style type= \"text/css\">\r\n");
      out.write("html {\r\n");
      out.write("	border : 10px solid red;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("	border : 10px solid green;\r\n");
      out.write("}\r\n");
      out.write("div {\r\n");
      out.write("	border : 10px solid blue;\r\n");
      out.write("	width : 200px;\r\n");
      out.write("	height : 200px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(":focus {\r\n");
      out.write("	border: 10px dashed yellow; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("class RGB  {\r\n");
      out.write("	constructor() {\r\n");
      out.write("		this.r = 0;\r\n");
      out.write("		this.g = 0;\r\n");
      out.write("		this.b = 0;\r\n");
      out.write("	}\r\n");
      out.write("	updateRed(value) {\r\n");
      out.write("		this.r += value;\r\n");
      out.write("		red.textContent = this.r;\r\n");
      out.write("		this.update();\r\n");
      out.write("	}\r\n");
      out.write("	updateGreen(value) {\r\n");
      out.write("		this.g += value;\r\n");
      out.write("		green.textContent = this.g;\r\n");
      out.write("		this.update();\r\n");
      out.write("	}\r\n");
      out.write("	updateBlue(value) {\r\n");
      out.write("		this.b += value;\r\n");
      out.write("		blue.textContent = this.b;\r\n");
      out.write("		this.update();\r\n");
      out.write("	}\r\n");
      out.write("	update() {\r\n");
      out.write("		box.style.backgroundColor = `rgb(${this.r}, ${this.g}, ${this.b})`;\r\n");
      out.write("	}\r\n");
      out.write("	handleEvent(e) {\r\n");
      out.write("		switch (e.type) {\r\n");
      out.write("		case \"contextmenu\":\r\n");
      out.write("			this.contextmenu(e);\r\n");
      out.write("			break;\r\n");
      out.write("		case \"mousedown\":\r\n");
      out.write("			this.mousedown(e);\r\n");
      out.write("			break;\r\n");
      out.write("		case \"keydown\":\r\n");
      out.write("			this.keydown(e);\r\n");
      out.write("			break;\r\n");
      out.write("		default:\r\n");
      out.write("			break;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		switch (e.button) {\r\n");
      out.write("		case 0:\r\n");
      out.write("			e.shiftKey ? rgb.updateRed(-10) : rgb.updateRed(10);\r\n");
      out.write("			break;\r\n");
      out.write("		case 1:\r\n");
      out.write("			e.shiftKey ? rgb.updateGreen(-10) : rgb.updateGreen(10);\r\n");
      out.write("			break;\r\n");
      out.write("		case 2: \r\n");
      out.write("			e.shiftKey ? rgb.updateBlue(-10) : rgb.updateBlue(10);\r\n");
      out.write("			break;\r\n");
      out.write("		default:\r\n");
      out.write("			break;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		switch (e.code) {\r\n");
      out.write("		case \"KeyR\":\r\n");
      out.write("			e.key=='r' ? rgb.updateRed(-10) : rgb.updateRed(10);\r\n");
      out.write("			break;\r\n");
      out.write("		case \"KeyG\":\r\n");
      out.write("			e.key=='g' ? rgb.updateGreen(-10) : rgb.updateGreen(10);\r\n");
      out.write("			break;\r\n");
      out.write("		case \"KeyB\":\r\n");
      out.write("			e.key=='b' ? rgb.updateBlue(-10) : rgb.updateBlue(10);\r\n");
      out.write("			break;\r\n");
      out.write("\r\n");
      out.write("		default:\r\n");
      out.write("			break;\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("	contextmenu(e) {\r\n");
      out.write("		console.log(\"contextmenu..\");\r\n");
      out.write("		e.preventDefault();\r\n");
      out.write("	}\r\n");
      out.write("	mousedown(e) {\r\n");
      out.write("		console.log(\"mousedown..\");\r\n");
      out.write("		this.onmousedown(e.code);\r\n");
      out.write("			\r\n");
      out.write("	}\r\n");
      out.write("	keydown(e) {\r\n");
      out.write("		console.log(\"keydown..\");\r\n");
      out.write("		switch (e.code) {\r\n");
      out.write("		case \"KeyR\":\r\n");
      out.write("			e.key=='r' ? rgb.updateRed(-10) : rgb.updateRed(10);\r\n");
      out.write("			break;\r\n");
      out.write("		case \"KeyG\":\r\n");
      out.write("			e.key=='g' ? rgb.updateGreen(-10) : rgb.updateGreen(10);\r\n");
      out.write("			break;\r\n");
      out.write("		case \"KeyB\":\r\n");
      out.write("			e.key=='b' ? rgb.updateBlue(-10) : rgb.updateBlue(10);\r\n");
      out.write("			break;\r\n");
      out.write("\r\n");
      out.write("		default:\r\n");
      out.write("			break;\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("	 \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("window.onload = function(e) {\r\n");
      out.write("	\r\n");
      out.write("	let rgb = new RGB();\r\n");
      out.write("	\r\n");
      out.write("	box.addEventListener('contextmenu', rgb);\r\n");
      out.write("	box.addEventListener('mousedown', rgb);\r\n");
      out.write("	box.addEventListener('keydown', rgb);\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>RGB 실험</h1>\r\n");
      out.write("<table>\r\n");
      out.write("<tbody>\r\n");
      out.write("<tr><td>R</td><td id=\"red\">0</td></tr>\r\n");
      out.write("<tr><td>G</td><td id=\"green\">0</td></tr>\r\n");
      out.write("<tr><td>B</td><td id=\"blue\">0</td></tr>\r\n");
      out.write("</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("<div id=\"box\" tabindex=\"1\"></div>\r\n");
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