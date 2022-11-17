/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

/**
 *
 * @author havan
 */
public class MonHoc {
    private String MaMH,TenMH;
    private int SoTinChi;

    public MonHoc() {
    }

    public MonHoc(String MaMH, String TenMH, int SoTinChi) {
        this.MaMH = MaMH;
        this.TenMH = TenMH;
        this.SoTinChi = SoTinChi;
    }

    public String getMaMH() {
        return MaMH;
    }

    public void setMaMH(String MaMH) {
        this.MaMH = MaMH;
    }

    public String getTenMH() {
        return TenMH;
    }

    public void setTenMH(String TenMH) {
        this.TenMH = TenMH;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int SoTinChi) {
        this.SoTinChi = SoTinChi;
    }
    
}
