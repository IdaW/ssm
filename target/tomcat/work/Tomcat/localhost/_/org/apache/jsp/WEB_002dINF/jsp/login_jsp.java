/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-28 08:54:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>欢迎登录</title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Index</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/bootstrap/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/icon.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/my.css\"/>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery.easyui.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/common.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"loginWin\" class=\"easyui-window\" title=\"登录\"\r\n");
      out.write("     style=\"width: 350px; height: 188px; padding: 5px;\" data-options=\"iconCls:'icon-save',closable:false,\r\n");
      out.write("                collapsible:false,minimizable:false,maximizable:false\">\r\n");
      out.write("    <div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("        <div region=\"center\" border=\"false\"\r\n");
      out.write("             style=\"padding: 5px; background: #fff; border: 1px solid #ccc;\">\r\n");
      out.write("            <form id=\"ff\" action=\"/user/login\" method=\"post\">\r\n");
      out.write("                <div style=\"padding: 5px 0;\">\r\n");
      out.write("                    <label for=\"login\">帐号:</label> <input id=\"login\" type=\"text\" name=\"username\"\r\n");
      out.write("                                                          style=\"width: 260px;\" placeHolder=\"用户名\"></input>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div style=\"padding: 5px 0;\">\r\n");
      out.write("                    <label for=\"password\">密码:</label> <input id=\"password\" type=\"password\"\r\n");
      out.write("                                                             name=\"pass\" style=\"width: 260px;\"></input>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div region=\"south\" border=\"false\"\r\n");
      out.write("             style=\"text-align: right; padding: 5px 0;\">\r\n");
      out.write("            <a class=\"easyui-linkbutton\" iconCls=\"icon-ok\"\r\n");
      out.write("               href=\"javascript:void(0)\" onclick=\"login()\">登录</a> <a\r\n");
      out.write("                class=\"easyui-linkbutton\" iconCls=\"icon-cancel\"\r\n");
      out.write("                href=\" /register\">注册</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\"#login\").focus();\r\n");
      out.write("        $('#login').validatebox({\r\n");
      out.write("            required: true,\r\n");
      out.write("            validType: 'length[5,18]',\r\n");
      out.write("            validateOnBlur: true,\r\n");
      out.write("            invalidMessage: '用户名长度5-18位',\r\n");
      out.write("            missingMessage: \"用户名不能为空\"\r\n");
      out.write("        });\r\n");
      out.write("        $('#password').focus(function () {\r\n");
      out.write("            $('#showMsg').html('');\r\n");
      out.write("        });\r\n");
      out.write("        $('#password').validatebox({\r\n");
      out.write("            required: true,\r\n");
      out.write("            validType: 'length[5,18]',\r\n");
      out.write("            validateOnBlur: true,\r\n");
      out.write("            invalidMessage: '密码长度5-18位',\r\n");
      out.write("            missingMessage: \"密码不能为空\"\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function login() {\r\n");
      out.write("        $('#ff').submit();\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function clearData() {\r\n");
      out.write("        $('#login').val(\"\");\r\n");
      out.write("        $('#password').val(\"\");\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}