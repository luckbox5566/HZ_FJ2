package priv.leon.hzfj.string.pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import priv.leon.hzfj.app.bean.NewHouseCanSell;
import priv.leon.hzfj.app.bean.NewHouseSignType;
import priv.leon.hzfj.string.interfaces.Pattern;
import priv.leon.hzfj.string.tool.SubStringTool;

import java.util.ArrayList;

public class NewHouseSignTypePattern implements Pattern{
    @Override
    public <T> ArrayList<T> matcher(String result) {
        ArrayList<NewHouseSignType> new_house_sign_type_list=new ArrayList<>();
        Document doc = Jsoup.parse(result);
        Elements links = doc.getElementsByTag("table");
        Element element=null;
        for(Element element1:links){
            if(element1.toString().indexOf("签约套数")>0&&element1.toString().indexOf("签约面积")>0){
                element=element1;
                break;
            }
        }
        //去掉列表的第一行
        Elements tr_links=element.getElementsByTag("tr");
        Elements te_element=new Elements();
        for(Element element1:tr_links){
            if(!(element1.toString().indexOf("签约套数")>0&&element1.toString().indexOf("签约面积")>0)){
                te_element.add(element1);
            }
        }

        //获得时间
        Elements links_h2 = doc.getElementsByTag("h2");
        String date_h2=links_h2.get(0).text();
        String date= SubStringTool.sub(date_h2,"[","]");
        for(Element element1:te_element){
            Elements elements=element1.getElementsByTag("td");
            NewHouseSignType newHouseSignType=new NewHouseSignType();

            newHouseSignType.setDate(date);
            newHouseSignType.setType(elements.get(0).text());
            newHouseSignType.setSign_house_suits(elements.get(1).text());
            newHouseSignType.setSign_sell_area(elements.get(2).text());
            new_house_sign_type_list.add(newHouseSignType);
        }

        return (ArrayList<T>) new_house_sign_type_list;
    }
}
