/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

/**
 *
 * @author havan
 */
public class ThoiKhoaBieu {
   private  String MaMH, DotHoc, Lop, TuanBatDau, TuanKetThuc, Thu;
    private int Stt;

    public ThoiKhoaBieu() {
    }

    public ThoiKhoaBieu(String MaMH, String DotHoc, String Lop, String TuanBatDau, String TuanKetThuc, String Thu,int Stt) {
        this.MaMH = MaMH;
        this.DotHoc = DotHoc;
        this.Lop = Lop;
        this.TuanBatDau = TuanBatDau;
        this.TuanKetThuc = TuanKetThuc;
        this.Thu = Thu;
        this.Stt = Stt;
    }

    public int getStt() {
        return Stt;
    }

    public void setStt(int Stt) {
        this.Stt = Stt;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getDotHoc() {
        return DotHoc;
    }

    public void setDotHoc(String DotHoc) {
        this.DotHoc = DotHoc;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }

    public String getTuanBatDau() {
        return TuanBatDau;
    }

    public void setTuanBatDau(String TuanBatDau) {
        this.TuanBatDau = TuanBatDau;
    }

    public String getTuanKetThuc() {
        return TuanKetThuc;
    }

    public void setTuanKetThuc(String TuanKetThuc) {
        this.TuanKetThuc = TuanKetThuc;
    }

    public String getThu() {
        return Thu;
    }

    public void setThu(String Thu) {
        this.Thu = Thu;
    }
    
}
