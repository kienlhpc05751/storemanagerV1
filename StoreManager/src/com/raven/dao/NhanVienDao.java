package com.raven.dao;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.raven.db.DBHelper;
import com.raven.model.NhanVien;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


public class NhanVienDao extends StoreDao<NhanVien, String> {

    @Override
    public void insert(NhanVien e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(NhanVien e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String k) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    private NhanVien getModel(ResultSet rs) throws SQLException{
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
       return null;
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
