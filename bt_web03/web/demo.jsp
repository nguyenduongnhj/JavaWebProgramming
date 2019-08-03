<%@page import="java.util.ArrayList"%>
<%@page import="com.java.demo.web.Student"%>
<%@page import="java.util.List"%>
<%@page import="com.java.demo.web.StudentManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
        <h1>Danh sách sinh viên</h1>
        
        <% try{ %>
    <table class="table table-dark table-striped">
            <tr>
                <th>ID</th>
                <th>Họ</th>
                <th>Khoa</th>
                <th>Lớp</th>
                <th>Chức năng</th>
            </tr>
            <%
                int i = 1;
                StudentManager sm = new StudentManager();
                List<Student> list = sm.getStudents();
                for (Student st : list) { %>
                    <tr>
                        <th> <%= i %> </th>    
                        <th> <% st.getTen(); %> </th>    
                        <th> <% st.getKhoa(); %> </th>    
                        <th> <% st.getLop(); i++;%> </th>    
                        <th> <button>sửa</button> <button>xóa</button> </th>    
                    </tr>
                <% }
              }catch(Exception ex ){
            ex.printStackTrace();
        }%>
    </table>
    <button >Thêm mới</button>
        
    </body>
</html>
