<%-- 
    Document   : addSinhvien
    Created on : Oct 16, 2022, 10:35:20 PM
    Author     : havan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Thông Tin Cá Nhân</title>
        <link rel="stylesheet" href="signin.css">
    </head>
    <body>
        <div class="wrapper">
            <div class="title">
                Thông Tin Cá Nhân
            </div>
            <form method="get" action="AddSinhVienServlet" enctype="multipart/form-data">

                <div class="field">
                    <input type="text"  name="MSSV" >
                    <label>MSSV</label>
                </div>
                <div class="field">
                    <input type="text" name="HoTen">
                    <label>HỌ TÊN</label>
                </div>
                <div class="field">
                    <input type="text" name="NgaySinh">
                    <label>NgaySinh</label>
                </div><!-- comment -->
                <div class="field">
                    <input type="text" name="GioiTinh">
                    <label>gioi Tinh</label>
                </div>
                <div class="field">
                    <input type="text" name="Lop">
                    <label>Lop</label>
                </div><!-- comment -->
                
                <div class="field">
                    <input type="text" name="Gmail" value="${Gmail}">
                    <label>Gmail</label>
                </div>
                
              
                <div class="field">
                    <input type="submit"  value="Hoàn tất">
                </div>
                
            </form>
        </div>
    <center>
        <div>
            <h4>Thông tin đăng ký</h4>
            <h5>${Gmail}</h5>
            <h5>${HoTen}</h5>
        </div>
    </center>
</body>
</html>

