package priv.leon.hzfj.string.transfrom;

import priv.leon.hzfj.string.interfaces.Trans;
import priv.leon.hzfj.string.pattern.NewHouseRankingPattern;
import priv.leon.hzfj.string.pattern.NewHouseSignPattern;
import priv.leon.hzfj.string.tool.Collect;

import java.util.ArrayList;

public class NewHouseSignTransform implements Trans {
    @Override
    public <T> ArrayList<T> trans(ArrayList<String> every_day_list) {
        ArrayList<T> list= Collect.collect(every_day_list,new NewHouseSignPattern());
        return list;
    }
}
