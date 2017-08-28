package priv.leon.hzfj;


import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.net.post.OkHttpPost;
import priv.leon.hzfj.string.transfrom.WeekTransform;
import priv.leon.hzfj.net.urls.WeekUrls;

import java.util.ArrayList;

public class AppliMain {
    public static void main(String[] args){

        //周报请求
        int[] pages= WeekUrls.pages();
        ArrayList<String> week_list=new ArrayList<>();
        String week_url="http://www.tmsf.com/info/search_infolist.htm";
        for (int i=0;i<pages.length;i++){
            OkHttpPost post=new OkHttpPost(week_url,pages[i]+"");
            String result=post.post();
            week_list.add(result);
        }
        //ArrayList<Week> week_trans_list= WeekTransform.trans(week_list);
        System.out.print(week_list.get(0));
    }
}
