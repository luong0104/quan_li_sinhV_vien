/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

/**
 *
 * @author havan
 */
public class Diem {
    private String MSSV, MaMH, DotHoc, Lop;
    private  double diem;
    private int Stt;

    public Diem() {
    }

    public Diem(String MSSV, String MaMH, String DotHoc, String Lop,int Stt,double diem) {
        this.MSSV = MSSV;
        this.MaMH = MaMH;
        this.DotHoc = DotHoc;
        this.Lop = Lop;
        this.Stt=Stt;
        this.diem = diem;
    }

    public String getMSSV() {
        return MSSV;
    }

    public String getMaMH() {
        return MaMH;
    }

    public String getDotHoc() {
        return DotHoc;
    }

    public String getLop() {
        return Lop;
    }
    public double getDiem() {
        return diem;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public void setDotHoc(String DotHoc) {
        this.DotHoc = DotHoc;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getStt() {
        return Stt;
    }

    public void setStt(int Stt) {
        this.Stt = Stt;
    }
    
}
