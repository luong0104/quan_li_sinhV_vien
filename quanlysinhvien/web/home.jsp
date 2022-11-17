<%-- 
    Document   : home
    Created on : Oct 16, 2022, 9:09:32 PM
    Author     : havan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
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
            <a class="active" href="home.jsp">Trang chủ</a>
            <a href="about.jsp">Giới thiệu</a>
            <a href="dishes.jsp">Môn Học</a>
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
 <!--Home section starts-->
 <section class="home" id="home">
    <div class="swiper home-slider">
        <div class="swiper-wrapper wrapper">
            <div class="swiper-slide slide">
                 <div class="content">
                     <span>Trường đại học Tài Nguyên Môi Trường Thành Phố Hồ Chí Minh</span>
                     <p>Cùng nhau hội nhập, cùng nhau phát triển</p>
                     <a href="#" class="btn">Tham gia ngay</a>
                 </div>
                 <div class="image">
                     <img src="images/h1.jpg" alt="" width="500" height="500">
                 </div>
            </div>
            <div class="swiper-slide slide">
               <div class="content">
                <span>Trường đại học Tài Nguyên Môi Trường Thành Phố Hồ Chí Minh</span>
                <p>Cùng nhau hội nhập, cùng nhau phát triển</p>
                <a href="#" class="btn">Tham gia ngay</a>
               </div>
               <div class="image">
                   <img src="images/h2.jpg" alt="" width="500" height="500">
               </div>
          </div>
          <div class="swiper-slide slide">
           <div class="content">
            <span>Trường đại học Tài Nguyên Môi Trường Thành Phố Hồ Chí Minh</span>
            <p>Cùng nhau hội nhập, cùng nhau phát triển</p>
            <a href="#" class="btn">Tham gia ngay</a>
           </div>
           <div class="image">
               <img src="images/h3.jpg" alt="" width="500" height="500">
           </div>
      </div>
        </div>
        <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
        <div class="swiper-pagination"></div>
    </div>
   </section>
   






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
<!-- loader part  -->
<div class="loader-container">
    <img src="images/Loader4.gif" alt="">
</div>
<!-- scroll top button  -->
<a href="#home" class="fas fa-angle-up" id="scroll-top"></a>
 <!--Home section ends-->
 <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>
    <!--File Js-->
    <script src="script.js"></script>
</body>
</html>


