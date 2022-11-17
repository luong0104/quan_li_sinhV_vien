<%-- 
    Document   : about.jsp
    Created on : Oct 16, 2022, 10:25:33 PM
    Author     : havan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thiết kế trang Web </title>
    <link
      rel="stylesheet"
      href="https://unpkg.com/swiper/swiper-bundle.min.css"
    />
    <!--font-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <!--File CSS-->
    <link rel="stylesheet" href="style2.css">
</head>
<body>
    <!--Header section start-->
    <header>
        <a href="#" class="logo"><img src="images/logic.png"> </a>
        <nav class="navbar">
            <a href="home.jsp">Trang chủ</a>
            <a class="active" href="about.jsp">Giới thiệu</a>
            <a href="dishes.jsp">Giảng Viên</a>
            <a href="menu.jsp">Sinh Viên</a>
            <a href="review.jsp">Điểm</a>
            <a href="schedule.jsp">Thời Khóa Biểu</a>
            <a href="index.jsp">Đăng xuất</a>
        </nav>
        <div class="icons">
            <i class="fas fa-search" id="search-icon"></i>
            
        </div>
    </header>
    <!--Header section end-->
    <!-- search form  -->

 <form action="" id="search-form">
    <input type="search" placeholder="Tìm kiếm..." name="" id="search-box">
    <label for="search-box" class="fas fa-search"></label>
    <i class="fas fa-times" id="close"></i>
 </form>
 <!-- about section starts  -->

<section class="about" id="about">

    <h3 class="sub-heading"></h3>
    <h1 class="heading"> BỘ TÀI NGUYÊN VÀ MÔI TRƯỜNG

        TRƯỜNG ĐẠI HỌC TÀI NGUYÊN VÀ MÔI TRƯỜNG TP. HCM </h1>

    <div class="row">

        
        <div class="content">
            <h3>Khoa Hệ Thống Thông tin Viễn Thám</h3>
            <h4 style="font-size: 18px">Khoa Công nghệ thông tin đào tạo 2 ngành: Kỹ sư Công nghệ thông tin và Kỹ sư Hệ thống thông tin</h4>
            <h5 style="font-size:17px">1. Kỹ sư Công nghệ thông tin có 2 chuyên ngành:</h5>
            <p>1.1. Tin học tài nguyên và Môi trường<br/>  1.2. Công nghệ phần mềm</p>
            <h5 style="font-size:17px">2. Kỹ sư Hệ thống thông tin có 2 chuyên ngành:</h5>
            <p>2.1. Hệ thống thông tin Tài nguyên và Môi trường <br/>2.2. Thương mại điện tử</p>
            <h5 style="font-size:17px">3. Kỹ sư công nghệ thông tin(4.5 năm):</h5>
            <h6 style="font-size:16px">Đào tạo ngành kỹ sư công nghệ thông tin đạt trình độ khu vực và quốc tế:</h6>
            <p>     - Nắm vững các kiên thức cơ bản và chuyên sâu về ngành công nghệ thông tin, có kiến thức  về ngành Tài Nguyên Môi Trường</p>
            <p>     - Có Khả năng giảng dạy ở các trường học,có khả năng nghiên cưu,làm việc ở các trung tâm và viện nghiên cứu,các công ty cũng như các cơ quan quản lý, sản xuất , kinh doanh thuộc lĩnh vực CNTT và ứng dụng CNTT để giải quyết vấn đề về Tài Nguyên Môi Trường</p>
            <p>     -Có kỹ năng mềm, có khả năng độc lập nghiên cứu,tự bồi dưỡng và tiếp tục học lên các trình độ cao hơn</p>
            <a href="#" class="btn">Tìm hiểu thêm</a>
        </div>

    </div>

</section>

<!-- about section ends -->
<!-- footer section starts  -->

<section class="footer">
    <div class="box-container">
        <div class="box">
            <a href="#"><img src="images/hinh1.png"></a>
        </div>
        <div class="box">
            <h3>Tham khảo</h3>
            <a href="#">Trang chủ DTM</a>
            <a href="#">Công tác tuyển sinh</a>
            <a href="#">Đơn vị hợp tác</a>
            
        </div>

        <div class="box">
            <h3>Liên hệ</h3>
            <a href="#">+84388159145</a>
            <a href="#">+123456789</a>
            <a href="#">hcmunre@gmail.com</a>
            <a href="#">hcmunre.com.vn</a>
        </div>

        <div class="box">
            <h3>Theo dõi</h3>
            <a href="#">facebook</a>
            <a href="#">twitter</a>
            <a href="#">instagram</a>
            <a href="#">Zalo</a>
        </div>

    </div>

    <div class="credit"> Đổi mới, nâng tầm cao mới-Năng động hội nhập toàn cầu <span></span> </div>

</section>


<!-- footer section ends -->

<script src="script.js"></script>
</body>
</html>
