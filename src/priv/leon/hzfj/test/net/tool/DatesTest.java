package priv.leon.hzfj.test.net.tool;

import priv.leon.hzfj.net.tool.Dates;

import java.util.ArrayList;

public class DatesTest {

    public  static void main(String[] s){
        String start="20150203";
        String end="20170901";
        ArrayList<String> list=new ArrayList<>();
        list= Dates.get(start,end);
        System.out.print("xxx");

    }
}
