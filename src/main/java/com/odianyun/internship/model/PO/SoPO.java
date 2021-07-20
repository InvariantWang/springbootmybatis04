package com.odianyun.internship.model.PO;
/**
 * 一个PO就是数据库中的一条记录。
 * 好处是可以把一条记录作为一个对象处理，可以方便的转为其它对象。
 */

import java.io.Serializable;


public class SoPO implements Serializable {
    private static final long serialVersionUID = 2886460985801589513L;
    private Long id;
    
    private String orderCode;

    private Long userId;

    private String userName;

    private Long merchantId;

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
}
