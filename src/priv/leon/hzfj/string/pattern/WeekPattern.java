package priv.leon.hzfj.string.pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
周报匹配
 */
public class WeekPattern implements priv.leon.hzfj.string.interfaces.Pattern {

    @Override
    public <T> ArrayList<String> matcher(String result) {


        //匹配规则
        String pattern="<div class=\"h20\"></div>\n[\\d\\D]*<div class=\"h20\"></div>\n";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(result);
        String p_result="";
        if(m.find()){
            p_result=m.group(1);
        }
        //jsoup
        Document doc = Jsoup.parse(p_result);
        Elements content = doc.getElementsByTag("li");

        Elements content2=doc.get


        ArrayList<String> list=new ArrayList<>();
        if(m.find()){
            for(int i=1;i<=m.groupCount();i++){
                list.add(m.group(i));
            }
        }
        return list;
    }
}
