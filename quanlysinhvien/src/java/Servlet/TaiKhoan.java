/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

/**
 *
 * @author havan
 */
public class TaiKhoan {
    private String Gmail, MatKhau, Thuoc;

    public TaiKhoan() {
    }

    public TaiKhoan(String Gmail, String MatKhau, String Thuoc) {
        this.Gmail = Gmail;
        this.MatKhau = MatKhau;
        this.Thuoc = Thuoc;
    }

    TaiKhoan(TaiKhoan u) {
        this.Gmail=u.Gmail;
        this.MatKhau=u.MatKhau;
        this.Thuoc=u.Thuoc;
    }

   
    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getThuoc() {
        return Thuoc;
    }

    public void setThuoc(String Thuoc) {
        this.Thuoc = Thuoc;
    }
    
}
