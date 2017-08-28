package priv.leon.hzfj.string.transfrom;


import priv.leon.hzfj.app.bean.Week;
import priv.leon.hzfj.string.interfaces.Trans;
import priv.leon.hzfj.string.pattern.WeekPattern;
import priv.leon.hzfj.string.tool.Collect;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class WeekTransform implements Trans {
    private static ArrayList<Week> list=new ArrayList<>();

    @Override
    public <T> ArrayList<T> trans(ArrayList<String> week_list) {
        ArrayList<String> col_list= Collect.collect(week_list,new WeekPattern());
        return null;
    }
}
