/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.model;

/**
 *
 * @author Admin
 */
public class HoaDonChiTiet {
    private String maHDCT;
    private String maHD;
    private String maSP;
    private int soLuong;
    private String ghiChu;
    private String maGG;
    private float giamGia;
//    private String tenSP;
//    private float gia;
//    private String mau;
//    private String size;
    private String maKH;
    private String tenKH;
    private String SDT;
    private String DiaChi;
//    private String diaChi;
    private String tenNV;
//    private String hinhThucTT;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(String maHDCT, String maHD, String maSP, int soLuong, String ghiChu, String maGG, float giamGia, String maKH, String tenKH, String SDT, String DiaChi, String tenNV) {
        this.maHDCT = maHDCT;
        this.maHD = maHD;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
        this.maGG = maGG;
        this.giamGia = giamGia;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.tenNV = tenNV;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaGG() {
        return maGG;
    }

    public void setMaGG(String maGG) {
        this.maGG = maGG;
    }

    public float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(float giamGia) {
        this.giamGia = giamGia;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

}