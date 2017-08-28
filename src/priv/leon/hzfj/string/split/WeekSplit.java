package priv.leon.hzfj.string.split;

import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.string.interfaces.Split;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class WeekSplit implements Split{

    @Override
    public <T> ArrayList<T> split(ArrayList<String> list, T t) {
        Week week=(Week)t;
        ArrayList<Week> list1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int start=list.get(i).indexOf("<span class=\"ash1 flotright\">");
            int end=list.get(i).indexOf("<span class=\"ash1 flotright\">");

        }
        return null;
    }
}
