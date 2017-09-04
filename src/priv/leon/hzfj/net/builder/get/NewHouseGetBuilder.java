package priv.leon.hzfj.net.builder.get;

import priv.leon.hzfj.net.builder.NetBuilder;
import priv.leon.hzfj.net.get.NewHouseGet;
import priv.leon.hzfj.net.post.WeekPost;
import priv.leon.hzfj.net.tool.HtmlCollect;
import priv.leon.hzfj.net.urls.NewHouseUrls;

import java.util.ArrayList;
import java.util.Random;

public class NewHouseGetBuilder extends NetBuilder {
    private String[] pages=null;
    private ArrayList<String> result=new ArrayList<>();
    private ArrayList<String> urls=new ArrayList<>();

    private int min=0;
    private int max=2;

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
                int num=i+1;
                double precent=((double) ((double)num/(double)urls.size()))*100;
                System.out.println("第"+num+"个网站请求成功,完成"+precent+"%");
            }
            //随记暂停几秒在运行
            Random random=new Random();//创建random对象
            double doubleNumber=random.nextDouble();//获取双精度数(0-1)
            try {
                Thread.sleep((long) (doubleNumber*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return result_list;
    }
}
