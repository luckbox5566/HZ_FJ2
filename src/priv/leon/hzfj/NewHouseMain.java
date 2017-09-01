package priv.leon.hzfj;

import priv.leon.hzfj.net.builder.NetDirector;
import priv.leon.hzfj.net.builder.WeekPostBuilder;
import priv.leon.hzfj.net.builder.get.NewHouseGetBuilder;
import priv.leon.hzfj.net.get.NewHouseGet;

import java.util.ArrayList;

public class NewHouseMain {
    public static void main(String[] args){
        ArrayList<String> new_house_list=new ArrayList<>();
        NetDirector director=new NetDirector(null,null);
        NewHouseGetBuilder new_house_builder=new NewHouseGetBuilder();

        director.construct(new_house_builder);
        new_house_list=new_house_builder.getResult();
        System.out.print("访问结束");
    }
}
