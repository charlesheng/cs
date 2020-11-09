package com.zheng.upms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TUploadMessageRecord implements Serializable {
    private String id;

    /**
     * 订单id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 司机id
     *
     * @mbg.generated
     */
    private String driverId;

    /**
     * 订单类型，0煤炭，1普货
     *
     * @mbg.generated
     */
    private Boolean orderType;

    /**
     * 是否可上报，0未检验，1可上报,2暂不上报,3不能上报
     *
     * @mbg.generated
     */
    private Boolean submitEnable;

    /**
     * 上报状态，0未上报，1已上报
     *
     * @mbg.generated
     */
    private Boolean submitStatus;

    /**
     * 不上报原因
     *
     * @mbg.generated
     */
    private String disableReason;

    /**
     * 订单时间
     *
     * @mbg.generated
     */
    private Date orderDt;

    private Date submitDt;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createDt;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateDt;

    /**
     * 是否删除
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    private String carId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Boolean getOrderType() {
        return orderType;
    }

    public void setOrderType(Boolean orderType) {
        this.orderType = orderType;
    }

    public Boolean getSubmitEnable() {
        return submitEnable;
    }

    public void setSubmitEnable(Boolean submitEnable) {
        this.submitEnable = submitEnable;
    }

    public Boolean getSubmitStatus() {
        return submitStatus;
    }

    public void setSubmitStatus(Boolean submitStatus) {
        this.submitStatus = submitStatus;
    }

    public String getDisableReason() {
        return disableReason;
    }

    public void setDisableReason(String disableReason) {
        this.disableReason = disableReason;
    }

    public Date getOrderDt() {
        return orderDt;
    }

    public void setOrderDt(Date orderDt) {
        this.orderDt = orderDt;
    }

    public Date getSubmitDt() {
        return submitDt;
    }

    public void setSubmitDt(Date submitDt) {
        this.submitDt = submitDt;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(Date updateDt) {
        this.updateDt = updateDt;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", driverId=").append(driverId);
        sb.append(", orderType=").append(orderType);
        sb.append(", submitEnable=").append(submitEnable);
        sb.append(", submitStatus=").append(submitStatus);
        sb.append(", disableReason=").append(disableReason);
        sb.append(", orderDt=").append(orderDt);
        sb.append(", submitDt=").append(submitDt);
        sb.append(", createDt=").append(createDt);
        sb.append(", updateDt=").append(updateDt);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", carId=").append(carId);
        sb.append("]");
        return sb.toString();
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
        TUploadMessageRecord other = (TUploadMessageRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getDriverId() == null ? other.getDriverId() == null : this.getDriverId().equals(other.getDriverId()))
            && (this.getOrderType() == null ? other.getOrderType() == null : this.getOrderType().equals(other.getOrderType()))
            && (this.getSubmitEnable() == null ? other.getSubmitEnable() == null : this.getSubmitEnable().equals(other.getSubmitEnable()))
            && (this.getSubmitStatus() == null ? other.getSubmitStatus() == null : this.getSubmitStatus().equals(other.getSubmitStatus()))
            && (this.getDisableReason() == null ? other.getDisableReason() == null : this.getDisableReason().equals(other.getDisableReason()))
            && (this.getOrderDt() == null ? other.getOrderDt() == null : this.getOrderDt().equals(other.getOrderDt()))
            && (this.getSubmitDt() == null ? other.getSubmitDt() == null : this.getSubmitDt().equals(other.getSubmitDt()))
            && (this.getCreateDt() == null ? other.getCreateDt() == null : this.getCreateDt().equals(other.getCreateDt()))
            && (this.getUpdateDt() == null ? other.getUpdateDt() == null : this.getUpdateDt().equals(other.getUpdateDt()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getCarId() == null ? other.getCarId() == null : this.getCarId().equals(other.getCarId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getDriverId() == null) ? 0 : getDriverId().hashCode());
        result = prime * result + ((getOrderType() == null) ? 0 : getOrderType().hashCode());
        result = prime * result + ((getSubmitEnable() == null) ? 0 : getSubmitEnable().hashCode());
        result = prime * result + ((getSubmitStatus() == null) ? 0 : getSubmitStatus().hashCode());
        result = prime * result + ((getDisableReason() == null) ? 0 : getDisableReason().hashCode());
        result = prime * result + ((getOrderDt() == null) ? 0 : getOrderDt().hashCode());
        result = prime * result + ((getSubmitDt() == null) ? 0 : getSubmitDt().hashCode());
        result = prime * result + ((getCreateDt() == null) ? 0 : getCreateDt().hashCode());
        result = prime * result + ((getUpdateDt() == null) ? 0 : getUpdateDt().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getCarId() == null) ? 0 : getCarId().hashCode());
        return result;
    }
}