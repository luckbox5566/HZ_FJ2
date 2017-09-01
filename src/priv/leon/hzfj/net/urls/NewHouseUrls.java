package priv.leon.hzfj.net.urls;

import priv.leon.hzfj.net.tool.Dates;

import java.util.ArrayList;

public class NewHouseUrls {
    private static String date="";
    private static  final String base_url="http://www.tmsf.com/upload/report/mrhqbb/";
    private static final String start="20130108";
    private static final String end="20170628";
    private static ArrayList<String> urls=new ArrayList<>();

    public static ArrayList<String> urls(){
        ArrayList<String> dates=new ArrayList<>();
        dates= Dates.get(start,end);
        for(String date:dates){
            String url=base_url+date+"/xf.html";
            urls.add(url);
        }
        return urls;
    }

}
