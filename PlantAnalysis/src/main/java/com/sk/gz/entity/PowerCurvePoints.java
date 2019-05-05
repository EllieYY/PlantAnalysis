package com.sk.gz.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * power_curve_points
 * @author 
 */
public class PowerCurvePoints implements Serializable {
    private Integer id;

    /**
     * 风机id
     */
    private Integer plantid;

    /**
     * 风速-区间
     */
    private Float windspeed;

    /**
     * 对应风速区间的功率总和
     */
    private Float power;

    /**
     * 风速区间功率点的个数
     */
    private Integer pointcount;

    /**
     * 0-实际功率 1-理论功率
     */
    private Boolean type;

    /**
     * 日期-默认按天统计
     */
    private Date date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlantid() {
        return plantid;
    }

    public void setPlantid(Integer plantid) {
        this.plantid = plantid;
    }

    public Float getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Float windspeed) {
        this.windspeed = windspeed;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public Integer getPointcount() {
        return pointcount;
    }

    public void setPointcount(Integer pointcount) {
        this.pointcount = pointcount;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PowerCurvePoints other = (PowerCurvePoints) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPlantid() == null ? other.getPlantid() == null : this.getPlantid().equals(other.getPlantid()))
            && (this.getWindspeed() == null ? other.getWindspeed() == null : this.getWindspeed().equals(other.getWindspeed()))
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()))
            && (this.getPointcount() == null ? other.getPointcount() == null : this.getPointcount().equals(other.getPointcount()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        result = prime * result + ((getWindspeed() == null) ? 0 : getWindspeed().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
        result = prime * result + ((getPointcount() == null) ? 0 : getPointcount().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", plantid=").append(plantid);
        sb.append(", windspeed=").append(windspeed);
        sb.append(", power=").append(power);
        sb.append(", pointcount=").append(pointcount);
        sb.append(", type=").append(type);
        sb.append(", date=").append(date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}