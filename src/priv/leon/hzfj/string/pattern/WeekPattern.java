package priv.leon.hzfj.string.pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import priv.leon.hzfj.app.bean.Week;

import java.util.ArrayList;

/*
周报匹配
 */
public class WeekPattern implements priv.leon.hzfj.string.interfaces.Pattern {

    @Override
    public <T> ArrayList<Week> matcher(String result) {
        ArrayList<Week> list=new ArrayList<>();
        Document doc = Jsoup.parse(result);
        Elements content = doc.getElementsByTag("li");
        Elements elements=new Elements();
        //过滤掉不需要的li
        for(Element element:content){
            if(element.select("span").attr("class").equals("ash1 flotright")){
                  elements.add(element);
            }
        }
        for(Element element:elements){
            String date="";
            String url="";
            String title="";

            Element date_element=element.select("span").first();
            date=date_element.text();

            Element url_element=element.select("a").first();
            url=url_element.attr("href");
            title=url_element.text();
            Week week=new Week();
            week.setDate(date);
            week.setUrl(url);
            week.setTitle(title);
            list.add(week);
        }



        return list;
    }
}
