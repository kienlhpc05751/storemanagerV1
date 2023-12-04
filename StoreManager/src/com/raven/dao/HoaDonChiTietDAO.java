/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietDAO {
//    public List<HoaDonChiTiet> getSelectAll(String ma) {
//        List<HoaDonChiTiet> list = new ArrayList<>();
//        Connection con = DBHelper.getDBConnection();
//        String sql = "select * from hoaDon a join CHITIETHOADON b on a.MAHD = b.MAHD join KhachHang c on a.MAKH = c.MAKH join SanPham d on b.MASP = d.maSP join size e on b.MASIZE = e.MASIZE join Mau f on b.MAMAU = f.MAMAU join NhanVien g on a.maNV = g.maNV\n"
//                + "               where a.maHD = ?";
//        try (PreparedStatement psm = con.prepareStatement(sql)) {
//            psm.setString(1, ma);
//            try (ResultSet rs = psm.executeQuery()) {
//                while (rs.next()) {
//                    HoaDonChiTiet hdct = new HoaDonChiTiet();
//                    hdct.setMaSP(rs.getString("maSP"));
//                    hdct.setTenSP(rs.getString("tenSP"));
//                    hdct.setGia(rs.getFloat("gia"));
//                    hdct.setSize(rs.getString("tenSize"));
//                    hdct.setMau(rs.getString("tenMau"));
//                    hdct.setMaKH(rs.getString("maKH"));
//                    hdct.setTenKH(rs.getString("tenKH"));
//                    hdct.setsDT(rs.getString("SoDT"));
//                    hdct.setDiaChi(rs.getString("DiaChi"));
//                    hdct.setSoLuong(rs.getInt("SoLuong"));
//                    hdct.setGiamGia(rs.getFloat("GiamGia"));
//                    hdct.setHinhThucTT(rs.getString("hinhThucTT"));
//                    hdct.setTenNV(rs.getString("tenNV"));
//                    list.add(hdct);
//                }
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(HoaDonChiTietDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return list;
//    }

}
