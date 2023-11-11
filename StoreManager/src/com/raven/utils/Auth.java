package com.raven.utils;

import com.raven.model.NhanVien;

public class Auth {

    public static NhanVien user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return user.isVaiTro();
    }
}
