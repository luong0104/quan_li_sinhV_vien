<%-- 
    Document   : dishes.jsp
    Created on : Oct 16, 2022, 10:27:07 PM
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <!--File CSS-->
    <link rel="stylesheet" href="style2.css">
    <link rel="stylesheet" href="manager.css">
</head>
<body>
    <!--Header section start-->
    <header>
        <a href="#" class="logo"><img src="images/logic.png"> </a>
        <nav class="navbar">
            <a href="home.jsp">Trang chủ</a>
            <a href="about.jsp">Giới thiệu</a>
            <a class="active" href="dishes.jsp">Môn Học</a>
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
 <!-- dishes section starts  -->

<section class="dishes" id="dishes">

    <h3 class="sub-heading"> Thông Tin Môn Học </h3>

    <div class="container">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <h2><b>Quản Lý Môn Học</b></h2>
                    </div>
                    <div class="col-sm-6">
                        <a href="#addEmployeeModal"  class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Thêm Mới</span></a>
                        <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Xóa</span></a>						
                    </div>
                </div>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                        <th>
                            
                        </th>
                        <th>Mã Môn Học</th>
                        <th>Tên Môn Học</th>
                        <th>Số Tín Chỉ</th>
                       
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listP}" var="o">
                        <tr>
                            <td>
                                <span class="custom-checkbox">
                                    <input type="checkbox" id="checkbox1" name="options[]" value="1">
                                    <label for="checkbox1"></label>
                                </span>
                            </td>
                            <td>${o.id}</td>
                            <td>${o.name}</td>
                            
                            <td>${o.price} $</td>
                            <td>
                                <a href="loadProduct?pid=${o.id}"  class="edit" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                <a href="delete?pid=${o.id}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="clearfix">
                <div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
                <ul class="pagination">
                    <li class="page-item disabled"><a href="#">Previous</a></li>
                    <li class="page-item"><a href="#" class="page-link">1</a></li>
                    <li class="page-item"><a href="#" class="page-link">2</a></li>
                    <li class="page-item active"><a href="#" class="page-link">3</a></li>
                    <li class="page-item"><a href="#" class="page-link">4</a></li>
                    <li class="page-item"><a href="#" class="page-link">5</a></li>
                    <li class="page-item"><a href="#" class="page-link">Next</a></li>
                </ul>
            </div>
        </div>

    </div>
    <!-- Edit Modal HTML -->
    <div id="addEmployeeModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="add" method="post">
                    <div class="modal-header">						
                        <h4 class="modal-title">Thêm Môn Học</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    </div>
                    <div class="modal-body">					
                        <div class="form-group">
                            <label>Mã Môn Học</label>
                            <input name="MaMH" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Tên Môn Học</label>
                            <input name="tenMH" type="text" class="form-control" required>
                        </div>
                        <div class="form-group">
                            <label>Số Tín Chỉ</label>
                            <input name="SoTinChi" type="number" class="form-control" required>
                        </div>
                       
                            <select name="category" class="form-select" aria-label="Default select example">
                                <c:forEach items="${listCC}" var="o">
                                    <option value="${o.cid}">${o.cname}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-success" value="Add">
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<!-- dishes section ends -->
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
<script src="js/manager.js" type="text/javascript"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>