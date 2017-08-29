package priv.leon.hzfj.net.cookies;

import priv.leon.hzfj.app.net.TmsfCookiesApp;
import priv.leon.hzfj.app.net.TmsfParasApp;
import priv.leon.hzfj.net.get.CookiesGet;

public class WeekCookies {
    public static void cookies(){
        CookiesGet get=new CookiesGet(TmsfCookiesApp.url);
        String cookies=get.get();
        TmsfParasApp.Cookie=cookies;
    }
}
