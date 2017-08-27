package priv.leon.hzfj.net.transform;

import priv.leon.hzfj.net.bean.Week;
import priv.leon.hzfj.net.pattern.WeekPattern;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class WeekTransform {
    private static ArrayList<Week> list=new ArrayList<>();

    public static ArrayList<Week> trans( ArrayList<String> week_list){
        for(int i=0;i<week_list.size();i++){
            Matcher matcher=WeekPattern.matcher(week_list.get(i));
            if(matcher.find()){
                Week week=new Week();
                week.setDate(matcher.group(0));
                //week.setUrl(matcher.group(1));
                //week.setTitle(matcher.group(2));
                list.add(week);
            }else {
                System.out.print("NO MATCH");
            }

        }
        return list;

    }
}
