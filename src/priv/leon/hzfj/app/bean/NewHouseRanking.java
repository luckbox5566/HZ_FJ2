package priv.leon.hzfj.app.bean;

import javax.persistence.*;

/*
 楼盘销售排行榜
 */
@Entity//声明当前类为hibernate映射到数据库中的实体类
@Table(name="nh_ranking")//声明在数据库中自动生成的表名为t_user
public class NewHouseRanking {

    @Id//声明此列为主键
    @GeneratedValue(strategy = GenerationType.AUTO)//根据不同数据库自动选择合适的id生成方案，这里使用mysql,为递增型
    private Integer no;
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

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
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
