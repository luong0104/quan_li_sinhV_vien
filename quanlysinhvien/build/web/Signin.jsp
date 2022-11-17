<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>ĐĂNG KÝ</title>
      <link rel="stylesheet" href="signin.css">
   </head>
   <body>
      <div class="wrapper">
         <div class="title">
            Đăng ký
         </div>
         <form method="post" action="SignInServlet">
            
             <div class="field">
               <input type="text"  name="Gmail" required>
               <label>Gmail</label>
            </div>
            <div class="field">
               <input type="password" name="MatKhau" required>
               <label>Mật khẩu</label>
            </div>
             <div class="field">
               <input type="text" name="Thuoc" required>
               <label>Thuộc</label>
            </div>
             
            <div class="field">
                <input type="submit" value="Đăng ký">
            </div>
            <div class="signup-link">
                <a href="addSinhVien.jsp">Thông Tin Chi Tiết</a>
                <br><a href="home.jsp">Quay về trang chủ</a>
            </div>
         </form>
      </div>
                
   </body>
</html>
