package priv.leon.hzfj.string.pattern;

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
        java.lang.String pattern="<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">.*\\s.*</span>\n" +
                "\t\t\t\t\t\t·<a href=\".*\"  title=\".*\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t.*\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>\n";
        java.lang.String s="<li>\n" +
                "\t\t\t\t\t\t<span class=\"ash1 flotright\">2017-08-14 16:29</span>\n" +
                "\t\t\t\t\t\t·<a href=\"/info/news_newsinfo_493330931_33_1.htm\"  title=\"[08.07-08.13]杭州市区二手房签约2119套\" target=\"_blank\">\n" +
                "\t\t\t\t\t\t\t[08.07-08.13]杭州市区二手房签约2119套\n" +
                "\t\t\t\t\t\t </a>\n" +
                "\t\t\t\t\t</li>";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(result);
        ArrayList<String> list=new ArrayList<>();
        if(m.find()){
            for(int i=1;i<=m.groupCount();i++){
                list.add(m.group(i));
            }
        }
        return list;
    }
}
