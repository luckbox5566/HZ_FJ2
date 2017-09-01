package priv.leon.hzfj.net.builder.get;

import priv.leon.hzfj.net.builder.NetBuilder;
import priv.leon.hzfj.net.get.NewHouseGet;
import priv.leon.hzfj.net.post.WeekPost;
import priv.leon.hzfj.net.tool.HtmlCollect;
import priv.leon.hzfj.net.urls.NewHouseUrls;

import java.util.ArrayList;

public class NewHouseGetBuilder extends NetBuilder {
    private String[] pages=null;
    private ArrayList<String> result=new ArrayList<>();
    private ArrayList<String> urls=new ArrayList<>();

    @Override
    public void setParas(String[] list) {
        urls= NewHouseUrls.urls();
    }

    @Override
    public void setUrl(String url) {

    }

    @Override
    public ArrayList<String> getResult() {
        ArrayList<String> result_list=new ArrayList<>();
        for(int i=0;i<urls.size();i++){
            NewHouseGet get=new NewHouseGet(urls.get(i));
            HtmlCollect htmlCollect=new HtmlCollect(get);
            String result=htmlCollect.collect();
            if(result!=null){
                result_list.add(result);
            }

        }
        return result_list;
    }
}
