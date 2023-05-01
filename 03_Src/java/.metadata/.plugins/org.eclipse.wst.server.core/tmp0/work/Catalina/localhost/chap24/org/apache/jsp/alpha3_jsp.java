/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-05-01 06:43:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import util.Alpha;

public final class alpha3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("util.Alpha");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"Coche-Control\" content=\"no-store\">\r\n");
      out.write("<link rel=\"icon\" href=\"faviconAlpha.png\"> \r\n");
      out.write("<title>alpha3.jsp</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("main {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	border-width: 10px;\r\n");
      out.write("	border-style: solid;\r\n");
      out.write("	border-color: orange;\r\n");
      out.write("	height: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	font-family: monospace;\r\n");
      out.write("	font-size: 15pt;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("window.onload = function() {\r\n");
      out.write("	let spans = document.querySelectorAll('span');\r\n");
      out.write("	\r\n");
      out.write("	let width = parseFloat(getComputedStyle(spans[0]).width);\r\n");
      out.write("	let height = parseFloat(getComputedStyle(spans[0]).height);\r\n");
      out.write("	\r\n");
      out.write("	let main = document.querySelector('main');\r\n");
      out.write("	main.style.height = 20*height + \"px\";	// line\r\n");
      out.write("	main.style.width  = 40*width + \"px\";	// column\r\n");
      out.write("	\r\n");
      out.write("	for (let s of spans) {\r\n");
      out.write("	    let line = s.dataset.line;\r\n");
      out.write("	    let column = s.dataset.column;\r\n");
      out.write("\r\n");
      out.write("	    s.style.top = height*(line-1) + \"px\";\r\n");
      out.write("	    s.style.left = width*(column-1) + \"px\";\r\n");
      out.write("	    \r\n");
      out.write("	    setInterval(() => { // blink setting.\r\n");
      out.write("			if (s.style.display=='inline')\r\n");
      out.write("				s.style.display = 'none';\r\n");
      out.write("			else \r\n");
      out.write("				s.style.display = 'inline';\r\n");
      out.write("		}, Math.random()*200 + 10);\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<main>\r\n");

	for (int i=0; i<1000; i++) {
		var a = new Alpha();
		var span = "<span data-line='%d' data-column='%d' style='color:%s; background:%s;'>%c</span>";
		span = String.format(span, a.getLine(), a.getColumn(), a.getFg(), a.getBg(), a.getCh());
		out.println(span);
		
	}



      out.write("\r\n");
      out.write("</main>\r\n");
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