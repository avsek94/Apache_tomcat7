/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.90
 * Generated at: 2018-07-11 06:48:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.catalina.util.RequestUtil;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write("  <title>404 Not found</title>\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    <!--\n");
      out.write("    BODY {font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;font-size:12px;}\n");
      out.write("    H1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;}\n");
      out.write("    PRE, TT {border: 1px dotted #525D76}\n");
      out.write("    A {color : black;}A.name {color : black;}\n");
      out.write("    -->\n");
      out.write("  </style>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("   <h1>404 Not found</h1>\n");
      out.write("   <p>\n");
      out.write("    The page you tried to access\n");
      out.write("    (");
      out.print(RequestUtil.filter((String) request.getAttribute(
            "javax.servlet.error.request_uri")));
      out.write(")\n");
      out.write("    does not exist.\n");
      out.write("   </p>\n");
      out.write("   <p>\n");
      out.write("    The Manager application has been re-structured for Tomcat 7 onwards and some\n");
      out.write("    of URLs have changed. All URLs used to access the Manager application should\n");
      out.write("    now start with one of the following options:\n");
      out.write("   </p>\n");
      out.write("    <ul>\n");
      out.write("      <li>");
      out.print(request.getContextPath());
      out.write("/html for the HTML GUI</li>\n");
      out.write("      <li>");
      out.print(request.getContextPath());
      out.write("/text for the text interface</li>\n");
      out.write("      <li>");
      out.print(request.getContextPath());
      out.write("/jmxproxy for the JMX proxy</li>\n");
      out.write("      <li>");
      out.print(request.getContextPath());
      out.write("/status for the status pages</li>\n");
      out.write("    </ul>\n");
      out.write("   <p>\n");
      out.write("    Note that the URL for the text interface has changed from\n");
      out.write("    &quot;");
      out.print(request.getContextPath());
      out.write("&quot; to\n");
      out.write("    &quot;");
      out.print(request.getContextPath());
      out.write("/text&quot;.\n");
      out.write("   </p>\n");
      out.write("   <p>\n");
      out.write("    You probably need to adjust the URL you are using to access the Manager\n");
      out.write("    application. However, there is always a chance you have found a bug in the\n");
      out.write("    Manager application. If you are sure you have found a bug, and that the bug\n");
      out.write("    has not already been reported, please report it to the Apache Tomcat team.\n");
      out.write("   </p>\n");
      out.write(" </body>\n");
      out.write("</html>\n");
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
