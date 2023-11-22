/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.dao;

import com.raven.db.DBHelper;
import com.raven.model.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDAO {
    public static String INSERT_SQL = "INSERT INTO NhanVien (MaNV, HoTen, MatKhau, NgaySinh, Email, SDT, VaiTro, Hinh) VALUES (?,?,?,?,?,?,?,?)";
    public static String UPDATE_SQL = "UPDATE NhanVien SET HoTen=?,MatKhau=?,NgaySinh=?,Email=?,SDT=?,VaiTro=?,Hinh=? WHERE MaNV=?";
    public static String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV=?";
    public static String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    public static String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV=?";

    
    public void insert(NhanVien entity) {
        DBHelper.update(INSERT_SQL,
                entity.getMaNV(),
                entity.getHoTen(),
                entity.getMatKhau(),
                entity.getNgaySinh(),
                entity.getEmail(),
                entity.getsDT(),
                entity.isVaiTro(),
                entity.getHinh());
    }

    
    public void update(NhanVien entity) {
       DBHelper.update(UPDATE_SQL,
                entity.getMaNV(),
                entity.getHoTen(),
                entity.getMatKhau(),
                entity.getNgaySinh(),
                entity.getEmail(),
                entity.getsDT(),
                entity.isVaiTro(),
                entity.getHinh());
    }

    
    public void delete(String key) {
       DBHelper.update(DELETE_SQL, key);
    }

    
    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    
    public NhanVien selectById(String key) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
//        return list.size() > 0 ? list.get(0) : null;
    }

    
    
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DBHelper.query(sql, args);
                while (rs.next()) {
                    NhanVien entity = new NhanVien();
                    entity.setMaNV(rs.getString("MaNV"));
                    entity.setHoTen(rs.getString("HoTen"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setNgaySinh(rs.getDate("NgaySinh"));
                    entity.setEmail(rs.getString("Email"));
                    entity.setsDT(rs.getString("SDT"));
                    entity.setVaiTro(rs.getBoolean("VaiTro"));
                    entity.setHinh(rs.getString("Hinh"));
                    list.add(entity);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private NhanVien readFromResultSet(ResultSet rs) throws Exception {
        NhanVien model = new NhanVien();
        model.setMaNV(rs.getString("MaNV"));
        model.setHoTen(rs.getString("HoTen"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setEmail(rs.getString("Email"));
        model.setsDT(rs.getString("SDT"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        model.setHinh(rs.getString("Hinh"));
        return model;
    }
}
