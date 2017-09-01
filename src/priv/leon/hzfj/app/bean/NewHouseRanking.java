package priv.leon.hzfj.app.bean;

/*
 楼盘销售排行榜
 */
public class NewHouseRanking {
    //主键 日期
    private String date;
    //表
    private Integer num;
    private String build_name;
    private String area;
    private String saled_volume;
    private String saled_square;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBuild_name() {
        return build_name;
    }

    public void setBuild_name(String build_name) {
        this.build_name = build_name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSaled_volume() {
        return saled_volume;
    }

    public void setSaled_volume(String saled_volume) {
        this.saled_volume = saled_volume;
    }

    public String getSaled_square() {
        return saled_square;
    }

    public void setSaled_square(String saled_square) {
        this.saled_square = saled_square;
    }
}
