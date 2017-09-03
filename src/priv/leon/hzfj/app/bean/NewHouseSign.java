package priv.leon.hzfj.app.bean;
/*
   新房今日签约信息表
 */

import javax.persistence.*;

@Entity//声明当前类为hibernate映射到数据库中的实体类
@Table(name="nh_sign")//声明在数据库中自动生成的表名为t_user
public class NewHouseSign {

    @Id//声明此列为主键
    @GeneratedValue(strategy = GenerationType.AUTO)//根据不同数据库自动选择合适的id生成方案，这里使用mysql,为递增型
    private Integer no;

    //主键 日期
    private String date;

    //新房签约
    private Integer total_sign;
    private Integer main_urban_area;
    private Integer xs_area;
    private Integer yh_area;
    private Integer fy_area;
    private Integer tl_area;
    private Integer jd_area;
    private Integer ca_area;
    private Integer la_area;
    private Integer djd_area;
    //均价
    private Double xs_average_price;
    private Double yh_average_price;
    private Double fy_average_price;
    private Double tl_average_price;
    private Double jd_average_price;
    private Double ca_average_price;
    private Double la_average_price;
    private Double djd_average_price;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTotal_sign() {
        return total_sign;
    }

    public void setTotal_sign(Integer total_sign) {
        this.total_sign = total_sign;
    }

    public Integer getMain_urban_area() {
        return main_urban_area;
    }

    public void setMain_urban_area(Integer main_urban_area) {
        this.main_urban_area = main_urban_area;
    }

    public Integer getXs_area() {
        return xs_area;
    }

    public void setXs_area(Integer xs_area) {
        this.xs_area = xs_area;
    }

    public Integer getYh_area() {
        return yh_area;
    }

    public void setYh_area(Integer yh_area) {
        this.yh_area = yh_area;
    }

    public Integer getFy_area() {
        return fy_area;
    }

    public void setFy_area(Integer fy_area) {
        this.fy_area = fy_area;
    }

    public Integer getTl_area() {
        return tl_area;
    }

    public void setTl_area(Integer tl_area) {
        this.tl_area = tl_area;
    }

    public Integer getJd_area() {
        return jd_area;
    }

    public void setJd_area(Integer jd_area) {
        this.jd_area = jd_area;
    }

    public Integer getCa_area() {
        return ca_area;
    }

    public void setCa_area(Integer ca_area) {
        this.ca_area = ca_area;
    }

    public Integer getLa_area() {
        return la_area;
    }

    public void setLa_area(Integer la_area) {
        this.la_area = la_area;
    }

    public Integer getDjd_area() {
        return djd_area;
    }

    public void setDjd_area(Integer djd_area) {
        this.djd_area = djd_area;
    }

    public Double getXs_average_price() {
        return xs_average_price;
    }

    public void setXs_average_price(Double xs_average_price) {
        this.xs_average_price = xs_average_price;
    }

    public Double getYh_average_price() {
        return yh_average_price;
    }

    public void setYh_average_price(Double yh_average_price) {
        this.yh_average_price = yh_average_price;
    }

    public Double getFy_average_price() {
        return fy_average_price;
    }

    public void setFy_average_price(Double fy_average_price) {
        this.fy_average_price = fy_average_price;
    }

    public Double getTl_average_price() {
        return tl_average_price;
    }

    public void setTl_average_price(Double tl_average_price) {
        this.tl_average_price = tl_average_price;
    }

    public Double getJd_average_price() {
        return jd_average_price;
    }

    public void setJd_average_price(Double jd_average_price) {
        this.jd_average_price = jd_average_price;
    }

    public Double getCa_average_price() {
        return ca_average_price;
    }

    public void setCa_average_price(Double ca_average_price) {
        this.ca_average_price = ca_average_price;
    }

    public Double getLa_average_price() {
        return la_average_price;
    }

    public void setLa_average_price(Double la_average_price) {
        this.la_average_price = la_average_price;
    }

    public Double getDjd_average_price() {
        return djd_average_price;
    }

    public void setDjd_average_price(Double djd_average_price) {
        this.djd_average_price = djd_average_price;
    }
}
