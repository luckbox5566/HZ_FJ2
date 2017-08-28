package priv.leon.hzfj.string.factory;

import priv.leon.hzfj.string.interfaces.Trans;
import priv.leon.hzfj.string.transfrom.WeekTransform;

public class TransFactory {
    public static Trans get(String name){
        switch (name){
            case "日报":
                break;
            case "周报":
                return new WeekTransform();
            case "月报":
                break;

        }
        return null;
    }
}
