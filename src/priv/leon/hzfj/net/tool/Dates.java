package priv.leon.hzfj.net.tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Dates {
    public static ArrayList<String> get(String start,String end){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        ArrayList<Date> date_d_list=new ArrayList<>();
        ArrayList<String> date_s_list=new ArrayList<>();
        try {
            Date dBegin = sdf.parse(start);
            Date dEnd = sdf.parse(end);
            date_d_list=findDates(dBegin,dEnd);
            for(Date date:date_d_list){
                date_s_list.add(sdf.format(date));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
      return date_s_list;
    }

    private static ArrayList<Date> findDates(Date dBegin, Date dEnd)
    {
        ArrayList lDate = new ArrayList();
        lDate.add(dBegin);
        Calendar calBegin = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calBegin.setTime(dBegin);
        Calendar calEnd = Calendar.getInstance();
        // 使用给定的 Date 设置此 Calendar 的时间
        calEnd.setTime(dEnd);
        // 测试此日期是否在指定日期之后
        while (dEnd.after(calBegin.getTime()))
        {
            // 根据日历的规则，为给定的日历字段添加或减去指定的时间量
            calBegin.add(Calendar.DAY_OF_MONTH, 1);
            lDate.add(calBegin.getTime());
        }
        return lDate;
    }
}
