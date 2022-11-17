/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DBUtils {
    // taikhoan
    public static void insertTaiKhoan(Connection conn, TaiKhoan user) throws SQLException {
        String sql="insert into taikhoan(Gmail,MatKhau, Thuoc) values (?,?,?)";
        PreparedStatement pstm =conn.prepareStatement(sql);
        pstm.setString(1,user.getGmail());
        pstm.setString(2,user.getMatKhau());
        pstm.setString(3,user.getThuoc());
        pstm.executeUpdate();
    }
     public static TaiKhoan findTaiKhoan(Connection conn,String Gmail,String MatKhau,String Thuoc) throws SQLException{
        String sql="select*from taikhoan where Gmail=? and MatKhau=? and Thuoc=?";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setString(1,Gmail);
        pstm.setString(2,MatKhau);
         pstm.setString(3,Thuoc);
        ResultSet rs=pstm.executeQuery();
        
        if(rs.next()){
            TaiKhoan user=new TaiKhoan();
            user.setGmail(rs.getString("Gmail"));
            user.setMatKhau(rs.getString("MatKhau"));
            user.setThuoc(rs.getString("Thuoc"));
            return user;
        }
        return null;
    }
     //sinhvien
     public static void insertSinhVien(Connection conn,String MSSV,String HoTen,String GioiTinh,String NgaySinh, String Lop,String Gmail) throws SQLException {
       String sql="insert into sinhvien(MSSV, HoTen, GioiTinh,NgaySinh,Lop,Gmail) values (?,?,?,?,?,?)";
        PreparedStatement pstm =conn.prepareStatement(sql);
        pstm.setString(1,MSSV);
        pstm.setString(2,HoTen);
       
        pstm.setString(3,GioiTinh);
        pstm.setString(4,NgaySinh);
        pstm.setString(5,Lop);
        pstm.setString(6,Gmail);
        pstm.executeUpdate();
    }

    public static List<SinhVien> selectSinhVien(Connection conn,String Gmail) throws SQLException{
        String sql="select s.MSSV, s.HoTen,s.NgaySinh, s.GioTinh,s.Lop,s.Gmail from SinhVien s join taikhoan t where k.Gamil=?";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setString(1,Gmail);
        ResultSet rs=pstm.executeQuery();
        List<SinhVien> list=new ArrayList<SinhVien>();
        while(rs.next()){
            String MSSV=rs.getString("MSSV");
            String HoTen=rs.getString("HoTen");
            String NgaySinh=rs.getString("NgaySinh");
     
             String GioiTinh=rs.getString("GioiTinh");
            String Lop=rs.getString("Lop");
             Gmail=rs.getString("Gmail");
            SinhVien userCustomer=new SinhVien();
            userCustomer.setMSSV(MSSV);
            userCustomer.setHoTen(HoTen);
            userCustomer.setNgaySinh(NgaySinh);
            
            userCustomer.setGioiTinh(GioiTinh);
            userCustomer.setGmail(Gmail);
            list.add(userCustomer);
    }
        return list;
}
       public static List<SinhVien> selectSinhVien(Connection conn) throws SQLException{
        String sql= " select*from SinhVien ";
        PreparedStatement pstm=conn.prepareStatement(sql);
        
        ResultSet rs=pstm.executeQuery();
        List<SinhVien> list=new ArrayList<SinhVien>();
        while(rs.next()){
            String MSSV=rs.getString("MSSV");
            String HoTen=rs.getString("HoTen");
            String NgaySinh=rs.getString("NgaySinh");
     
             String GioiTinh=rs.getString("GioiTinh");
            String Lop=rs.getString("Lop");
             String Gmail=rs.getString("Gmail");
            SinhVien userCustomer=new SinhVien();
            userCustomer.setMSSV(MSSV);
            userCustomer.setHoTen(HoTen);
            userCustomer.setNgaySinh(NgaySinh);
            userCustomer.setLop(Lop);
            userCustomer.setGioiTinh(GioiTinh);
            userCustomer.setGmail(Gmail);
            list.add(userCustomer);
    }
        return list;
}

    public static SinhVien getSinhVienXem(Connection conn,String Gmail) throws SQLException{
    String sql="select*from sinhvien where Gmail=?";
    PreparedStatement pstm=conn.prepareStatement(sql);
    pstm.setString(1, Gmail);
    ResultSet rs=pstm.executeQuery();
    SinhVien usp=new SinhVien();
    while(rs.next()){
        usp.setMSSV(rs.getString("MSSV"));
        usp.setHoTen(rs.getString("HoTen"));
        
        usp.setNgaySinh(rs.getString("NgaySinh"));
        usp.setGioiTinh(rs.getString("Gioitinh"));
         usp.setLop(rs.getString("Lop"));
        usp.setGmail(rs.getString("Gmail"));
    }
    return usp;
}
    public static void updateSinhVien(Connection conn,String MSSV,String HoTen,String HinhAnh,String NgaySinh,String GioiTinh, String Lop, String Gmail) throws SQLException{
    String sql="update sinhvien set MSSV=?, HoTen=?, NgaySinh=? , GioiTinh=? ,Lop=? where Gmail=? ";
    PreparedStatement pstm=conn.prepareStatement(sql);
    pstm.setString(1, MSSV);
    pstm.setString(2,HoTen );

    pstm.setString(3,NgaySinh);
    pstm.setString(4,GioiTinh );
    pstm.setString(5,Lop);
    pstm.setString(6,Gmail);
    pstm.executeUpdate();
}
    public static void deleteSinhVien(Connection conn, String MSSV) throws SQLException{
        String sql = "delete from sinhvien where MSSV = ?";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setString(1,MSSV);
        pstm.executeUpdate();
}
    //monhoc
     public static void insertMonHoc(Connection conn,String MaMH,String TenMH,int SoTinChi) throws SQLException {
       String sql="insert into monhoc(MaMH, TenMH,SoTinChi) values (?,?,?)";
        PreparedStatement pstm =conn.prepareStatement(sql);
        pstm.setString(1,MaMH);
        pstm.setString(2,TenMH);
        pstm.setInt(3,SoTinChi);
        pstm.executeUpdate();
    }

    public static List<MonHoc> selectMonHoc(Connection conn) throws SQLException {
        String sql = "select MaMH, TenMH, SoTinChi from monhoc";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<MonHoc> list = new ArrayList<MonHoc>();
        while (rs.next()) {
            String MaMH = rs.getString("MaMH");
            String TenMH = rs.getString("TenMH");
            int SoTinChi = rs.getInt("SoTinChi");
           MonHoc menu = new MonHoc();
            menu.setMaMH(MaMH);
            menu.setTenMH(TenMH);
            menu.setSoTinChi(SoTinChi);
            list.add(menu);
        }
        return list;
    }
    public static MonHoc getMonHoc(Connection conn, String MaMH) throws SQLException {
        String sql = "select*from monhoc where MaMH=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaMH);
        ResultSet rs = pstm.executeQuery();
        MonHoc usp = new MonHoc();
        while (rs.next()) {
            usp.setMaMH(rs.getString("MaMH"));
            usp.setTenMH(rs.getString("TenMH"));
            usp.setSoTinChi(rs.getInt("SoTinhChi"));
           
        }
        return usp;
    }
    public static void updateMOnHoc(Connection conn,String MaMH,String TenMH, int SoTinChi) throws SQLException {
        String sql = "update monhoc set TenMH=?,  SoTinChi=? where MaMH=? ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, TenMH);
        pstm.setInt(2, SoTinChi);
        pstm.setString(3, MaMH);
        pstm.executeUpdate();
    }
        public static void deleteMonHoc(Connection conn, String MaMH) throws SQLException{
        String sql = "delete from monhoc where MaMH = ?";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setString(1,MaMH);
        pstm.executeUpdate();
}
        //thoikhoabieu
        public static void insertThoiKhoaBieu(Connection conn,String MaMH,String DotHoc,String Lop, String TuanBatDau, String TuanKetThuc, String Thu) throws SQLException {
       String sql="insert into monhoc(MaMH, DotHoc,Lop, TuanBatDau, TuanKetThuc, Thu) values (?,?,?,?,?,?)";
        PreparedStatement pstm =conn.prepareStatement(sql);
        pstm.setString(1,MaMH);
        pstm.setString(2,DotHoc);
        pstm.setString(3,Lop);
        pstm.setString(4,TuanBatDau);
        pstm.setString(5,TuanKetThuc);
        pstm.setString(6,Thu);
        
        pstm.executeUpdate();
    }

    public static List<ThoiKhoaBieu> selectThoiKhoabieu(Connection conn) throws SQLException {
        String sql = "select MaMH, DotHoc, Lop, TuanBatDau, TuanKetThuc,Thu from thoikhoabieu";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        List<ThoiKhoaBieu> list = new ArrayList<ThoiKhoaBieu>();
        while (rs.next()) {
            String MaMH = rs.getString("MaMH");
            String DotHoc = rs.getString("DotHoc");
            String Lop = rs.getString("Lop");
            String TuanBatDau = rs.getString("TuanBatDau");
            String TuanKetThuc= rs.getString("TuanKetThuc");
            String Thu = rs.getString("Thu");
           ThoiKhoaBieu menu = new ThoiKhoaBieu();
            menu.setMaMH(MaMH);
            menu.setDotHoc(DotHoc);
             menu.setLop(Lop);
            menu.setTuanBatDau(TuanBatDau);
             menu.setTuanKetThuc(TuanKetThuc);
            menu.setThu(Thu);
            
            list.add(menu);
        }
        return list;
    }
    public static ThoiKhoaBieu getThoiKhoaBieu(Connection conn, int Stt) throws SQLException {
        String sql = "select*from thoikhoabieu where Stt=?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, Stt);
        ResultSet rs = pstm.executeQuery();
         ThoiKhoaBieu usp = new ThoiKhoaBieu();
        while (rs.next()) {
            usp.setMaMH(rs.getString("MaMH"));
            usp.setDotHoc(rs.getString("DotHoc"));
             usp.setLop(rs.getString("Lop"));
            usp.setTuanBatDau(rs.getString("TuanBatDau"));
             usp.setTuanKetThuc(rs.getString("TuanKetThuc"));
            usp.setThu(rs.getString("Thu"));
             usp.setStt(rs.getInt("Thu"));
        }
        return usp;
    }
    public static void updateThoiKhoaBieu(Connection conn,String MaMH,String DotHoc, String Lop, String TuanBatDau, String TuanKetThuc, String Thu, int Stt) throws SQLException {
        String sql = "update thoikhoabieu set MaMH=?,DotHoc=?, Lop=?, TuanBatDau=?, TuanKetThuc, Thu=? where Stt=? ";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, MaMH);
        pstm.setString(2, DotHoc);
        pstm.setString(3, Lop);
        pstm.setString(4, TuanBatDau);
        pstm.setString(5,TuanKetThuc);
        pstm.setString(6, Thu);
        pstm.executeUpdate();
    }
        public static void deleteThoiKhoaBieu(Connection conn, int Stt) throws SQLException{
        String sql = "delete from thoikhoabieu where Stt = ?";
        PreparedStatement pstm=conn.prepareStatement(sql);
        pstm.setInt(1,Stt);
        pstm.executeUpdate();
}

    static void insertSinhVien(Connection conn, SinhVien usr) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   