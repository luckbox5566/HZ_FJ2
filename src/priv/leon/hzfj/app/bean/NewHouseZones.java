package priv.leon.hzfj.app.bean;

import javax.persistence.*;

@Entity//声明当前类为hibernate映射到数据库中的实体类
@Table(name="nh_zones")//声明在数据库中自动生成的表名为t_user
public class NewHouseZones {

    @Id//声明此列为主键
    @GeneratedValue(strategy = GenerationType.AUTO)//根据不同数据库自动选择合适的id生成方案，这里使用mysql,为递增型
    private Integer no;

    //主键 日期
    private String date;
    //表
    private String type;
    private String can_sell_house_suits;
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

    public String getCan_sell_house_suits() {
        return can_sell_house_suits;
    }

    public void setCan_sell_house_suits(String can_sell_house_suits) {
        this.can_sell_house_suits = can_sell_house_suits;
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
