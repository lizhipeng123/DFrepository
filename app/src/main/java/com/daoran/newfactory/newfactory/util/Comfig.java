package com.daoran.newfactory.newfactory.util;

import com.daoran.newfactory.newfactory.R;

/**
 * Created by lizhipeng on 2017/3/21.
 */

public class Comfig {

    /**
     *  记录是否自动登录app
     */
    public static final String AUTO_LOGIN_WHRN_LAUNCH = "auto_login";
    /**
     * 记录是否记住密码
     */
    public static final String REMEMBER_PASSWORD = "remember_pws";
    /**
     * token值
     */
    public static final String TOKEN = "token";
    public static final String USERNAME = "name";
    public static final String PASSWORD = "password";

    /**
     * 是否开启打印输出 true 开启打印输出 false 关闭打印输出,发布设置为flase
     */
    public static final boolean isDebug = true;
    /*发布设置为true*/
    public static final boolean isLine = true;
    /**
     * 获取服务器
     *
     * @return 服务器地址的Id
     */
    public static final String getServer() {
        String serverIp = isLine ? "服务器地址" : "服务器地址ip";
        return serverIp;
    }

    public static String key = "token值";



    public static final String OTHER_FIRST_LETTER = "#";
}
