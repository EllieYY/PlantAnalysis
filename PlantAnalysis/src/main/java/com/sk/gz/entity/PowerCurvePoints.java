package com.sk.gz.entity;

import java.io.Serializable;

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
     * 风速-区间（风速平均值）
     */
    private Float windspeed;

    /**
     * 对应风速区间的功率平均值
     */
    private Float power;

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
            && (this.getPower() == null ? other.getPower() == null : this.getPower().equals(other.getPower()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPlantid() == null) ? 0 : getPlantid().hashCode());
        result = prime * result + ((getWindspeed() == null) ? 0 : getWindspeed().hashCode());
        result = prime * result + ((getPower() == null) ? 0 : getPower().hashCode());
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
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}