package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.java.demo.web.Student;
import java.util.List;
import com.java.demo.web.StudentManager;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h1>Danh sách sinh viên</h1>\n");
      out.write("        \n");
      out.write("        ");
 try{ 
      out.write("\n");
      out.write("    <table class=\"table table-dark table-striped\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Họ</th>\n");
      out.write("                <th>Khoa</th>\n");
      out.write("                <th>Lớp</th>\n");
      out.write("                <th>Chức năng</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                int i = 1;
                StudentManager sm = new StudentManager();
                List<Student> list = sm.getStudents();
                for (Student st : list) { 
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <th> ");
      out.print( i );
      out.write(" </th>    \n");
      out.write("                        <th> ");
 st.getTen(); 
      out.write(" </th>    \n");
      out.write("                        <th> ");
 st.getKhoa(); 
      out.write(" </th>    \n");
      out.write("                        <th> ");
 st.getLop(); i++;
      out.write(" </th>    \n");
      out.write("                        <th> <button>sửa</button> <button>xóa</button> </th>    \n");
      out.write("                    </tr>\n");
      out.write("                ");
 }
              }catch(Exception ex ){
            ex.printStackTrace();
        }
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <button >Thêm mới</button>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
