package priv.leon.hzfj;


import priv.leon.hzfj.app.net.TmsfParasApp;
import priv.leon.hzfj.net.builder.NetDirector;
import priv.leon.hzfj.net.builder.WeekPostBuilder;
import priv.leon.hzfj.net.cookies.WeekCookies;
import priv.leon.hzfj.net.post.WeekPost;
import priv.leon.hzfj.net.urls.WeekUrls;

import java.util.ArrayList;

public class AppliMain {
    public static void main(String[] args){
        //周报请求参数
        String[] pages= WeekUrls.pages();
        String week_url="http://www.tmsf.com/info/search_infolist.htm";
        ArrayList<String> week_list=new ArrayList<>();

        //获取Cookies
        WeekCookies.cookies();
        if(!TmsfParasApp.Cookie.equals("")){
            NetDirector director=new NetDirector(pages,week_url);
            WeekPostBuilder week_post=new WeekPostBuilder();
            director.construct(week_post);
            week_list=week_post.getResult();
        }
        System.out.print(week_list.get(0));
    }
}
