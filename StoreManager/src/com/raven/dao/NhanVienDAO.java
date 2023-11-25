package com.raven.dao;

import com.raven.db.DBHelper;
import com.raven.model.NhanVien;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

abstract public class NhanVienDao extends StoreDao<NhanVien, String> {

    String SELECT_ALL_SQL = "SELECT * FROM Nhanvien";

    @Override
    public void insert(NhanVien model) {
        String sql = "INSERT INTO NhanVien (MaNV, TenNV, Matkhau, NgaySinh, Email, Phone, vaiTro, Hinh) VALUES (?, ?, ?, ?,?, ?, ?, ?)";
        DBHelper.update(sql,
                model.getMaNV(),
                model.getTenNV(),
                model.getMatKhau(),
                model.getNgaySinh(),
                model.getEmail(),
                model.getSDT(),
                model.getVaiTro(),
                model.getHinhAnh());
    }

    @Override
    public void update(NhanVien model) {
        String sql = "update nhanvien set TenNV = ?, Matkhau = ?, NgaySinh = ?, Email = ?, Phone =?, vaiTro =?, Hinh =? where MaNV = ?";
        DBHelper.update(sql,
                model.getMaNV(),
                model.getTenNV(),
                model.getMatKhau(),
                model.getNgaySinh(),
                model.getEmail(),
                model.getSDT(),
                model.getVaiTro(),
                model.getHinhAnh());
    }

    @Override
    public void delete(String MaNV) {
        String sql = "delete from nhanvien where MaNV = ?";
        DBHelper.update(sql, MaNV);
    }

    public List<NhanVien> select() throws SQLException {
        String sql = "select * from nhanvien";
        return select(sql);
    }

    public NhanVien findByID(String ID) throws SQLException {
        String sql = "SELECT * FROM nhanvien WHERE MaNV=?";
        List<NhanVien> list = select(sql, ID);
        return !list.isEmpty() ? list.get(0) : null;
    }

    @SuppressWarnings("null")
    private List<NhanVien> select(String query, Object... objects) throws SQLException {
        List<NhanVien> list = new ArrayList<>();
        @SuppressWarnings("UnusedAssignment")
        ResultSet rs = null;
        try {
            rs = DBHelper.query(query, objects);
            while (rs.next()) {
                NhanVien e = getModel(rs);
                list.add(e);
            }
        } finally {
//                rs.getStatement().getConnection().close();
        }

        return list;
    }

    private NhanVien getModel(ResultSet rs) throws SQLException {
        NhanVien nv = new NhanVien();
        nv.setMaNV(rs.getString("MaNV"));
        nv.setTenNV(rs.getString("TenNV"));
        nv.setMatKhau(rs.getString("Matkhau"));
        nv.setNgaySinh(rs.getDate("NgaySinh"));
        nv.setSDT(rs.getString("Phone"));
        nv.setVaiTro(rs.getBoolean("vaiTro"));
        nv.setHinhAnh(rs.getString("Hinh") == null ? "Username.png" : rs.getString("Hinh"));
        return nv;
    }

    public void setTable(JTable table) {
        //Thiết lập lại font chữ
        table.setFont(new Font("Roboto", Font.PLAIN, 18));
        table.setRowHeight(30);

        // Thiết lập chỉ được chọn 1 dòng trong bảng
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @Override
    public List<NhanVien> selectAll() {
             return this.selectBySql(SELECT_ALL_SQL);
//        return this.selectBysql(SELECT_ALL_SQL);

    }

    @Override
    public NhanVien selectById(String k) {
        return null;
    }

    @Override
    public NhanVien selectByName(String k) {
        return null;
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        return null;
    }

}