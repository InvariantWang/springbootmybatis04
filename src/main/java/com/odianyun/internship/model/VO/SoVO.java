package com.odianyun.internship.model.VO;

import com.odianyun.internship.constant.SoConstant;

import java.io.Serializable;
import java.util.Date;

/**
 * 主要对应界面显示的数据对象。对于一个WEB页面，
 * 或者SWT、SWING的一个界面，用一个VO对象对应整个界面的值。
 * (包含界面所有值的对象)
 */
public class SoVO implements Serializable {
    private static final long serialVersionUID = -6592575993631478052L;

    private Long id;

    private String orderCode;

    private String parentOrderCode;

    private Long userId;

    private String userName;

    private Long merchantId;

    private String merchantName;

    private Long storeId;

    private String storeName;

    private Integer orderStatus;

    private Date orderCreateTime;

    private String orderRemarkUser;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getParentOrderCode() {
        return parentOrderCode;
    }

    public void setParentOrderCode(String parentOrderCode) {
        this.parentOrderCode = parentOrderCode;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getOrderRemarkUser() {
        return orderRemarkUser;
    }

    public void setOrderRemarkUser(String orderRemarkUser) {
        this.orderRemarkUser = orderRemarkUser;
    }

    public String getOrderStatusStr() {
        return SoConstant.STATUS_MAP.get(orderStatus);
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }


}
