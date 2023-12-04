/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String maHD;
    //private String maSP;
    private String maKH;
    private String maNV;
    private Date ngayTao;
    private float tongtien;
//    private String hinhThucTT;
//    private int tongSoLuong;
//    private boolean TrangThaiTT;
//    private int soLuong;
//   private int maMau;
//   private int maSize;
//   private float gia;
//   private float giamGia;

    public HoaDon() {
    }

    public HoaDon(String maHD, String maKH, String maNV, Date ngayTao, float tongtien) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.ngayTao = ngayTao;
        this.tongtien = tongtien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

   
   
}

