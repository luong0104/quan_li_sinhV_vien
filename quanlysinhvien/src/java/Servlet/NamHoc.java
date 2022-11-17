/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

/**
 *
 * @author havan
 */
public class NamHoc {
    private String DotHoc, HocKy, NamHoc;

    public NamHoc() {
    }

    public NamHoc(String DotHoc, String HocKy, String NamHoc) {
        this.DotHoc = DotHoc;
        this.HocKy = HocKy;
        this.NamHoc = NamHoc;
    }

    public String getDotHoc() {
        return DotHoc;
    }

    public void setDotHoc(String DotHoc) {
        this.DotHoc = DotHoc;
    }

    public String getHocKy() {
        return HocKy;
    }

    public void setHocKy(String HocKy) {
        this.HocKy = HocKy;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }
    
}
