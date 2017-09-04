package priv.leon.hzfj.string.pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import priv.leon.hzfj.app.bean.NewHouseRanking;
import priv.leon.hzfj.app.bean.NewHouseZones;
import priv.leon.hzfj.string.interfaces.Pattern;
import priv.leon.hzfj.string.tool.SubStringTool;

import java.util.ArrayList;

public class NewHouseRankingPattern implements Pattern {
    @Override
    public <T> ArrayList<T> matcher(String result) {
        ArrayList<NewHouseRanking> new_house_zones_type_list=new ArrayList<>();
        try{
            Document doc = Jsoup.parse(result);
            Elements links = doc.getElementsByTag("table");
            Element element=null;
            for(Element element1:links){
                if(element1.toString().indexOf("楼盘名称")>0&&element1.toString().indexOf("所属区域")>0){
                    element=element1;
                    break;
                }
            }
            //去掉列表的第一行
            Elements tr_links=element.getElementsByTag("tr");
            Elements te_element=new Elements();
            for(Element element1:tr_links){
                if(!(element1.toString().indexOf("楼盘名称")>0&&element1.toString().indexOf("所属区域")>0)){
                    te_element.add(element1);
                }
            }

            //获得时间
            Elements links_h2 = doc.getElementsByTag("h2");
            String date_h2=links_h2.get(0).text();
            String date= SubStringTool.sub(date_h2,"[","]");
            for(Element element1:te_element){
                Elements elements=element1.getElementsByTag("td");
                NewHouseRanking newHouseZones=new NewHouseRanking();

                newHouseZones.setDate(date);
                newHouseZones.setNum(elements.get(0).text());
                newHouseZones.setBuild_name(elements.get(1).text());
                newHouseZones.setArea(elements.get(2).text());
                newHouseZones.setSaled_volume(elements.get(3).text());
                newHouseZones.setSaled_square(elements.get(4).text());
                new_house_zones_type_list.add(newHouseZones);
            }
        }catch (Exception e){
            System.out.println("当前类为："+this.getClass().toString()+e.toString());
        }


        return (ArrayList<T>) new_house_zones_type_list;
    }
}
