package priv.leon.hzfj.string.transfrom;

import priv.leon.hzfj.string.interfaces.Trans;
import priv.leon.hzfj.string.pattern.NewHouseSignTypePattern;
import priv.leon.hzfj.string.pattern.NewHouseZonesPattern;
import priv.leon.hzfj.string.tool.Collect;

import java.util.ArrayList;

public class NewHouseZonesTransform implements Trans {
    @Override
    public <T> ArrayList<T> trans(ArrayList<String> every_day_list) {
        ArrayList<T> list= Collect.collect(every_day_list,new NewHouseZonesPattern());
        return list;
    }
}
