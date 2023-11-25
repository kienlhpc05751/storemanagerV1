package com.raven.utils;

import com.raven.model.NhanVien;

public class Auth {

//    public static NhanVien user = null;
//
//    public static void clear() {
//        Auth.user = null;
//    }
//
//    public static boolean isLogin() {
//        return Auth.user != null;
//    }
//
//    public static boolean isManager() {
//        return user.isVaiTro();
//    }
    /*
     * Đối tượng này chứa thông tin người sử dụng sau khi đăng nhập
     */
    public static NhanVien user = null;

    /*
     * Xóa thông tin của người sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }

    /*
     * Kiểm tra xem đã đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }

    /*
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
    public static boolean isManager() {
        return Auth.isLogin() && user.isVaiTro();
    }
}
