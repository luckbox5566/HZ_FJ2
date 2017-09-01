package priv.leon.hzfj.app.bean;
/*
   新房今日可售信息表
 */
public class NewHouseCanSell {
    //主键 日期
    private String date;

    //表
    private String type;
    private String can_sell_house_suits;
    private String can_sell_area;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCan_sell_house_suits() {
        return can_sell_house_suits;
    }

    public void setCan_sell_house_suits(String can_sell_house_suits) {
        this.can_sell_house_suits = can_sell_house_suits;
    }

    public String getCan_sell_area() {
        return can_sell_area;
    }

    public void setCan_sell_area(String can_sell_area) {
        this.can_sell_area = can_sell_area;
    }
}
