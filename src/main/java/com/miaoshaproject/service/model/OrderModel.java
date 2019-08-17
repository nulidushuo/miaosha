package com.miaoshaproject.service.model;

import java.math.BigDecimal;

/**
 * @program: miaosha
 * @description:
 * @author: JIANG Ziyang
 * @create: 2019-08-17 15:22
 **/
//用户下单模型
public class OrderModel {
    //201810210012828有具体含义所以用string
    private String id;

    private Integer userId;

    private Integer itemId;

    private BigDecimal itemPrice;

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    private Integer amount;

    private BigDecimal orderPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}
