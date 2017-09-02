package priv.leon.hzfj.string.factory;

import priv.leon.hzfj.string.interfaces.Trans;
import priv.leon.hzfj.string.transfrom.*;

public class TransFactory {
    public static Trans get(String name){
        switch (name){
            case "日报":
                break;
            case "周报":
                return new WeekTransform();
            case "月报":
                break;
            case "sign":
                //新房签约信息表
                return new NewHouseSignTransform();
            case "can_sell":
                //新房可售信息表
                return new NewHouseCallSellTransform();
            case "sign_type":
                //新房分类型信息表
                return new NewHousesSignTypeTransform();
            case "zones":
                //新房分区交易信息表
                return new NewHouseZonesTransform();
            case "ranking":
                //新房楼盘销售排行表
                return new NewHouseRankingTransform();

        }
        return null;
    }
}
