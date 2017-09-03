package priv.leon.hzfj.string.pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import priv.leon.hzfj.app.bean.NewHouseSign;
import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.string.interfaces.Pattern;
import priv.leon.hzfj.string.tool.SubStringTool;

import java.util.ArrayList;

public class NewHouseSignPattern implements Pattern {
    String all_s="";
    String[] spilt_s;
    @Override
    public <T> ArrayList<T> matcher(String result) {
        ArrayList<NewHouseSign> house_sign_list=new ArrayList<>();
        try{
            Document doc = Jsoup.parse(result);
            Elements links = doc.getElementsByTag("dt");
            all_s=links.get(1).text();
            //用;进行分割
            spilt_s=all_s.split("；");
            //获得时间
            Elements links_h2 = doc.getElementsByTag("h2");
            String date_h2=links_h2.get(0).text();
            String date=SubStringTool.sub(date_h2,"[","]");
            //还是直接字符串剪切出来方便
            //各地今日签约套数
            Integer total_sign= getTao("全市新房签约","套");
            Integer main_urban_area= getTao("杭州主城区新房签约","套");
            Integer xs_area= getTao("萧山","套");
            Integer yh_area= getTao("余杭","套");
            Integer fy_area= getTao("富阳","套");
            Integer tl_area= getTao("桐庐","套");
            Integer jd_area= getTao("建德","套");
            Integer ca_area=getTao("淳安","套");
            Integer la_area= getTao("临安","套");
            Integer djd_area= getTao("大江东","套");
            //各地今日签约平均价格
            Double xs_average_price=getPrice("萧山","元/平方米");
            Double yh_average_price=getPrice("余杭","元/平方米");
            Double fy_average_price=getPrice("富阳","元/平方米");
            Double tl_average_price=getPrice("桐庐","元/平方米");
            Double jd_average_price=getPrice("建德","元/平方米");
            Double ca_average_price=getPrice("淳安","元/平方米");
            Double la_average_price=getPrice("临安","元/平方米");
            Double djd_average_price=getPrice("大江东","元/平方米");

            NewHouseSign newHouseSign=new NewHouseSign();
            newHouseSign.setDate(date);
            newHouseSign.setTotal_sign(total_sign);
            newHouseSign.setMain_urban_area(main_urban_area);
            newHouseSign.setXs_area(xs_area);
            newHouseSign.setYh_area(yh_area);
            newHouseSign.setFy_area(fy_area);
            newHouseSign.setTl_area(tl_area);
            newHouseSign.setJd_area(jd_area);
            newHouseSign.setCa_area(ca_area);
            newHouseSign.setLa_area(la_area);
            newHouseSign.setDjd_area(djd_area);
            newHouseSign.setXs_average_price(xs_average_price);
            newHouseSign.setYh_average_price(yh_average_price);
            newHouseSign.setFy_average_price(fy_average_price);
            newHouseSign.setTl_average_price(tl_average_price);
            newHouseSign.setJd_average_price(jd_average_price);
            newHouseSign.setCa_average_price(ca_average_price);
            newHouseSign.setLa_average_price(la_average_price);
            newHouseSign.setDjd_average_price(djd_average_price);
            house_sign_list.add(newHouseSign);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        return (ArrayList<T>) house_sign_list;
    }


    //获得套数
    private Integer getTao(String start,String end){
        //先剪切出来整段
        String pipei="";
        for(int i=0;i<spilt_s.length;i++){
            if(spilt_s[i].indexOf(start)!=-1){
                pipei=spilt_s[i];
            }
        }
        if(pipei.indexOf("全市新房签约")==-1){
            return  Integer.valueOf(SubStringTool.sub(pipei,start,end));
        }else {
            String v="";
            v=pipei.split("。")[1];
            if(v.indexOf(start)==-1){
                return  Integer.valueOf(SubStringTool.sub(pipei,start,end));
            }else {
                return Integer.valueOf(SubStringTool.sub(v,start,end));
            }

        }

    }

    //获得签约均价
    private Double getPrice(String start,String end){
        //先剪切出来整段
        String pipei="";
        for(int i=0;i<spilt_s.length;i++){
            if(spilt_s[i].indexOf(start)!=-1){
                pipei=spilt_s[i];
            }
        }
        return Double.valueOf(SubStringTool.sub(pipei,"签约均价","元/平方米"));
    }
}
