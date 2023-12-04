/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.db.DBHelper;
import com.raven.model.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class HoaDonDAO {
//     public List<HoaDon> getAllSelect() {
//        List<HoaDon> list = new ArrayList<>();
//        Connection con = DBHelper.getDBConnection();
//        String sql = "select * from hoadon";
//        try {
//            Statement stm = con.createStatement();
//            ResultSet rs = stm.executeQuery(sql);
//            while (rs.next()) {
//                HoaDon hd = new HoaDon();
//                hd.setMaHD(rs.getString("maHD"));
//                hd.setMaKH(rs.getString("maKH"));
//                hd.setMaNV(rs.getString("maNV"));
//                hd.setNgayNhap(rs.getString("NgayNhap"));
//                hd.setTongSoLuong(rs.getInt("TongSoLuong"));
//                hd.setTongtien(rs.getFloat("tongTien"));
//                hd.setHinhThucTT(rs.getString("HINHTHUCTT"));
//                hd.setTrangThaiTT(rs.getBoolean("TRANGTHAITT"));
//                list.add(hd);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//
//    public List<HoaDon> getAllByID(String ma) {
//        List<HoaDon> list = new ArrayList<>();
//        String sql = "SELECT * FROM HoaDon WHERE maHD = ?";
//        Connection con = DBHelper.getDBConnection();
//        try (PreparedStatement stm = con.prepareStatement(sql)) {
//            stm.setString(1, ma);
//            try (ResultSet rs = stm.executeQuery()) {
//                while (rs.next()) {
//                    HoaDon hd = new HoaDon();
//                    hd.setMaHD(rs.getString("maHD"));
//                    hd.setMaKH(rs.getString("maKH"));
//                    hd.setMaNV(rs.getString("maNV"));
//                    hd.setNgayNhap(rs.getString("NgayNhap"));
//                    hd.setTongSoLuong(rs.getInt("TongSoLuong"));
//                    hd.setTongtien(rs.getFloat("tongTien"));
//                    hd.setHinhThucTT(rs.getString("HINHTHUCTT"));
//                    hd.setTrangThaiTT(rs.getBoolean("TRANGTHAITT"));
//                    list.add(hd);
//                }
//            }
//        } catch (SQLException ex) {
//            System.out.println("Lỗi SQL: " + ex.getMessage());
//            ex.printStackTrace();
//            // Hoặc ghi log lỗi
//        }
//        return list;
//    }
//
//    public List<HoaDon> getAllSelectHDCT(String maHD) {
//        List<HoaDon> list = new ArrayList<>();
//        Connection con = DBHelper.getDBConnection();
//        String sql = "select * from ChiTietHoaDon a join HoaDon b on a.MAHD = b.MAHD where a.maHD = ?";
//        try (PreparedStatement psm = con.prepareStatement(sql)) {
//            psm.setString(1, maHD);
//            try (ResultSet rs = psm.executeQuery()){
//                while (rs.next()) {
//                    HoaDon hd = new HoaDon();
//                    hd.setMaHD(rs.getString("maHD"));
//                    hd.setMaKH(rs.getString("maKH"));
//                    hd.setMaNV(rs.getString("maNV"));
//                    hd.setMaSP(rs.getString("MaSP"));
//                    hd.setMaMau(rs.getInt("MaMau"));
//                    hd.setMaSize(rs.getInt("MaSize"));
//                    hd.setNgayNhap(rs.getString("NgayNhap"));
//                    hd.setTongSoLuong(rs.getInt("TongSoLuong"));
//                    hd.setTongtien(rs.getFloat("tongTien"));
//                    hd.setHinhThucTT(rs.getString("HINHTHUCTT"));
//                    hd.setTrangThaiTT(rs.getBoolean("TRANGTHAITT"));
//                    hd.setSoLuong(rs.getInt("SoLuong"));
//                    hd.setGiamGia(rs.getFloat("GiamGia"));
//                    list.add(hd);
//                }
//            } catch (Exception e) {
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }
//
//    public void insertHD(HoaDon hd) {
//        String sql = "insert into hoadon values(?,?,?,?,?,?,?,?)";
//        Connection con = DBHelper.getDBConnection();
//        try {
//            PreparedStatement stm = con.prepareStatement(sql);
//            stm.setString(1, hd.getMaHD());
//            stm.setString(2, hd.getMaKH());
//            stm.setString(3, hd.getNgayNhap());
//            stm.setString(4, hd.getMaNV());
//            stm.setFloat(5, hd.getTongtien());
//            stm.setInt(6, hd.getTongSoLuong());
//            stm.setBoolean(7, false);
//            stm.setString(8, hd.getHinhThucTT());
//            stm.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void updateHD(HoaDon hd) {
//        String sql = "update HoaDon set maKH =?,ngayNhap =?,MaNV=?,tongsoluong=?,tongtien =?, hinhThucTT =?,TrangThaiTT =? where maHD =?";
//        Connection con = DBHelper.getDBConnection();
//        try {
//            PreparedStatement stm = con.prepareStatement(sql);
//            stm.setString(8, hd.getMaHD());
//            stm.setString(1, hd.getMaKH());
//            stm.setString(2, hd.getNgayNhap());
//            stm.setString(3, hd.getMaNV());
//            stm.setInt(5, hd.getTongSoLuong());
//            stm.setFloat(4, hd.getTongtien());
//            stm.setString(6, hd.getHinhThucTT());
//            stm.setBoolean(7, hd.isTrangThaiTT());
//            stm.execute();
//        } catch (Exception e) {
////            e.printStackTrace();
//        }
//    }
//
//    public void deleteHD() {
//
//    }
//
//    public void insetHDCYT(HoaDon hd) {
//        String sql = "INSERT INTO CHITIETHOADON VALUES(?,?,?,?,?,?,?)";
//        Connection con = DBHelper.getDBConnection();
//        try {
//            PreparedStatement pstm = con.prepareStatement(sql);
//            pstm.setString(1, hd.getMaSP());
//            pstm.setString(2, hd.getMaHD());
//            pstm.setInt(3, hd.getSoLuong());
//            pstm.setFloat(4, hd.getGia());
//            pstm.setFloat(5, hd.getGiamGia());
//            pstm.setInt(6, hd.getMaMau());
//            pstm.setInt(7, hd.getMaSize());
//            pstm.execute();
//        } catch (SQLException ex) {
//            Logger.getLogger(HoaDonDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
}
