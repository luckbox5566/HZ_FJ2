package priv.leon.hzfj;

import priv.leon.hzfj.app.bean.*;
import priv.leon.hzfj.hibernate.factotry.HibernateDo;
import priv.leon.hzfj.hibernate.session.insert.*;
import priv.leon.hzfj.net.builder.NetDirector;
import priv.leon.hzfj.net.builder.WeekPostBuilder;
import priv.leon.hzfj.net.builder.get.NewHouseGetBuilder;
import priv.leon.hzfj.net.get.NewHouseGet;
import priv.leon.hzfj.string.factory.TransFactory;
import priv.leon.hzfj.string.interfaces.Trans;

import java.util.ArrayList;

public class NewHouseMain {
    public static void main(String[] args){
        //网络请求
        ArrayList<String> new_house_list=new ArrayList<>();
        NetDirector director=new NetDirector(null,null);
        NewHouseGetBuilder new_house_builder=new NewHouseGetBuilder();

        director.construct(new_house_builder);
        new_house_list=new_house_builder.getResult();
        System.out.print("访问结束");
        //转换
        ArrayList<NewHouseCanSell> can_sell_list=new ArrayList<>();
        ArrayList<NewHouseRanking> ranking_list=new ArrayList<>();
        ArrayList<NewHouseSign> sign_list=new ArrayList<>();
        ArrayList<NewHouseSignType> sign_type_list=new ArrayList<>();
        ArrayList<NewHouseZones> zones_list=new ArrayList<>();

        Trans can_sell_trans= TransFactory.get("can_sell");
        Trans ranking_trans= TransFactory.get("ranking");
        Trans sign_trans= TransFactory.get("sign");
        Trans sign_type_trans= TransFactory.get("sign_type");
        Trans zones_trans= TransFactory.get("zones");

        can_sell_list=can_sell_trans.trans(new_house_list);
        ranking_list=ranking_trans.trans(new_house_list);
        sign_list=sign_trans.trans(new_house_list);
        sign_type_list=sign_type_trans.trans(new_house_list);
        zones_list=zones_trans.trans(new_house_list);

        //插入数据库
        HibernateDo can_sell_hibernate=new HibernateDo(new NewHouseCanSellSession(can_sell_list),"insert_can_sell");
        HibernateDo ranking_hibernate=new HibernateDo(new NewHouseRankingSession(ranking_list),"insert_ranking");
        HibernateDo sign_hibernate=new HibernateDo(new NewHouseSignSession(sign_list),"insert_sign");
        HibernateDo sign_type_hibernate=new HibernateDo(new NewHouseSignTypeSession(sign_type_list),"insert_sign_type");
        HibernateDo zones_hibernate=new HibernateDo(new NewHouseZonesSession(zones_list),"insert_zones");

        can_sell_hibernate.commit();
        ranking_hibernate.commit();
        sign_hibernate.commit();
        sign_type_hibernate.commit();
        zones_hibernate.commit();
    }
}
