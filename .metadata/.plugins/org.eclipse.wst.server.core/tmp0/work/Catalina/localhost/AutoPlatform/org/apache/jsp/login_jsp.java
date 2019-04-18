package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
 String rootPath=request.getContextPath(); 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"keyword\" content=\"\">\r\n");
      out.write("<title>登录</title>\r\n");
      out.write("<link href=\"");
      out.print(rootPath);
      out.write("/theme/gray/css/base.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"");
      out.print(rootPath);
      out.write("/theme/gray/css/main.css\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- extjs库 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(rootPath);
      out.write("/res/extjs/ext-all.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(rootPath);
      out.write("/res/extjs/ext-lang-zh_CN.js\"></script>\r\n");
      out.write("<!-- jQuery库 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(rootPath);
      out.write("/res/jquery/jquery-1.6.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(rootPath);
      out.write("/res/jquery/plugins/jquery.tmpl.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar errMsg=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errMsg}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";\r\n");
      out.write("\tif(errMsg!=\"\"){\r\n");
      out.write("\t\talert(errMsg);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction checkForm(){\r\n");
      out.write("\t\tvar username=$(\"#userName\").val();\r\n");
      out.write("\t\tvar password=$(\"#passwd\").val();\r\n");
      out.write("\t\tif(username==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入用户名\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(password==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入密码\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//验证码逻辑\r\n");
      out.write("\tfunction reloadVerifyCode() {\r\n");
      out.write("\t\tvar imgSrc = $(\"#verifyCodeImage\");\r\n");
      out.write("\t\tvar src = imgSrc.attr(\"src\");\r\n");
      out.write("\t\timgSrc.attr(\"src\", chgUrl(src));\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction chgUrl(url) {\r\n");
      out.write("\t\tvar timestamp = (new Date()).valueOf();\r\n");
      out.write("\t\tnewurl = url + \"?timestamp=\" + timestamp;\r\n");
      out.write("\t\treturn newurl;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"lg-wrap\">\r\n");
      out.write("\t<div class=\"wrapper2\">\r\n");
      out.write("\t\t<!-- 使用shiro登录验证：loginShiro ，不使用为login-->\r\n");
      out.write("\t\t<form class=\"login-cnt\" action=\"");
      out.print(rootPath);
      out.write("/loginController/login\" method=\"POST\">\r\n");
      out.write("\t\t\t<ul class=\"login\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<label class=\"login-tip\">用户名</label> \r\n");
      out.write("\t\t\t\t\t<span class=\"login-ipt user-ico\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"userName\" placeholder=\"请输入用户名\" />\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<label class=\"login-tip\">密&nbsp;&nbsp;&nbsp;码</label> \r\n");
      out.write("\t\t\t\t\t<span class=\"login-ipt pwd-ico\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\tname=\"password\" id=\"passwd\" placeholder=\"请输入密码\" />\r\n");
      out.write("\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<label class=\"login-tip\">验证码</label> \r\n");
      out.write("\t\t\t\t\t<span class=\"login-ipt code-ipt\"> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"verifyCode\" id=\"verifyCode\" />\r\n");
      out.write("\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t<img id=\"verifyCodeImage\" class=\"verify-code\" onclick=\"reloadVerifyCode()\" src=\"");
      out.print(rootPath);
      out.write("/loginController/getVerifyCode\" /> \r\n");
      out.write("\t\t\t\t\t<em class=\"ver-turn\" onclick=\"reloadVerifyCode()\" title=\"换一张\">换一张</em>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"login-action\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"login-btn\"\r\n");
      out.write("\t\t\t\t\tid=\"submitbutton\" onclick=\"return checkForm()\" value=\"登录\" />\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
