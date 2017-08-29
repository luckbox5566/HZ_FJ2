package priv.leon.hzfj;


import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.app.net.TmsfParasApp;
import priv.leon.hzfj.net.builder.NetDirector;
import priv.leon.hzfj.net.builder.WeekPostBuilder;
import priv.leon.hzfj.net.cookies.WeekCookies;
import priv.leon.hzfj.net.post.WeekPost;
import priv.leon.hzfj.net.urls.WeekUrls;
import priv.leon.hzfj.string.factory.TransFactory;
import priv.leon.hzfj.string.interfaces.Trans;

import java.util.ArrayList;

public class AppliMain {
    public static void main(String[] args){
        //周报请求参数
        String[] pages= WeekUrls.pages();
        String week_url="http://www.tmsf.com/info/search_infolist.htm";
        ArrayList<String> week_s_list=new ArrayList<>();

         NetDirector director=new NetDirector(pages,week_url);
         WeekPostBuilder week_post=new WeekPostBuilder();
         director.construct(week_post);
         week_s_list=week_post.getResult();


        Trans trans=TransFactory.get("周报");
        ArrayList<Week> week_b_list=new ArrayList<>();
        week_b_list=trans.trans(week_s_list);
        System.out.print(week_s_list.get(0));
    }
}
