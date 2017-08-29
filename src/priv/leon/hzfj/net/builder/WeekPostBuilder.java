package priv.leon.hzfj.net.builder;

import priv.leon.hzfj.net.post.WeekPost;
import priv.leon.hzfj.net.tool.HtmlCollect;
import priv.leon.hzfj.string.pattern.WeekPattern;

import java.util.ArrayList;

public class WeekPostBuilder extends NetBuilder {
    private String url="";
    private String[] pages=null;
    private ArrayList<String> result=new ArrayList<>();

    @Override
    public void setParas(String[] list) {
        this.pages=list;
    }

    @Override
    public void setUrl(String url) {
        this.url=url;
    }

    @Override
    public ArrayList<String> getResult() {
        ArrayList<String> result_list=new ArrayList<>();
        for(int i=0;i<pages.length;i++){
            WeekPost post=new WeekPost(url,pages[i]);
            HtmlCollect htmlCollect=new HtmlCollect(post);
            String result=htmlCollect.collect();
            if(result!=null){
                result_list.add(result);
            }

        }
        return result_list;
    }
}
