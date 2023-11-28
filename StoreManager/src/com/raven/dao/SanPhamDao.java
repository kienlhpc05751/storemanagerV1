/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.db.DBHelper;
import com.raven.model.Sanpham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
abstract class SanPhamDao extends StoreDao<Sanpham, String> {

    String INSERT_SQL = "INSERT INTO sanpham(BienTheSP,Maloai,TenSP,KichCo,MauSac,GiaBan,SoLuong)Values(?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE sanpham SET MaLoai=?, TenSP=?,KichCo=?,MauSac=?,GiaBan=?,SoLuong=? WHERE BienTheSP=?";
    String DELETE_SQL = "DELETE FROM sanpham WHERE BienTheSP=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM sanpham WHERE BienTheSP=?";
    String sql = " select * from san "
            + "where HoTen like ? AND "
            + "MaNH NOT IN (select MaNH from HocVien where MaKH = ?)";

    //
    String sqlNH1 = "select * from NguoiHoc where MaNH not in ( select MaNH from HocVien)";

    String sqlNH = "select * from nguoihoc where maNH not in (select maNH from hocvien where makh = ?)";

    @Override
    public void insert(Sanpham enity) {

        DBHelper.update(INSERT_SQL, enity.getBienTheSP(), enity.getMaLoai(), enity.getTenSP(), enity.getKichCo(),
                enity.getMauSac(), enity.getGia(), enity.getSoLuong());
    }

    @Override
    public void update(Sanpham enity) {
        DBHelper.update(UPDATE_SQL, enity.getBienTheSP(), enity.getMaLoai(), enity.getTenSP(), enity.getKichCo(),
                enity.getMauSac(), enity.getGia(), enity.getSoLuong());
    }

    @Override
    public void delete(String id) {
        DBHelper.update(DELETE_SQL, id);
    }

    @Override
    public Sanpham selectById(String k) {

        List<Sanpham> list = this.selectBySql(SELECT_BY_ID_SQL, k);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

  

    @Override
    protected List<Sanpham> selectBySql(String sql, Object... args) {
        List<Sanpham> list = new ArrayList<>();
        try {
            ResultSet rs = DBHelper.query(sql, args);
            while (rs.next()) {
                Sanpham enity = new Sanpham();
                enity.setBienTheSP(rs.getString("MaNH"));
                enity.setMaLoai(rs.getString("HoTen"));
                enity.setTenSP(rs.getString("GioiTinh"));
                enity.setKichCo(rs.getString("DienThoai"));
                enity.setMauSac(rs.getString("NgaySinh"));
                enity.setGia(rs.getDouble("Email"));
                enity.setSoLuong(rs.getInt("GhiChu"));
                list.add(enity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    protected List<Sanpham> selectBysql(String sql, Object... args) {
//        
//    }
    @Override
    public List<Sanpham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);

    }
//

    public List<Sanpham> selectNotlnCourse(int makh, String keyword) {

        return this.selectBySql(sql, "%" + keyword + "%", makh);
    }
//

    public List<Sanpham> selectNotlnCourse1(int makh) {

        return this.selectBySql(sqlNH, makh);
    }

//    String sqla = "Select * from NguoiHoc Where HoTen LIKE ?";

    
    
//    public List<Sanpham> selectByKeyword(String keyword) {
//        return this.selectBySql(sqla, "%" + keyword + "%");
//
//    }

}
