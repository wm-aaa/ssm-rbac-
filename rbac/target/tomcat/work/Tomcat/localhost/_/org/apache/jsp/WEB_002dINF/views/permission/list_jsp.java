/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-06-21 03:44:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.permission;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/common/menu.jsp", Long.valueOf(1592575707331L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1592619111278L));
    _jspx_dependants.put("/WEB-INF/views/common/navbar.jsp", Long.valueOf(1592622488084L));
    _jspx_dependants.put("/WEB-INF/views/common/page.jsp", Long.valueOf(1585220956523L));
    _jspx_dependants.put("/WEB-INF/views/common/link.jsp", Long.valueOf(1558886890000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>权限管理</title>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/bootstrap/css/bootstrap.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/Ionicons/css/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/adminlte/css/AdminLTE.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/adminlte/css/skins/_all-skins.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/js/adminlte/css/fonts.googleapis.com.css\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"/js/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/js/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"/js/adminlte/js/adminlte.min.js\"></script>\r\n");
      out.write("<script src=\"/js/plugins/twbsPagination/jquery.twbsPagination.min.js\"></script>\r\n");
      out.write("<script src=\"/js/system/commonAll.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("<div class=\"wrapper\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<header class=\"main-header\">\r\n");
      out.write("    <a href=\"../../index2.html\" class=\"logo\">\r\n");
      out.write("        <span class=\"logo-mini\">CRM</span>\r\n");
      out.write("        <span class=\"logo-lg\"><b>客户管理系统</b></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <!-- Header Navbar: style can be found in header.less -->\r\n");
      out.write("    <nav class=\"navbar navbar-static-top\">\r\n");
      out.write("        <!-- Sidebar toggle button-->\r\n");
      out.write("        <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"push-menu\" role=\"button\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-custom-menu\">\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"dropdown user user-menu\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <img src=\"/js/adminlte/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\r\n");
      out.write("                        <span class=\"hidden-xs\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EMPLOYEE_IN_SESSION.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close\" style=\"min-width: 100px;\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <i class=\"fa fa-cog\" ></i>\r\n");
      out.write("                                个人设置\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"profile.html\">\r\n");
      out.write("                                <i class=\" fa fa-user\"></i>\r\n");
      out.write("                                个人信息\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"/logout\">\r\n");
      out.write("                                <i class=\"fa fa-power-off\"></i>\r\n");
      out.write("                                注销\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("    <!--菜单回显-->\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<aside class=\"main-sidebar\">\r\n");
      out.write("    <section class=\"sidebar\">\r\n");
      out.write("        <ul class=\"sidebar-menu\" data-widget=\"tree\">\r\n");
      out.write("            <li class=\"treeview\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-dashboard\"></i> <span>系统管理</span>\r\n");
      out.write("                    <span class=\"pull-right-container\">\r\n");
      out.write("                        <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("                    </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"treeview-menu\">\r\n");
      out.write("                    <li name=\"department\"><a href=\"/department/list\"><i class=\"fa fa-circle-o\"></i> 部门管理</a></li>\r\n");
      out.write("                    <li name=\"employee\"><a href=\"/employee/list\"><i class=\"fa fa-circle-o\"></i> 员工管理</a></li>\r\n");
      out.write("                    <li name=\"permission\"><a href=\"/permission/list\"><i class=\"fa fa-circle-o\"></i> 权限管理</a></li>\r\n");
      out.write("                    <li name=\"role\"><a href=\"/role/list\"><i class=\"fa fa-circle-o\"></i> 角色管理</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"treeview\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-files-o\"></i>\r\n");
      out.write("                    <span>数据管理</span>\r\n");
      out.write("                    <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"treeview-menu\">\r\n");
      out.write("                    <li name=\"systemDictionary\"><a href=\"/systemDictionary/list.do\"><i class=\"fa fa-circle-o\"></i> 字典目录</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li name=\"systemDictionaryItem\"><a href=\"/systemDictionaryItem/list.do\"><i\r\n");
      out.write("                            class=\"fa fa-circle-o\"></i> 字典明细</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"treeview\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-pie-chart\"></i>\r\n");
      out.write("                    <span>客户管理</span>\r\n");
      out.write("                    <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"treeview-menu\">\r\n");
      out.write("                    <li name=\"customer\"><a href=\"/customer/list.do\"><i class=\"fa fa-circle-o\"></i> 客户列表</a></li>\r\n");
      out.write("                    <li name=\"customer_potential\"><a href=\"/customer/potentialList.do\"><i class=\"fa fa-circle-o\"></i>\r\n");
      out.write("                        潜在客户</a></li>\r\n");
      out.write("                    <li name=\"customer_pool\"><a href=\"/customer/poolList.do\"><i class=\"fa fa-circle-o\"></i> 客户池</a></li>\r\n");
      out.write("                    <li name=\"customer_fail\"><a href=\"/customer/failList.do\"><i class=\"fa fa-circle-o\"></i> 失败客户</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> 正式客户</a></li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i> 流失客户</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"treeview\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-edit\"></i>\r\n");
      out.write("                    <span>客户历史</span>\r\n");
      out.write("                    <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"treeview-menu\">\r\n");
      out.write("\r\n");
      out.write("                    <li name=\"customerTraceHistory\"><a href=\"/customerTraceHistory/list.do\"><i\r\n");
      out.write("                            class=\"fa fa-circle-o\"></i> 跟进历史</a></li>\r\n");
      out.write("                    <li name=\"customerTransfer\"><a href=\"/customerTransfer/list.do\"><i class=\"fa fa-circle-o\"></i> 移交历史</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"treeview\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-laptop\"></i>\r\n");
      out.write("                    <span>报表统计</span>\r\n");
      out.write("                    <span class=\"pull-right-container\">\r\n");
      out.write("              <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("            </span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"treeview-menu\">\r\n");
      out.write("                    <li name=\"customerReport\"><a href=\"/customerReport/list.do\"><i class=\"fa fa-circle-o\"></i>潜在客户报表</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("        </ul>\r\n");
      out.write("    </section>\r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        //菜单初始\r\n");
      out.write("        $('.sidebar-menu').tree();\r\n");
      out.write("        //菜单激活\r\n");
      out.write("        var cuLi = $(\".treeview-menu li[name='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentMenu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("']\");\r\n");
      out.write("        cuLi.addClass(\"active\");\r\n");
      out.write("        cuLi.closest(\".treeview\").addClass(\"active\")\r\n");
      out.write("    })\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("    <div class=\"content-wrapper\">\r\n");
      out.write("        <section class=\"content-header\">\r\n");
      out.write("            <h1>权限管理</h1>\r\n");
      out.write("        </section>\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <div class=\"box\">\r\n");
      out.write("                <!--高级查询--->\r\n");
      out.write("                <form class=\"form-inline\" id=\"searchForm\" action=\"/permission/list\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"currentPage\" id=\"currentPage\" value=\"1\">\r\n");
      out.write("                    <a href=\"/permission/reload\" class=\"btn btn-success btn-input\" style=\"margin: 10px\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-refresh\"></span> 重新加载\r\n");
      out.write("                    </a>\r\n");
      out.write("                </form>\r\n");
      out.write("                <!--编写内容-->\r\n");
      out.write("                <div class=\"box-body table-responsive no-padding \">\r\n");
      out.write("                    <table class=\"table table-hover table-bordered\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>编号</th>\r\n");
      out.write("                            <th>权限名称</th>\r\n");
      out.write("                            <th>权限表达式</th>\r\n");
      out.write("                            <th>操作</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                    <!--分页-->\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<div style=\"text-align: center;\">\r\n");
      out.write("    <ul id=\"pagination\" class=\"pagination\"></ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    //分页\r\n");
      out.write("    $(function(){\r\n");
      out.write("        $(\"#pagination\").twbsPagination({\r\n");
      out.write("            totalPages: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageResult.totalPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" || 1,\r\n");
      out.write("            startPage: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageResult.currentPage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" || 1,\r\n");
      out.write("            visiblePages:5,\r\n");
      out.write("            first:\"首页\",\r\n");
      out.write("            prev:\"上页\",\r\n");
      out.write("            next:\"下页\",\r\n");
      out.write("            last:\"尾页\",\r\n");
      out.write("            initiateStartPageClick:false,\r\n");
      out.write("            onPageClick:function(event,page){\r\n");
      out.write("            $(\"#currentPage\").val(page);\r\n");
      out.write("            $(\"#searchForm\").submit();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<footer class=\"main-footer\">\r\n");
      out.write("    <div class=\"pull-right hidden-xs\">\r\n");
      out.write("        <b>Version</b> 1.0.0\r\n");
      out.write("    </div>\r\n");
      out.write("    <strong>课程设计2020-6-20 </strong>\r\n");
      out.write("    reserved.\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/views/permission/list.jsp(16,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("currentMenu");
    // /WEB-INF/views/permission/list.jsp(16,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/permission/list.jsp(16,4) 'permission'",_el_expressionfactory.createValueExpression("permission",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/permission/list.jsp(40,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/permission/list.jsp(40,24) '${pageResult.data}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageResult.data}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/permission/list.jsp(40,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("entity");
    // /WEB-INF/views/permission/list.jsp(40,24) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("vs");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <tr>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vs.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entity.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entity.expression}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                <td>\r\n");
          out.write("                                    <a href=\"/permission/delete?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entity.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"btn btn-danger btn-xs btn-delete\">\r\n");
          out.write("                                        <span class=\"glyphicon glyphicon-trash\"></span> 删除\r\n");
          out.write("                                    </a>\r\n");
          out.write("                                </td>\r\n");
          out.write("                            </tr>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
