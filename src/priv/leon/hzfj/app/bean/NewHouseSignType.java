package priv.leon.hzfj.app.bean;
/*
  新房分类型（住宅、商业、办公楼）交易信息表
 */
public class NewHouseSignType {
    //主键 日期
    private String date;
    //表

    private String type;
    private String sign_house_suits;
    private String sign_sell_area;

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

    public String getSign_house_suits() {
        return sign_house_suits;
    }

    public void setSign_house_suits(String sign_house_suits) {
        this.sign_house_suits = sign_house_suits;
    }

    public String getSign_sell_area() {
        return sign_sell_area;
    }

    public void setSign_sell_area(String sign_sell_area) {
        this.sign_sell_area = sign_sell_area;
    }
}
